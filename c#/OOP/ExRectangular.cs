using System;
using System.Collections.Generic;
using System.Text;

namespace OOP
{
    class ExRectangular
    {
        private int height;
        private int width;
        public ExRectangular()
        {
            width = 1;
            height = 1;
        }
        public ExRectangular(int height, int width)
        {
            this.height = height;
            this.width = width;
        }
        public int Height
        {
            set
            {
                this.height = value;
            }
            get
            {
                return this.height;
            }
        }
        public int Width
        {
            set
            {
                this.width = value;
            }
            get
            {
                return this.width;
            }
        }
        public override string ToString()
        {
            return "Width: " + this.width + " Height: " + this.height;
        }

    }
}
