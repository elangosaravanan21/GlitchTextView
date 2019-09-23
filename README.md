# GlitchText
[![](https://jitpack.io/v/elangosaravanan21/GlitchTextLib.svg)](https://jitpack.io/#elangosaravanan21/GlitchTextLib)

	        implementation 'com.github.elangosaravanan21:GlitchTextLib:v1.2'
		
		
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

