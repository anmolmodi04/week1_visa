package com.visa.prj.client;

import com.visa.prj.entity.Product;
import com.visa.prj.util.SQLUtil;

public class SQLTest {

	public static void main(String[] args) {
		String str = SQLUtil.createStatement(Product.class);
		System.out.println(str);
	}

}
