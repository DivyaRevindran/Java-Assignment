package com.nissan.bean;

public class box {

		private double width = 0.0;
		private double depth = 0.0;
		private double height = 0.0;
		public double volume = 0.0;
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getDepth() {
			return depth;
		}
		public void setDepth(double depth) {
			this.depth = depth;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		public double volume()
		{
			this.volume=this.depth*this.width*this.height;
			return volume;
		}
		

}
