# GlitchText
[![](https://github.com/elangosaravanan21/GlitchTextLib/blob/master/app/src/main/res/raw/New%20Project%20(15).png?raw=true)
[![](https://github.com/elangosaravanan21/GlitchTextLib/blob/master/app/src/main/res/raw/New%20Project%20(16).png?raw=true)
[![](https://jitpack.io/v/elangosaravanan21/GlitchTextLib.svg)](https://jitpack.io/#elangosaravanan21/GlitchTextLib)
Step 1: Add it in your root build.gradle

		allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
			

Step 2: Add the dependency

  	implementation 'com.github.elangosaravanan21:GlitchTextLib:v1.2'
	      
Step 3: Use it in your layout

		
		<com.youngfilmmakerz.glitchtext.Glitchtext
                android:layout_width="wrap_content"
                app:text="Your Text"
                android:id="@+id/glitchtxt"
                android:background="@color/colorBlack"
                android:layout_height="wrap_content">
                </com.youngfilmmakerz.glitchtext.Glitchtext>
		
		
		
		//java
		
		glitchtxt = (Glitchtext) findViewById(R.id.glitchtxt);
		
		glitchtxt.setMaintext("Your Text");
		//custom font
        	glitchtxt.setFontstyle("champanebold.ttf");

