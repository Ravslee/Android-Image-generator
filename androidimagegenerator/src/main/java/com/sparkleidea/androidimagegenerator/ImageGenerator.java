package com.sparkleidea.androidimagegenerator;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import java.io.ByteArrayOutputStream;
import java.io.File;

public class ImageGenerator {


   public static Bitmap getRectImage(TextDrawable textDrawable,int widthPx,int heightPx){

       Bitmap mutableBitmap = Bitmap.createBitmap(widthPx, heightPx, Bitmap.Config.ARGB_8888);
       Canvas canvas = new Canvas(mutableBitmap);
       textDrawable.setBounds(0, 0, widthPx, heightPx);
       textDrawable.draw(canvas);


       ByteArrayOutputStream stream = new ByteArrayOutputStream();
       mutableBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
//       byte[] byteArray = stream.toByteArray();
       return mutableBitmap;
   }


}
