public class MazeGame {
  public MazeGame() {
     Room room1 = makeRoom();
     Room room2 = makeRoom();
     room1.connect(room2);
     this.addRoom(room1);
     this.addRoom(room2);
  }
 
  protected Room makeRoom() {
     return new OrdinaryRoom();
  }
}
public class MagicMazeGame extends MazeGame {
  @Override
  protected Room makeRoom() {
      return new MagicRoom();
  }
}
class Complex {
     public static Complex fromCartesianFactory(double real, double imaginary) {
         return new Complex(real, imaginary);
     }
     public static Complex fromPolarFactory(double modulus, double angle) {
         return new Complex(modulus * cos(angle), modulus * sin(angle));
     }
     private Complex(double a, double b) {
         //...
     }
}
 
Complex product = Complex.fromPolarFactory(1, pi);
public class ImageReaderFactory {
    public static ImageReader imageReaderFactoryMethod(InputStream is) {
        ImageReader product = null;
 
        int imageType = determineImageType(is);
        switch (imageType) {
            case ImageReaderFactory.GIF:
                product = new GifReader(is);
                break;
            case ImageReaderFactory.JPEG:
                product = new JpegReader(is);
                break;
            //...
        }
        return product;
    }
}

