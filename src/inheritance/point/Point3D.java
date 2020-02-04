package inheritance.point;

    public class Point3D extends Point2D {

        protected float z=0.0f;
        public Point3D( float x,float y,float z){
            super();

        }

        public Point3D() {

        }

        protected void setZ(float z){
            this.z=z;
        }
        protected float getZ(){
            return this.z;
        }
        protected void setXYZ(){
            float[] arr={this.x,this.y,this.z};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+" ");
            }

        }
        public String toString(){
            System.out.println("x="+this.x+"y="+this.y+"z="+this.z);

            return null;
        }

        public static void main(String[] args) {
            Point3D point3D=new Point3D();
            point3D.toString();
            point3D.setXYZ();

        }
    }

