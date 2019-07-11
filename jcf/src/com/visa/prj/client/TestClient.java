package com.visa.prj.client;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

import com.visa.prj.entity.Product;

public class TestClient {

	public static void main(String[] args) {
		Product p = new Product(645, "Hp Laptop", 135000.00, "computer", 100);
		Map<String, Object> info = storeInfo(p);
		System.out.println(info);
	}

	private static Map<String, Object> storeInfo(Object o) {
		Map<String, Object> map = new HashMap<>();
		Class clazz = o.getClass();
		Method[] methods = clazz.getMethods();
		for (Method m : methods) {
			if (m.getName().startsWith("get")) {
				try {
					Object ret = m.invoke(o);
					map.put(m.getName().substring(3), ret);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		return map;

	}

}