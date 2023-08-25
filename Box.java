package ControlStructures;

public class Box {
	
		float width, height,depth;
		
		
		public Box(float width, float height, float depth) {
			this.width = width;
			this.height = height;
			this.depth = depth;
		}


		public float volume(float width, float height, float depth) {
			return width*depth*height;
		}
		
		
	}


