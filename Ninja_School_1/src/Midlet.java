import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public class Midlet extends MIDlet implements Runnable {
   // $FF: renamed from: a boolean
   static boolean field_boolean_a;
   // $FF: renamed from: b a
   static class_a field_class_a_b;
   // $FF: renamed from: c Midlet
   static Midlet field_class_Midlet_c;
   // $FF: renamed from: i boolean
   private static boolean field_boolean_i = true;
   // $FF: renamed from: d int
   public static int field_int_d;
   // $FF: renamed from: e boolean
   public static boolean field_boolean_e;
   // $FF: renamed from: f boolean
   public static boolean field_boolean_f;
   // $FF: renamed from: j javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_j;
   // $FF: renamed from: k int[]
   private static final int[] field_array_int_k = new int[]{5, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 5, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 6, 5, 5, 5, 5, 5, 5, 5, 5, 7, 5, 5, 5};
   // $FF: renamed from: l int
   private static int field_int_l = 8;
   // $FF: renamed from: m javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_m;
   // $FF: renamed from: n int[]
   private static final int[] field_array_int_n = new int[]{2, 6, 3, 5, 6, 6, 6, 5, 6, 6, 6, 3, 3, 3, 2, 6, 4, 4, 5, 3, 6, 8, 8, 8, 8, 8, 8, 8, 8, 3, 8, 8, 8, 10, 8, 8, 8, 8, 8, 7, 8, 8, 8, 10, 8, 8, 8, 6, 6, 6, 6, 6, 5, 6, 6, 3, 5, 6, 3, 8, 6, 6, 6, 6, 6, 6, 5, 6, 6, 8, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
   // $FF: renamed from: o int
   private static int field_int_o = 12;
   // $FF: renamed from: p javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_p;
   // $FF: renamed from: q int[]
   private static final int[] field_array_int_q = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 4, 3, 3, 3, 6, 7, 7, 8, 5, 11, 11, 7, 6, 10, 6, 7, 5, 7, 6, 5, 7, 7, 3, 3, 6, 3, 9, 7, 7, 7, 7, 4, 5, 4, 8, 6, 9, 7, 6, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 3, 3, 3, 3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 7, 7, 8, 7, 8, 8, 8, 7, 7, 8, 7, 6, 7, 8, 8, 8, 8, 8, 6, 6, 6, 6, 6, 7, 8, 7, 7, 8, 6, 6, 8, 8, 3, 6, 7, 6, 11, 9, 8, 7, 8, 7, 5, 6, 8, 7, 11, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 6, 6, 6, 6, 6, 6, 7, 6, 6, 6, 6, 5, 5, 5, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 9};
   // $FF: renamed from: r int
   private static int field_int_r = 13;
   // $FF: renamed from: g int
   public static int field_int_g = 0;
   // $FF: renamed from: s javax.microedition.media.Player
   private static Player field_class_javax_microedition_media_Player_s;
   // $FF: renamed from: t int
   private static int field_int_t;
   // $FF: renamed from: h boolean
   public static boolean field_boolean_h;

   static {
      try {
         field_array_class_javax_microedition_lcdui_Image_j = new Image[3];

         for(int var0 = 0; var0 < 3; ++var0) {
            field_array_class_javax_microedition_lcdui_Image_j[var0] = Image.createImage("/fs" + var0 + ".png");
         }
      } catch (Exception var3) {
      }

      try {
         field_class_javax_microedition_lcdui_Image_m = Image.createImage("/fr.png");
      } catch (Exception var2) {
      }

      try {
         field_class_javax_microedition_lcdui_Image_p = Image.createImage("/fb.png");
      } catch (Exception var1) {
      }

      field_int_t = -1;
   }

   // $FF: renamed from: b (int) void
   private static void func_void_b(int var0) {
      if (var0 != field_int_t) {
         try {
            if (field_class_javax_microedition_media_Player_s != null) {
               field_class_javax_microedition_media_Player_s.stop();
               field_class_javax_microedition_media_Player_s.deallocate();
               field_class_javax_microedition_media_Player_s = null;
               System.gc();
            }

            (field_class_javax_microedition_media_Player_s = Manager.createPlayer("".getClass().getResourceAsStream("/s/" + var0 + ".mid"), "audio/midi")).realize();
            ((VolumeControl)field_class_javax_microedition_media_Player_s.getControl("VolumeControl")).setLevel(100);
            field_class_javax_microedition_media_Player_s.prefetch();
            field_class_javax_microedition_media_Player_s.setLoopCount(1000);
            field_int_t = var0;
         } catch (Exception var1) {
            var1.printStackTrace();
            System.gc();
            field_boolean_h = true;
         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
   public static void func_void_a(Graphics var0, String var1, int var2, int var3, int var4) {
      int var5 = var1.length();
      if (var4 == 0) {
         var4 = var2;
      } else if (var4 == 1) {
         var4 = var2 - func_int_a(var1);
      } else {
         var4 = var2 - (func_int_a(var1) >> 1);
      }

      for(int var6 = 0; var6 < var5; ++var6) {
         if ((var2 = " 0123456789.,:!?()+-*/#$%abcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(var1.charAt(var6))) == -1) {
            var2 = 0;
         }

         if (var2 > -1) {
            var0.drawRegion(field_class_javax_microedition_lcdui_Image_p, 0, var2 * field_int_r + 1, field_array_int_q[var2], field_int_r - 1, 0, var4, var3, 20);
         }

         var4 += field_array_int_q[var2];
      }

   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
   public static void func_void_b(Graphics var0, String var1, int var2, int var3, int var4) {
      int var5 = var1.length();
      var4 = var2 - (func_int_c(var1) >> 1);

      for(int var6 = 0; var6 < var5; ++var6) {
         if ((var2 = " 0123456789.,:!?()-'/ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđĐ".indexOf(var1.charAt(var6))) == -1) {
            var2 = 0;
         }

         if (var2 > -1) {
            var0.drawRegion(field_class_javax_microedition_lcdui_Image_m, 0, var2 * field_int_o + 1, field_array_int_n[var2], field_int_o - 1, 0, var4, var3, 20);
         }

         var4 += field_array_int_n[var2];
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int, int) void
   public static void func_void_a(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - func_int_d(var1);
      } else {
         var5 = var3 - (func_int_d(var1) >> 1);
      }

      for(int var7 = 0; var7 < var6; ++var7) {
         if ((var3 = "0123456789+-%$:abcdefghijklmnopqrstuvwxyz".indexOf(var1.charAt(var7))) == -1) {
            var3 = 0;
         }

         if (var3 > -1) {
            var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_j[var2], 0, var3 * field_int_l, field_array_int_k[var3], field_int_l, 0, var5, var4, 20);
         }

         var5 += field_array_int_k[var3] - 1;
      }

   }

   // $FF: renamed from: a (java.lang.String) int
   public static int func_int_a(String var0) {
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         int var1;
         if ((var1 = " 0123456789.,:!?()+-*/#$%abcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(var0.charAt(var3))) == -1) {
            var1 = 0;
         }

         var2 += field_array_int_q[var1];
      }

      return var2;
   }

   // $FF: renamed from: c (java.lang.String) int
   private static int func_int_c(String var0) {
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         int var1;
         if ((var1 = " 0123456789.,:!?()-'/ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđĐ".indexOf(var0.charAt(var3))) == -1) {
            var1 = 0;
         }

         var2 += field_array_int_n[var1];
      }

      return var2;
   }

   // $FF: renamed from: d (java.lang.String) int
   private static int func_int_d(String var0) {
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         int var1;
         if ((var1 = "0123456789+-%$:abcdefghijklmnopqrstuvwxyz".indexOf(var0.charAt(var3))) == -1) {
            var1 = 0;
         }

         var2 += field_array_int_k[var1] + 1;
      }

      return var2;
   }

   // $FF: renamed from: b (java.lang.String) byte[]
   public static byte[] func_array_byte_b(String var0) {
      try {
         RecordStore var3;
         byte[] var1 = (var3 = RecordStore.openRecordStore(var0, false)).getRecord(1);
         var3.closeRecordStore();
         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   // $FF: renamed from: a () int
   public static int func_int_a() {
      byte[] var0;
      return (var0 = func_array_byte_b("bg")) == null ? 0 : var0[0];
   }

   // $FF: renamed from: a (java.lang.String, byte[]) void
   public static void func_void_a(String var0, byte[] var1) {
      try {
         RecordStore var3;
         if ((var3 = RecordStore.openRecordStore(var0, true)).getNumRecords() > 0) {
            var3.setRecord(1, var1, 0, var1.length);
         } else {
            var3.addRecord(var1, 0, var1.length);
         }

         var3.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: a (boolean) void
   public static void func_void_a(boolean var0) {
      byte[] var1;
      (var1 = new byte[1])[0] = 1;
      func_void_a("saved", var1);
   }

   // $FF: renamed from: b () boolean
   public static boolean func_boolean_b() {
      byte[] var0;
      if ((var0 = func_array_byte_b("saved")) == null) {
         return false;
      } else {
         return var0[0] == 1;
      }
   }

   // $FF: renamed from: a (int) void
   public static void func_void_a(int var0) {
      byte[] var1;
      (var1 = new byte[1])[0] = (byte)var0;
      func_void_a("bg", var1);
   }

   // $FF: renamed from: a (java.lang.String, int) java.lang.String[]
   public static String[] func_array_class_java_lang_String_a(String var0, int var1) {
      Vector var2 = new Vector();
      int var3;
      if ((var3 = var0.length()) <= 1) {
         return new String[]{var0};
      } else {
         String var4 = "";
         int var5 = 0;
         int var6 = 0;

         while(true) {
            while(func_int_a(var4) < var1) {
               var4 = var4 + var0.charAt(var6);
               ++var6;
               if (var0.charAt(var6) == '\n') {
                  break;
               }

               if (var6 >= var3 - 1) {
                  var6 = var3 - 1;
                  break;
               }
            }

            if (var6 != var3 - 1 && var0.charAt(var6 + 1) != ' ') {
               int var8;
               for(var8 = var6; var0.charAt(var6 + 1) != '\n' && (var0.charAt(var6 + 1) != ' ' || var0.charAt(var6) == ' ') && var6 != var5; --var6) {
               }

               if (var6 == var5) {
                  var6 = var8;
               }
            }

            var2.addElement(var0.substring(var5, var6 + 1));
            if (var6 == var3 - 1) {
               break;
            }

            for(var5 = var6 + 1; var5 != var3 - 1 && var0.charAt(var5) == ' '; ++var5) {
            }

            if (var5 == var3 - 1) {
               break;
            }

            var6 = var5;
            var4 = "";
         }

         String[] var9 = new String[var2.size()];

         for(int var7 = 0; var7 < var2.size(); ++var7) {
            var9[var7] = (String)var2.elementAt(var7);
         }

         return var9;
      }
   }

   // $FF: renamed from: b (java.lang.String, int) java.lang.String[]
   public static String[] func_array_class_java_lang_String_b(String var0, int var1) {
      Vector var2 = new Vector();
      int var3 = var0.length();
      String var4 = "";
      int var5 = 0;
      int var6 = 0;

      while(true) {
         while(func_int_c(var4) < var1) {
            var4 = var4 + var0.charAt(var6);
            ++var6;
            if (var6 == var3 - 1) {
               break;
            }
         }

         if (var6 != var3 - 1 && var0.charAt(var6 + 1) != ' ') {
            int var8;
            for(var8 = var6; (var0.charAt(var6 + 1) != ' ' || var0.charAt(var6) == ' ') && var6 != var5; --var6) {
            }

            if (var6 == var5) {
               var6 = var8;
            }
         }

         var2.addElement(var0.substring(var5, var6 + 1));
         if (var6 == var3 - 1) {
            break;
         }

         for(var5 = var6 + 1; var5 != var3 - 1 && var0.charAt(var5) == ' '; ++var5) {
         }

         if (var5 == var3 - 1) {
            break;
         }

         var6 = var5;
         var4 = "";
      }

      String[] var9 = new String[var2.size()];

      for(int var7 = 0; var7 < var2.size(); ++var7) {
         var9[var7] = (String)var2.elementAt(var7);
      }

      return var9;
   }

   public Midlet() {
      field_class_Midlet_c = this;
      class_a.func_void_s();
      Display.getDisplay(this).setCurrent(field_class_a_b);
   }

   protected void destroyApp(boolean var1) {
      if (field_class_javax_microedition_media_Player_s != null) {
         try {
            field_class_javax_microedition_media_Player_s.stop();
         } catch (MediaException var2) {
         }

         field_class_javax_microedition_media_Player_s.deallocate();
      }

   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      System.gc();
      this.notifyDestroyed();
   }

   protected void pauseApp() {
   }

   public void run() {
      try {
         Thread.sleep(200L);
         Thread.yield();
         class_a.field_int_w = class_a.func_int_a((int)System.currentTimeMillis() % 1000);
         class_a.field_int_R = 30;
         Thread.yield();
         class_a.func_void_m(class_a.field_int_v);
         class_a.func_void_q(class_a.field_int_v);
         class_a.func_void_p(class_a.field_int_v);
         class_a.func_void_o(class_a.field_int_v);
         class_a.field_int_R = 50;
         Thread.yield();
         class_a.func_void_t(class_a.field_int_v);
         class_a.func_void_i();
         class_a.func_void_f(class_a.field_int_v);
         class_a.func_void_g(class_a.field_int_v);
         class_a.func_void_e(class_a.field_int_v);
         class_a.field_int_R = 65;
         Thread.yield();
         class_a.func_void_r(class_a.field_int_v);
         class_a.field_int_R = 70;
         Thread.yield();
         class_a.func_void_h(class_a.field_int_v);
         class_a.func_void_i(class_a.field_int_v);
         class_a.func_void_j(class_a.field_int_v);
         class_a.func_void_k(class_a.field_int_v);
         class_a.func_void_l(class_a.field_int_v);
         class_a.field_int_R = 75;
         class_a.func_void_k();
         class_a.func_void_g();
         class_a.func_void_p();
         class_a.field_int_R = 78;
         Thread.yield();
         class_a.func_void_d(class_a.field_int_v);
         class_a.func_void_c(class_a.field_int_v);
         class_a.field_int_R = 80;
         class_a.func_void_l();
         class_a.func_void_r();
         class_a.field_int_R = 82;
         Thread.yield();
         class_a.func_void_q();
         class_a.func_void_n();
         class_a.func_void_m();
         class_a.field_int_R = 85;
         class_a.func_void_b(class_a.field_int_v);
         class_a.func_void_f();
         class_a.func_void_o();
         class_a.field_int_R = 87;
         class_a.func_void_e();
         class_a.func_void_h();
         class_a.func_void_j();
         class_a.field_int_R = 95;
         Thread.yield();
         class_a.field_int_i = (new int[]{5614318, 18})[field_int_g];

         int var5;
         try {
            if (!class_a.field_boolean_a) {
               if (class_a.field_array_class_javax_microedition_lcdui_Image_s == null) {
                  class_a.field_array_class_javax_microedition_lcdui_Image_s = new Image[4];

                  for(var5 = 0; var5 < 4; ++var5) {
                     class_a.field_array_class_javax_microedition_lcdui_Image_s[var5] = Image.createImage("/bg" + var5 + field_int_g + ".png");
                  }
               }

               if (class_a.field_class_javax_microedition_lcdui_Image_t == null) {
                  class_a.field_class_javax_microedition_lcdui_Image_t = Image.createImage("/cl" + field_int_g + ".png");
               }

               if (class_a.field_class_javax_microedition_lcdui_Image_u == null) {
                  class_a.field_class_javax_microedition_lcdui_Image_u = Image.createImage("/sun" + field_int_g + ".png");
               }
            }
         } catch (Exception var2) {
         }

         class_a.field_boolean_b = false;
         if (class_a.field_int_v != 0 && !class_a.field_boolean_a) {
            class_a.field_boolean_b = true;
            class_a.field_int_p = class_a.field_int_r - (class_a.field_array_class_javax_microedition_lcdui_Image_s[0].getHeight() + class_a.field_array_class_javax_microedition_lcdui_Image_s[1].getHeight() + class_a.field_array_class_javax_microedition_lcdui_Image_s[2].getHeight()) + 11;
            class_a.field_int_l = (class_a.field_int_k = (class_a.field_int_j = class_a.field_int_r - class_a.field_array_class_javax_microedition_lcdui_Image_s[0].getHeight()) - class_a.field_array_class_javax_microedition_lcdui_Image_s[1].getHeight()) - class_a.field_array_class_javax_microedition_lcdui_Image_s[2].getHeight();
            class_a.field_int_m = class_a.field_int_k - class_a.field_array_class_javax_microedition_lcdui_Image_s[3].getHeight() - 10;
         }

         if ((var5 = 2 * class_a.field_int_r / 3 - class_a.field_int_k) < 0) {
            var5 = 0;
         }

         if (class_a.field_int_v < 19) {
            class_a.field_array_boolean_W[class_a.field_int_v] = true;
         }

         class_a.field_int_p += var5;
         class_a.field_int_j += var5;
         class_a.field_int_k += var5;
         class_a.field_int_l += var5;
         class_a.field_int_m += var5;
         class_a.field_int_g = 3 * class_a.field_int_q / 4;
         class_a.field_int_h = class_a.field_int_p / 3;
         class_a.field_array_int_e = new int[2];
         class_a.field_array_int_f = new int[2];
         class_a.field_array_int_e[0] = class_a.field_int_q / 3;
         class_a.field_array_int_f[0] = class_a.field_int_p / 2 - 8;
         class_a.field_array_int_e[1] = 2 * class_a.field_int_q / 3;
         class_a.field_array_int_f[1] = class_a.field_int_p / 2 + 8;
         class_a.field_boolean_c = true;
         class_a.field_class_java_lang_String_n = "Menu";
         class_a.field_class_java_lang_String_o = " ";
         class_a.field_boolean_T = false;
         class_a.func_void_n(class_a.field_int_v);
         class_a.field_int_R = 100;
         if (field_boolean_i) {
            field_boolean_i = false;
            class_a.field_int_E = 20;
            class_a.field_int_F = 10;
            class_a.field_int_H = 200;
            class_a.field_int_G = 200;
            class_a.field_int_J = 150;
            class_a.field_int_I = 150;
            class_a.field_int_O = -1;
            class_a.field_int_P = 5;
            class_a.field_int_K = 6;
            class_a.field_int_L = 2;
            class_a.field_int_Q = 8;
            class_a.field_int_A = 4;
            class_a.field_int_y = 1;
            class_a.field_int_z = 1;
            class_a.field_int_B = 0;
            class_a.field_int_D = 0;
            class_a.field_int_C = 0;
            class_a.field_int_M = 1;
            class_a.field_int_N = 0;
         }

         class_a.func_void_d();
         class_a.func_void_c();
         if (field_boolean_e) {
            class_a.func_void_b();
            field_boolean_e = false;
         } else if (field_boolean_f) {
            class_a.func_void_a();
            field_boolean_f = false;
         }

         switch(class_a.field_int_v) {
         case 0:
         case 1:
         case 2:
            func_void_b(1);
            break;
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
            func_void_b(2);
            break;
         case 95:
         case 96:
         case 97:
            func_void_b(4);
            break;
         case 99:
            func_void_b(0);
            break;
         default:
            func_void_b(3);
         }

         if (!field_boolean_h) {
            try {
               field_class_javax_microedition_media_Player_s.start();
            } catch (Exception var1) {
               var1.printStackTrace();
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         Midlet var4 = field_class_Midlet_c;
         System.gc();
         var4.notifyDestroyed();
      }

      while(class_a.field_int_S < 90) {
         Thread.yield();
      }

      class_a.field_int_d = field_int_d;
   }

   protected void startApp() {
      System.out.println(class_a.func_class_java_lang_String_b("2212"));
   }
}
