package com.core.java.ObjectAnalyzerTest;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * Analyzer Class
 *
 * @author 	Lian
 * @date 	16/9/5
 * @since 	1.0
 */
class ObjectAnalyzer {

	private ArrayList<Object> visited = new ArrayList<Object>();

	/**
	 * The method of analyzing object
	 *
	 * @param obj
	 * @return
	 */
	public String toString(Object obj) {
		// obj is null
		if (obj == null) return "null";

		if (visited.contains(obj)) return "...";

		visited.add(obj);

		Class cl = obj.getClass();
		// obj is String
		if (cl == String.class) return (String) obj;
		// obj is Array
		if (cl.isArray()) {
			String r = cl.getComponentType() + "[]{";
			for (int i = 0; i < Array.getLength(obj); i++) {
				if(i > 0) r += ",";
				Object val = Array.get(obj, i);
				if(cl.getComponentType().isPrimitive()) {
					r += val;
				} else {
					r += toString(val);
				}
			}
			return r + "}";
		}

		String r = cl.getName();
		// inspect the fields of this class and all superclass
		do {
			r += "[";
			Field[] fields = cl.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			// get the names and values of all fields
			for (Field f: fields ) {
				if(!Modifier.isStatic(f.getModifiers())) {
					if(!r.endsWith("[")) {
						r += ",";
					}
					r += f.getName() + "=";

					try {
						Class t = f.getType();
						Object val = f.get(obj);
						if (t.isPrimitive()) {
							r += val;
						} else {
							r += toString(val);
						}
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}

			r += "]";
			cl = cl.getSuperclass();

		} while (cl != null);

		return r;
	}
}
