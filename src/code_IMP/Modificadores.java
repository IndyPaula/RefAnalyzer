package code_IMP;

import java.lang.reflect.Modifier;

public class Modificadores {

	public String modificadores(int classModifier) {
		if (Modifier.isPublic(classModifier)) {
			// System.out.println("Classe public " +
			// Modifier.isPublic(classModifier) + "\n");
			return Constant.PUBLIC;

		} else if (Modifier.isPrivate(classModifier)) {
			// System.out.println("Classe private " +
			// Modifier.isPrivate(classModifier) + "\n");
			return Constant.PRIVATE;

		} else if (Modifier.isProtected(classModifier)) {
			// System.out.println("Classe protected " +
			// Modifier.isProtected(classModifier) + "\n");
			return Constant.PROTECTED;

		} else if (Modifier.isStatic(classModifier)) {
			// System.out.println("Classe stactic " +
			// Modifier.isStatic(classModifier) + "\n");
			return Constant.STATIC;

		} else if (Modifier.isFinal(classModifier)) {
			// System.out.println("Classe final " +
			// Modifier.isFinal(classModifier) + "\n");
			return Constant.FINAL;

		} else if (Modifier.isInterface(classModifier)) {
			// System.out.println("Classe Interface " +
			// Modifier.isInterface(classModifier) + "\n");
			return Constant.INTERFACE;

		} else if (Modifier.isAbstract(classModifier)) {
			// System.out.println("Classe Abstract " +
			// Modifier.isAbstract(classModifier) + "\n");
			return Constant.ABSTRACT;

		}

		return Constant.OUTROS;
	}

}
