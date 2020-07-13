import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

// $FF: renamed from: b
final class class_b implements Runnable {
   // $FF: renamed from: a java.lang.String
   private final String field_class_java_lang_String_a;
   // $FF: renamed from: b java.lang.String
   private final String field_class_java_lang_String_b;
   // $FF: renamed from: c int
   private final int field_int_c;

   class_b(String var1, String var2, int var3) {
      this.field_class_java_lang_String_a = var1;
      this.field_class_java_lang_String_b = var2;
      this.field_int_c = var3;
   }

   public final void run() {
      try {
         MessageConnection var1 = null;
         TextMessage var2;
         (var2 = (TextMessage)(var1 = (MessageConnection)Connector.open(this.field_class_java_lang_String_a)).newMessage("text")).setAddress(this.field_class_java_lang_String_a);
         var2.setPayloadText(this.field_class_java_lang_String_b);
         var1.send(var2);
         class_a.func_void_d();
         int[] var10000;
         switch(this.field_int_c) {
         case 0:
            class_a.field_int_Y = 5;
            return;
         case 1:
            var10000 = class_a.field_array_int_V;
            var10000[0] += 50;
            return;
         case 2:
            var10000 = class_a.field_array_int_V;
            var10000[1] += 50;
            return;
         case 3:
            var10000 = class_a.field_array_int_V;
            var10000[2] += 30;
            return;
         case 4:
            var10000 = class_a.field_array_int_V;
            var10000[3] += 50;
            return;
         case 5:
            var10000 = class_a.field_array_int_V;
            var10000[4] += 30;
            return;
         case 6:
            var10000 = class_a.field_array_int_V;
            var10000[5] += 50;
            return;
         case 7:
            class_a.field_int_x = 1;
            class_a.func_void_a();
            class_a.func_void_t();
            return;
         case 8:
            class_a.field_int_x = 2;
            class_a.func_void_a();
            class_a.func_void_t();
            return;
         case 9:
            class_a.field_int_x = 3;
            class_a.func_void_a();
            class_a.func_void_t();
            return;
         default:
         }
      } catch (Exception var3) {
         switch(this.field_int_c) {
         case 0:
            class_a.field_int_Y = 6;
            return;
         default:
            class_a.func_void_s(7);
            class_a.func_void_a("Không thể mua. Xin hãy thử lại sau.");
            class_a.field_int_X = class_a.field_int_U;
            class_a.field_int_d = 7;
         }
      }
   }
}
