package com.minthanthtoo.unicode;

public class UnicodeZawgyiConverter
{
	public static final String path="/sdcard/MT/UnicodeZawgyiConverter"+"/scripts/";
	public static void main(String[] args)
	{
		String txtZg="မင္﻿းသန္﻿့ထူး";
		System.out.println(Zg1ToUni51.Z1_Uni(txtZg));
		
		String txtUni="မင်းသန့်ထူး";
		System.out.println(Uni51ToZg1.Uni_Z1(Zg1ToUni51.Z1_Uni(txtZg)));
		System.out.println(Uni51ToZg1.Uni_Z1(txtUni));
	}
}
