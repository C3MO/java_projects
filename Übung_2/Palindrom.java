{\rtf1\ansi\ansicpg1252\cocoartf1561
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red106\green62\blue62;\red63\green127\blue95;
\red127\green159\blue191;\red42\green0\blue255;\red0\green0\blue192;}
{\*\expandedcolortbl;;\csgenericrgb\c49804\c0\c33333;\csgenericrgb\c41569\c24314\c24314;\csgenericrgb\c24706\c49804\c37255;
\csgenericrgb\c49804\c62353\c74902;\csgenericrgb\c16471\c0\c100000;\csgenericrgb\c0\c0\c75294;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\fs22 \cf0 \
\pard\pardeftab720\partightenfactor0
\cf2 public\cf0  \cf2 class\cf0  Palindrom \{\
\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main(String[] \cf3 args\cf0 ) \{\
		\cf4 // \cf5 TODO\cf4  Auto-generated method stub\cf0 \
		\
\
			\cf4 // \ul Alle\ulnone  Strings \ul sind\ulnone  \ul immer\ulnone  \ul mit\ulnone  \ul Kleinbuchstaben\cf0 \ulnone \
		String \cf3 s1\cf0  = \cf6 "step on no pets"\cf0 ;\
		String \cf3 s2\cf0  = \cf6 "was it a car or a cat i saw"\cf0 ;\
		String \cf3 s3\cf0  = \cf6 "murder for a jar of red rum"\cf0 ;\
		String \cf3 s4\cf0  = \cf6 "oozy rat in a sanitary zoo"\cf0 ;\
		String \cf3 s5\cf0  = \cf6 "this is nonsense"\cf0 ;\
		String \cf3 s6\cf0  = \cf6 "abc de edd ba"\cf0 ; \
		String \cf3 rueck\cf0  = \cf6 ""\cf0 ;\
\
		\
\
	 \cf2 int\cf0  \cf3 length\cf0  = \cf3 s1\cf0 .length();\
	 \cf2 int\cf0  \cf3 \ul \ulc3 length2\cf0 \ulnone  = \cf3 s2\cf0 .length();\
	 \cf2 int\cf0  \cf3 \ul \ulc3 length3\cf0 \ulnone  = \cf3 s3\cf0 .length();\
	 \cf2 int\cf0  \cf3 \ul \ulc3 length4\cf0 \ulnone  = \cf3 s4\cf0 .length();\
	 \cf2 int\cf0  \cf3 \ul \ulc3 length5\cf0 \ulnone  = \cf3 s5\cf0 .length();\
	 \cf2 int\cf0  \cf3 \ul \ulc3 length6\cf0 \ulnone  = \cf3 s6\cf0 .length();\
	 System.\cf7 out\cf0 .println(\cf6 "***Palindrome Checker***\\n"\cf0 );\
	 \
	 \
	 \
	 \
	 \
	      \cf2 for\cf0  ( \cf2 int\cf0  \cf3 i\cf0  = \cf3 length\cf0  -1; \cf3 i\cf0  >= 0; \cf3 i\cf0 -- )\
	         \cf3 rueck\cf0  = \cf3 rueck\cf0  + \cf3 s1\cf0 .charAt(\cf3 i\cf0 );\
	 \
	      \cf2 if\cf0  (leerzeichenEntf(\cf3 s1\cf0 ).compareTo(leerzeichenEntf(\cf3 rueck\cf0 )) == 0) \{\
	    	  	System.\cf7 out\cf0 .println(\cf6 "Ihr Satz ohne leerzeichen: "\cf0 +leerzeichenEntf(\cf3 s1\cf0 ));\
	         System.\cf7 out\cf0 .println(\cf6 "Ihr Satz: "\cf0 +\cf3 s1\cf0 +\cf6 "\\nErgebnis: Es ist ein Palindrom.\\n"\cf0 );\
	      \}\
	      \cf2 else\cf0  \{\
	         System.\cf7 out\cf0 .println(\cf6 "Der zweite Satz: "\cf0 +\cf3 s1\cf0 +\cf6 "\\nErgebnis: Es ist kein Palindrom. \\n"\cf0 );\
	 \
	   \}	\
	   \
\
	\
	     \
\pard\pardeftab720\partightenfactor0
\cf4 //-------------------------------------------------------------------------------------------------------\cf0 \
	\
	\cf4 /*\cf0 \
\cf4 	 for ( \ul int\ulnone  i = length2 -1; i >= 0; i-- )\cf0 \
\cf4          \ul rueck\ulnone  = \ul rueck\ulnone  + s2.charAt(i);\cf0 \
\cf4 	 \cf0 \
\cf4 	      if (leerzeichenEntf(s2).compareTo(leerzeichenEntf(\ul rueck\ulnone )) == 0) \{\cf0 \
\cf4 	    	  	System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone  \ul ohne\ulnone  \ul Leerzeichen\ulnone : "+leerzeichenEntf(s2));\cf0 \
\cf4 	         System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone : "+s2+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul ein\ulnone  \ul Palindrom\ulnone .\\n");\cf0 \
\cf4 	      \}\cf0 \
\cf4 	      else \{\cf0 \
\cf4 	         System.out.println("\ul Der\ulnone  \ul zweite\ulnone  \ul Satz\ulnone : "+s2+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul kein\ulnone  \ul Palindrom\ulnone . \\n");\cf0 \
\cf4 	 \cf0 \
\cf4 	   \}	\cf0 \
\cf4 	 \cf0 \
\cf4 	      \cf0 \
\cf4 //--------------------------------------------------------------------------------------------------------\cf0 \
\cf4 	    \cf0 \
\cf4 	      \cf0 \
\cf4 	      for ( \ul int\ulnone  i = length3 -1; i >= 0; i-- )\cf0 \
\cf4 	          \ul rueck\ulnone  = \ul rueck\ulnone  + s3.charAt(i);\cf0 \
\cf4 	 	 \cf0 \
\cf4 	 	      if (leerzeichenEntf(s3).compareTo(leerzeichenEntf(\ul rueck\ulnone )) == 0) \{\cf0 \
\cf4 	 	    	  	System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone  \ul ohne\ulnone  \ul Leerzeichen\ulnone : "+leerzeichenEntf(s3));\cf0 \
\cf4 	 	         System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone : "+s3+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul ein\ulnone  \ul Palindrom\ulnone .\\n");\cf0 \
\cf4 	 	      \}\cf0 \
\cf4 	 	      else \{\cf0 \
\cf4 	 	         System.out.println("\ul Der\ulnone  \ul zweite\ulnone  \ul Satz\ulnone : "+s3+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul kein\ulnone  \ul Palindrom\ulnone . \\n");\cf0 \
\cf4 	 	 \cf0 \
\cf4 	 	   \}	\cf0 \
\cf4 	 	   \cf0 \
\cf4 //---------------------------------------------------------------------------------------------------------\cf0 \
\cf4 	 	   \cf0 \
\cf4 	 	      \cf0 \
\cf4 	 	      for ( \ul int\ulnone  i = length4 -1; i >= 0; i-- )\cf0 \
\cf4 		          \ul rueck\ulnone  = \ul rueck\ulnone  + s4.charAt(i);\cf0 \
\cf4 		 	 \cf0 \
\cf4 		 	      if (leerzeichenEntf(s4).compareTo(leerzeichenEntf(\ul rueck\ulnone )) == 0) \{\cf0 \
\cf4 		 	    	  	System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone  \ul ohne\ulnone  \ul leerzeichen\ulnone : "+leerzeichenEntf(s4));\cf0 \
\cf4 		 	         System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone : "+s4+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul ein\ulnone  \ul Palindrom\ulnone .\\n");\cf0 \
\cf4 		 	      \}\cf0 \
\cf4 		 	      else \{\cf0 \
\cf4 		 	         System.out.println("\ul Der\ulnone  \ul zweite\ulnone  \ul Satz\ulnone : "+s4+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul kein\ulnone  \ul Palindrom\ulnone . \\n");\cf0 \
\cf4 		 	 \cf0 \
\cf4 		 	   \}	\cf0 \
\cf4 		 	      \cf0 \
\cf4 		 	     \cf0 \
\cf4 //----------------------------------------------------------------------------------------------------------\cf0 \
\cf4 		 	    \cf0 \
\cf4 		 	      \cf0 \
\cf4 		 	      for ( \ul int\ulnone  i = length5 -1; i >= 0; i-- )\cf0 \
\cf4 			          \ul rueck\ulnone  = \ul rueck\ulnone  + s5.charAt(i);\cf0 \
\cf4 			 	 \cf0 \
\cf4 			 	      if (leerzeichenEntf(s5).compareTo(leerzeichenEntf(\ul rueck\ulnone )) == 0) \{\cf0 \
\cf4 			 	    	  	System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone  \ul ohne\ulnone  \ul leerzeichen\ulnone : "+leerzeichenEntf(s5));\cf0 \
\cf4 			 	         System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone : "+s5+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul ein\ulnone  \ul Palindrom\ulnone .\\n");\cf0 \
\cf4 			 	      \}\cf0 \
\cf4 			 	      else \{\cf0 \
\cf4 			 	         System.out.println("\ul Der\ulnone  \ul zweite\ulnone  \ul Satz\ulnone : "+s5+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul kein\ulnone  \ul Palindrom\ulnone . \\n");\cf0 \
\cf4 			 	 \cf0 \
\cf4 			 	   \}\cf0 \
\cf4 			 	      \cf0 \
\cf4 //----------------------------------------------------------------------------------------------------------\cf0 \
\cf4 			 	      \cf0 \
\cf4 			 	    \cf0 \
\cf4 			 	      for ( \ul int\ulnone  i = length6 -1; i >= 0; i-- )\cf0 \
\cf4 				          \ul rueck\ulnone  = \ul rueck\ulnone  + s6.charAt(i);\cf0 \
\cf4 				 	 \cf0 \
\cf4 				 	      if (leerzeichenEntf(s6).compareTo(leerzeichenEntf(\ul rueck\ulnone )) == 0) \{\cf0 \
\cf4 				 	    	  	System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone  \ul ohne\ulnone  \ul leerzeichen\ulnone : "+leerzeichenEntf(s6));\cf0 \
\cf4 				 	         System.out.println("\ul Ihr\ulnone  \ul Satz\ulnone : "+s6+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul ein\ulnone  \ul Palindrom\ulnone .\\n");\cf0 \
\cf4 				 	      \}\cf0 \
\cf4 				 	      else \{\cf0 \
\cf4 				 	         System.out.println("\ul Der\ulnone  \ul zweite\ulnone  \ul Satz\ulnone : "+s6+"\\nErgebnis: \ul Es\ulnone  \ul ist\ulnone  \ul kein\ulnone  \ul Palindrom\ulnone . \\n");\cf0 \
\cf4 				 	 \cf0 \
\cf4 				 	   \}	\cf0 \
\cf4 	*/\cf0 \
	\} \
	\
    \cf4 //\ul Methode\ulnone  \ul um\ulnone  die \ul Leerzeichen\ulnone  \ul zu\ulnone  \ul entfernen\cf0 \ulnone \
	\
    \cf2 private\cf0  \cf2 static\cf0  String leerzeichenEntf(String \cf3 einWort\cf0 ) \{\
     String \cf3 buffer\cf0  = \cf6 ""\cf0 ;\
     \
        \cf2 for\cf0 (\cf2 int\cf0  \cf3 i\cf0  = 0; \cf3 i\cf0  < \cf3 einWort\cf0 .length(); \cf3 i\cf0 ++)  \{\
        	\
         \cf2 if\cf0 (!(String.valueOf(\cf3 einWort\cf0 .charAt(\cf3 i\cf0 )).compareTo(\cf6 " "\cf0 ) == 0)) \{\
             \cf3 buffer\cf0  += \cf3 einWort\cf0 .charAt(\cf3 i\cf0 );\
         \}\
     \}\
        \cf2 return\cf0  \cf3 buffer\cf0 ;\
    \}\
\
\}}