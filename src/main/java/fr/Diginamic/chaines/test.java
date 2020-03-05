package fr.Diginamic.chaines;

import java.util.StringTokenizer;

public abstract class test {

	public static void main(String[] args) {
		String s = "Java est un langage moderne";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
