import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;


import static org.objectweb.asm.Opcodes.ACC_PRIVATE;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.DRETURN;


public class CompilationClassVisitor extends ClassVisitor {
    private final ParseTree _parseTree;

    public CompilationClassVisitor(ClassVisitor visitor, ParseTree tree) {
        super(Opcodes.ASM5, visitor);
        if (null == tree)
            throw new IllegalArgumentException("parse tree cannot be null.");

        this._parseTree = tree;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if ("execute".equalsIgnoreCase(name) && (access == ACC_PRIVATE + ACC_STATIC) && null != mv)
        {
            mv.visitCode();
            ParseTreeWalker walker = new ParseTreeWalker();
            TreeCompilationListener listener = new TreeCompilationListener(mv);
            walker.walk(listener, this._parseTree);
            mv.visitInsn(DRETURN);
            mv.visitMaxs(2 * listener.getTreeDepth(), 0); // double -> 2 *
            return null;
        }
        else return mv;
    }
}
