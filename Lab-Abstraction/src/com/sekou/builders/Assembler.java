package com.sekou.builders;

import com.sekou.interfaces.Packager;
import com.sekou.model.Color;
import com.sekou.model.Content;
import com.sekou.model.Dimension;
import com.sekou.model.Package;


public class Assembler implements Packager{
		private final int DIMENSION_MAX = 50;
	    private final int COLOR_MAX = 256;
	    private final int CONTENT_MAX = 100;

	    private Color generateColor() {
	        int red = (int)( Math.random() * COLOR_MAX );
	        int green = (int)( Math.random() * COLOR_MAX );
	        int blue = (int)( Math.random() * COLOR_MAX );

	        return new Color(red, green, blue);
	    }

	    private Content generateContent() {
	        int amount = (int) ( Math.random() * CONTENT_MAX );
	        String description = "This is a new Package: " + amount;

	        return new Content(amount, description);
	    }

	    private Dimension generateDimension() {
	        double width = Math.random() * DIMENSION_MAX+ 1;
	        double height = Math.random() * DIMENSION_MAX+ 1;
	        double length = Math.random() * DIMENSION_MAX + 1;

	        return new Dimension(width, height, length);
	    }

		@Override
		public Package assemblePackage() {
			Content content = generateContent();
		    Color color = generateColor();
		    Dimension dimension = generateDimension();

		    return new Package(content, color, dimension);
		}

}
