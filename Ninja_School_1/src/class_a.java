import java.io.IOException;
import java.io.InputStream;
import javax.bluetooth.LocalDevice;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.rms.RecordStore;

// $FF: renamed from: a
public final class class_a extends Canvas implements Runnable, CommandListener {
   // $FF: renamed from: Z java.lang.String
   private static String field_class_java_lang_String_Z = "TEAM";
   // $FF: renamed from: a boolean
   public static boolean field_boolean_a = true;
   // $FF: renamed from: aa int
   private static int field_int_aa = 40;
   // $FF: renamed from: ab java.lang.String[]
   private static String[] field_array_class_java_lang_String_ab = new String[]{"x1xx", "x2xx", "x3xx", "x4xx", "x5xx", "x6xx", "x7xx"};
   // $FF: renamed from: ac int[]
   private static int[] field_array_int_ac = new int[]{150, 180, 180, 300, 350, 380, 500};
   // $FF: renamed from: ad int[]
   private static int[] field_array_int_ad = new int[]{20, 30, 40, 100, 80, 120, 200};
   // $FF: renamed from: ae int[]
   private static int[] field_array_int_ae = new int[]{150, 140, 120, 240, 280, 290, 300};
   // $FF: renamed from: af int[]
   private static int[] field_array_int_af = new int[]{800, 1000, 1200, 3000, 3500, 4000, 6000};
   // $FF: renamed from: ag int[][]
   private static int[][] field_array_array_int_ag = new int[][]{{-5, -2}, {-2, -4}, {0, -5}, {-6, -6}, {-5, -2}, {-2, -4}, {0, -5}};
   // $FF: renamed from: ah int[][]
   private static int[][] field_array_array_int_ah = new int[][]{{5, 8}, {3, 3}, new int[2], {4, 4}, {5, 8}, {3, 3}, new int[2]};
   // $FF: renamed from: ai int[]
   private static int[] field_array_int_ai = new int[]{1, -2, 1, 1, 1, -2, 1};
   // $FF: renamed from: aj int[]
   private static int[] field_array_int_aj = new int[]{3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
   // $FF: renamed from: ak int[]
   private static int[] field_array_int_ak = new int[]{50, 150, 240, 400, 600, 800, 1000, 1500, 2000, 3000, 5000, 7000, 9000, 12000, 15000, 19000, 26000, 32000, 40000, 50000, 60000, 70000, 80000, 90000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000};
   // $FF: renamed from: al int[]
   private static int[] field_array_int_al = new int[]{20, 20, 20, 20, 30, 30, 30, 40, 40, 50, 60, 70, 80, 80, 90, 90, 100, 120, 130, 150, 160, 170, 180, 190, 200, 210, 220, 250, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300};
   // $FF: renamed from: am java.lang.String[]
   private static String[] field_array_class_java_lang_String_am = new String[]{"Ma một mắt", "ốc sên", "Dơi quỷ", "Quỷ một chân", "Cóc xanh", "Nhện", "Ong bò vẽ", "Bù nhìn rơm", "Cá cọp", "Ninja gió", "Cá cọp đỏ", "Ma một mắt", "Rết sa mạc", "Dơi vàng", "Chuột", "Thổ dân", "Ong đỏ", "Bò cạp", "Quỷ hoa", "Quỷ tử hoa"};
   // $FF: renamed from: an int[]
   private static int[] field_array_int_an = new int[]{140, 70, 150, 120, 150, 150, 60, 1000, 250, 500, 4000, 500, 600, 1000, 1500, 2000, 1000, 3500, 1500, 5500};
   // $FF: renamed from: ao int[]
   private static int[] field_array_int_ao = new int[]{15, 10, 30, 25, 25, 25, 5, 10, 20, 40, 30, 40, 130, 30, 40, 100, 60, 160, 120, 200};
   // $FF: renamed from: ap int[]
   private static int[] field_array_int_ap = new int[]{35, 20, 55, 40, 45, 50, 30, 130, 60, 65, 70, 75, 120, 85, 100, 120, 140, 160, 180, 200};
   // $FF: renamed from: aq int[]
   private static int[] field_array_int_aq = new int[]{20, 10, 50, 25, 30, 40, 15, 50, 60, 70, 80, 100, 120, 130, 160, 180, 170, 210, 190, 220};
   // $FF: renamed from: ar int[][][]
   private static int[][][] field_array_array_array_int_ar = new int[][][]{{{0, -13, 31}, {0, -7, 8}, {0, -11, 14}}, {{0, -13, 32}, {0, -7, 8}, {0, -11, 15}}, {{1, -11, 31}, {1, -9, 16}, {6, -1000, 0}}, {{2, -11, 32}, {2, -10, 16}, {6, -1000, 0}}, {{1, -11, 31}, {3, -8, 16}, {6, -1000, 0}}, {{2, -10, 32}, {7, -9, 17}, {6, -1000, 0}}, {{1, -10, 31}, {8, -8, 16}, {6, -1000, 0}}, {{0, -8, 35}, {4, -5, 15}, {2, -10, 21}}, {{0, -8, 34}, {5, -6, 13}, {3, -11, 22}}, {{0, -8, 31}, {6, -13, 9}, {4, -10, 18}}, {{1, -8, 30}, {6, -13, 9}, {5, -8, 17}}, {{2, -10, 30}, {6, -13, 9}, {6, -8, 16}}, {{2, -10, 29}, {6, -13, 9}, {7, -11, 17}}, {{3, -11, 33}, {8, -4, 13}, {8, -15, 25}}};
   // $FF: renamed from: as int[][][]
   private static int[][][] field_array_array_array_int_as = new int[][][]{{{0, -10, 32}, {1, -7, 7}, {1, -11, 15}}, {{0, -10, 33}, {1, -7, 7}, {1, -11, 16}}, {{1, -10, 33}, {2, -10, 11}, {2, -9, 16}}, {{1, -10, 32}, {3, -11, 9}, {3, -11, 16}}, {{1, -10, 34}, {4, -9, 9}, {4, -8, 16}}, {{1, -10, 34}, {5, -11, 11}, {5, -10, 17}}, {{1, -10, 33}, {6, -9, 9}, {6, -8, 16}}, {{0, -9, 36}, {7, -5, 15}, {7, -10, 21}}, {{4, -13, 26}, new int[3], new int[3]}, {{5, -13, 25}, new int[3], new int[3]}, {{6, -12, 26}, new int[3], new int[3]}, {{7, -13, 25}, new int[3], new int[3]}, {{0, -9, 35}, {8, -4, 13}, {8, -14, 27}}, {{0, -9, 32}, {9, -11, 9}, {10, -10, 18}}, {{2, -7, 34}, {9, -11, 9}, {11, -8, 16}}, {{2, -8, 33}, {9, -11, 9}, {12, -8, 15}}, {{2, -7, 33}, {9, -11, 9}, {13, -12, 16}}, {{0, -11, 32}, {9, -11, 9}, {14, -15, 19}}, {{2, -9, 33}, {9, -11, 9}, {15, -13, 20}}, {{2, -9, 32}, {9, -11, 9}, {16, -7, 23}}, {{2, -9, 33}, {9, -11, 9}, {17, -11, 19}}, {{3, -12, 34}, {8, -4, 13}, {8, -15, 25}}, {{0, -10, 28}, new int[3], {19, -8, 12}}, {{0, -9, 35}, {8, -4, 13}, {9, -9, 22}}, {{0, -10, 33}, new int[3], new int[3]}, {{9, -4, 24}, new int[3], new int[3]}, {{10, -4, 22}, new int[3], new int[3]}, {{0, -9, 32}, {8, -4, 9}, {10, -10, 18}}, {{2, -7, 34}, {8, -4, 9}, {11, -8, 16}}, {{2, -8, 33}, {8, -4, 9}, {12, -8, 15}}, {{2, -7, 33}, {8, -4, 9}, {13, -12, 16}}, {{0, -11, 32}, {7, -5, 9}, {14, -15, 19}}, {{2, -9, 33}, {7, -5, 9}, {15, -13, 20}}, {{2, -9, 32}, {7, -5, 9}, {16, -7, 23}}, {{2, -9, 33}, {7, -5, 9}, {17, -11, 19}}, {{0, -9, 32}, {2, -10, 11}, {10, -10, 18}}, {{2, -7, 34}, {3, -11, 9}, {11, -8, 16}}, {{2, -8, 33}, {4, -9, 9}, {12, -8, 15}}, {{2, -7, 33}, {5, -11, 11}, {13, -12, 16}}, {{0, -11, 32}, {2, -10, 11}, {14, -15, 19}}, {{2, -9, 33}, {3, -11, 9}, {15, -13, 20}}, {{2, -9, 32}, {4, -9, 9}, {16, -7, 23}}, {{2, -9, 33}, {5, -11, 11}, {17, -11, 19}}, {{1, -8, 38}, new int[3], {18, -8, 21}}, {{1, -8, 39}, new int[3], {18, -8, 22}}, {{1, -10, 43}, new int[3], {18, -11, 26}}};
   // $FF: renamed from: at int[]
   private static int[] field_array_int_at = new int[]{-2, -6, 22, 21, 19, 22, 10, -2, -2, 5, 19};
   // $FF: renamed from: au int[]
   private static int[] field_array_int_au = new int[]{9, 22, 25, 17, 26, 37, 36, 49, 50, 52, 36};
   // $FF: renamed from: av int[][]
   private static int[][] field_array_array_int_av = new int[][]{{2, 1, 1, 5, 3}, {2, 4, 3}, {2, 3}, {2, 1, 3}, {6, 3}, {2, 7, 3}, {2, 8, 3}, {2, 9, 3}, {2, 3}, {1, 3}, {2, 3}};
   // $FF: renamed from: aw int[][]
   private static int[][] field_array_array_int_aw = new int[][]{{0, 1, 2, 5, 0}, {3, 4, 0}, {6, 0}, {7, 8, 0}, {9, 0}, {10, 11, 0}, {12, 13, 0}, {14, 15, 0}, {16, 0}, {17, 0}, {18, 0}};
   // $FF: renamed from: ax int[][]
   private static int[][] field_array_array_int_ax = new int[][]{{0, 360, 1128, 0, 0}, new int[3], new int[2], {0, 2784, 0}, {1248, 0}, new int[3], new int[3], new int[3], new int[2], new int[2], new int[2]};
   // $FF: renamed from: ay int[][]
   private static int[][] field_array_array_int_ay = new int[][]{new int[5], new int[3], new int[2], new int[3], {408, 0}, new int[3], new int[3], new int[3], new int[2], new int[2], new int[2]};
   // $FF: renamed from: az int[][]
   private static int[][] field_array_array_int_az = new int[][]{{15, 1, 1, 2, 2, 1, 2, 4, 5, 3}, {6, 15, 1, 2, 1, 2, 1, 2, 1, 2, 4, 5, 3}, {6, 1, 2, 8, 11, 4, 7, 1, 2, 1, 2, 3}, {8, 9, 15, 12, 14, 10, 4, 16, 5, 1, 2, 3}, {7, 17}, {4, 1, 2, 17}, {8, 9, 15, 12, 14, 10, 4, 18, 4, 7, 3}, {1, 2, 4, 5, 3}, {6, 4, 19, 3}, {4, 20, 21, 3}, {4, 3}, {4, 22, 3}, {23, 4, 7, 4, 3}, {23, 25, 4, 7, 24, 26, 3}, {27, 4, 7, 4, 28, 3}, {4, 31, 32, 7, 4, 31, 4, 7, 4, 8, 17, 3}, {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 29, 3}, {4, 30, 3}, {15, 31, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 33, 17, 3}};
   // $FF: renamed from: aA int[][]
   private static int[][] field_array_array_int_aA = new int[][]{{1, -4, -1, -1, -4, -4, -4, 0, 20000, 0}, {0, 2, -4, -4, -5, -5, -5, -5, -5, -5, 1, 20000, 0}, {0, -5, -5, 0, 0, 2, 0, 55, 55, -4, -4, 0}, {0, 1, 0, 2, 3, 4, 3, 432, 20000, -4, -4, 0}, {0, 4}, {4, 55, 55, 0}, {0, 5, 3, 6, 7, 8, 5, 2, 6, 0, 0}, {-4, -4, 7, 20000, 0}, {0, 8, 0, 0}, {9, 0, 0, 0}, {10, 0}, {11, 0, 0}, {0, 12, 0, 13, 0}, {0, 0, 14, 0, 600, 0, 0}, {0, 15, 0, 16, 0, 0}, {17, 0, 0, 0, 55, 0, 56, 0, 57, 0, 94, 0}, {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 0, 0}, {54, 0, 0}, {4, 0, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 0, 0, 0}};
   // $FF: renamed from: aB int[][]
   private static int[][] field_array_array_int_aB = new int[][]{{5, 26, 30, 33, 41, 48, 53, 57, 58, 60}, {5, 6, 8, 9, 18, 20, 30, 32, 39, 40, 60, 63, 67}, {5, 6, 7, 13, 14, 19, 21, 34, 35, 60, 79, 80}, {1, 2, 3, 20, 50, 80, 85, 90, 92, 93, 95, 0}, {5, 6}, {10, 12, 13, 50}, {1, 2, 3, 4, 5, 6, 17, 18, 19, 20, 21}, {5, 10, 20, 30, 32}, {5, 10, 15, 20}, {10, 15, 20, 25}, {20, 25}, {10, 12, 14}, {15, 30, 35, 45, 55}, {10, 12, 30, 40, 45, 50, 75}, {15, 30, 35, 45, 53, 55}, {10, 12, 13, 40, 50, 60, 70, 80, 90, 95, 100, 105}, {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47}, {10, 12, 14}, {10, 11, 60, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74}};
   // $FF: renamed from: aC int[][]
   private static int[][] field_array_array_int_aC = new int[][]{{1344, 288}, {816, 48}, {816, 192}, {744, 192}, {144, 264}, {1440, 96}, {1368, 288}, {1128, 288}, {840, 312}};
   // $FF: renamed from: aD int[]
   private static int[] field_array_int_aD = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 4, 0, 3, 0, 6, 0, 2, 0, 5, 0, 4, 0, 1, 0, 3, 0, 0, 0, 5, 0, 4, 0, 3, 0, 2, 0, 2, 0, 1, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 2, 1, 3, 2, 2};
   // $FF: renamed from: aE int[]
   private static int[] field_array_int_aE = new int[]{0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 2, 3, 0, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 4, 0, 4, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2};
   // $FF: renamed from: aF java.lang.String[]
   private static String[] field_array_class_java_lang_String_aF = new String[]{"Chơi mới", "Chơi tiếp", "Chỉ dẫn", "Game khác", "Thoát"};
   // $FF: renamed from: aG java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_aG = new String[][]{{"Rừng trúc đây rồi!", "Hôm nay ta phải hạ được con quái vật đó!", "Nó chắc quanh quẩn đây thôi!"}, {"Bọn quái vật nhãi nhép này làm gì được ta chứ!"}, {"Con quái vật hung hăng kia rồi!", "Ngươi phải đền tội vì những gì gây ra!"}, {"Này các con, sau bao năm tháng tập luyện...", "Đây là lúc các con thể hiện tài năng!", "Gần đây, trong khu rừng trúc...", "..xuất hiện 1 con quái vật to lớn..", "Nó thường phá phách, đe dọa dân làng.", "Các con biết phải làm gì rồi chứ?", "Đây là lúc các con chứng minh khả năng của mình.. ", "Đi đi. Và hãy cẩn thận đấy !!"}, {"Chết đi, con quái vật hung hăng kia !!!", "Hahahaha!"}, {"Chào mừng ngươi đến với trường đào tạo ninja Hirosaki.", "Ta là Okamesama, hiệu trưởng trường này.", "Tại đây chúng ta sẽ đào tạo các ngươi, trở thành những ninja chuyên nghiệp.", "Giáo viên chủ nhiêm của ngươi là thầy Takanashi", "Hãy đến gặp thầy để nhận bài tập.", "Có vấn đề gì, ngươi có thể hỏi những đồng môn của mình.", "Chúc ngươi sớm đạt được thành công nhé."}, {"Vâng, thưa thầy!"}, {"Con đường hoa đào đây rồi.", "Con bé ấy đâu rồi nhỉ?"}, {"Chào bạn! Bạn có phải là em gái cô Ayumi không?", "Thầy Takanashi bận nên nhờ mình đón bạn giúp.", "Đi theo mình nhé, chúng ta sẽ về trường!"}, {"Tốt lắm, con đã đưa cô bé về an toàn!", "Đây ta có món quà gì giá trị để tặng con..", "Đây là tấm bằng lái xe có chữ ký của ta. Kể từ nay con có thể sử dụng những chiếc xe máy rồi!", "Nhớ phải lái cẩn thận và đội mũ bảo hiểm, nếu không là CSGT phạt đó!"}, {"Thuỷ quái hạ nguồn sông Waramato, con quái trong truyền thuyết !", "Một khi nó chưa bị tiêu diệt, ta sẽ không đi tiếp!"}, {"Chết đi, con quái vật kia!", "Từ nay con sông này sẽ trở lại thanh bình rồi!", "Ta tiếp tục cuộc hành trình thôi!"}, {"Ngươi cũng lặn lội đến tận đây được à, khá đấy!", "Hãy bỏ ngôi trường ấy đi, theo ta lập căn cứ, ngươi sẽ có tất cả.", "Nếu không theo ta, ngươi sẽ hối hận đấy... HaHaHa!"}, {"Không đời nào, tên phản bội kia!"}, {"Ngươi khá lắm! Hãy đợi đấy, ta sẽ nhớ mối thù này!", "Hẹn gặp lại ngươi!!!"}, {"Chúng ta lại gặp nhau rồi!", "Ta cho ngươi một cơ hội lần cuối. hãy theo ta, hoặc là chết!"}, {"Haha. Tên phản bội kia, ta sẽ cho mi biết sức mạnh một ninja thực thụ!"}, {"Cuối cùng thì mi cũng đã phải dền tội!"}, {"Các con hãy cho biết làm cách nào để di chuyển!"}, {"Sử dụng phím mũi tên hoặc phím 2,4,6,8!"}, {"Làm thế nào để tấn công?, Kunio"}, {"Sử dụng phím 5 hoặc phím chọn giữa!"}, {"Làm thế nào để trò chuyện với bạn bè hoặc thầy cô?,Lee"}, {"Đứng gần người đó rồi bấm Giao Tiếp!"}, {"Làm thế nào để biết mình đang ở đâu! Katashi"}, {"Chọn menu/Xem bản đồ!"}, {"Làm thế nào khi hết HP hoặc MP! Toniku"}, {"Chọn menu/Sử dụng Item, chọn một bình HP/MP để sử dụng!"}, {"Uhm..Nếu không còn bình HP/MP nào thì sao? Minori"}, {"Gặp ông bán hàng mua tại trường, ở gần ký túc xá!"}, {"Tốt. Làm thế nào để di chuyển nhanh từ khu vực này đến khu vực khác?"}, {"Mở bản đồ, chọn 1 địa điểm để di chuyển đến!"}, {"Đúng rồi, Làm sao để sử dụng phi tiêu?,Ryuu"}, {"Bấm phím 1 sẽ chuyển sang chế độ phi tiêu.", "Bấm phím 1 lần nữa để quay lại đánh kiếm!"}, {"Tốt. Làm sao để sử dụng khinh công?"}, {"Học khinh công từ cô Ayumi. Bấm phím mũi tên lên hoặc phím 2 nhiều lần!"}, {"Uhm..Làm sao để độn thổ!"}, {"Học độn thổ từ thầy Honda. Bấm và giữ luôn phím xuống hoặc phím 8!"}, {"Khi nào mới có thể lái xe môtô?"}, {"Học lái xe từ thầy Takanashi, được cấp bằng lái", "Sau đó có thể nhảy lên chạy bất kỳ chiếc mô tô nào !"}, {"Làm sao để chạy trên mặt nước? huh ? Sadao"}, {"Học thuật chạy nước/ lặn nước từ thầy Honda! Sau đó có thể chạy trên mặt nước!"}, {"Làm sao để biến hình!"}, {"Bấm phím 7. Sau khi đã học phép biến hình từ thầy Hiroyaki"}, {"Làm sao để tàng hình!"}, {"Bấm phím 3. Sau khi đã học phép tàng hình từ thầy Honda"}, {"Tốt! Cho ta biết ai phát triển game này!"}, {"Nhóm TeaMobile!"}, {"Cụ thể là ai?"}, {"...Con không biết..."}, {"Hmm, có thể tìm thêm nhiều game hay khác ở đâu?"}, {"www.teamobi.com hay www.wap.teamobi.com"}, {"Tốt, các con có thể giải tán !"}, {"Chúng con chào thầy !"}, {"Cảm ơn, mi thật tốt bụng. Hẹn gặp lại!", "Quên mất, lúc nãy cô Ayumi dặn ta gặp cô ấy ngay.", "Hihi, gặp lại mi sau!"}, {"Sakura, bạn có sao không!"}, {"Mình không sao, bạn không bị thương chứ!"}, {"Mình cũng không sao! Tên Toniku chắc cũng không chạy xa được đâu , hắn cũng sớm bị bắt thôi!", "Chúng ta về thôi!"}, {"Toniku, ngươi đã biết tội chưa!"}, {"..vâng..con biết...."}, {"Theo nội quy của nhà trường. Ngươi phải rời khỏi ngôi trường này.", "Vĩnh viễn không được trở lại nữa.."}, {"......"}, {"Thưa thầy...", "Toniku vốn là học sinh giỏi của trường..", " Chỉ vì nghe lời xúi giục của bọn xấu nên mới hành động như thế...", "Đây là lần vi phạm đầu tiên, xin nhà trường tha thứ cho bạn ấy..."}, {"......"}, {"Xin các thầy hãy tha thứ cho bạn ấy ạ!"}, {"..thôi được rồi..", "Tội Toniku rất nặng, đáng lẽ ra phải bị đuổi học.", "Con đường để thành một nhẫn giả thật gian lao và chông gai..", "..ngươi phải luyện tập bằng khả năng và sức lực của mình", " sẽ không có con đường nào khác", " ... các con đều biết chữ Nhẫn gồm chữ Đao và chữ Tâm.", "..nếu Tâm không tịnh thì Đao sẽ bổ xuống!", "Các con hãy lấy Toniku mà làm gương ...", "Toniku, ngươi đã quá tham lam...", "..nhưng ta cũng thây nơi con người ngươi có tố chất tiềm tàng!", "Nên ta quyết định tha cho con lần này...", "Sẽ không có lần sau, Toniku, ngươi nhớ đấy!!"}, {"Vâng, con xin cảm ơn thầy!"}, {"Sẵn đây ta muốn nhắc nhở thêm các con..", "Hai tháng nữa là đến kỳ thi kết khoá cho Genin. Các con phải cố gắng tập luyện hơn nữa..", "..Mọi thứ chỉ mới bắt đầu thôi!"}, {"Vâng, chúng con xin nghe!"}};
   // $FF: renamed from: aH java.lang.String[]
   private static String[] field_array_class_java_lang_String_aH = new String[]{"Trường đạo tạo Ninja Hirosaki, Mùa thu 1937", "2 ngày sau, tại rừng trúc...", "Chỉ dẫn: Dùng phím 5 để tấn công.", "6 tháng trước, tại trường Hirosaki...", "2 ngày sau, tại trường Hirosaki..."};
   // $FF: renamed from: aI java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_aI = new String[][]{{"Chúng ta đi thôi!"}, {"Muốn rủ ta đi chơi à!", "Ta chỉ chơi với những người cùng trình độ thôi.", "Ngươi hãy tập luyện đi, bao giờ khá hơn thì quay lại. Đừng ở đó tán gái nữa!"}, {"Muốn rủ ta cùng đi à?", "OK, nhưng chỉ một lúc thôi nhé, nếu không chị Ayumi mắng ta đó!"}, {"Ta muốn đến miếu Koujin chơi, mi có thể dẫn đường chứ!", "Nếu sợ, mi có thể ở nhà, ta sẽ tự đi. Haha!"}};
   // $FF: renamed from: aJ int[][][]
   private static int[][][] field_array_array_array_int_aJ;
   // $FF: renamed from: aK int[]
   private static int[] field_array_int_aK;
   // $FF: renamed from: aL int[]
   private static int[] field_array_int_aL;
   // $FF: renamed from: aM int
   private static int field_int_aM;
   // $FF: renamed from: aN a
   private static class_a field_class_a_aN;
   // $FF: renamed from: aO boolean
   private static boolean field_boolean_aO;
   // $FF: renamed from: aP boolean
   private static boolean field_boolean_aP;
   // $FF: renamed from: aQ int
   private static int field_int_aQ;
   // $FF: renamed from: aR int
   private static int field_int_aR;
   // $FF: renamed from: aS boolean
   private static boolean field_boolean_aS;
   // $FF: renamed from: aT boolean
   private static boolean field_boolean_aT;
   // $FF: renamed from: aU boolean[]
   private static boolean[] field_array_boolean_aU;
   // $FF: renamed from: aV boolean[]
   private static boolean[] field_array_boolean_aV;
   // $FF: renamed from: aW int
   private static int field_int_aW;
   // $FF: renamed from: aX int
   private static int field_int_aX;
   // $FF: renamed from: aY int
   private static int field_int_aY;
   // $FF: renamed from: aZ int
   private static int field_int_aZ;
   // $FF: renamed from: ba int
   private static int field_int_ba;
   // $FF: renamed from: b boolean
   public static boolean field_boolean_b;
   // $FF: renamed from: c boolean
   public static boolean field_boolean_c;
   // $FF: renamed from: bb int
   private static int field_int_bb;
   // $FF: renamed from: bc int
   private static int field_int_bc;
   // $FF: renamed from: bd int
   private static int field_int_bd;
   // $FF: renamed from: be int
   private static int field_int_be;
   // $FF: renamed from: bf int
   private static int field_int_bf;
   // $FF: renamed from: bg int
   private static int field_int_bg;
   // $FF: renamed from: d int
   public static int field_int_d;
   // $FF: renamed from: bh boolean
   private static boolean field_boolean_bh;
   // $FF: renamed from: e int[]
   public static int[] field_array_int_e;
   // $FF: renamed from: f int[]
   public static int[] field_array_int_f;
   // $FF: renamed from: g int
   public static int field_int_g;
   // $FF: renamed from: h int
   public static int field_int_h;
   // $FF: renamed from: i int
   public static int field_int_i;
   // $FF: renamed from: j int
   public static int field_int_j;
   // $FF: renamed from: k int
   public static int field_int_k;
   // $FF: renamed from: l int
   public static int field_int_l;
   // $FF: renamed from: m int
   public static int field_int_m;
   // $FF: renamed from: n java.lang.String
   public static String field_class_java_lang_String_n;
   // $FF: renamed from: o java.lang.String
   public static String field_class_java_lang_String_o;
   // $FF: renamed from: bi int
   private static int field_int_bi;
   // $FF: renamed from: bj int
   private static int field_int_bj;
   // $FF: renamed from: bk int
   private static int field_int_bk;
   // $FF: renamed from: bl int
   private static int field_int_bl;
   // $FF: renamed from: bm int
   private static int field_int_bm;
   // $FF: renamed from: bn int
   private static int field_int_bn;
   // $FF: renamed from: bo int
   private static int field_int_bo;
   // $FF: renamed from: bp int
   private static int field_int_bp;
   // $FF: renamed from: bq int
   private static int field_int_bq;
   // $FF: renamed from: br int
   private static int field_int_br;
   // $FF: renamed from: bs int
   private static int field_int_bs;
   // $FF: renamed from: bt int
   private static int field_int_bt;
   // $FF: renamed from: bu int
   private static int field_int_bu;
   // $FF: renamed from: bv int
   private static int field_int_bv;
   // $FF: renamed from: bw int
   private static int field_int_bw;
   // $FF: renamed from: bx int
   private static int field_int_bx;
   // $FF: renamed from: by java.lang.String
   private static String field_class_java_lang_String_by;
   // $FF: renamed from: bz int
   private static int field_int_bz;
   // $FF: renamed from: bA int
   private static int field_int_bA;
   // $FF: renamed from: bB int
   private static int field_int_bB;
   // $FF: renamed from: bC int
   private static int field_int_bC;
   // $FF: renamed from: bD int
   private static int field_int_bD;
   // $FF: renamed from: bE int
   private static int field_int_bE;
   // $FF: renamed from: p int
   public static int field_int_p;
   // $FF: renamed from: q int
   public static int field_int_q;
   // $FF: renamed from: r int
   public static int field_int_r;
   // $FF: renamed from: bF int
   private static int field_int_bF;
   // $FF: renamed from: bG int
   private static int field_int_bG;
   // $FF: renamed from: bH int
   private static int field_int_bH;
   // $FF: renamed from: bI int
   private static int field_int_bI;
   // $FF: renamed from: bJ int
   private static int field_int_bJ;
   // $FF: renamed from: bK int
   private static int field_int_bK;
   // $FF: renamed from: bL int
   private static int field_int_bL;
   // $FF: renamed from: bM int
   private static int field_int_bM;
   // $FF: renamed from: bN int
   private static int field_int_bN;
   // $FF: renamed from: bO int
   private static int field_int_bO;
   // $FF: renamed from: bP int
   private static int field_int_bP;
   // $FF: renamed from: bQ int[]
   private static int[] field_array_int_bQ;
   // $FF: renamed from: bR int[]
   private static int[] field_array_int_bR;
   // $FF: renamed from: bS int[]
   private static int[] field_array_int_bS;
   // $FF: renamed from: bT int[]
   private static int[] field_array_int_bT;
   // $FF: renamed from: bU int[]
   private static int[] field_array_int_bU;
   // $FF: renamed from: bV int[]
   private static int[] field_array_int_bV;
   // $FF: renamed from: bW int
   private static int field_int_bW;
   // $FF: renamed from: bX int[]
   private static int[] field_array_int_bX;
   // $FF: renamed from: bY int[]
   private static int[] field_array_int_bY;
   // $FF: renamed from: bZ int[]
   private static int[] field_array_int_bZ;
   // $FF: renamed from: ca int[]
   private static int[] field_array_int_ca;
   // $FF: renamed from: cb int[]
   private static int[] field_array_int_cb;
   // $FF: renamed from: cc int[]
   private static int[] field_array_int_cc;
   // $FF: renamed from: cd int[]
   private static int[] field_array_int_cd;
   // $FF: renamed from: ce int[]
   private static int[] field_array_int_ce;
   // $FF: renamed from: cf int[]
   private static int[] field_array_int_cf;
   // $FF: renamed from: cg int[]
   private static int[] field_array_int_cg;
   // $FF: renamed from: ch int[]
   private static int[] field_array_int_ch;
   // $FF: renamed from: ci int[]
   private static int[] field_array_int_ci;
   // $FF: renamed from: cj int[]
   private static int[] field_array_int_cj;
   // $FF: renamed from: ck int[]
   private static int[] field_array_int_ck;
   // $FF: renamed from: cl int[]
   private static int[] field_array_int_cl;
   // $FF: renamed from: cm int[]
   private static int[] field_array_int_cm;
   // $FF: renamed from: cn int[]
   private static int[] field_array_int_cn;
   // $FF: renamed from: co int[]
   private static int[] field_array_int_co;
   // $FF: renamed from: cp boolean
   private static boolean field_boolean_cp;
   // $FF: renamed from: cq int
   private static int field_int_cq;
   // $FF: renamed from: cr java.lang.String
   private static String field_class_java_lang_String_cr;
   // $FF: renamed from: cs int
   private static int field_int_cs;
   // $FF: renamed from: ct int[]
   private static int[] field_array_int_ct;
   // $FF: renamed from: cu int[]
   private static int[] field_array_int_cu;
   // $FF: renamed from: cv int[]
   private static int[] field_array_int_cv;
   // $FF: renamed from: cw int[]
   private static int[] field_array_int_cw;
   // $FF: renamed from: cx int[]
   private static int[] field_array_int_cx;
   // $FF: renamed from: cy int[]
   private static int[] field_array_int_cy;
   // $FF: renamed from: cz int[]
   private static int[] field_array_int_cz;
   // $FF: renamed from: cA int[]
   private static int[] field_array_int_cA;
   // $FF: renamed from: cB int[]
   private static int[] field_array_int_cB;
   // $FF: renamed from: cC int[]
   private static int[] field_array_int_cC;
   // $FF: renamed from: cD int[]
   private static int[] field_array_int_cD;
   // $FF: renamed from: cE int[]
   private static int[] field_array_int_cE;
   // $FF: renamed from: cF int[]
   private static int[] field_array_int_cF;
   // $FF: renamed from: cG int[]
   private static int[] field_array_int_cG;
   // $FF: renamed from: cH int[]
   private static int[] field_array_int_cH;
   // $FF: renamed from: cI int[]
   private static int[] field_array_int_cI;
   // $FF: renamed from: cJ int[]
   private static int[] field_array_int_cJ;
   // $FF: renamed from: cK int[]
   private static int[] field_array_int_cK;
   // $FF: renamed from: cL int[]
   private static int[] field_array_int_cL;
   // $FF: renamed from: cM int[]
   private static int[] field_array_int_cM;
   // $FF: renamed from: cN int[]
   private static int[] field_array_int_cN;
   // $FF: renamed from: cO int[]
   private static int[] field_array_int_cO;
   // $FF: renamed from: cP int
   private static int field_int_cP;
   // $FF: renamed from: cQ int[]
   private static int[] field_array_int_cQ;
   // $FF: renamed from: cR int[]
   private static int[] field_array_int_cR;
   // $FF: renamed from: cS int[]
   private static int[] field_array_int_cS;
   // $FF: renamed from: cT int[]
   private static int[] field_array_int_cT;
   // $FF: renamed from: cU int[]
   private static int[] field_array_int_cU;
   // $FF: renamed from: cV int[]
   private static int[] field_array_int_cV;
   // $FF: renamed from: cW int[]
   private static int[] field_array_int_cW;
   // $FF: renamed from: cX int[]
   private static int[] field_array_int_cX;
   // $FF: renamed from: cY int
   private static int field_int_cY;
   // $FF: renamed from: cZ int[]
   private static int[] field_array_int_cZ;
   // $FF: renamed from: da int[]
   private static int[] field_array_int_da;
   // $FF: renamed from: db int[]
   private static int[] field_array_int_db;
   // $FF: renamed from: dc int[]
   private static int[] field_array_int_dc;
   // $FF: renamed from: dd int[]
   private static int[] field_array_int_dd;
   // $FF: renamed from: de int[]
   private static int[] field_array_int_de;
   // $FF: renamed from: df boolean[]
   private static boolean[] field_array_boolean_df;
   // $FF: renamed from: dg int
   private static int field_int_dg;
   // $FF: renamed from: dh int
   private static int field_int_dh;
   // $FF: renamed from: di int[]
   private static int[] field_array_int_di;
   // $FF: renamed from: dj int[]
   private static int[] field_array_int_dj;
   // $FF: renamed from: dk int[]
   private static int[] field_array_int_dk;
   // $FF: renamed from: dl int[]
   private static int[] field_array_int_dl;
   // $FF: renamed from: dm int[]
   private static int[] field_array_int_dm;
   // $FF: renamed from: dn int[]
   private static int[] field_array_int_dn;
   // $FF: renamed from: do int[]
   private static int[] field_array_int_do;
   // $FF: renamed from: dp int[]
   private static int[] field_array_int_dp;
   // $FF: renamed from: dq boolean
   private static boolean field_boolean_dq;
   // $FF: renamed from: dr int
   private static int field_int_dr;
   // $FF: renamed from: ds int
   private static int field_int_ds;
   // $FF: renamed from: dt int
   private static int field_int_dt;
   // $FF: renamed from: du int
   private static int field_int_du;
   // $FF: renamed from: dv int
   private static int field_int_dv;
   // $FF: renamed from: dw boolean[]
   private static boolean[] field_array_boolean_dw;
   // $FF: renamed from: dx int
   private static int field_int_dx;
   // $FF: renamed from: dy java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_dy;
   // $FF: renamed from: dz boolean
   private static boolean field_boolean_dz;
   // $FF: renamed from: dA boolean
   private static boolean field_boolean_dA;
   // $FF: renamed from: dB int
   private static int field_int_dB;
   // $FF: renamed from: dC int[]
   private static int[] field_array_int_dC;
   // $FF: renamed from: dD int[]
   private static int[] field_array_int_dD;
   // $FF: renamed from: dE int[]
   private static int[] field_array_int_dE;
   // $FF: renamed from: dF int[]
   private static int[] field_array_int_dF;
   // $FF: renamed from: dG int[]
   private static int[] field_array_int_dG;
   // $FF: renamed from: dH int[]
   private static int[] field_array_int_dH;
   // $FF: renamed from: dI int[]
   private static int[] field_array_int_dI;
   // $FF: renamed from: dJ int[]
   private static int[] field_array_int_dJ;
   // $FF: renamed from: dK int[]
   private static int[] field_array_int_dK;
   // $FF: renamed from: dL int[]
   private static int[] field_array_int_dL;
   // $FF: renamed from: dM int[]
   private static int[] field_array_int_dM;
   // $FF: renamed from: dN int[]
   private static int[] field_array_int_dN;
   // $FF: renamed from: dO int[]
   private static int[] field_array_int_dO;
   // $FF: renamed from: dP int[]
   private static int[] field_array_int_dP;
   // $FF: renamed from: dQ int[]
   private static int[] field_array_int_dQ;
   // $FF: renamed from: dR java.lang.String[]
   private static String[] field_array_class_java_lang_String_dR;
   // $FF: renamed from: dS int[]
   private static int[] field_array_int_dS;
   // $FF: renamed from: dT int[]
   private static int[] field_array_int_dT;
   // $FF: renamed from: dU int[]
   private static int[] field_array_int_dU;
   // $FF: renamed from: dV int[]
   private static int[] field_array_int_dV;
   // $FF: renamed from: dW int[]
   private static int[] field_array_int_dW;
   // $FF: renamed from: dX int[]
   private static int[] field_array_int_dX;
   // $FF: renamed from: dY int
   private static int field_int_dY;
   // $FF: renamed from: dZ int
   private static int field_int_dZ;
   // $FF: renamed from: ea int
   private static int field_int_ea;
   // $FF: renamed from: eb javax.microedition.lcdui.Image[][]
   private static Image[][] field_array_array_class_javax_microedition_lcdui_Image_eb;
   // $FF: renamed from: ec javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ec;
   // $FF: renamed from: ed javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_ed;
   // $FF: renamed from: s javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_s;
   // $FF: renamed from: ee javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ee;
   // $FF: renamed from: ef javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_ef;
   // $FF: renamed from: eg javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eg;
   // $FF: renamed from: eh javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_eh;
   // $FF: renamed from: t javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_t;
   // $FF: renamed from: u javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_u;
   // $FF: renamed from: ei javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ei;
   // $FF: renamed from: ej javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ej;
   // $FF: renamed from: ek javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_ek;
   // $FF: renamed from: el javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_el;
   // $FF: renamed from: em javax.microedition.lcdui.Image[][]
   private static Image[][] field_array_array_class_javax_microedition_lcdui_Image_em;
   // $FF: renamed from: en javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_en;
   // $FF: renamed from: eo javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eo;
   // $FF: renamed from: ep javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ep;
   // $FF: renamed from: eq javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eq;
   // $FF: renamed from: er javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_er;
   // $FF: renamed from: es javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_es;
   // $FF: renamed from: et javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_et;
   // $FF: renamed from: eu javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eu;
   // $FF: renamed from: ev javax.microedition.lcdui.Image[][]
   private static Image[][] field_array_array_class_javax_microedition_lcdui_Image_ev;
   // $FF: renamed from: ew javax.microedition.lcdui.Image[][]
   private static Image[][] field_array_array_class_javax_microedition_lcdui_Image_ew;
   // $FF: renamed from: ex javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ex;
   // $FF: renamed from: ey javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ey;
   // $FF: renamed from: ez javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_ez;
   // $FF: renamed from: eA javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eA;
   // $FF: renamed from: eB javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eB;
   // $FF: renamed from: eC javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eC;
   // $FF: renamed from: eD javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_eD;
   // $FF: renamed from: eE javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eE;
   // $FF: renamed from: eF javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eF;
   // $FF: renamed from: eG javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_eG;
   // $FF: renamed from: v int
   public static int field_int_v;
   // $FF: renamed from: w int
   public static int field_int_w;
   // $FF: renamed from: eH boolean
   private static boolean field_boolean_eH;
   // $FF: renamed from: eI boolean
   private static boolean field_boolean_eI;
   // $FF: renamed from: eJ boolean
   private static boolean field_boolean_eJ;
   // $FF: renamed from: eK boolean
   private static boolean field_boolean_eK;
   // $FF: renamed from: eL boolean
   private static boolean field_boolean_eL;
   // $FF: renamed from: eM boolean
   private static boolean field_boolean_eM;
   // $FF: renamed from: eN boolean
   private static boolean field_boolean_eN;
   // $FF: renamed from: eO boolean
   private static boolean field_boolean_eO;
   // $FF: renamed from: eP boolean
   private static boolean field_boolean_eP;
   // $FF: renamed from: eQ boolean
   private static boolean field_boolean_eQ;
   // $FF: renamed from: eR boolean
   private static boolean field_boolean_eR;
   // $FF: renamed from: eS boolean
   private static boolean field_boolean_eS;
   // $FF: renamed from: eT boolean
   private static boolean field_boolean_eT;
   // $FF: renamed from: eU boolean
   private static boolean field_boolean_eU;
   // $FF: renamed from: eV boolean
   private static boolean field_boolean_eV;
   // $FF: renamed from: eW boolean
   private static boolean field_boolean_eW;
   // $FF: renamed from: eX boolean
   private static boolean field_boolean_eX;
   // $FF: renamed from: eY boolean
   private static boolean field_boolean_eY;
   // $FF: renamed from: eZ boolean
   private static boolean field_boolean_eZ;
   // $FF: renamed from: fa boolean
   private static boolean field_boolean_fa;
   // $FF: renamed from: fb boolean
   private static boolean field_boolean_fb;
   // $FF: renamed from: fc boolean
   private static boolean field_boolean_fc;
   // $FF: renamed from: fd boolean
   private static boolean field_boolean_fd;
   // $FF: renamed from: fe boolean
   private static boolean field_boolean_fe;
   // $FF: renamed from: ff int
   private static int field_int_ff;
   // $FF: renamed from: fg int
   private static int field_int_fg;
   // $FF: renamed from: x int
   public static int field_int_x;
   // $FF: renamed from: fh int
   private static int field_int_fh;
   // $FF: renamed from: fi int
   private static int field_int_fi;
   // $FF: renamed from: y int
   public static int field_int_y;
   // $FF: renamed from: z int
   public static int field_int_z;
   // $FF: renamed from: A int
   public static int field_int_A;
   // $FF: renamed from: B int
   public static int field_int_B;
   // $FF: renamed from: fj int
   private static int field_int_fj;
   // $FF: renamed from: fk int
   private static int field_int_fk;
   // $FF: renamed from: fl int
   private static int field_int_fl;
   // $FF: renamed from: fm int
   private static int field_int_fm;
   // $FF: renamed from: fn int
   private static int field_int_fn;
   // $FF: renamed from: fo int
   private static int field_int_fo;
   // $FF: renamed from: fp int
   private static int field_int_fp;
   // $FF: renamed from: C int
   public static int field_int_C;
   // $FF: renamed from: D int
   public static int field_int_D;
   // $FF: renamed from: fq int
   private static int field_int_fq;
   // $FF: renamed from: E int
   public static int field_int_E;
   // $FF: renamed from: F int
   public static int field_int_F;
   // $FF: renamed from: G int
   public static int field_int_G;
   // $FF: renamed from: H int
   public static int field_int_H;
   // $FF: renamed from: I int
   public static int field_int_I;
   // $FF: renamed from: J int
   public static int field_int_J;
   // $FF: renamed from: K int
   public static int field_int_K;
   // $FF: renamed from: L int
   public static int field_int_L;
   // $FF: renamed from: fr int
   private static int field_int_fr;
   // $FF: renamed from: fs int
   private static int field_int_fs;
   // $FF: renamed from: ft int
   private static int field_int_ft;
   // $FF: renamed from: fu boolean
   private static boolean field_boolean_fu;
   // $FF: renamed from: fv int
   private static int field_int_fv;
   // $FF: renamed from: fw int
   private static int field_int_fw;
   // $FF: renamed from: M int
   public static int field_int_M;
   // $FF: renamed from: N int
   public static int field_int_N;
   // $FF: renamed from: fx boolean
   private static boolean field_boolean_fx;
   // $FF: renamed from: fy boolean
   private static boolean field_boolean_fy;
   // $FF: renamed from: fz boolean
   private static boolean field_boolean_fz;
   // $FF: renamed from: fA boolean
   private static boolean field_boolean_fA;
   // $FF: renamed from: O int
   public static int field_int_O;
   // $FF: renamed from: fB int
   private static int field_int_fB;
   // $FF: renamed from: fC int
   private static int field_int_fC;
   // $FF: renamed from: fD boolean
   private static boolean field_boolean_fD;
   // $FF: renamed from: fE boolean
   private static boolean field_boolean_fE;
   // $FF: renamed from: fF int
   private static int field_int_fF;
   // $FF: renamed from: fG int
   private static int field_int_fG;
   // $FF: renamed from: fH int
   private static int field_int_fH;
   // $FF: renamed from: fI int
   private static int field_int_fI;
   // $FF: renamed from: fJ int
   private static int field_int_fJ;
   // $FF: renamed from: fK int
   private static int field_int_fK;
   // $FF: renamed from: fL int
   private static int field_int_fL;
   // $FF: renamed from: fM int
   private static int field_int_fM;
   // $FF: renamed from: fN int
   private static int field_int_fN;
   // $FF: renamed from: fO int
   private static int field_int_fO;
   // $FF: renamed from: fP int
   private static int field_int_fP;
   // $FF: renamed from: fQ int
   private static int field_int_fQ;
   // $FF: renamed from: fR int
   private static int field_int_fR;
   // $FF: renamed from: fS int
   private static int field_int_fS;
   // $FF: renamed from: fT int
   private static int field_int_fT;
   // $FF: renamed from: fU int
   private static int field_int_fU;
   // $FF: renamed from: fV boolean
   private static boolean field_boolean_fV;
   // $FF: renamed from: fW int
   private static int field_int_fW;
   // $FF: renamed from: fX int
   private static int field_int_fX;
   // $FF: renamed from: P int
   public static int field_int_P;
   // $FF: renamed from: Q int
   public static int field_int_Q;
   // $FF: renamed from: fY boolean
   private static boolean field_boolean_fY;
   // $FF: renamed from: fZ java.lang.String[]
   private static String[] field_array_class_java_lang_String_fZ;
   // $FF: renamed from: ga int
   private static int field_int_ga;
   // $FF: renamed from: gb int
   private static int field_int_gb;
   // $FF: renamed from: gc int
   private static int field_int_gc;
   // $FF: renamed from: gd boolean
   private static boolean field_boolean_gd;
   // $FF: renamed from: ge int
   private static int field_int_ge;
   // $FF: renamed from: gf int
   private static int field_int_gf;
   // $FF: renamed from: gg int
   private static int field_int_gg;
   // $FF: renamed from: gh int
   private static int field_int_gh;
   // $FF: renamed from: gi int
   private static int field_int_gi;
   // $FF: renamed from: gj int
   private static int field_int_gj;
   // $FF: renamed from: gk int
   private static int field_int_gk;
   // $FF: renamed from: gl int
   private static int field_int_gl;
   // $FF: renamed from: gm int
   private static int field_int_gm;
   // $FF: renamed from: gn boolean
   private static boolean field_boolean_gn;
   // $FF: renamed from: go int
   private static int field_int_go;
   // $FF: renamed from: gp int
   private static int field_int_gp;
   // $FF: renamed from: gq int
   private static int field_int_gq;
   // $FF: renamed from: gr int
   private static int field_int_gr;
   // $FF: renamed from: gs int
   private static int field_int_gs;
   // $FF: renamed from: gt int
   private static int field_int_gt;
   // $FF: renamed from: gu int
   private static int field_int_gu;
   // $FF: renamed from: gv int
   private static int field_int_gv;
   // $FF: renamed from: gw int
   private static int field_int_gw;
   // $FF: renamed from: gx int
   private static int field_int_gx;
   // $FF: renamed from: gy int
   private static int field_int_gy;
   // $FF: renamed from: gz int
   private static int field_int_gz;
   // $FF: renamed from: gA int
   private static int field_int_gA;
   // $FF: renamed from: gB int
   private static int field_int_gB;
   // $FF: renamed from: gC int
   private static int field_int_gC;
   // $FF: renamed from: gD int
   private static int field_int_gD;
   // $FF: renamed from: gE int
   private static int field_int_gE;
   // $FF: renamed from: gF int
   private static int field_int_gF;
   // $FF: renamed from: gG int
   private static int field_int_gG;
   // $FF: renamed from: gH int
   private static int field_int_gH;
   // $FF: renamed from: gI int
   private static int field_int_gI;
   // $FF: renamed from: gJ int
   private static int field_int_gJ;
   // $FF: renamed from: gK int
   private static int field_int_gK;
   // $FF: renamed from: gL int
   private static int field_int_gL;
   // $FF: renamed from: gM int
   private static int field_int_gM;
   // $FF: renamed from: gN int
   private static int field_int_gN;
   // $FF: renamed from: gO int
   private static int field_int_gO;
   // $FF: renamed from: gP long
   private static long field_long_gP;
   // $FF: renamed from: gQ boolean
   private static boolean field_boolean_gQ;
   // $FF: renamed from: gR int
   private static int field_int_gR;
   // $FF: renamed from: gS int
   private static int field_int_gS;
   // $FF: renamed from: gT int
   private static int field_int_gT;
   // $FF: renamed from: gU int
   private static int field_int_gU;
   // $FF: renamed from: gV int
   private static int field_int_gV;
   // $FF: renamed from: gW int
   private static int field_int_gW;
   // $FF: renamed from: gX int
   private static int field_int_gX;
   // $FF: renamed from: gY int
   private static int field_int_gY;
   // $FF: renamed from: gZ int
   private static int field_int_gZ;
   // $FF: renamed from: ha int
   private static int field_int_ha;
   // $FF: renamed from: hb int
   private static int field_int_hb;
   // $FF: renamed from: hc int
   private static int field_int_hc;
   // $FF: renamed from: hd int
   private static int field_int_hd;
   // $FF: renamed from: he int
   private static int field_int_he;
   // $FF: renamed from: hf boolean
   private static boolean field_boolean_hf;
   // $FF: renamed from: hg boolean
   private static boolean field_boolean_hg;
   // $FF: renamed from: hh boolean
   private static boolean field_boolean_hh;
   // $FF: renamed from: hi int
   private static int field_int_hi;
   // $FF: renamed from: hj int
   private static int field_int_hj;
   // $FF: renamed from: hk int
   private static int field_int_hk;
   // $FF: renamed from: hl boolean
   private static boolean field_boolean_hl;
   // $FF: renamed from: hm int
   private static int field_int_hm;
   // $FF: renamed from: hn int
   private static int field_int_hn;
   // $FF: renamed from: ho int
   private static int field_int_ho;
   // $FF: renamed from: hp int
   private static int field_int_hp;
   // $FF: renamed from: hq int
   private static int field_int_hq;
   // $FF: renamed from: hr int
   private static int field_int_hr;
   // $FF: renamed from: hs int
   private static int field_int_hs;
   // $FF: renamed from: ht int
   private static int field_int_ht;
   // $FF: renamed from: hu int
   private static int field_int_hu;
   // $FF: renamed from: hv int
   private static int field_int_hv;
   // $FF: renamed from: hw int
   private static int field_int_hw;
   // $FF: renamed from: hx int
   private static int field_int_hx;
   // $FF: renamed from: hy int
   private static int field_int_hy;
   // $FF: renamed from: hz int
   private static int field_int_hz;
   // $FF: renamed from: hA int[][]
   private static int[][] field_array_array_int_hA;
   // $FF: renamed from: hB int[][]
   private static int[][] field_array_array_int_hB;
   // $FF: renamed from: hC int[][]
   private static int[][] field_array_array_int_hC;
   // $FF: renamed from: hD int[][]
   private static int[][] field_array_array_int_hD;
   // $FF: renamed from: hE int[][]
   private static int[][] field_array_array_int_hE;
   // $FF: renamed from: hF int[][]
   private static int[][] field_array_array_int_hF;
   // $FF: renamed from: hG int[]
   private static int[] field_array_int_hG;
   // $FF: renamed from: hH int[]
   private static int[] field_array_int_hH;
   // $FF: renamed from: hI int[]
   private static int[] field_array_int_hI;
   // $FF: renamed from: hJ int[]
   private static int[] field_array_int_hJ;
   // $FF: renamed from: hK int[]
   private static int[] field_array_int_hK;
   // $FF: renamed from: hL int[]
   private static int[] field_array_int_hL;
   // $FF: renamed from: hM boolean
   private static boolean field_boolean_hM;
   // $FF: renamed from: hN int
   private static int field_int_hN;
   // $FF: renamed from: hO int
   private static int field_int_hO;
   // $FF: renamed from: hP int
   private static int field_int_hP;
   // $FF: renamed from: hQ int
   private static int field_int_hQ;
   // $FF: renamed from: hR int
   private static int field_int_hR;
   // $FF: renamed from: hS int
   private static int field_int_hS;
   // $FF: renamed from: hT int
   private static int field_int_hT;
   // $FF: renamed from: hU int
   private static int field_int_hU;
   // $FF: renamed from: hV int
   private static int field_int_hV;
   // $FF: renamed from: hW int
   private static int field_int_hW;
   // $FF: renamed from: hX int
   private static int field_int_hX;
   // $FF: renamed from: hY int
   private static int field_int_hY;
   // $FF: renamed from: hZ int
   private static int field_int_hZ;
   // $FF: renamed from: ia int
   private static int field_int_ia;
   // $FF: renamed from: ib int
   private static int field_int_ib;
   // $FF: renamed from: ic int
   private static int field_int_ic;
   // $FF: renamed from: id int
   private static int field_int_id;
   // $FF: renamed from: ie int
   private static int field_int_ie;
   // $FF: renamed from: if int
   private static int field_int_if;
   // $FF: renamed from: ig int
   private static int field_int_ig;
   // $FF: renamed from: ih boolean
   private static boolean field_boolean_ih;
   // $FF: renamed from: ii int
   private static int field_int_ii;
   // $FF: renamed from: ij int
   private static int field_int_ij;
   // $FF: renamed from: ik int
   private static int field_int_ik;
   // $FF: renamed from: il int
   private static int field_int_il;
   // $FF: renamed from: im int
   private static int field_int_im;
   // $FF: renamed from: in int[]
   private static int[] field_array_int_in;
   // $FF: renamed from: io int[]
   private static int[] field_array_int_io;
   // $FF: renamed from: ip int[]
   private static int[] field_array_int_ip;
   // $FF: renamed from: iq int[]
   private static int[] field_array_int_iq;
   // $FF: renamed from: ir int[]
   private static int[] field_array_int_ir;
   // $FF: renamed from: is int[]
   private static int[] field_array_int_is;
   // $FF: renamed from: it int
   private static int field_int_it;
   // $FF: renamed from: iu int
   private static int field_int_iu;
   // $FF: renamed from: iv int[]
   private static int[] field_array_int_iv;
   // $FF: renamed from: iw int[]
   private static int[] field_array_int_iw;
   // $FF: renamed from: ix int[]
   private static int[] field_array_int_ix;
   // $FF: renamed from: iy int[]
   private static int[] field_array_int_iy;
   // $FF: renamed from: iz int[]
   private static int[] field_array_int_iz;
   // $FF: renamed from: iA int[]
   private static int[] field_array_int_iA;
   // $FF: renamed from: iB int[]
   private static int[] field_array_int_iB;
   // $FF: renamed from: iC boolean
   private static boolean field_boolean_iC;
   // $FF: renamed from: iD int
   private static int field_int_iD;
   // $FF: renamed from: iE int
   private static int field_int_iE;
   // $FF: renamed from: iF int
   private static int field_int_iF;
   // $FF: renamed from: iG int
   private static int field_int_iG;
   // $FF: renamed from: iH java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_iH;
   // $FF: renamed from: iI int
   private static int field_int_iI;
   // $FF: renamed from: iJ int
   private static int field_int_iJ;
   // $FF: renamed from: iK int
   private static int field_int_iK;
   // $FF: renamed from: iL int
   private static int field_int_iL;
   // $FF: renamed from: iM int
   private static int field_int_iM;
   // $FF: renamed from: iN int
   private static int field_int_iN;
   // $FF: renamed from: iO java.lang.String
   private static String field_class_java_lang_String_iO;
   // $FF: renamed from: iP int
   private static int field_int_iP;
   // $FF: renamed from: iQ int
   private static int field_int_iQ;
   // $FF: renamed from: iR int
   private static int field_int_iR;
   // $FF: renamed from: iS int
   private static int field_int_iS;
   // $FF: renamed from: iT byte[]
   private static byte[] field_array_byte_iT;
   // $FF: renamed from: iU int[]
   private static int[] field_array_int_iU;
   // $FF: renamed from: iV boolean[]
   private static boolean[] field_array_boolean_iV;
   // $FF: renamed from: iW javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_iW;
   // $FF: renamed from: iX javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_iX;
   // $FF: renamed from: iY javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_iY;
   // $FF: renamed from: iZ javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_iZ;
   // $FF: renamed from: ja int
   private static int field_int_ja;
   // $FF: renamed from: jb int[]
   private static int[] field_array_int_jb;
   // $FF: renamed from: jc int[]
   private static int[] field_array_int_jc;
   // $FF: renamed from: jd int[]
   private static int[] field_array_int_jd;
   // $FF: renamed from: je int[]
   private static int[] field_array_int_je;
   // $FF: renamed from: jf int[]
   private static int[] field_array_int_jf;
   // $FF: renamed from: jg javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_jg;
   // $FF: renamed from: jh int
   private static int field_int_jh;
   // $FF: renamed from: ji int
   private static int field_int_ji;
   // $FF: renamed from: jj int
   private static int field_int_jj;
   // $FF: renamed from: jk int
   private static int field_int_jk;
   // $FF: renamed from: jl int
   private static int field_int_jl;
   // $FF: renamed from: jm java.lang.String[]
   private static String[] field_array_class_java_lang_String_jm;
   // $FF: renamed from: jn int[]
   private static int[] field_array_int_jn;
   // $FF: renamed from: jo int[]
   private static int[] field_array_int_jo;
   // $FF: renamed from: jp int[]
   private static int[] field_array_int_jp;
   // $FF: renamed from: jq int
   private static int field_int_jq;
   // $FF: renamed from: jr int
   private static int field_int_jr;
   // $FF: renamed from: js int
   private static int field_int_js;
   // $FF: renamed from: jt int
   private static int field_int_jt;
   // $FF: renamed from: ju int
   private static int field_int_ju;
   // $FF: renamed from: jv int
   private static int field_int_jv;
   // $FF: renamed from: jw int
   private static int field_int_jw;
   // $FF: renamed from: jx int
   private static int field_int_jx;
   // $FF: renamed from: jy int
   private static int field_int_jy;
   // $FF: renamed from: jz int
   private static int field_int_jz;
   // $FF: renamed from: jA int
   private static int field_int_jA;
   // $FF: renamed from: jB int
   private static int field_int_jB;
   // $FF: renamed from: jC int
   private static int field_int_jC;
   // $FF: renamed from: jD int
   private static int field_int_jD;
   // $FF: renamed from: R int
   static int field_int_R;
   // $FF: renamed from: jE int
   private static int field_int_jE;
   // $FF: renamed from: S int
   static int field_int_S;
   // $FF: renamed from: jF javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_jF;
   // $FF: renamed from: jG javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_jG;
   // $FF: renamed from: jH int
   private static int field_int_jH;
   // $FF: renamed from: jI int
   private static int field_int_jI;
   // $FF: renamed from: T boolean
   public static boolean field_boolean_T;
   // $FF: renamed from: jJ javax.microedition.lcdui.Image[][][]
   private static Image[][][] field_array_array_array_class_javax_microedition_lcdui_Image_jJ;
   // $FF: renamed from: jK int
   private static int field_int_jK;
   // $FF: renamed from: jL int
   private static int field_int_jL;
   // $FF: renamed from: jM int[]
   private static int[] field_array_int_jM;
   // $FF: renamed from: jN int[]
   private static int[] field_array_int_jN;
   // $FF: renamed from: jO int[]
   private static int[] field_array_int_jO;
   // $FF: renamed from: jP int[]
   private static int[] field_array_int_jP;
   // $FF: renamed from: jQ int[]
   private static int[] field_array_int_jQ;
   // $FF: renamed from: jR int[]
   private static int[] field_array_int_jR;
   // $FF: renamed from: jS int[]
   private static int[] field_array_int_jS;
   // $FF: renamed from: jT int[]
   private static int[] field_array_int_jT;
   // $FF: renamed from: jU int[]
   private static int[] field_array_int_jU;
   // $FF: renamed from: jV int[]
   private static int[] field_array_int_jV;
   // $FF: renamed from: jW int[]
   private static int[] field_array_int_jW;
   // $FF: renamed from: jX int[]
   private static int[] field_array_int_jX;
   // $FF: renamed from: jY int[]
   private static int[] field_array_int_jY;
   // $FF: renamed from: jZ int[]
   private static int[] field_array_int_jZ;
   // $FF: renamed from: ka int[]
   private static int[] field_array_int_ka;
   // $FF: renamed from: kb int[]
   private static int[] field_array_int_kb;
   // $FF: renamed from: kc int[]
   private static int[] field_array_int_kc;
   // $FF: renamed from: kd int[]
   private static int[] field_array_int_kd;
   // $FF: renamed from: ke int[]
   private static int[] field_array_int_ke;
   // $FF: renamed from: kf int[]
   private static int[] field_array_int_kf;
   // $FF: renamed from: kg int[]
   private static int[] field_array_int_kg;
   // $FF: renamed from: kh int[]
   private static int[] field_array_int_kh;
   // $FF: renamed from: ki int[]
   private static int[] field_array_int_ki;
   // $FF: renamed from: kj int[]
   private static int[] field_array_int_kj;
   // $FF: renamed from: kk int[]
   private static int[] field_array_int_kk;
   // $FF: renamed from: kl boolean[]
   private static boolean[] field_array_boolean_kl;
   // $FF: renamed from: km int[][]
   private static int[][] field_array_array_int_km;
   // $FF: renamed from: kn int[][]
   private static int[][] field_array_array_int_kn;
   // $FF: renamed from: ko boolean[][]
   private static boolean[][] field_array_array_boolean_ko;
   // $FF: renamed from: kp int[]
   private static int[] field_array_int_kp;
   // $FF: renamed from: kq int[]
   private static int[] field_array_int_kq;
   // $FF: renamed from: U int
   static int field_int_U;
   // $FF: renamed from: kr int
   private static int field_int_kr;
   // $FF: renamed from: ks int
   private static int field_int_ks;
   // $FF: renamed from: kt int
   private static int field_int_kt;
   // $FF: renamed from: ku int
   private static int field_int_ku;
   // $FF: renamed from: kv int
   private static int shopType;
   // $FF: renamed from: kw int[]
   private static int[] field_array_int_kw;
   // $FF: renamed from: kx java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_kx;
   // $FF: renamed from: ky java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_ky;
   // $FF: renamed from: kz int[][]
   private static int[][] field_array_array_int_kz;
   // $FF: renamed from: kA javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_kA;
   // $FF: renamed from: kB java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_kB;
   // $FF: renamed from: kC java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_kC;
   // $FF: renamed from: kD int
   private static int field_int_kD;
   // $FF: renamed from: kE int
   private static int field_int_kE;
   // $FF: renamed from: kF int
   private static int field_int_kF;
   // $FF: renamed from: kG int
   private static int field_int_kG;
   // $FF: renamed from: kH int[]
   private static int[] field_array_int_kH;
   // $FF: renamed from: kI java.lang.String[]
   private static String[] field_array_class_java_lang_String_kI;
   // $FF: renamed from: V int[]
   static int[] field_array_int_V;
   // $FF: renamed from: kJ int[]
   private static int[] field_array_int_kJ;
   // $FF: renamed from: kK javax.microedition.lcdui.Image[]
   private static Image[] field_array_class_javax_microedition_lcdui_Image_kK;
   // $FF: renamed from: kL int
   private static int field_int_kL;
   // $FF: renamed from: kM int
   private static int field_int_kM;
   // $FF: renamed from: kN int
   private static int field_int_kN;
   // $FF: renamed from: kO java.lang.String[]
   private static String[] field_array_class_java_lang_String_kO;
   // $FF: renamed from: kP java.lang.String[]
   private static String[] field_array_class_java_lang_String_kP;
   // $FF: renamed from: kQ int[]
   private static int[] field_array_int_kQ;
   // $FF: renamed from: W boolean[]
   public static boolean[] field_array_boolean_W;
   // $FF: renamed from: kR int[]
   private static int[] field_array_int_kR;
   // $FF: renamed from: kS int[]
   private static int[] field_array_int_kS;
   // $FF: renamed from: kT int[]
   private static int[] field_array_int_kT;
   // $FF: renamed from: kU int[]
   private static int[] field_array_int_kU;
   // $FF: renamed from: kV javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_kV;
   // $FF: renamed from: kW javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_kW;
   // $FF: renamed from: kX int
   private static int field_int_kX;
   // $FF: renamed from: kY int
   private static int field_int_kY;
   // $FF: renamed from: kZ int
   private static int field_int_kZ;
   // $FF: renamed from: la int
   private static int field_int_la;
   // $FF: renamed from: lb int
   private static int field_int_lb;
   // $FF: renamed from: lc int
   private static int field_int_lc;
   // $FF: renamed from: ld int
   private static int field_int_ld;
   // $FF: renamed from: le int
   private static int field_int_le;
   // $FF: renamed from: lf int
   private static int field_int_lf;
   // $FF: renamed from: lg int
   private static int field_int_lg;
   // $FF: renamed from: lh int
   private static int field_int_lh;
   // $FF: renamed from: li int
   private static int field_int_li;
   // $FF: renamed from: lj int
   private static int field_int_lj;
   // $FF: renamed from: lk int
   private static int field_int_lk;
   // $FF: renamed from: ll int
   private static int field_int_ll;
   // $FF: renamed from: lm java.lang.String
   private static String field_class_java_lang_String_lm;
   // $FF: renamed from: ln javax.microedition.lcdui.Image
   private static Image field_class_javax_microedition_lcdui_Image_ln;
   // $FF: renamed from: lo boolean
   private static boolean field_boolean_lo;
   // $FF: renamed from: lp int
   private static int field_int_lp;
   // $FF: renamed from: X int
   public static int field_int_X;
   // $FF: renamed from: lq int
   private static int field_int_lq;
   // $FF: renamed from: lr int
   private static int field_int_lr;
   // $FF: renamed from: ls int
   private static int field_int_ls;
   // $FF: renamed from: lt java.lang.String
   private static String field_class_java_lang_String_lt;
   // $FF: renamed from: lu java.lang.String
   private static String field_class_java_lang_String_lu;
   // $FF: renamed from: lv java.lang.String[]
   private static String[] field_array_class_java_lang_String_lv;
   // $FF: renamed from: lw javax.microedition.lcdui.Image[][]
   private static Image[][] field_array_array_class_javax_microedition_lcdui_Image_lw;
   // $FF: renamed from: lx int
   private static int field_int_lx;
   // $FF: renamed from: ly int[]
   private static int[] field_array_int_ly;
   // $FF: renamed from: lz int[]
   private static int[] field_array_int_lz;
   // $FF: renamed from: lA int[]
   private static int[] field_array_int_lA;
   // $FF: renamed from: lB java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_lB;
   // $FF: renamed from: lC java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_lC;
   // $FF: renamed from: lD java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_lD;
   // $FF: renamed from: lE java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_lE;
   // $FF: renamed from: lF java.lang.String[][]
   private static String[][] field_array_array_class_java_lang_String_lF;
   // $FF: renamed from: lG java.lang.String[]
   private static String[] field_array_class_java_lang_String_lG;
   // $FF: renamed from: lH int[]
   private static int[] field_array_int_lH;
   // $FF: renamed from: lI int[]
   private static int[] field_array_int_lI;
   // $FF: renamed from: lJ int[]
   private static int[] field_array_int_lJ;
   // $FF: renamed from: lK int
   private static int field_int_lK;
   // $FF: renamed from: lL int
   private static int field_int_lL;
   // $FF: renamed from: lM int
   private static int field_int_lM;
   // $FF: renamed from: lN int
   private static int field_int_lN;
   // $FF: renamed from: lO boolean
   private static boolean field_boolean_lO;
   // $FF: renamed from: lP java.lang.String
   private static String field_class_java_lang_String_lP;
   // $FF: renamed from: lQ java.lang.String[]
   private static String[] field_array_class_java_lang_String_lQ;
   // $FF: renamed from: lR java.lang.String[]
   private static String[] field_array_class_java_lang_String_lR;
   // $FF: renamed from: Y int
   public static int activeCommand;
   // $FF: renamed from: lS int
   private static int field_int_lS;
   // $FF: renamed from: lT int
   private static int field_int_lT;
   // $FF: renamed from: lU javax.microedition.lcdui.Font
   private static Font field_class_javax_microedition_lcdui_Font_lU;
   // $FF: renamed from: lV javax.microedition.lcdui.Font
   private static Font field_class_javax_microedition_lcdui_Font_lV;
   // $FF: renamed from: lW int
   private static int field_int_lW;
   // $FF: renamed from: lX java.lang.String
   private String field_class_java_lang_String_lX = "12345678";
   // $FF: renamed from: lY int
   private int field_int_lY;
   // $FF: renamed from: lZ java.lang.String
   private static String field_class_java_lang_String_lZ;
   // $FF: renamed from: ma int[]
   private static int[] field_array_int_ma;
   // $FF: renamed from: mb int
   private static int field_int_mb;
   // $FF: renamed from: mc int
   private int field_int_mc = 0;
   // $FF: renamed from: md boolean
   private boolean field_boolean_md = false;
   // $FF: renamed from: me java.lang.String
   private String field_class_java_lang_String_me = "";
   // $FF: renamed from: mf int
   private int field_int_mf;
   // $FF: renamed from: mg int
   private int field_int_mg;

   static {
      field_array_array_array_int_aJ = new int[field_array_array_array_int_as.length][3][3];

      int var0;
      for(var0 = 0; var0 < field_array_array_array_int_as.length; ++var0) {
         for(int var1 = 0; var1 < 3; ++var1) {
            for(int var2 = 0; var2 < 3; ++var2) {
               field_array_array_array_int_aJ[var0][var1][var2] = field_array_array_array_int_as[var0][var1][var2];
               if (var1 == 0 && var2 == 0) {
                  switch(field_array_array_array_int_as[var0][var1][var2]) {
                  case 1:
                  case 2:
                     field_array_array_array_int_aJ[var0][var1][var2] = 1;
                     break;
                  default:
                     field_array_array_array_int_aJ[var0][var1][var2] = 0;
                  }
               }
            }
         }
      }

      field_array_int_aK = new int[]{-1, 2, 1, -2};
      field_array_int_aL = new int[]{-3, 2, -1, 1};
      field_int_aM = -1;
      field_boolean_aO = true;
      field_array_boolean_aU = new boolean[14];
      field_array_boolean_aV = new boolean[14];
      field_int_ba = 0;
      field_class_java_lang_String_by = "";
      field_int_bJ = -22;
      field_int_bK = 18;
      field_int_bL = -10;
      field_int_bM = -19;
      field_int_bN = -12;
      field_int_bO = -26;
      field_boolean_eL = false;
      field_boolean_eM = false;
      field_boolean_eN = false;
      field_boolean_eO = false;
      field_boolean_eP = false;
      field_boolean_eQ = false;
      field_boolean_eR = false;
      field_boolean_eS = false;
      field_boolean_eT = false;
      field_boolean_eU = false;
      field_boolean_eV = false;
      field_boolean_eW = false;
      field_boolean_eX = false;
      field_boolean_eY = false;
      field_boolean_eZ = false;
      field_boolean_fa = false;
      field_boolean_fb = false;
      field_boolean_fc = false;
      field_boolean_fd = false;
      field_boolean_fe = false;
      field_boolean_fx = true;
      field_boolean_fV = false;
      field_int_fX = 0;
      field_array_class_java_lang_String_fZ = new String[]{""};
      field_int_gc = 0;
      field_int_ge = -1;
      field_int_gk = 1;
      field_boolean_gn = false;
      field_int_gp = -1;
      field_int_hm = 500;
      field_int_hn = 60;
      field_int_ho = 60;
      field_int_hN = 20;
      field_int_hO = 60;
      field_int_hR = 50;
      field_int_ig = 10;
      field_int_im = -1;
      field_int_iu = -1;
      field_boolean_iC = false;

      try {
         Image.createImage("/attkButton.png");
      } catch (IOException var3) {
      }

      field_class_java_lang_String_iO = "oplj";
      field_int_jh = 24;
      field_int_R = 0;
      field_int_jE = 0;
      field_int_S = 0;
      field_array_int_kp = null;
      field_array_int_kq = new int[]{0, 10, 15, 20};
      field_array_int_kw = new int[]{12281360, 13859359, 15439166, 16693877, 16765346, 16777215, 16765346, 16693877, 15439166, 13859359, 12281360};
      field_array_array_class_java_lang_String_kx = new String[][]{{"Bình HP nhỏ", "Bình HP vừa", "Bình HP to", "Bình MP nhỏ", "Bình MP vừa", "Bình MP to"}, {"Kiếm tre", "Thủy linh kiếm", "Hỏa giác kiếm", "Long giao kiếm"}};
      field_array_array_class_java_lang_String_ky = new String[][]{{"2000vnđ / 50 bình", "3000vnđ / 50 bình", "3000vnđ / 30 bình", "2000vnđ / 50 bình", "2000vnđ / 30 bình", "3000vnđ / 50 bình"}, {"2000vnđ", "3000vnđ", "3000vnđ", "5000vnđ"}};
      field_array_array_int_kz = new int[][]{{200, 600, 1500, 200, 600, 1200}, {2000, 12000, 45000, 182000}};
      field_array_array_class_java_lang_String_kB = new String[][]{{"BinhHP_Nho(50)", "BinhHP_Vua(50)", "BinhHP_To(30)", "BinhMP_Nho(50)", "BinhMP_Vua(30)", "BinhMP_To(50)"}, {"KiemTre", "ThuyLinhKiem", "HoaGiacKiem", "LongGiaoKiem"}};
      field_array_array_class_java_lang_String_kC = new String[][]{{"sms://" + field_array_class_java_lang_String_ab[1], "sms://" + field_array_class_java_lang_String_ab[2], "sms://" + field_array_class_java_lang_String_ab[2], "sms://" + field_array_class_java_lang_String_ab[1], "sms://" + field_array_class_java_lang_String_ab[1], "sms://" + field_array_class_java_lang_String_ab[1]}, {"sms://" + field_array_class_java_lang_String_ab[0], "sms://" + field_array_class_java_lang_String_ab[2], "sms://" + field_array_class_java_lang_String_ab[3], "sms://" + field_array_class_java_lang_String_ab[4]}};
      field_array_int_kH = new int[]{12281360, 13859359, 15439166, 16693877, 16765346, 16777215, 16765346, 16693877, 15439166, 13859359, 12281360};
      field_array_class_java_lang_String_kI = new String[]{"Bình HP nhỏ", "Bình HP vừa", "Bình HP to", "Bình MP nhỏ", "Bình MP vừa", "Bình MP to"};
      field_array_int_V = new int[]{5, 2, 1, 5, 2, 1};
      field_array_int_kJ = new int[]{100, 400, 1000, 100, 200, 300};
      field_array_class_java_lang_String_kO = new String[]{"Sử dụng item", "Xem bản đồ", "Lưu và thoát", "Nhạc: Bật"};
      field_array_class_java_lang_String_kP = new String[]{"Trường Hirosaki", "Khu luyện tập", "Làng Kenshin", "Rừng đào Sakura", "Rừng trúc Ura", "Thác Kitajima", "Cánh đồng Mishima", "Sông Watamaro", "Nghĩa địa Izuko", "Miếu Kojin", "Miếu Kamo", "Miếu Yazaka", "Rừng gỗ Kouji", "Rừng chông Hakata", "Vách đá Ito", "Thung lũng Taira", "Thôn Sanzu", "Lối vào Orochi", "Ngôi đền Orochi"};
      field_array_int_kQ = new int[]{50, 60, 70, 80, 90, 70, 100, 120, 150, 180, 220, 250, 300, 320, 350, 370, 390, 420, 450};
      field_array_boolean_W = new boolean[19];
      field_array_int_kR = new int[]{49, 31, 98, 112, 106, 42, 75, 84, 37, 39, 80, 117, 157, 201, 208, 170, 186, 219, 161};
      field_array_int_kS = new int[]{35, 65, 38, 75, 98, 97, 95, 128, 142, 185, 212, 189, 189, 204, 156, 142, 96, 59, 39};
      field_array_int_kT = new int[]{62, 52, 17, 4, 8, 12, 14, 5, 1, 2, 3, 2, 2, 2, 2, 1, 2, 3, 1};
      field_array_int_kU = new int[]{17, 9, 12, 9, 10, 5, 9, 7, 12, 11, 4, 11, 8, 9, 7, 6, 11, 16, 8};
      field_class_java_lang_String_lm = "Chuyển đến";
      String[] var10000 = new String[]{"Quy Sư Phụ", "Lâm Sư Phụ"};
      field_array_array_class_java_lang_String_lB = new String[][]{{"..."}, {"Đây là khu vực luyện tập, cứ yên tâm, nếu bị thương ta sẽ giúp đỡ.", "Đôi khi tập luyện với cái bù nhìn rơm đằng kia cũng mang lại nhiều bất ngờ đấy!"}, {"Thác nước này rất nguy hiểm, ta khuyên ngươi không nên xuống.", "Hãy quay lại đi, nếu có chuyện gì ta không cứu được ngươi đâu."}, {"Khu rừng trước mặt ngươi là nơi sống của bọn dơi quỷ, nhện độc và những sát thủ bị truy nã.", "Dù ngươi tài giỏi đến đâu cũng phải mất mạng khi đi ngang qua đó.", "Một số người có thể qua được bằng cách chạy thật nhanh qua.", "Nếu ngươi tự tin hãy dùng chiếc moto kia và liều một phen xem.", "Chúc ngươi may mắn."}};
      field_array_array_class_java_lang_String_lC = new String[][]{{"Con lại tìm ta có chuyện gì?", "Thầy chủ nhiệm Con là Takanashi, mau đến gặp thầy để nhận bài tập."}, {"Chào cậu bé, ta là Kagome Ayumi, giảng viên cao cấp bộ môn Khí.", "Khí là môn đầu tiên bất kỳ học sinh nào cũng phải học khi bước vào đây.", "Bài học đâu tiên là kỹ năng khinh công. Sau khi học xong con sẽ phi thân cao hơn  gấp đôi bình thường.", "Bây giờ ta phải kiểm tra sơ bộ con. Hãy chạy thẳng về tay trái đến khu luyện tập.", "đến đó giết đủ 10 con ốc sên đá, sau đó quay lại đây!"}, {"Chào con, con đã sẵn sàng luyện tập rồi chứ?", "Hãy đến gặp cô Ayumi để học môn đầu tiên.", "Cô ấy đứng đằng kia, chúc con học tốt nhé!", "à, nếu cô ấy có hỏi gì về ta, hãy nói tốt về ta nhé, ta sẽ thưởng."}, {"Ta già cả rồi, tựa như chiếc lá khô..", "Lại đây, ta sẽ truyền hết võ công cho con...", "Toyotomi,...tình yêu của ta,....em ở nơi nào"}, {"Trình độ nhà ngươi còn quá thấp. Hãy quay lại đây khi đã học xong khinh công."}, {"Ngươi còn chưa dùng shuriken thì làm sao học phép thuật được."}, {"Ta sẽ dạy ngươi dùng shuriken nếu ngươi có đủ khả năng.", "Gần cổng trường có vài cái bù nhìn rơm, hãy đánh gãy 2 cái.", "Nhanh lên, hãy chứng tỏ sức mạnh của mình đi."}, {"Ngươi còn không mau đi đi!"}, {"Ngươi muốn học thuật ư?", "Không như những môn khác, thuật đòi hỏi ngươi phải luyện tập hàng ngày..", "Hơn thế nữa, ngươi phải học theo những quyển bí kíp.", "Ta sẽ dạy cho ngươi môn độn thổ, nếu ngươi có thể tìm được 1 quyển bí kíp từ bọn quỷ một chân", "Bọn chúng thường xuất hiện ở thác nước, bên kia khu luyện tập.", "Đi đi, hãy kiên nhẫn với từng tên , ngươi sẽ tìm thấy thôi!"}, {"Nhanh lên con, cô bé ấy đang đứng chờ ở đường hoa đào đấy!", "Nếu chậm, cô Ayumi sẽ buồn lắm đó!"}, {"Con có thể giúp ta một chuyện được không?", "Cô Ayumi có nhờ ta đón giúp cô em gái. Nhưng đúng vào lúc ta phải họp cùng thầy hiệu trưởng.", "Ta rất tin tưởng ở con, con hãy đến đầu đường hoa đào, đón cô ấy nhé!", "Nhanh lên, ta sẽ thưởng cho con nếu con làm tốt."}, {"Để trở thành 1 ninja giỏi ngươi phải có thể lực tốt.", "Ngươi có biết chữ Nin là Nhẫn không!", "Trong Nhẫn thì có Lực và Tâm..", "..để trở thành ninja thực thụ thì ngươi phải có Tâm và Lực", "....mà ta nói, ngươi có hiểu gì không.", "Hãy giết 20 con ong, rồi quay về gặp ta. Lúc đó ta sẽ giúp ngươi."}, {"Ngươi đã bao giờ vượt sông Watamoro chưa? Đó là một con sông rộng và hung dữ với thuỷ quái và sóng to.", "Ta sẽ giúp ngươi 1 cách vượt sông rất dễ dàng, nhưng ngươi phải làm một việc...", "Trong khu rừng trúc, có 1 con heo rừng thành tinh rất hung hăng..", "Hãy giết nó, mang về đây 1 quyển bí kíp nói về thuật lặn nước, ta sẽ hướng dẫn ngươi luyện.", "Đi đi, và hãy cẩn thận tính mạng nhà ngươi."}, {"Ngươi đã học được kỹ năng chạy nước rồi!", "Nếu ngươi có thể qua bên kia con sông,đến khu nghĩa địa, nhặt quyển bí kíp Ninja biến hình..", "..ta sẽ truyền thụ kỹ năng biến hình cho ngươi.", "Hãy nhớ ngươi phải đối đầu với một con quái vật to lớn bên kia sông đấy!", "Đi đi, chúc ngươi may mắn."}, {"Con biết, ta đang nghiên cứu làm ra 1 thứ thuốc, để chữa trị vết thương...", "Tuy nhiên ta thiếu 1 loại nguyên liệu rất khó kiếm.", "Nếu con có thể tìm giúp ta 15 cánh dơi vàng, ta sẽ có đền đáp xứng đáng.", "Bọn dơi vàng có mặt ở những ngôi đền phía nam. Bọn chúng rất nhanh.", "Tuy thế, ta vẫn tin con có thể mang về cho ta.", "Chúc con may mắn!"}, {"Cô Ayumi nói cho con nghe rồi à...", "Nói ra thật đáng buồn, cũng như bao trường khác, trường ta luôn có những học sinh cá biệt...", "Toniku là một trong số đó, nó đã bỏ trường thành lập băng nhóm...", "Hiện đang tụ tập quậy phá ở 3 ngôi miếu phía nam trường...", "Con là một học sinh tốt, hãy đi tìm bọn chúng bắt về cho ta.", "Làm đi, rồi báo cáo kết quả với ta nhé!"}, {"Cô bé em gái cô Ayumi cũng xinh, y như cô ấy vậy, con có thấy thế không!", "Nếu con có thể vào khu rừng gỗ, đánh gục 20 tên Quỷ khố, ta sẽ mai mối cho, haha!", "Nhưng hãy cẩn thận, bọn quái vật trong khu rừng ấy rất đông và mạnh đấy!"}, {"Hiện tại khả năng con đã rất khá rồi, ta quyết định dạy những kỹ năng cấp cao cho con.", "Đầu tiên là khinh công cấp 2.", "Tuy nhiên, con phải chứng tỏ đã thành thạo khinh công cấp 1 trước...", "Hãy nhảy lên không tung, đánh được 20 đòn trước khi chạm đất!", "Không dễ phải không..."}, {"Shuriken , một trong những vũ khí cơ bản của Ninja, ta sẽ truyền cho ngươi bộ ám khí mới này", "Vẫn như các lần trước, ngươi phải cho ta thấy đã đủ sức học...", "Đến khu rừng chông tre. Nhổ gốc 70 con quỷ hoa đỏ rồi về đây, ta sẽ dạy cho.", "Cẩn thận tính mạng ngươi đấy."}, {"Mấy hôm nay ta nhận thấy con chạy còn rất chậm..", "Một ninja chậm chạp như con không thể làm việc lớn được.", "Hãy đến vách đá Ito, mang về cho ta 50 đuôi bò cạp..", "Ta sẽ dùng độc của chúng, điều chế cho con 1 loại thuốc tăng lực...", "Cẩn thận nọc độc bọn chúng nhé! Hãy dẫn cô bé Sakura đi, nó sẽ giúp con nhiều đấy."}, {"Ta không muốn nói nhiều. Một phần thưởng đặt biệt cho ngươi..", "..nếu ngươi có thể giết được 30 con cá đỏ!"}, {"Đây là kỹ năng cuối cùng của một ninja... kỹ thuật ẩn thân", "Kỹ năng này muốn học cũng không khó, tại một thung lũng phía nam..", "có một quyển bí kíp được giấu từ ngàn năm nay.", "Hãy tìm về, ta sẽ giúp con có được kỹ năng lợi hại này."}, {"Con còn nhớ tên phản đồ Toniku lần trước không!", "Sau khi bị con đánh, hắn đã bỏ chạy đến ngôi miếu phía đông bắc.", "Nó vừa bắt mất cô bé Sakura đi rồi.", "Ta đã sai tất cả đệ tử đi tìm nó, cứu cô bé về!", "Con cũng phải thế nhé! Cô bé ấy đang chờ con đấy!"}};
      field_array_array_class_java_lang_String_lD = new String[][]{{"Thể lực con rất tốt, ta sẽ dạy khinh công cho con...", "Hãy tập trung khí huyết, hít thở nhẹ, người con nhẹ dần, nhẹ dần tựa chiếc lá khô...", "Chúc mừng con! Hãy thử nhảy lên xem kết quả thế nào.", "à, suýt nữa ta quên, lúc nãy thầy Hiroyaki trên tầng 1 gọi con đấy."}, {"Tốt. Đây là cách phóng shuriken, hãy nhớ kỹ:", "Bấm phím 0 để chuyển sang phóng shuriken, bấm lần nữa để đánh kiếm.", "Nếu chăm chỉ tập luyện, phi tiêu sẽ là vũ khí lợi hại nhất của ngươi.", "Thầy Honda có việc cần gặp ngươi. Nhanh lại đó đi!"}, {"Giỏi lắm, đúng là quyển bí kíp này.", "Cứ luyện tập theo quyển bí kíp này: hãy đến khu vực có đất..", "Ngồi thấp xuống và tập trung, ngươi sẽ độn thổ được.", "Hãy luyện tập đi, chú ý MP ngươi sẽ bị giảm khi độn thổ đó.", "Còn chuyện này nữa, vừa nãy ta thấy thầy chủ nhiệm ngươi có vẻ mệt. Ngươi hãy nhanh ghé thăm!"}, {"Ngươi giỏi lắm, ta sẽ đã thông kinh mạch cho...", "úm ba la !! soda cacao cola!", "Ngươi có cảm nhận được luồn chân khí trong người không", "Đi đi, hãy dùng sức mạnh này để bảo vệ dân làng!"}, {"Quyển bí kíp đây rồi, khá lắm cậu bé.", "Ngươi đã có thể lặn nước được rồi. Hãy nhớ, tuy lặn được nhưng thanh trúc dùng để thở rất ngắn...", "Vì thế, đừng lặn sâu quá đó.", "Thầy Hiroyaki tìm ngươi. Hãy mau đến gặp đi."}, {"Ngươi có thể vượt qua con sông ấy ư?", "Ta sẽ giúp ngươi gọi được sức mạnh của dòng tộc mình: Xích Mao", "Bất kỳ khi nào, hãy ấn phím số 7, ngươi sẽ có được sức mạnh từ gốc cội của dòng tộc mình", "hãy thử xem, nhưng ngươi cần cẩn thận, vì thi triển thuật này,ngươi sẽ chóng mệt lắm đấy."}, {"Cảm ơn con nhiều lắm. Đây là phần thưởng cho con, 5000$", "Tuy không bao nhiêu nhưng con có thể dùng nó để mua HP, MP.", "À, trường ta đang có việc lớn đấy!", "Con hãy gặp thầy chủ nhiệm để hỏi xem có giúp được gì hay không!"}, {"Hắn bỏ trốn thoát rồi ư?", "Ta thật đau lòng khi có một đứa học trò như nó!", "Kể từ nay, ta cho phép con tấn công nó, không nương tay, bất kỳ khi nào gặp!"}, {"Ta biết chắc chắn thế nào con cũng giết được bọn quỷ khố hung hăng đó!", "Lúc nãy, ta đã nói chuyện với cô Ayumi rồi.", "Hãy lại bắt chuyện với cô bé ấy đi!"}, {"Tốt lắm. Con đã chứng tỏ được mình.", "Đây là kỹ năng khinh công cấp 2. Con đã có thể nhảy cao hơn trước rồi.", "Tiếp theo, hãy gặp thầy Hiroyaki, ông ta sẽ dạy con những kỹ năng mới!"}, {"Tốt. Đây là kỹ năng shuriken cấp 2.", "Sức tấn công từ shuriken của con đã tăng lên rất nhiều!", "Con phải siêng năng tập luyện mới có thể giữ được sức mạnh này. Nhớ đấy!"}, {"Khá lắm. Đây là phương thuốc chạy nhanh cho con!", "Hãy chạy 1 đoạn ngắn, sau đó tốc độ của con sẽ tăng nhanh..", "Hãy thử xem nào!"}, {"Giỏi. Kể từ nay con sẽ không bao giờ bị chìm dưới nước nữa!", "..đây là kỹ thuật đứng nước bí truyền của ninja. Ta chỉ dạy cho mình con đấy!"}, {"Ngươi có thể tìm được nó ư?", "Tốt lắm, từ nay con có thể sử dụng nó rồi đấy.", "Hãy nhấn phím số 9 để có thể ẩn thân. Kỹ năng này rất lợi hại..", "tuy nhiên nó sẽ tiêu thụ rất nhiều MP của con đấy!"}, {"Các con đều bình an vô sự, rất tốt!", "Những gì đã là quá khứ thì ta cho qua, nhưng hãy nhớ và không tái phạm", "Nào, ta cho các con nghỉ, điện thoại cũng có lúc phải nghì ngơi chứ, hehe. Nay , ta chúc mừng các con đã hoàn thành khóa học ninja sơ cấp: các con không còn là Chunin nữa !", "Nay ta tuyên bố thăng cấp cho các con là Genin !"}};
      String[][] var4 = new String[][]{{"Ta đang bận."}, {"Ngươi đã học được chiêu shuriken cuối cùng, ta ko còn gì dạy ngươi nữa. Đi đi."}};
      field_array_array_class_java_lang_String_lE = new String[][]{{"Nhanh lên, hãy sang khu luyện tập và giết 10 con ốc sên."}, {"Hãy đánh sập 2 bù nhìn rơm gần cổng trường. Nhanh lên!"}, {"Bọn quỷ một chân có mặt ở thác nước, bên kia khu luyện tập, mau giết chúng để tìm quyển bí kíp!"}, {"Hãy trở lại khi ngươi đã giết đủ 20 con ong."}, {"Con heo rừng rất nguy hiểm. Nhưng ta tin ngươi có thể giết được nó và cầm về cho ta quyển bí kíp. Đi đi!"}, {"Hãy đến khu nghĩa địa bên kia sông! Mang về quyển bí kíp. Nhanh lên!"}, {"Nhanh lên, hãy giết 15 con dơi vàng ở những ngôi miếu phía nam!"}, {"Hãy tìm tên Toniku, hắn trốn ở những ngôi miếu phía nam.", "Tìm gặp hắn quay lại báo cáo với ta nhé!"}, {"Hãy giết 20 con quỷ khố ở khu rừng gỗ!", "Xong việc ta sẽ giúp con cưa con bé em gái cô giáo Ayumi!"}, {"Để ta dạy kinh công cấp 2 cho con, con phải chứng tỏ được khả năng hiện tại.", "Hãy nhảy lên cao và chém được ít nhất 20 phát khi chưa chạm đất!", "Khá khó, nhưng ta tin con sẽ khẳng định được mình!"}, {"Hãy đến rừng chông tre. Giết 70 quỷ hoa đỏ rồi về đây, ta cho ngươi shuriken cấp 2!"}, {"Con hãy đến vách đá Ito, giết 50 con bò cạp, mang đuôi về cho ta!"}, {"Ta không muốn nói nhiều. Một phần thưởng đặt biệt cho ngươi..", "..nếu ngươi có thể giết được 30 con cá đỏ!"}, {"Để học kỹ năng ẩn thân, hãy đi tìm 1 quyển bí kíp...", "Cất giấu tại 1 thung lũng phía đông."}, {"Nhanh lên, cô bé ấy đã bị bắt từ mấy hôm rồi!"}};
      field_array_array_class_java_lang_String_lF = new String[][]{{"Ta đang bận, Con hãy đi tập luyện đi."}, {"Các ngươi phải cố gắng tập luyện để trở thành những Ninja tốt"}, {"Hằng ngày ngươi phải siêng năng tập thể lực, đó là nền tảng cho mọi hoạt động."}, {"Cô Ayumi xinh thật. Con có thấy thế không?"}, {"Ngươi biết không....à..à...mà ta định nói gì với ngươi nhỉ."}, {"Ta không còn gì để dạy con nữa...", "Nhưng con phải cố gắng tập luyện hàng ngày. Biết không!"}, {"Con cần phải để mắt tới cô bé Sakura nhé..", "Con bé ấy quậy lắm đấy!"}, {"Dù sau này có đi đâu, ngươi cũng phải trở thành 1 ninja tốt nhé!"}, {"Ta không còn gì để dạy con nữa!", "Hãy rèn luyện sức khỏe hàng ngày, biết không!"}, {"..à.. ừ.. ngươi muốn học phép à..", ".. để ta nghĩ ra thêm vài phép mới..", "..trước mắt hãy học những kỹ năng cũ đã nhé..."}};
      var10000 = new String[]{"Ngươi không có đủ vàng."};
      field_array_class_java_lang_String_lG = new String[]{"Hãy hoàn thành nhiệm vụ được giao rồi quay lại gặp ta!"};
      field_array_int_lH = new int[]{1, 7, 100, 100, 6, 100, 100, 13, 100, 15, 100, 100, 18, 17, 10, 100, 100, 100};
      field_array_int_lI = new int[]{10, 2, 0, 0, 20, 0, 0, 15, 0, 20, 0, 0, 70, 50, 30, 0, 0, 0};
      field_array_int_lJ = new int[]{7, 6, 6, 5, 2, 4};
      field_int_lK = -1;
      field_class_java_lang_String_lP = "sms://8722";
      field_array_class_java_lang_String_lQ = new String[]{"1. Tiep tuc", "2. Kich hoat", "3. Nhap ma kich hoat"};
      field_array_class_java_lang_String_lR = new String[]{"1. Kich hoat", "2. Nhap ma kich hoat"};
      field_class_javax_microedition_lcdui_Font_lU = Font.getFont(0, 0, 0);
      field_class_javax_microedition_lcdui_Font_lV = Font.getFont(0, 1, 0);
      field_int_lW = field_class_javax_microedition_lcdui_Font_lU.getHeight() + 6;
      field_array_int_ma = new int[9];
      field_int_mb = 10;

      for(var0 = 0; var0 < 9; ++var0) {
         field_array_int_ma[var0] = (var0 << 1) + 1;
         int[] var5 = field_array_int_ma;
         var5[var0] += field_int_aY;
      }

   }

   // $FF: renamed from: a () void
   public static void func_void_a() {
      int[] var1 = new int[500];
      byte var2 = 0;
      if (field_long_gP > 0L) {
         field_int_gO += (int)((System.currentTimeMillis() - field_long_gP) / 1000L);
      }

      field_long_gP = System.currentTimeMillis();
      int var5 = var2 + 1;
      var1[0] = field_int_gO;
      ++var5;
      var1[1] = field_int_v;
      ++var5;
      var1[2] = field_int_w;
      ++var5;
      var1[3] = field_boolean_eH ? 1 : 0;
      ++var5;
      var1[4] = field_int_dg;
      ++var5;
      var1[5] = field_boolean_dz ? 1 : 0;
      ++var5;
      var1[6] = field_boolean_eI ? 1 : 0;
      ++var5;
      var1[7] = field_boolean_eJ ? 1 : 0;
      ++var5;
      var1[8] = field_boolean_eK ? 1 : 0;
      ++var5;
      var1[9] = field_boolean_gn ? 1 : 0;
      ++var5;
      var1[10] = field_int_go;
      ++var5;
      var1[11] = field_int_gp;
      ++var5;
      var1[12] = field_int_im;
      ++var5;
      var1[13] = field_int_x;
      ++var5;
      var1[14] = field_boolean_eZ ? 1 : 0;

      int var0;
      for(var0 = 0; var0 < field_array_boolean_W.length; ++var0) {
         var1[var5++] = field_array_boolean_W[var0] ? 1 : 0;
      }

      for(var0 = 0; var0 < field_array_int_V.length; ++var0) {
         var1[var5++] = field_array_int_V[var0];
      }

      var1[var5++] = field_boolean_eL ? 1 : 0;
      var1[var5++] = field_boolean_eM ? 1 : 0;
      var1[var5++] = field_boolean_eN ? 1 : 0;
      var1[var5++] = field_boolean_eO ? 1 : 0;
      var1[var5++] = field_boolean_eP ? 1 : 0;
      var1[var5++] = field_boolean_eQ ? 1 : 0;
      var1[var5++] = field_boolean_eR ? 1 : 0;
      var1[var5++] = field_boolean_eS ? 1 : 0;
      var1[var5++] = field_boolean_eT ? 1 : 0;
      var1[var5++] = field_boolean_eU ? 1 : 0;
      var1[var5++] = field_boolean_eV ? 1 : 0;
      var1[var5++] = field_boolean_eW ? 1 : 0;
      var1[var5++] = field_boolean_eX ? 1 : 0;
      var1[var5++] = field_boolean_eY ? 1 : 0;
      var1[var5++] = field_boolean_fa ? 1 : 0;
      var1[var5++] = field_boolean_fb ? 1 : 0;
      var1[var5++] = field_boolean_fc ? 1 : 0;
      var1[var5++] = field_boolean_fd ? 1 : 0;
      var1[var5++] = field_boolean_fe ? 1 : 0;
      var1[var5++] = field_int_ff;
      var1[var5++] = field_int_fg;
      var1[var5++] = field_int_fh;
      var1[var5++] = field_int_fi;
      var1[var5++] = field_int_y;
      var1[var5++] = field_int_z;
      var1[var5++] = field_int_A;
      var1[var5++] = field_int_B;
      var1[var5++] = field_int_fj;
      var1[var5++] = field_int_fk;
      var1[var5++] = field_int_fl;
      var1[var5++] = field_int_fm;
      var1[var5++] = field_int_fn;
      var1[var5++] = field_int_fo;
      var1[var5++] = field_int_fp;
      var1[var5++] = field_int_C;
      var1[var5++] = field_int_D;
      var1[var5++] = field_int_fq;
      var1[var5++] = field_int_E;
      var1[var5++] = field_int_F;
      var1[var5++] = field_int_G;
      var1[var5++] = field_int_H;
      var1[var5++] = field_int_I;
      var1[var5++] = field_int_J;
      var1[var5++] = field_int_K;
      var1[var5++] = field_int_L;
      var1[var5++] = field_int_fr;
      var1[var5++] = field_int_fs;
      var1[var5++] = field_int_ft;
      var1[var5++] = field_int_fv;
      var1[var5++] = field_int_fw;
      var1[var5++] = field_int_M;
      var1[var5++] = field_int_N;
      var1[var5++] = field_boolean_fx ? 1 : 0;
      var1[var5++] = field_boolean_fy ? 1 : 0;
      var1[var5++] = field_boolean_fz ? 1 : 0;
      var1[var5++] = field_boolean_fA ? 1 : 0;
      var1[var5++] = field_int_O;
      var1[var5++] = field_int_fB;
      var1[var5++] = field_int_fC;
      var1[var5++] = field_boolean_fD ? 1 : 0;
      var1[var5++] = field_int_fF;
      var1[var5++] = field_int_fG;
      var1[var5++] = field_int_fH;
      var1[var5++] = field_int_ij;
      var1[var5++] = field_int_ik;
      var1[var5++] = field_int_fI;
      var1[var5++] = field_int_fJ;
      var1[var5++] = field_int_fK;
      var1[var5++] = field_int_fL;
      var1[var5++] = field_int_fM;
      var1[var5++] = field_int_fN;
      var1[var5++] = field_int_fO;
      var1[var5++] = field_int_fP;
      var1[var5++] = field_int_fQ;
      var1[var5++] = field_int_fR;
      var1[var5++] = field_int_fS;
      var1[var5++] = field_int_fT;
      var1[var5++] = field_int_fU;
      var1[var5++] = field_boolean_ih ? 1 : 0;
      var1[var5++] = field_int_ig;
      var1[var5++] = field_int_ii;
      var1[var5++] = field_int_ge;
      var1[var5++] = field_int_gf;
      var1[var5++] = field_int_gg;
      var1[var5++] = field_int_gh;
      var1[var5++] = field_int_gi;
      var1[var5++] = field_int_gj;
      var1[var5++] = field_int_gk;
      var1[var5++] = field_int_gl;
      var1[var5++] = field_int_gm;
      var1[var5++] = field_int_gq;
      var1[var5++] = field_int_gr;
      var1[var5++] = field_int_gs;
      var1[var5++] = field_int_gt;
      var1[var5++] = field_int_gu;
      var1[var5++] = field_int_gv;
      var1[var5++] = field_int_gw;
      var1[var5++] = field_int_gx;
      var1[var5++] = field_int_gy;
      var1[var5++] = field_int_gz;
      var1[var5++] = field_int_gA;
      var1[var5++] = field_int_gB;
      var1[var5++] = field_int_gC;
      var1[var5++] = field_int_gD;
      var1[var5++] = field_int_gE;
      var1[var5++] = field_int_gF;
      var1[var5++] = field_int_gG;
      var1[var5++] = field_int_gH;
      var1[var5++] = field_int_gI;
      var1[var5++] = field_int_gJ;
      var1[var5++] = field_int_gK;
      var1[var5++] = field_int_gL;
      var1[var5++] = field_int_gM;
      var1[var5++] = field_int_hc;
      var1[var5++] = field_int_hj;
      var1[var5++] = field_int_hp;
      var1[var5++] = field_int_hP;
      var1[var5++] = field_int_hu;
      var1[var5++] = field_int_il;
      if (field_int_il > 0) {
         for(var0 = 0; var0 < field_array_int_ir.length; ++var0) {
            var1[var5++] = field_array_int_ir[var0];
         }

         for(var0 = 0; var0 < field_array_int_ip.length; ++var0) {
            var1[var5++] = field_array_int_ip[var0];
         }

         for(var0 = 0; var0 < field_array_int_iq.length; ++var0) {
            var1[var5++] = field_array_int_iq[var0];
         }

         for(var0 = 0; var0 < field_array_int_is.length; ++var0) {
            var1[var5++] = field_array_int_is[var0];
         }

         for(var0 = 0; var0 < field_array_int_in.length; ++var0) {
            var1[var5++] = field_array_int_in[var0];
         }

         for(var0 = 0; var0 < field_array_int_io.length; ++var0) {
            var1[var5++] = field_array_int_io[var0];
         }
      }

      var1[var5++] = field_int_it;
      if (field_int_it > 0) {
         var1[var5++] = field_int_iu;
         if (field_array_int_ix != null) {
            for(var0 = 0; var0 < field_array_int_ix.length; ++var0) {
               var1[var5++] = field_array_int_ix[var0];
            }
         }

         if (field_array_int_iB != null) {
            for(var0 = 0; var0 < field_array_int_iB.length; ++var0) {
               var1[var5++] = field_array_int_iB[var0];
            }
         }

         if (field_array_int_iA != null) {
            for(var0 = 0; var0 < field_array_int_iA.length; ++var0) {
               var1[var5++] = field_array_int_iA[var0];
            }
         }

         if (field_array_int_iy != null) {
            for(var0 = 0; var0 < field_array_int_iy.length; ++var0) {
               var1[var5++] = field_array_int_iy[var0];
            }
         }

         if (field_array_int_iz != null) {
            for(var0 = 0; var0 < field_array_int_iz.length; ++var0) {
               var1[var5++] = field_array_int_iz[var0];
            }
         }

         if (field_array_int_iv != null) {
            for(var0 = 0; var0 < field_array_int_iv.length; ++var0) {
               var1[var5++] = field_array_int_iv[var0];
            }
         }

         if (field_array_int_iw != null) {
            for(var0 = 0; var0 < field_array_int_iw.length; ++var0) {
               var1[var5++] = field_array_int_iw[var0];
            }
         }
      }

      int[] var6 = var1;
      int var4;
      byte[] var7 = new byte[(var4 = var1.length) << 2];

      for(int var3 = 0; var3 < var4; ++var3) {
         var7[var3 << 2] = (byte)(var6[var3] >> 24);
         var7[(var3 << 2) + 1] = (byte)(var6[var3] >>> 16);
         var7[(var3 << 2) + 2] = (byte)(var6[var3] >>> 8);
         var7[(var3 << 2) + 3] = (byte)var6[var3];
      }

      Midlet.func_void_a("ninjasave", var7);
      Midlet.func_void_a(true);
   }

   // $FF: renamed from: b () void
   public static void func_void_b() {
      int[] var0 = func_array_int_a(Midlet.func_array_byte_b("ninjasave"));
      byte var2 = 0;
      int var7 = var2 + 1;
      field_int_gO = var0[0];
      ++var7;
      field_int_v = var0[1];
      ++var7;
      field_int_w = var0[2];
      ++var7;
      field_boolean_eH = var0[3] == 1;
      ++var7;
      field_int_dg = var0[4];
      ++var7;
      field_boolean_dz = var0[5] == 1;
      ++var7;
      field_boolean_eI = var0[6] == 1;
      ++var7;
      field_boolean_eJ = var0[7] == 1;
      ++var7;
      field_boolean_eK = var0[8] == 1;
      ++var7;
      field_boolean_gn = var0[9] == 1;
      ++var7;
      field_int_go = var0[10];
      ++var7;
      field_int_gp = var0[11];
      ++var7;
      field_int_im = var0[12];
      ++var7;
      field_int_x = var0[13];
      ++var7;
      field_boolean_eZ = var0[14] == 1;

      int var1;
      for(var1 = 0; var1 < field_array_boolean_W.length; ++var1) {
         field_array_boolean_W[var1] = var0[var7++] == 1;
      }

      for(var1 = 0; var1 < field_array_int_V.length; ++var1) {
         field_array_int_V[var1] = var0[var7++];
      }

      field_boolean_eL = var0[var7++] == 1;
      field_boolean_eM = var0[var7++] == 1;
      field_boolean_eN = var0[var7++] == 1;
      field_boolean_eO = var0[var7++] == 1;
      field_boolean_eP = var0[var7++] == 1;
      field_boolean_eQ = var0[var7++] == 1;
      field_boolean_eR = var0[var7++] == 1;
      field_boolean_eS = var0[var7++] == 1;
      field_boolean_eT = var0[var7++] == 1;
      field_boolean_eU = var0[var7++] == 1;
      field_boolean_eV = var0[var7++] == 1;
      field_boolean_eW = var0[var7++] == 1;
      field_boolean_eX = var0[var7++] == 1;
      field_boolean_eY = var0[var7++] == 1;
      field_boolean_fa = var0[var7++] == 1;
      field_boolean_fb = var0[var7++] == 1;
      field_boolean_fc = var0[var7++] == 1;
      field_boolean_fd = var0[var7++] == 1;
      field_boolean_fe = var0[var7++] == 1;
      field_int_ff = var0[var7++];
      field_int_fg = var0[var7++];
      field_int_fh = var0[var7++];
      field_int_fi = var0[var7++];
      field_int_y = var0[var7++];
      field_int_z = var0[var7++];
      field_int_A = var0[var7++];
      field_int_B = var0[var7++];
      field_int_fj = var0[var7++];
      field_int_fk = var0[var7++];
      field_int_fl = var0[var7++];
      field_int_fm = var0[var7++];
      field_int_fn = var0[var7++];
      field_int_fo = var0[var7++];
      field_int_fp = var0[var7++];
      field_int_C = var0[var7++];
      field_int_D = var0[var7++];
      field_int_fq = var0[var7++];
      field_int_E = var0[var7++];
      field_int_F = var0[var7++];
      field_int_G = var0[var7++];
      field_int_H = var0[var7++];
      field_int_I = var0[var7++];
      field_int_J = var0[var7++];
      field_int_K = var0[var7++];
      field_int_L = var0[var7++];
      field_int_fr = var0[var7++];
      field_int_fs = var0[var7++];
      field_int_ft = var0[var7++];
      field_int_fv = var0[var7++];
      field_int_fw = var0[var7++];
      field_int_M = var0[var7++];
      field_int_N = var0[var7++];
      field_boolean_fx = var0[var7++] == 1;
      field_boolean_fy = var0[var7++] == 1;
      field_boolean_fz = var0[var7++] == 1;
      field_boolean_fA = var0[var7++] == 1;
      field_int_O = var0[var7++];
      field_int_fB = var0[var7++];
      field_int_fC = var0[var7++];
      field_boolean_fD = var0[var7++] == 1;
      field_int_fF = var0[var7++];
      field_int_fG = var0[var7++];
      field_int_fH = var0[var7++];
      field_int_ij = var0[var7++];
      field_int_ik = var0[var7++];
      field_int_fI = var0[var7++];
      field_int_fJ = var0[var7++];
      field_int_fK = var0[var7++];
      field_int_fL = var0[var7++];
      field_int_fM = var0[var7++];
      field_int_fN = var0[var7++];
      field_int_fO = var0[var7++];
      field_int_fP = var0[var7++];
      field_int_fQ = var0[var7++];
      field_int_fR = var0[var7++];
      field_int_fS = var0[var7++];
      field_int_fT = var0[var7++];
      field_int_fU = var0[var7++];
      field_boolean_ih = var0[var7++] == 1;
      field_int_ig = var0[var7++];
      field_int_ii = var0[var7++];
      field_int_ge = var0[var7++];
      field_int_gf = var0[var7++];
      field_int_gg = var0[var7++];
      field_int_gh = var0[var7++];
      field_int_gi = var0[var7++];
      field_int_gj = var0[var7++];
      field_int_gk = var0[var7++];
      field_int_gl = var0[var7++];
      field_int_gm = var0[var7++];
      field_int_gq = var0[var7++];
      field_int_gr = var0[var7++];
      field_int_gs = var0[var7++];
      field_int_gt = var0[var7++];
      field_int_gu = var0[var7++];
      field_int_gv = var0[var7++];
      field_int_gw = var0[var7++];
      field_int_gx = var0[var7++];
      field_int_gy = var0[var7++];
      field_int_gz = var0[var7++];
      field_int_gA = var0[var7++];
      field_int_gB = var0[var7++];
      field_int_gC = var0[var7++];
      field_int_gD = var0[var7++];
      field_int_gE = var0[var7++];
      field_int_gF = var0[var7++];
      field_int_gG = var0[var7++];
      field_int_gH = var0[var7++];
      field_int_gI = var0[var7++];
      field_int_gJ = var0[var7++];
      field_int_gK = var0[var7++];
      field_int_gL = var0[var7++];
      field_int_gM = var0[var7++];
      if ((field_int_hc = var0[var7++]) <= 0) {
         field_int_hc = field_int_hd;
      }

      field_int_hj = var0[var7++];
      field_int_hp = var0[var7++];
      field_int_hP = var0[var7++];
      field_int_hu = var0[var7++];
      int var10001 = var7++;
      int var10000 = var0[var10001];
      var10001 = var0[var10001];
      if (var10000 > 0) {
         try {
            for(var1 = 0; var1 < field_array_int_ir.length; ++var1) {
               ++var7;
            }

            for(var1 = 0; var1 < field_array_int_ip.length; ++var1) {
               ++var7;
            }

            for(var1 = 0; var1 < field_array_int_iq.length; ++var1) {
               ++var7;
            }

            for(var1 = 0; var1 < field_array_int_is.length; ++var1) {
               ++var7;
            }

            for(var1 = 0; var1 < field_array_int_in.length; ++var1) {
               ++var7;
            }

            for(var1 = 0; var1 < field_array_int_io.length; ++var1) {
               ++var7;
            }
         } catch (Exception var5) {
         }
      }

      if ((field_int_it = var0[var7++]) > 0) {
         field_int_iu = var0[var7++];

         try {
            for(var1 = 0; var1 < field_array_int_ix.length; ++var1) {
               field_array_int_ix[var1] = var0[var7++];
            }

            for(var1 = 0; var1 < field_array_int_iB.length; ++var1) {
               field_array_int_iB[var1] = var0[var7++];
            }

            for(var1 = 0; var1 < field_array_int_iA.length; ++var1) {
               field_array_int_iA[var1] = var0[var7++];
            }

            for(var1 = 0; var1 < field_array_int_iy.length; ++var1) {
               field_array_int_iy[var1] = var0[var7++];
            }

            for(var1 = 0; var1 < field_array_int_iz.length; ++var1) {
               field_array_int_iz[var1] = var0[var7++];
            }

            for(var1 = 0; var1 < field_array_int_iv.length; ++var1) {
               field_array_int_iv[var1] = var0[var7++];
            }

            for(var1 = 0; var1 < field_array_int_iw.length; ++var1) {
               field_array_int_iw[var1] = var0[var7++];
            }
         } catch (Exception var4) {
         }
      }

      if (field_boolean_fA) {
         if (field_array_class_javax_microedition_lcdui_Image_es == null) {
            field_array_class_javax_microedition_lcdui_Image_es = new Image[4];

            try {
               field_array_class_javax_microedition_lcdui_Image_es[0] = Image.createImage("/cp/ch0x.png");
               field_array_class_javax_microedition_lcdui_Image_es[1] = Image.createImage("/cp/ch1x.png");
            } catch (Exception var3) {
            }

            field_array_class_javax_microedition_lcdui_Image_es[2] = field_array_class_javax_microedition_lcdui_Image_es[1];
            field_array_class_javax_microedition_lcdui_Image_es[3] = field_array_class_javax_microedition_lcdui_Image_es[0];
         }

         for(var1 = 0; var1 < 4; ++var1) {
            Image var6 = field_array_class_javax_microedition_lcdui_Image_er[var1];
            field_array_class_javax_microedition_lcdui_Image_er[var1] = field_array_class_javax_microedition_lcdui_Image_es[var1];
            field_array_class_javax_microedition_lcdui_Image_es[var1] = var6;
         }
      }

   }

   // $FF: renamed from: a (byte[]) int[]
   private static int[] func_array_int_a(byte[] var0) {
      int var1;
      int[] var3 = new int[(var1 = var0.length) >> 2];

      for(int var2 = 0; var2 < var3.length; ++var2) {
         var3[var2] = (var0[var2 << 2] << 24) + ((var0[(var2 << 2) + 1] & 255) << 16) + ((var0[(var2 << 2) + 2] & 255) << 8) + (var0[(var2 << 2) + 3] & 255);
      }

      return var3;
   }

   // $FF: renamed from: a (int) int
   public static final int func_int_a(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   // $FF: renamed from: a (int, int, int, int, int) void
   private static void func_void_a(int var0, int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < field_int_dh && field_array_int_dk[var5] != 0; ++var5) {
      }

      if (var5 != field_int_dh) {
         field_array_int_di[var5] = var0;
         field_array_int_dj[var5] = var1;
         field_array_int_dl[var5] = var2;
         field_array_int_dm[var5] = var3;
         field_array_int_dk[var5] = 1;
         field_array_int_do[var5] = var4;
         if (var4 < 160) {
            field_array_int_dp[var5] = 0;
         } else if (var4 < 600) {
            field_array_int_dp[var5] = 1;
         } else {
            field_array_int_dp[var5] = 2;
         }
      }
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   private static void func_void_a(int var0, int var1, int var2, int var3, int var4, int var5) {
      for(var3 = 0; var3 < field_int_cP && field_array_int_cT[var3] != 0; ++var3) {
      }

      if (var3 != field_int_cP) {
         field_array_int_cR[var3] = var0;
         field_array_int_cS[var3] = var1;
         field_array_int_cU[var3] = var2;
         field_array_int_cV[var3] = -5;
         field_array_int_cT[var3] = 1;
         field_array_int_cX[var3] = var4;
         field_array_int_cQ[var3] = var5;
         if (var4 < 100) {
            field_array_int_cW[var3] = 0;
         } else if (var4 < 200) {
            field_array_int_cW[var3] = 1;
         } else {
            field_array_int_cW[var3] = 2;
         }
      }
   }

   // $FF: renamed from: u (int) void
   private static void func_void_u(int var0) {
      if ((field_int_N += var0) > field_array_int_ak[field_int_M - 1]) {
         field_int_N = 0;
         if (Midlet.field_boolean_a && field_int_M == 6) {
            func_void_s(6);
            func_void_a("Xin đăng ký để có thể lên cấp 7!");
            field_int_d = 7;
            return;
         }

         ++field_int_M;
         field_int_E += field_array_int_aj[field_int_M - 2];
         field_int_F += 2;
         field_int_G = field_int_H += field_array_int_al[field_int_M - 2];
         field_int_I = field_int_J;
         func_void_a("level-up", 2, field_int_fh, field_int_fi - field_int_fk, 0, -2);
         func_void_s(6);
         func_void_a("Chúc mừng! Bạn đạt được cấp " + field_int_M + '\n' + "HP: " + field_int_H + '\n' + "Sức đánh: " + (field_int_E + (field_int_E >> 2) * (field_int_x + 1)));
         field_int_d = 7;
      } else {
         func_void_a("+" + var0, 2, field_int_fh, field_int_fi - field_int_fk, 0, -2);
      }

      field_boolean_c = true;
   }

   // $FF: renamed from: u () void
   private static void func_void_u() {
      if (field_int_O == 11 && field_int_z != 0) {
         ++field_int_fF;
         if (field_int_O >= 20) {
            func_void_c("Thành công 20 hit!");
         } else {
            func_void_c("Hit: " + field_int_fF);
         }
      }

      int var0 = (var0 = field_int_E + field_int_w % (field_int_E >> 1)) + (var0 >> 1) * field_int_x;
      if (field_boolean_fA) {
         var0 <<= 1;
      }

      if (field_int_fg == 1) {
         func_void_a(field_int_fh + (field_int_fp << 3), field_int_fi - 12, (field_int_fp << 3) + field_int_y, field_int_z << 1, false);
      } else {
         if (field_int_z > 0 && field_int_y == 0) {
            field_int_z = -2;
         }

         int var1 = func_int_A();
         field_boolean_fu = false;
         if (var1 != -1) {
            field_boolean_fu = true;
            func_boolean_k(var1, var0, -field_int_fp);
            func_boolean_f(field_array_int_jN[var1], field_array_int_jO[var1] - (field_array_int_jP[var1] >> 1), field_int_fp);
            func_void_a("-" + var0, 0, field_array_int_jN[var1], field_array_int_jO[var1] - field_array_int_jP[var1], 0, -2);
            if (field_int_z > 0) {
               field_int_z = -6;
            }

            func_void_Q();
         }

         for(var1 = 0; var1 < field_int_it; ++var1) {
            if (func_int_a(field_int_fi - field_int_fm - field_array_int_iw[var1]) < 20 && func_int_a(field_int_fh + (field_int_fp << 4) - field_array_int_iv[var1]) < 24) {
               field_array_int_ix[var1] = 2;
               field_array_int_iy[var1] = field_int_fp << 3;
               func_boolean_f(field_array_int_iv[var1], field_array_int_iw[var1] - 12, field_int_fp);
               func_void_Q();
               break;
            }
         }

         if (field_boolean_gQ && func_int_a(field_int_fi - field_int_gT) < 30 && func_int_a(field_int_fh + (field_int_fp << 4) - field_int_gS) < 40) {
            if (!func_boolean_c(var0, -field_int_fp)) {
               func_boolean_f(field_int_fh + (field_int_gS - field_int_fh >> 1), field_int_fi - 12, field_int_fp);
               func_void_a("-" + var0, 0, field_int_gS, field_int_gT - field_int_gZ, 0, -2);
            }

            func_void_Q();
         }

         for(var1 = 0; var1 < field_int_cs; ++var1) {
            if (func_int_a(field_int_fi - field_array_int_cy[var1]) <= 12 && func_int_a(field_int_fh + (field_int_fp << 4) - field_array_int_cx[var1]) < 24) {
               func_boolean_a(var1, var0, -field_int_fp);
               func_boolean_f(field_array_int_cx[var1], field_array_int_cy[var1] - 15, field_int_fp);
               func_void_a("-" + var0, 0, field_array_int_cx[var1], field_array_int_cy[var1] - 28, 0, -2);
               func_void_Q();
               break;
            }
         }

         boolean var10000;
         if (field_boolean_hM && func_int_a(field_int_fi - (field_int_hT - 40)) < 30 && func_int_a(field_int_fh + (field_int_fp << 4) - field_int_hS) < 40) {
            if ((field_int_hP -= var0) <= 0) {
               field_int_hP = 0;
               field_int_ie = 0;
               field_int_if = 0;
               field_int_ia = 1;
               func_void_a(field_int_hS, field_int_hT, 4, -10, 600);
               func_void_a(field_int_hS, field_int_hT, -4, -17, 600);
               func_void_a(field_int_hS, field_int_hT, -3, -18, 600);
               func_void_a(field_int_hS, field_int_hT, 4, -19, 600);
               func_void_a(field_int_hS, field_int_hT, 0, -10, 600);
               var10000 = false;
            } else {
               field_int_if = 50;
               var10000 = false;
            }

            func_boolean_f(field_int_fh + (field_int_hS - field_int_fh >> 1), field_int_fi - 12, field_int_fp);
            func_void_a("-" + var0, 0, field_int_hS, field_int_hT - field_int_hO, 0, -2);
            func_void_Q();
         }

         if (field_boolean_hf) {
            if (func_int_a(field_int_fi - field_array_int_dD[0]) < 5 && func_int_a(field_int_fh + (field_int_fp << 4) - field_array_int_dC[0]) < 30) {
               func_void_d(var0, field_int_fp);
            }

            func_void_Q();
         }

         if (field_boolean_hl) {
            if (func_int_a(field_int_fi - (field_int_ht - 30)) < 30 && func_int_a(field_int_fh + (field_int_fp << 4) - field_int_hs) < 30) {
               if ((field_int_hp -= var0) <= 0) {
                  field_int_hp = 0;
                  field_int_hy = 0;
                  field_int_hr = 0;
                  field_int_hu = 6;
                  func_void_a(field_int_hs, field_int_ht, 4, -10, 500);
                  func_void_a(field_int_hs, field_int_ht, -4, -17, 500);
                  func_void_a(field_int_hs, field_int_ht, -3, -18, 500);
                  func_void_a(field_int_hs, field_int_ht, 4, -19, 500);
                  func_void_a(field_int_hs, field_int_ht, 0, -10, 500);
                  var10000 = false;
               } else {
                  field_int_hr = 50;
                  func_boolean_f(field_int_hs, field_int_ht - 47, field_int_fp);
                  func_void_a("-" + var0, 0, field_int_hs, field_int_ht - 55, 0, -2);
                  var10000 = false;
               }
            }

            func_void_Q();
         }

      }
   }

   // $FF: renamed from: v () void
   private static void func_void_v() {
      int var0;
      int var1;
      if (field_int_ik == 1) {
         var0 = field_int_gC << 3;
         var1 = field_int_fi - field_int_gr >> 3;
         func_void_a(field_int_gq + (field_int_gC << 3), field_int_gr - 12, var0, var1 + (var0 - 8), true);
      } else {
         var0 = field_int_E << 1;
         var1 = field_int_gC > 0 ? field_int_gq - 20 : field_int_gq - 40;
         int var2 = field_int_gC > 0 ? field_int_gq + 40 : field_int_gq + 20;
         int var3 = field_int_gr - field_int_gx - 15;
         int var4 = field_int_gr + 5;
         int var5 = 0;

         int var10000;
         while(true) {
            if (var5 >= field_int_jK) {
               var10000 = -1;
               break;
            }

            if (field_array_int_jS[var5] != 5 && field_array_int_jN[var5] >= var1 && field_array_int_jN[var5] <= var2 && field_array_int_jO[var5] >= var3 && field_array_int_jO[var5] <= var4) {
               var10000 = var5;
               break;
            }

            ++var5;
         }

         var1 = var10000;
         if (var10000 != -1) {
            func_boolean_k(var1, var0, -field_int_gC);
            func_boolean_f(field_array_int_jN[var1], field_array_int_jO[var1] - (field_array_int_jP[var1] >> 1), field_int_gC);
            func_void_a("-" + var0, 0, field_array_int_jN[var1], field_array_int_jO[var1] - field_array_int_jP[var1], 0, -2);
         }

         if (field_boolean_gQ && func_int_a(field_int_gr - field_int_gT) < 30 && func_int_a(field_int_gq + (field_int_gC << 4) - field_int_gS) < 40 && !func_boolean_c(var0, -field_int_gC)) {
            func_boolean_f(field_int_gq + (field_int_gS - field_int_gq >> 1), field_int_gr - 12, field_int_gC);
            func_void_a("-" + var0, 0, field_int_gS, field_int_gT - field_int_gZ, 0, -2);
         }

         for(var1 = 0; var1 < field_int_cs; ++var1) {
            if (field_int_gr == field_array_int_cy[var1] && func_int_a(field_int_gq + (field_int_gC << 4) - field_array_int_cx[var1]) < 24) {
               func_boolean_a(var1, var0, -field_int_gC);
               func_boolean_f(field_array_int_cx[var1], field_array_int_cy[var1] - 15, field_int_gC);
               func_void_a("-" + var0, 0, field_array_int_cx[var1], field_array_int_cy[var1] - 28, 0, -2);
               return;
            }
         }

      }
   }

   // $FF: renamed from: w () void
   private static void func_void_w() {
      for(int var0 = 0; var0 < field_int_it; ++var0) {
         if (field_array_int_ix[var0] != 4 && func_int_a(field_int_fh - field_array_int_iv[var0]) < 20 && field_array_int_iw[var0] > field_int_fi && field_array_int_iw[var0] - 24 <= field_int_fi) {
            field_int_y = 0;
            field_int_z = 0;
            field_int_fi = field_array_int_iw[var0] - 24;
            field_int_A = 1;
            field_int_ff = -1;
            field_int_iu = var0;
            if (field_array_int_ix[var0] == 11) {
               func_boolean_g(field_array_int_iv[var0], field_array_int_iw[var0] - 10);
               int[] var10000 = field_array_int_iw;
               var10000[var0] += 4;
               var10000 = field_array_int_iz;
               var10000[var0] += 4;
               return;
            }
            break;
         }
      }

   }

   // $FF: renamed from: x () void
   private static void func_void_x() {
      for(int var0 = 0; var0 < field_int_it; ++var0) {
         if (func_int_a(field_int_fh - field_array_int_iv[var0]) < 20 && func_int_a(field_array_int_iw[var0] - field_int_fi) < 4) {
            field_int_y = 0;
            if (field_int_fh < field_array_int_iv[var0]) {
               field_int_fh = field_array_int_iv[var0] - 20;
            } else {
               field_int_fh = field_array_int_iv[var0] + 20;
            }

            if (field_array_int_ix[var0] != 4) {
               field_array_int_ix[var0] = 2;
               field_array_int_iy[var0] = -field_int_fp << 1;
               return;
            }
         }
      }

   }

   // $FF: renamed from: v (int) void
   private static void func_void_v(int var0) {
      if (func_int_a(field_int_fi - field_array_int_cy[var0]) <= 24 && func_int_a(field_array_int_cx[var0] + (field_array_int_cK[var0] << 3) - field_int_fh) < 25 && (field_array_int_cG[var0] == 6 || field_array_int_cG[var0] == 2 || field_array_int_cG[var0] == 3)) {
         field_array_int_cJ[var0] = field_array_int_cI[var0] = 0;
         field_array_int_cH[var0] = 4;
      }

   }

   // $FF: renamed from: w (int) void
   private static void func_void_w(int var0) {
      if (!field_boolean_fz) {
         if (func_int_a(field_array_int_cx[var0] - field_int_fh) < 100 && func_int_a(field_array_int_cy[var0] - field_int_fi) < 20) {
            switch(field_array_int_cG[var0]) {
            case 0:
            case 1:
            case 4:
            case 5:
               field_array_int_cK[var0] = field_array_int_cx[var0] < field_int_fh ? 1 : -1;
               field_array_int_cJ[var0] = field_array_int_cI[var0] = 0;
               field_array_int_cH[var0] = 4;
               break;
            case 2:
            case 3:
            case 6:
               field_array_int_cJ[var0] = field_int_fh;
               int[] var10000;
               if (field_array_int_cx[var0] < field_int_fh) {
                  var10000 = field_array_int_cJ;
                  var10000[var0] -= 10;
               } else {
                  var10000 = field_array_int_cJ;
                  var10000[var0] += 10;
               }

               field_array_int_cK[var0] = field_array_int_cJ[var0] < field_int_fh ? 1 : -1;
               field_array_int_cH[var0] = 7;
               field_array_int_cB[var0] = field_array_int_cK[var0] << 3;
               if (field_array_int_cJ[var0] < field_array_int_cN[var0]) {
                  field_array_int_cJ[var0] = field_array_int_cN[var0];
               }

               if (field_array_int_cJ[var0] > field_array_int_cO[var0]) {
                  field_array_int_cJ[var0] = field_array_int_cO[var0];
                  return;
               }
            }
         }

      }
   }

   // $FF: renamed from: y () void
   private static void func_void_y() {
      for(int var0 = 0; var0 < field_int_it; ++var0) {
         if (func_int_a(field_int_fh - field_array_int_iv[var0]) < 20 && field_array_int_iw[var0] == field_int_fi) {
            field_int_y = 0;
            if (field_int_fh < field_array_int_iv[var0]) {
               field_int_fh = field_array_int_iv[var0] - 20;
            } else {
               field_int_fh = field_array_int_iv[var0] + 20;
            }

            if (field_array_int_ix[var0] != 4) {
               field_array_int_ix[var0] = 2;
               field_array_int_iy[var0] = field_int_fp << 2;
               return;
            }
         }
      }

   }

   // $FF: renamed from: c () void
   static void func_void_c() {
      for(int var0 = 0; var0 < 14; ++var0) {
         field_array_boolean_aU[var0] = false;
      }

   }

   // $FF: renamed from: d () void
   static void func_void_d() {
      for(int var0 = 0; var0 < 14; ++var0) {
         field_array_boolean_aV[var0] = false;
      }

   }

   // $FF: renamed from: z () void
   private static void func_void_z() {
      label58:
      switch(field_int_iG) {
      case 3:
         field_int_O = 0;
         field_int_fF = 0;
         func_void_c("NV: Giết 10 ốc sên");
         break;
      case 4:
         field_boolean_eL = true;
         field_boolean_eM = true;
         field_int_O = -1;
         field_int_fF = 0;
         func_void_c("đã học phép khinh công");
         break;
      case 5:
         field_int_O = 1;
         field_int_fF = 0;
         func_void_c("NV: đánh ngã 2 bù nhìn");
         break;
      case 6:
         field_boolean_eN = true;
         field_int_O = -1;
         field_int_fF = 0;
         func_void_c("đã học ném phi tiêu");
      case 7:
      default:
         break;
      case 8:
         func_void_c((String)null);
         break;
      case 9:
         field_int_O = 2;
         field_int_fB = 103;
         field_int_fC = 2;
         field_boolean_fD = false;
         func_void_c("NV: Tìm bí kíp");
         break;
      case 10:
         field_boolean_eO = true;
         field_int_O = -1;
         field_int_fB = 0;
         field_int_fC = 0;
         field_boolean_fD = false;
         func_void_c("đã học thuật độn thổ");
         break;
      case 11:
         field_int_O = 3;
         field_int_gp = 3;
         field_int_gq = 2808;
         field_int_gr = 216;
         field_int_gC = -1;
         field_int_gu = 1;
         field_int_gs = 5;
         break;
      case 12:
         field_boolean_eQ = true;
         field_int_E <<= 1;
         field_int_O = -1;
         field_int_fB = 0;
         field_int_fC = 0;
         field_boolean_fD = false;
         func_void_c("sức công nhân đôi!");
         break;
      case 13:
         field_int_O = 4;
         field_int_fF = 0;
         func_void_c("NV: giết 20 con ong");
         break;
      case 14:
         field_int_O = 5;
         field_boolean_fD = false;
         field_int_fF = 0;
         field_int_fC = 10;
         func_void_c("NV: giết heo rừng");
         break;
      case 15:
         field_int_O = -1;
         field_boolean_eR = true;
         field_boolean_eS = true;
         func_void_c("đã học chạy nước.");
         break;
      case 16:
         field_int_O = 6;
         field_boolean_fD = false;
         field_int_fC = 10;
         func_void_c("NV: vượt sông");
         break;
      case 17:
         field_int_O = -1;
         field_boolean_eT = true;
         func_void_c("đã học biến hình.");
         break;
      case 18:
         field_int_O = 7;
         field_int_fF = 0;
         func_void_c("NV: giết 15 dơi vàng");
         break;
      case 19:
         field_boolean_eU = true;
         field_int_dg += 5000;
         field_boolean_c = true;
         field_int_O = -1;
         field_int_fB = 0;
         field_int_fC = 0;
         field_boolean_fD = false;
         func_void_c("Nhận được tiền 5000$");
         break;
      case 20:
         field_int_O = 15;
         field_int_fF = 0;
         field_boolean_fD = false;
         func_void_c("NV: tìm bí kíp");
         break;
      case 21:
         field_boolean_fc = true;
         field_int_O = -1;
         field_int_fF = 0;
         field_boolean_fD = false;
         func_void_c("đã có thể ẩn thân");
         break;
      case 22:
         field_int_O = 8;
         func_void_c("NV: tìm đánh Toniku");
         break;
      case 23:
         field_int_O = -1;
         field_boolean_eV = true;
         func_void_c("Hoàn thành nhiệm vụ.");
         break;
      case 24:
         field_int_O = 9;
         field_int_fF = 0;
         func_void_c("NV: giết 20 thổ dân");
         break;
      case 25:
         field_boolean_eW = true;
         field_int_O = -1;
         field_int_fB = 0;
         field_int_fC = 0;
         field_boolean_fD = false;
         func_void_c("đến gặp cô bé!");
         break;
      case 26:
         field_int_O = 10;
         field_int_fF = 0;
         field_boolean_gn = true;
         func_void_c("NV: dẫn cô bé đi chơi");
         break;
      case 27:
         field_int_O = -1;
         field_boolean_eY = true;
         field_int_fF = 0;
         func_void_c("Học khinh công cấp 2");
         break;
      case 28:
         field_int_O = 11;
         field_int_fF = 0;
         func_void_c("NV: 20 hit trên không");
         break;
      case 29:
         field_boolean_eZ = true;
         field_int_F <<= 2;
         field_int_O = -1;
         field_int_fF = 0;
         func_void_c("đã học phi tiêu cấp 2");
         int var0 = 0;

         while(true) {
            if (var0 >= 2) {
               break label58;
            }

            try {
               field_array_class_javax_microedition_lcdui_Image_en[var0] = Image.createImage("/c/pt" + (var0 + 2) + ".png");
            } catch (IOException var1) {
            }

            ++var0;
         }
      case 30:
         field_int_O = 12;
         field_int_fF = 0;
         func_void_c("NV: đánh 70 quỷ hoa đỏ");
         break;
      case 31:
         field_boolean_fa = true;
         field_int_O = -1;
         field_int_fF = 0;
         func_void_c("đã có thể chạy nhanh");
         break;
      case 32:
         field_int_O = 13;
         field_int_fF = 0;
         func_void_c("NV: Giết 50 bò cạp");
         break;
      case 33:
         field_boolean_fb = true;
         field_int_O = -1;
         field_int_fF = 0;
         func_void_c("đã có thể đứng nước");
         break;
      case 34:
         field_int_O = 14;
         field_int_fF = 0;
         func_void_c("NV: Giết 30 cá đỏ");
         break;
      case 35:
         field_int_O = -1;
         field_int_fF = 0;
         field_boolean_fD = false;
         break;
      case 36:
         field_int_O = 16;
         field_int_fF = 0;
         field_boolean_fD = false;
         func_void_c("NV: cứu Sakura");
      }

      if (field_int_lK >= 0) {
         func_void_a(field_int_lK, field_int_lL, field_int_lM, field_int_lN);
         field_int_lK = -1;
      }

   }

   // $FF: renamed from: A () int
   private static int func_int_A() {
      int var0 = field_int_fp > 0 ? field_int_fh - 20 : field_int_fh - 40;
      int var1 = field_int_fp > 0 ? field_int_fh + 40 : field_int_fh + 20;
      int var2 = field_int_fi - field_int_fk - 15;
      int var3 = field_int_fi + 5;

      for(int var4 = 0; var4 < field_int_jK; ++var4) {
         if (field_array_int_jS[var4] != 5 && field_array_int_jN[var4] >= var0 && field_array_int_jN[var4] <= var1 && field_array_int_jO[var4] >= var2 && field_array_int_jO[var4] <= var3) {
            return var4;
         }
      }

      return -1;
   }

   // $FF: renamed from: B () void
   private static void func_void_B() {
      field_array_array_class_javax_microedition_lcdui_Image_lw = null;
      System.gc();
      field_array_class_javax_microedition_lcdui_Image_ee = null;
      field_class_javax_microedition_lcdui_Image_eh = null;
      field_array_class_javax_microedition_lcdui_Image_ey = null;
      System.gc();
      field_array_class_javax_microedition_lcdui_Image_eA = null;
      System.gc();
      field_array_array_array_class_javax_microedition_lcdui_Image_jJ = null;
      System.gc();
      func_void_C();
      field_array_array_class_javax_microedition_lcdui_Image_ev = null;
      field_array_class_javax_microedition_lcdui_Image_el = null;
      field_array_array_class_javax_microedition_lcdui_Image_eb = null;
      System.gc();
   }

   // $FF: renamed from: C () void
   private static void func_void_C() {
      field_array_class_javax_microedition_lcdui_Image_ex = null;
      field_array_array_class_javax_microedition_lcdui_Image_ew = null;
      System.gc();
   }

   // $FF: renamed from: D () void
   private static void func_void_D() {
      int var0;
      for(var0 = 0; var0 < field_int_jK; ++var0) {
         if (field_array_int_jS[var0] != 5 && func_int_a(field_array_int_jO[var0] - field_int_gr) < 20 && func_int_a(field_array_int_jN[var0] - field_int_gq) < 40) {
            field_int_gC = field_array_int_jN[var0] > field_int_gq ? 1 : -1;
            field_int_gu = 5;
            field_int_ik = 0;
            field_int_gD = 0;
            field_int_gE = 0;
            return;
         }
      }

      for(var0 = 0; var0 < field_int_cs; ++var0) {
         if (field_array_int_cH[var0] != 5 && field_array_int_cy[var0] == field_int_gr && func_int_a(field_array_int_cx[var0] - field_int_gq) < 40) {
            field_int_gC = field_array_int_cx[var0] > field_int_gq ? 1 : -1;
            field_int_gu = 5;
            field_int_ik = 0;
            field_int_gD = 0;
            field_int_gE = 0;
            return;
         }
      }

      if (func_int_a(field_int_fh - field_int_gq) > 25 && field_int_fi != field_int_gr && field_int_A == 5) {
         field_int_gC = field_int_fh > field_int_gq ? 1 : -1;
         field_int_gu = 5;
         field_int_ik = 1;
         field_int_gD = 0;
         field_int_gE = 0;
      }
   }

   // $FF: renamed from: E () void
   private static void func_void_E() {
      if (field_boolean_gn) {
         if (field_int_fi <= field_int_gr - 24 && func_boolean_g(field_int_gq, field_int_gr - 1, 2)) {
            field_int_gu = 3;
            field_int_gs = 0;
            field_int_gt = -7;
            return;
         }

         if (field_int_fi <= field_int_gr - 24 && func_boolean_g(field_int_gq, field_int_gr - 25, 2)) {
            field_int_gu = 3;
            field_int_gs = 0;
            field_int_gt = -10;
            return;
         }

         int var0;
         int var1;
         if (field_int_gq >= field_int_fR - 24 && field_int_gq <= field_int_fR + field_int_q + 24) {
            if (field_int_gr < field_int_fS - 30 || field_int_gr > field_int_fS + field_int_r + 30) {
               field_int_gC = field_int_fh + (field_int_fp << 5) > field_int_gq ? 1 : -1;
               var0 = field_int_fh;
               var1 = field_int_fi > field_int_gr ? field_int_fS - 20 : field_int_fS + field_int_r;
               field_int_gq = var0;
               field_int_gr = var1;
               field_int_gu = 3;
               field_int_gs = field_int_gC << 2;
               field_int_gt = -4;
               return;
            }

            if (func_int_a(field_int_fh + (field_int_fp << 5) - field_int_gq) <= (field_int_A == 5 ? 10 : 60)) {
               field_int_gu = 1;
            } else if (field_int_fi >= field_int_gr) {
               if (field_int_fi > field_int_gr) {
                  if (func_boolean_g(field_int_gq + field_int_gC * field_int_gw, field_int_gr, 2)) {
                     field_int_gC = field_int_fh > field_int_gq ? 1 : -1;
                     field_int_gu = 2;
                     field_int_gs = field_int_gC * field_int_P;
                     return;
                  }

                  if (func_boolean_g(field_int_gq + field_int_gC * 48, field_int_gr + 24, 2)) {
                     field_int_gu = 3;
                     field_int_gs = field_int_gC * 7;
                     field_int_gt = -5;
                     return;
                  }

                  for(var0 = 1; var0 <= 5 && field_int_gr + var0 * 24 < field_int_iS && !func_boolean_g(field_int_gq + field_int_gC * 24, field_int_gr + var0 * 24, 64); ++var0) {
                     if (func_boolean_g(field_int_gq + field_int_gC * 24, field_int_gr + var0 * 24, 2)) {
                        field_int_gu = 3;
                        field_int_gs = field_int_gC << 2;
                        field_int_gt = -4;
                        return;
                     }

                     if (func_boolean_g(field_int_gq + field_int_gC * 48, field_int_gr + var0 * 24, 2)) {
                        field_int_gu = 3;
                        field_int_gs = field_int_gC * 6;
                        field_int_gt = -4;
                        return;
                     }
                  }

                  if (func_boolean_g(field_int_gq + field_int_gC * 24, field_int_gr - 24, 2)) {
                     field_int_gu = 3;
                     field_int_gs = field_int_gC * 5;
                     field_int_gt = -7;
                     return;
                  }

                  if (func_boolean_g(field_int_gq + field_int_gC * 48, field_int_gr - 24, 2)) {
                     field_int_gu = 3;
                     field_int_gs = field_int_gC * 6;
                     field_int_gt = -8;
                     return;
                  }

                  if (func_boolean_g(field_int_gq + field_int_gC * 24, field_int_gr - 48, 2)) {
                     field_int_gu = 3;
                     field_int_gs = field_int_gC * 5;
                     field_int_gt = -11;
                     return;
                  }
               } else if (func_boolean_g(field_int_gq + field_int_gC * field_int_gw, field_int_gr, 2)) {
                  field_int_gC = field_int_fh + (field_int_fp << 5) > field_int_gq ? 1 : -1;
                  field_int_gu = 2;
                  field_int_gs = field_int_gC * field_int_P;
                  return;
               }
            } else {
               if (func_boolean_g(field_int_gq + field_int_gC * 48, field_int_gr - 24, 2)) {
                  field_int_gu = 3;
                  field_int_gs = field_int_gC * 5;
                  field_int_gt = -8;
                  return;
               }

               for(var0 = 1; var0 <= 3; ++var0) {
                  if (func_boolean_g(field_int_gq + field_int_gC * 24, field_int_gr - var0 * 24, 2)) {
                     field_int_gu = 3;
                     field_int_gs = field_int_gC * 6;
                     field_int_gt = -5 - var0 * 3;
                     return;
                  }
               }

               if (!func_boolean_g(field_int_gq + field_int_gC * 48, field_int_gr - 2, 64)) {
                  if (field_int_gr + 24 >= field_int_iS || func_boolean_g(field_int_gq + field_int_gC * 48, field_int_gr + 24, 2)) {
                     field_int_gu = 3;
                     field_int_gs = field_int_gC * 7;
                     field_int_gt = -4;
                     return;
                  }

                  var0 = 1;

                  while(true) {
                     if (var0 > 5) {
                        return;
                     }

                     if (field_int_gr + var0 * 24 >= field_int_iS || func_boolean_g(field_int_gq + field_int_gC * 24, field_int_gr + var0 * 24, 64)) {
                        break;
                     }

                     if (func_boolean_g(field_int_gq + field_int_gC * 48, field_int_gr + var0 * 24, 2)) {
                        field_int_gu = 3;
                        field_int_gs = field_int_gC * 6;
                        field_int_gt = -4;
                        return;
                     }

                     if (func_boolean_g(field_int_gq + field_int_gC * 24, field_int_gr + var0 * 24, 2)) {
                        field_int_gu = 3;
                        field_int_gs = field_int_gC << 2;
                        field_int_gt = -4;
                        return;
                     }

                     ++var0;
                  }
               }
            }
         } else {
            field_int_gC = field_int_fh + (field_int_fp << 5) > field_int_gq ? 1 : -1;
            var0 = field_int_fh > field_int_gq ? field_int_fR - 24 : field_int_fR + field_int_q + 24;
            var1 = field_int_fi - 20;
            if (!func_boolean_g(var0, var1, 8192)) {
               field_int_gq = var0;
               field_int_gr = var1;
               field_int_gu = 4;
               field_int_gs = 4;
               field_int_gt = 3;
               return;
            }

            if (func_boolean_g(field_int_gq + field_int_gC * field_int_gw, field_int_gr, 2)) {
               field_int_gC = field_int_fh > field_int_gq ? 1 : -1;
               field_int_gu = 2;
               field_int_gs = field_int_gC * 12;
               return;
            }
         }
      }

   }

   // $FF: renamed from: a (int, int) void
   private static void func_void_a(int var0, int var1) {
      field_int_G -= var0;
      field_int_ff = -1;
      field_boolean_c = true;
      field_int_iu = -1;
      if (field_int_G <= 0) {
         field_int_G = 0;
         field_int_z = -7;
         field_int_y = var1 << 2;
         field_int_A = 6;
         field_int_im = -1;
      } else if (field_int_im == -1 && field_int_A != 23) {
         field_int_y = var1 << 2;
         field_int_z = -2;
         field_int_C = 0;
         field_int_D = 0;
         field_int_A = 7;
      }

      func_boolean_f(field_int_fh, field_int_fi - 12, -field_int_fp);
      func_void_a("-" + var0, 0, field_int_fh, field_int_fi - field_int_fk, 0, -2);
   }

   // $FF: renamed from: b (int, int) void
   private static void func_void_b(int var0, int var1) {
      field_int_ij = -1;
      field_int_gs = var1 << 2;
      field_int_gt = -2;
      field_int_gD = 0;
      field_int_gE = 0;
      field_int_gu = 7;
      func_boolean_f(field_int_gq, field_int_gr - 12, -field_int_gC);
      func_void_a("-" + var0, 0, field_int_gq, field_int_gr - field_int_gx, 0, -2);
   }

   // $FF: renamed from: a (int, int, int) boolean
   private static boolean func_boolean_a(int var0, int var1, int var2) {
      int[] var10000 = field_array_int_cu;
      var10000[var0] -= var1;
      if (field_array_int_cH[var0] != 1 && field_array_int_cH[var0] != 5) {
         if (field_array_int_cu[var0] <= 0) {
            field_array_int_cu[var0] = 0;
            field_array_int_cK[var0] = var2;
            field_array_int_cB[var0] = 0;
            field_array_int_cC[var0] = 0;
            field_array_int_cD[var0] = -(var2 << 3);
            field_array_int_cE[var0] = -6;
            field_array_int_cI[var0] = 0;
            field_array_int_ct[var0] = 0;
            field_array_int_cH[var0] = 1;
            func_void_u(field_array_int_ae[field_array_int_cG[var0]]);
            func_void_a(field_array_int_cx[var0], field_array_int_cy[var0], -(field_array_int_cK[var0] << 2), -4, field_array_int_ac[field_array_int_cG[var0]] + field_int_w % 10);
            if (field_int_w % 20 > 5) {
               func_void_a(field_array_int_cx[var0], field_array_int_cy[var0], -(field_array_int_cK[var0] << 3), -5, field_array_int_ad[field_array_int_cG[var0]] << 2, (field_int_w + 1) % 2);
            }

            return true;
         } else {
            field_array_int_cI[var0] = 0;
            field_array_int_cK[var0] = var2;
            field_array_int_ct[var0] = 100;
            field_array_int_cH[var0] = 6;
            return false;
         }
      } else {
         return true;
      }
   }

   // $FF: renamed from: c (int, int) boolean
   private static boolean func_boolean_c(int var0, int var1) {
      if (field_int_gV == 1 || field_int_gV == 2) {
         if ((field_int_hc -= var0) <= 0) {
            field_int_hc = 0;
            field_int_ha = -5;
            field_int_gU = -(var1 << 3);
            field_int_he = 0;
            field_int_gV = 6;
            func_void_a(field_int_gS, field_int_gT, 4, -6, 50);
            func_void_a(field_int_gS, field_int_gT, -5, -7, 50);
            func_void_a(field_int_gS, field_int_gT, -4, -8, 50);
            func_void_a(field_int_gS, field_int_gT, 5, -9, 50);
            func_void_a(field_int_gS, field_int_gT, 0, -10, 50);
            if (field_int_O == 5) {
               func_void_e(field_int_gS, field_int_gT);
            }

            return true;
         }

         field_int_ha = 0;
         field_int_gW = var1;
         field_int_gV = 7;
         field_int_he = 10;
         field_int_gX = 0;
         if (var0 <= field_int_F) {
            field_int_hb = 0;
         } else {
            field_int_hb = 2 + field_int_w % 5;
         }
      }

      return false;
   }

   // $FF: renamed from: d (int, int) void
   private static void func_void_d(int var0, int var1) {
      field_int_hj -= var0;
      field_array_int_dL[0] = -1;
      if (field_int_hj <= 0) {
         field_int_hj = 0;
      } else {
         field_array_int_dE[0] = var1 << 2;
         field_array_int_dF[0] = -2;
         field_array_int_dH[0] = 0;
         field_array_int_dI[0] = 0;
         field_array_int_dG[0] = 7;
         func_boolean_f(field_array_int_dC[0], field_array_int_dD[0] - 12, field_int_fp);
         func_void_a("-" + var0, 0, field_array_int_dC[0], field_array_int_dD[0] - 32, 0, -2);
      }
   }

   // $FF: renamed from: b (int) void
   public static final void func_void_b(int var0) {
      field_int_bP = 0;
      if (var0 == 0) {
         field_int_bP = 0;
      } else {
         if (field_array_array_class_javax_microedition_lcdui_Image_eb == null) {
            field_array_array_class_javax_microedition_lcdui_Image_eb = new Image[4][2];

            for(var0 = 0; var0 < 4; ++var0) {
               for(int var1 = 0; var1 < 2; ++var1) {
                  try {
                     field_array_array_class_javax_microedition_lcdui_Image_eb[var0][var1] = Image.createImage("/c/ar" + var0 + var1 + ".png");
                  } catch (IOException var2) {
                  }
               }
            }
         }

         field_int_bP = 10;
         field_array_int_bQ = new int[10];
         field_array_int_bR = new int[field_int_bP];
         field_array_int_bS = new int[field_int_bP];
         field_array_int_bT = new int[field_int_bP];
         field_array_int_bU = new int[field_int_bP];
         field_array_int_bV = new int[field_int_bP];

         for(var0 = 0; var0 < field_int_bP; ++var0) {
            field_array_int_bS[var0] = -1;
         }

      }
   }

   // $FF: renamed from: e () void
   public static void func_void_e() {
      if (field_array_class_javax_microedition_lcdui_Image_ec == null) {
         field_array_class_javax_microedition_lcdui_Image_ec = new Image[4];

         for(int var0 = 0; var0 < 4; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_ec[var0] = Image.createImage("/u/arr" + var0 + ".png");
            } catch (Exception var1) {
            }
         }
      }

   }

   // $FF: renamed from: f () void
   public static void func_void_f() {
      field_int_bW = 8;
      field_array_int_bX = new int[8];
      field_array_int_bY = new int[field_int_bW];
      field_array_int_bZ = new int[field_int_bW];
      field_array_int_ca = new int[field_int_bW];
      field_array_int_cb = new int[field_int_bW];
      field_array_int_cc = new int[field_int_bW];

      try {
         field_class_javax_microedition_lcdui_Image_ed = Image.createImage("/e/b.png");
      } catch (Exception var0) {
      }
   }

   // $FF: renamed from: c (int) void
   public static final void func_void_c(int var0) {
      field_int_il = 0;
      int var1 = field_int_im == -1 ? 0 : 1;
      if ((var0 == 0 || var0 == 1 || var0 == 7 || var0 == 5 || var0 == 18 || var0 >= 94) && var1 == 1) {
         field_int_il = 1;
         func_void_F();
         func_void_b(0, field_int_fh, field_int_fi);
         field_int_im = 0;
         field_array_int_ip[field_int_im] = field_int_fp;
      }

      if (var0 == 2) {
         func_void_d(var1, 18, 12);
      }

      if (var0 == 3) {
         func_void_d(var1, 2, 9);
      }

      if (var0 == 4) {
         func_void_d(var1, 3, 6);
      }

      if (var0 == 6) {
         func_void_d(var1, 12, 9);
      }

      if (var0 == 8) {
         func_void_d(var1, 3, 12);
      }

      if (var0 == 9) {
         func_void_d(var1, 2, 11);
      }

      if (var0 == 10) {
         func_void_d(var1, 3, 12);
      }

      if (var0 == 11) {
         func_void_d(var1, 5, 6);
      }

      if (var0 == 12) {
         func_void_d(var1, 4, 8);
      }

      if (var0 == 13) {
         func_void_d(var1, 16, 11);
      }

      if (var0 == 14) {
         func_void_d(var1, 18, 7);
      }

      if (var0 == 15) {
         func_void_d(var1, 1, 11);
      }

      if (var0 == 16) {
         func_void_d(var1, 7, 11);
      }

      if (var0 == 17) {
         func_void_d(var1, 14, 12);
      }

   }

   // $FF: renamed from: F () void
   private static void func_void_F() {
      if (field_array_class_javax_microedition_lcdui_Image_ee == null) {
         field_array_class_javax_microedition_lcdui_Image_ee = new Image[3];

         try {
            for(int var0 = 0; var0 < 3; ++var0) {
               field_array_class_javax_microedition_lcdui_Image_ee[var0] = Image.createImage("/c/v" + var0 + ".png");
            }
         } catch (Exception var1) {
         }
      }

      field_array_int_in = new int[field_int_il];
      field_array_int_io = new int[field_int_il];
      field_array_int_ip = new int[field_int_il];
      field_array_int_iq = new int[field_int_il];
      field_array_int_ir = new int[field_int_il];
      field_array_int_is = new int[field_int_il];
   }

   // $FF: renamed from: b (int, int, int) void
   private static void func_void_b(int var0, int var1, int var2) {
      field_array_int_in[var0] = var1 * field_int_jh + 12;
      field_array_int_io[var0] = var2 * field_int_jh;
      field_array_int_iq[var0] = 0;
      field_array_int_ip[var0] = 1;
   }

   // $FF: renamed from: g () void
   public static void func_void_g() {
      try {
         field_class_javax_microedition_lcdui_Image_ef = Image.createImage("/i/bk.png");
      } catch (Exception var0) {
      }
   }

   // $FF: renamed from: d (int) void
   public static final void func_void_d(int var0) {
      field_int_it = 0;
      if (var0 == 1) {
         field_int_it = 2;
         func_void_G();
         func_void_c(0, 21, 9);
         func_void_c(1, 13, 8);
      }

      if (var0 == 11) {
         field_int_it = 2;
         func_void_G();
         func_void_c(0, 33, 7);
         func_void_c(1, 44, 10);
      }

      if (var0 == 5) {
         field_int_it = 2;
         func_void_G();
         func_void_c(0, 5, 46);
         func_void_c(1, 15, 46);
      }

      if (var0 == 97) {
         field_int_it = 4;
         func_void_G();
         func_void_c(0, 3, 6);
         func_void_c(1, 7, 4);
         func_void_c(2, 12, 3);
         func_void_c(3, 22, 6);
      }

   }

   // $FF: renamed from: G () void
   private static void func_void_G() {
      if (field_class_javax_microedition_lcdui_Image_eh == null) {
         try {
            field_class_javax_microedition_lcdui_Image_eh = Image.createImage("/i/b.png");
         } catch (Exception var0) {
         }
      }

      field_array_int_iv = new int[field_int_it];
      field_array_int_iw = new int[field_int_it];
      field_array_int_ix = new int[field_int_it];
      field_array_int_iy = new int[field_int_it];
      field_array_int_iz = new int[field_int_it];
      field_array_int_iA = new int[field_int_it];
      field_array_int_iB = new int[field_int_it];
   }

   // $FF: renamed from: c (int, int, int) void
   private static void func_void_c(int var0, int var1, int var2) {
      field_array_int_iv[var0] = var1 * field_int_jh + 12;
      field_array_int_iw[var0] = var2 * field_int_jh + 24;
      field_array_int_ix[var0] = 1;
   }

   // $FF: renamed from: h () void
   public static final void func_void_h() {
      field_int_q = field_int_aW;
      if (field_int_aX >= 208) {
         field_boolean_bh = true;
         field_int_bl = 50;
         field_int_r = field_int_aX - field_int_bl;
         field_int_bk = field_int_q;
         field_int_bi = 0;
         field_int_bj = field_int_r + 1;
      } else {
         field_int_bl = 16;
         field_int_r = field_int_aX - field_int_bl;
         field_boolean_bh = false;
         field_int_bl = 0;
         field_int_bk = field_int_q;
         field_int_bi = 0;
         field_int_bj = field_int_r + 1;
         field_int_bt = (field_int_br = field_int_q / 3) + 29;
         field_int_bu = field_int_br + 50;
      }

      if ((field_int_bw = field_int_aX / 6) < 48) {
         field_int_bw = 48;
      }

      field_int_bF = field_int_q >> 1;
      field_int_bG = field_int_r >> 1;
      field_int_bH = 3 * field_int_r / 4;
      field_int_bI = field_int_q / 6;
      field_int_bB = field_int_q / field_int_jh + 2;
      field_int_bC = field_int_r / field_int_jh + 2;
      if (field_int_q % 24 != 0) {
         ++field_int_bB;
      }

      field_int_fT = (field_int_iP - 1) * field_int_jh - field_int_q;
      field_int_fU = (field_int_iQ - 1) * field_int_jh - field_int_r;
      field_int_fR = field_int_fL = field_int_fh - field_int_bF + field_int_bI * field_int_fp;
      field_int_fS = field_int_fM = field_int_fi - field_int_bH;
      if (field_int_fR < 0) {
         field_int_fR = 0;
      }

      if (field_int_fR > field_int_fT) {
         field_int_fR = field_int_fT;
      }

      if (field_int_fS < 0) {
         field_int_fS = 0;
      }

      if (field_int_fS > field_int_fU) {
         field_int_fS = field_int_fU;
      }

      if ((field_int_bz = field_int_fR / field_int_jh - 1) < 0) {
         field_int_bz = 0;
      }

      field_int_bA = field_int_fS / field_int_jh;
      field_int_bD = field_int_bz + field_int_bB;
      field_int_bE = field_int_bA + field_int_bC;
      if (field_int_bA < 0) {
         field_int_bA = 0;
      }

      if (field_int_bE > field_int_iQ - 1) {
         field_int_bE = field_int_iQ - 1;
      }

   }

   // $FF: renamed from: i () void
   public static final void func_void_i() {
      field_int_ff = -1;
      if (field_array_class_javax_microedition_lcdui_Image_eg == null) {
         try {
            field_array_class_javax_microedition_lcdui_Image_eg = new Image[20];

            int var0;
            for(var0 = 0; var0 < 20; ++var0) {
               field_array_class_javax_microedition_lcdui_Image_eg[var0] = Image.createImage("/cp/cb" + var0 + ".png");
            }

            field_array_class_javax_microedition_lcdui_Image_er = new Image[11];

            for(var0 = 0; var0 < 11; ++var0) {
               field_array_class_javax_microedition_lcdui_Image_er[var0] = Image.createImage("/cp/ch" + var0 + ".png");
            }

            field_array_class_javax_microedition_lcdui_Image_et = new Image[10];

            for(var0 = 0; var0 < 10; ++var0) {
               field_array_class_javax_microedition_lcdui_Image_et[var0] = Image.createImage("/cp/cl" + var0 + ".png");
            }
         } catch (Exception var1) {
         }
      }

      func_void_H();
      field_int_fj = 22;
      field_int_fk = 32;
      field_int_fl = field_int_fj >> 1;
      field_int_fm = field_int_fk >> 1;
      field_int_fn = field_int_fj >> 2;
      field_int_fo = field_int_fk >> 2;
      field_int_fG = -1;
   }

   // $FF: renamed from: H () void
   private static void func_void_H() {
      field_array_class_javax_microedition_lcdui_Image_eE = new Image[11];
      System.gc();

      for(int var0 = 0; var0 < 11; ++var0) {
         try {
            field_array_class_javax_microedition_lcdui_Image_eE[var0] = Image.createImage("/c/w" + var0 + "t" + field_int_x + ".png");
         } catch (Exception var3) {
            try {
               field_array_class_javax_microedition_lcdui_Image_eE[var0] = Image.createImage("/c/w" + var0 + "t0.png");
            } catch (IOException var2) {
               var2.printStackTrace();
            }
         }
      }

   }

   // $FF: renamed from: j () void
   public static void func_void_j() {
      func_void_I();
      if (field_boolean_bh) {
         try {
            if (field_array_class_javax_microedition_lcdui_Image_ei == null) {
               field_array_class_javax_microedition_lcdui_Image_ei = new Image[2];

               for(int var0 = 0; var0 < 2; ++var0) {
                  field_array_class_javax_microedition_lcdui_Image_ei[var0] = Image.createImage("/u/c" + var0 + ".png");
               }
            }

            field_int_bm = field_array_class_javax_microedition_lcdui_Image_ei[0].getWidth();
            field_int_bn = field_array_class_javax_microedition_lcdui_Image_ei[1].getWidth();
            field_int_bo = field_int_q - field_int_bm - field_int_bn + 1;
            field_int_bp = 78;
            field_int_bq = field_int_bj + 7;
            field_int_br = field_int_q - 134;
            field_int_bs = field_int_q - 84;
            field_int_bv = 5;
         } catch (IOException var1) {
         }
      }
   }

   // $FF: renamed from: I () void
   private static void func_void_I() {
      try {
         if (field_class_javax_microedition_lcdui_Image_ek == null) {
            field_class_javax_microedition_lcdui_Image_ek = Image.createImage("/u/co.png");
         }

         (field_array_class_javax_microedition_lcdui_Image_eF = new Image[2])[1] = Image.createImage("/u/wpt1.png");
         if (field_int_x == 0) {
            field_array_class_javax_microedition_lcdui_Image_eF[0] = Image.createImage("/u/wpt0.png");
         } else {
            field_array_class_javax_microedition_lcdui_Image_eF[0] = Image.createImage("/u/wpt" + (field_int_x + 1) + ".png");
         }
      } catch (Exception var0) {
      }
   }

   // $FF: renamed from: k () void
   public static void func_void_k() {
      field_int_dh = 5;
      if (field_array_class_javax_microedition_lcdui_Image_ej == null) {
         try {
            field_array_class_javax_microedition_lcdui_Image_ej = new Image[3];

            for(int var0 = 0; var0 < 3; ++var0) {
               field_array_class_javax_microedition_lcdui_Image_ej[var0] = Image.createImage("/i/dm" + var0 + ".png");
            }
         } catch (Exception var1) {
         }
      }

      field_array_int_di = new int[field_int_dh];
      field_array_int_dj = new int[field_int_dh];
      field_array_int_dk = new int[field_int_dh];
      field_array_int_dl = new int[field_int_dh];
      field_array_int_dm = new int[field_int_dh];
      field_array_int_dn = new int[field_int_dh];
      field_array_int_dp = new int[field_int_dh];
      field_array_int_do = new int[field_int_dh];
   }

   // $FF: renamed from: e (int) void
   public static void func_void_e(int var0) {
      field_boolean_dq = false;
      if (var0 == 0) {
         if (field_array_class_javax_microedition_lcdui_Image_el == null) {
            field_array_class_javax_microedition_lcdui_Image_el = new Image[2];

            for(var0 = 0; var0 < 2; ++var0) {
               try {
                  field_array_class_javax_microedition_lcdui_Image_el[var0] = Image.createImage("/npc/d" + var0 + ".png");
               } catch (Exception var1) {
               }
            }
         }

         field_boolean_dq = true;
         field_int_dr = 348;
         field_int_ds = 408;
         field_int_dt = 1;
         field_int_du = 252;
         field_int_dv = 708;
      }

   }

   // $FF: renamed from: l () void
   public static final void func_void_l() {
      if (!field_boolean_a) {
         if (field_array_array_class_javax_microedition_lcdui_Image_em == null) {
            field_array_array_class_javax_microedition_lcdui_Image_em = new Image[2][5];

            for(int var0 = 0; var0 < 2; ++var0) {
               for(int var1 = 0; var1 < 5; ++var1) {
                  try {
                     field_array_array_class_javax_microedition_lcdui_Image_em[var0][var1] = Image.createImage("/e/d" + var0 + var1 + ".png");
                  } catch (IOException var2) {
                  }
               }
            }
         }

         field_array_int_cm = new int[2];
         field_array_int_cn = new int[2];
         (field_array_int_co = new int[2])[0] = field_array_int_co[1] = -1;
      }
   }

   // $FF: renamed from: m () void
   public static final void func_void_m() {
      int var0;
      if (field_array_class_javax_microedition_lcdui_Image_en == null) {
         field_array_class_javax_microedition_lcdui_Image_en = new Image[2];

         for(var0 = 0; var0 < 2; ++var0) {
            try {
               if (field_boolean_eZ) {
                  field_array_class_javax_microedition_lcdui_Image_en[var0] = Image.createImage("/c/pt" + (var0 + 2) + ".png");
               } else {
                  field_array_class_javax_microedition_lcdui_Image_en[var0] = Image.createImage("/c/pt" + var0 + ".png");
               }
            } catch (IOException var1) {
            }
         }
      }

      field_int_cY = 10;
      field_array_int_cZ = new int[10];
      field_array_int_da = new int[field_int_cY];
      field_array_int_db = new int[field_int_cY];
      field_array_int_dc = new int[field_int_cY];
      field_array_int_dd = new int[field_int_cY];
      field_array_boolean_df = new boolean[field_int_cY];
      field_array_int_de = new int[field_int_cY];

      for(var0 = 0; var0 < field_int_cY; ++var0) {
         field_array_int_db[var0] = -1;
      }

   }

   // $FF: renamed from: n () void
   public static final void func_void_n() {
      field_array_int_dS = new int[5];
      field_array_int_dT = new int[5];
      field_array_int_dU = new int[5];
      field_array_int_dV = new int[5];
      field_array_int_dW = new int[5];
      field_array_int_dX = new int[5];
      field_array_class_java_lang_String_dR = new String[5];

      for(int var0 = 0; var0 < 5; ++var0) {
         field_array_int_dW[var0] = -1;
      }

   }

   // $FF: renamed from: x (int) void
   private static void func_void_x(int var0) {
      field_int_d = 2;
      field_int_v = var0;
      Midlet.field_int_d = 1;
      func_void_ak();
      (new Thread(Midlet.field_class_Midlet_c)).start();
   }

   // $FF: renamed from: f (int) void
   public static final void func_void_f(int var0) {
      if (field_boolean_gn) {
         field_int_gp = var0;
      }

      if (field_int_gp == var0) {
         field_int_ij = -1;
         if (field_array_class_javax_microedition_lcdui_Image_eo == null) {
            try {
               field_array_class_javax_microedition_lcdui_Image_eo = new Image[8];

               for(var0 = 0; var0 < 8; ++var0) {
                  field_array_class_javax_microedition_lcdui_Image_eo[var0] = Image.createImage("/cp/gb" + var0 + ".png");
               }

               field_array_class_javax_microedition_lcdui_Image_ep = new Image[3];

               for(var0 = 0; var0 < 3; ++var0) {
                  field_array_class_javax_microedition_lcdui_Image_ep[var0] = Image.createImage("/cp/gh" + var0 + ".png");
               }

               field_array_class_javax_microedition_lcdui_Image_eq = new Image[9];

               for(var0 = 0; var0 < 9; ++var0) {
                  field_array_class_javax_microedition_lcdui_Image_eq[var0] = Image.createImage("/cp/gl" + var0 + ".png");
               }
            } catch (Exception var1) {
            }
         }

         field_int_gw = 22;
         field_int_gx = 32;
         field_int_gy = field_int_gw >> 1;
         field_int_gz = field_int_gx >> 1;
         field_int_gA = field_int_gw >> 2;
         field_int_gB = field_int_gx >> 2;
         if (field_boolean_gn) {
            field_int_gq = field_int_fh - field_int_fp * 10;
            field_int_gr = field_int_fi;
            field_int_gC = field_int_fp;
            field_int_gu = 4;
         }

      }
   }

   // $FF: renamed from: o () void
   public static void func_void_o() {
      if (field_array_class_javax_microedition_lcdui_Image_eu == null) {
         field_array_class_javax_microedition_lcdui_Image_eu = new Image[2];

         for(int var0 = 0; var0 < 2; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_eu[var0] = Image.createImage("/e/l" + var0 + ".png");
            } catch (IOException var1) {
            }
         }
      }

   }

   // $FF: renamed from: g (int) void
   public static void func_void_g(int var0) {
      field_int_dx = 0;
      field_boolean_dA = false;
      if (var0 == 0) {
         field_int_dx = 7;
         func_void_J();
         func_void_a(0, 0, 14, 17, 130, 11, 22, new String[]{"Chào, cậu là ai thế, mình chưa từng gặp bạn thì phải?", "Nói cậu nghe nhé, thầy cô trường này khó tính lắm đó.", "Cẩn thận với ông thầy Hiroyaki nhé. Đừng chọc giận ổng."});
         func_void_a(1, 1, 24, 17, 160, 15, 30, new String[]{"Mình là MinhXP, lớp trưởng lớp kiếm thuật.", "Kiếm là vũ khí lợi hại nhất của một ninja đấy bạn biết không?", "Khu vực luyện tập nằm ở bên trái. Hãy sang đấy tập luyện nhiều hơn nữa."});
         if (field_boolean_eT) {
            func_void_a(2, 6, 17, 12, 200, 7, 29, new String[]{"Thằng bên kia là sát thủ giả mạo.", "Ta đây mới là ninja sát thủ thứ thiệt đây!"});
         } else {
            func_void_a(2, 2, 17, 12, 200, 7, 29, new String[]{"Chào, tao tên là Tonic, mày là thằng nào?", "Nhìn lão hiệu trưởng kìa, lão có một hũ rượu trông hấp dẫn quá!", "Nếu muốn rủ tao đi nhậu thì ok, còn không thì biến đi.", "À, nếu mày có thấy con chó của tao thì báo tao 1 tiếng nhé."});
         }

         func_void_a(3, 3, 48, 17, 200, 44, 63, new String[]{"Hi, mình là Craze, trông bạn có vẻ hơi buồn thì phải?", "Bạn có thấy chán khi tối ngày quanh quẩn trong trường không?", "Đi về phía tay phải bạn sẽ đến được ngôi làng, ra đó để tìm niềm vui đi!"});
         func_void_a(4, 4, 46, 12, 200, 40, 54, new String[]{"Thằng nhà quê kia, mày mau kiếm tiền đóng thuế thân cho tao.", "Tao cho mày 2 ngày, nếu không đưa tao 1000$ thì mày ăn chém đó."});
         func_void_a(5, 5, 38, 17, 200, 34, 49, new String[]{"Xin chào, bạn là học sinh mới phải không?", "Nhìn thầy hiệu trưởng kìa, thầy vốn là một ninja sát thủ đấy.", "Thầy đã bỏ nghề sát thủ lâu rồi, nhưng tài năng vẫn còn đó", "Chúng ta có tập luyện cả đời cũng không bằng thầy đâu."});
         func_void_a(6, 6, 58, 12, 200, 46, 60, new String[]{"Đừng hỏi ta là ai...", "Ta chỉ là một ninja sát thủ thôi, ngươi biết thế là được rồi.", "Biến đi cho ta luyện tập."});
         func_void_y(7);
      }

      if (var0 == 1) {
         field_int_dx = 3;
         func_void_J();
         func_void_a(0, 5, 35, 9, 40, 33, 36, new String[]{"Bạn có thể nhảy lên cây cầu này nếu đã học xong khinh công từ cô Ayumi xinh đẹp."});
         if (field_boolean_eT) {
            func_void_a(1, 6, 25, 10, 40, 22, 28, new String[]{"Ta đây là một ninja sát thủ!", "Ha ha ha!"});
         } else {
            func_void_a(1, 2, 25, 10, 40, 22, 28, new String[]{"Mày đã học khinh công rồi hả?", "À, mày có thấy con chó của tao chạy đâu đâu không?"});
         }

         func_void_a(2, 1, 6, 9, 40, 2, 10, new String[]{"Bên kia là một thác nước rất lớn đấy.", "Nó không thuộc phạm vi trường chúng ta nữa nên có rất nhiều quái vật hung dữ.", "Nghe nói có một con quái vật rất to đấy, tốt hơn ngươi đừng qua làm gì!"});
         func_void_y(7);
      }

      if (var0 == 2) {
         field_int_dx = 7;
         func_void_J();
         func_void_a(0, 3, 16, 12, 60, 14, 21, new String[]{"Cậu nhìn thấy chiếc xe máy kia không?", "Phải có bằng lái từ thầy chủ nhiệm bạn mới có thể chạy được."});
         func_void_a(1, 4, 8, 12, 50, 2, 15, new String[]{"Thằng nhà quê kia, mày đi đâu đấy?"});
         if (field_boolean_eT) {
            func_void_a(2, 6, 29, 13, 200, 27, 40, new String[]{"Ninja sát thủ là ta - Thiên hạ vô địch!"});
         } else {
            func_void_a(2, 2, 29, 13, 200, 27, 40, new String[]{"Mày có thấy con chó của tao ở đâu không?"});
         }

         func_void_a(3, 5, 46, 13, 200, 41, 49, new String[]{"Nếu bạn muốn lên kia thì phải học khinh công từ cô Ayumi đã."});
         func_void_a(4, 1, 46, 11, 200, 43, 53, new String[]{"Cậu có thấy ở đây ai cũng tài giỏi không?", "Hãy cố gắng tập luyện hơn nữa nhé"});
         func_void_a(5, 0, 54, 11, 200, 50, 58, new String[]{"Ra ngoài rừng hoa đào có rất nhiều điều thú vị đấy.", "Bạn nên ra thử một lần để biết."});
         func_void_a(6, 6, 34, 13, 200, 28, 48, new String[]{"Đừng hỏi ta là ai...", "Ta chỉ là một ninja sát thủ thôi, ngươi biết thế là được rồi.", "Biến đi cho ta luyện tập."});
         func_void_y(7);
      }

      String[] var1;
      if (var0 == 99 || var0 == 101) {
         field_int_dx = 7;
         func_void_J();
         var1 = new String[]{"Này, cậu đi tìm con heo đó trước đi. Tớ đi theo bọc lót cho!"};
         func_void_a(0, 0, 8, 13, 0, 0, 1000, var1);
         func_void_a(1, 1, 5, 13, 0, 0, 1000, var1);
         func_void_a(2, 6, 6, 13, 0, 0, 1000, var1);
         func_void_a(3, 2, 7, 13, 0, 0, 1000, var1);
         func_void_a(4, 4, 6, 13, 0, 0, 1000, var1);
         func_void_a(5, 5, 5, 13, 0, 0, 1000, var1);
         func_void_a(6, 3, 8, 13, 0, 0, 1000, var1);
         func_void_y(7);
      }

      if (var0 == 94) {
         field_int_dx = 7;
         func_void_J();
         var1 = new String[]{"Chúc mừng, sắp được ra trường rồi nhé!"};
         func_void_a(0, 0, 5, 12, 0, 0, 1000, var1);
         func_void_a(1, 1, 5, 12, 0, 0, 1000, var1);
         func_void_a(2, 6, 6, 12, 0, 0, 1000, var1);
         func_void_a(3, 7, 3, 12, 0, 0, 1000, var1);
         func_void_a(4, 4, 6, 12, 0, 0, 1000, var1);
         func_void_a(5, 5, 5, 12, 0, 0, 1000, var1);
         func_void_a(6, 3, 8, 12, 0, 0, 1000, var1);
         func_void_y(8);
      }

   }

   // $FF: renamed from: J () void
   private static void func_void_J() {
      field_array_int_dC = new int[field_int_dx];
      field_array_int_dD = new int[field_int_dx];
      field_array_int_dE = new int[field_int_dx];
      field_array_int_dF = new int[field_int_dx];
      field_array_int_dG = new int[field_int_dx];
      field_array_int_dH = new int[field_int_dx];
      field_array_int_dM = new int[field_int_dx];
      field_array_int_dI = new int[field_int_dx];
      field_array_int_dJ = new int[field_int_dx];
      field_array_int_dK = new int[field_int_dx];
      field_array_int_dL = new int[field_int_dx];
      field_array_int_dN = new int[field_int_dx];
      field_array_int_dO = new int[field_int_dx];
      field_array_int_dP = new int[field_int_dx];
      field_array_int_dQ = new int[field_int_dx];
      field_array_array_class_java_lang_String_dy = new String[field_int_dx][];
   }

   // $FF: renamed from: y (int) void
   private static void func_void_y(int var0) {
      if (field_array_array_class_javax_microedition_lcdui_Image_ev == null) {
         field_array_array_class_javax_microedition_lcdui_Image_ev = new Image[var0][2];

         for(int var1 = 0; var1 < var0; ++var1) {
            for(int var2 = 0; var2 < 2; ++var2) {
               try {
                  field_array_array_class_javax_microedition_lcdui_Image_ev[var1][var2] = Image.createImage("/cp/f" + var1 + "h" + var2 + ".png");
               } catch (Exception var3) {
               }
            }
         }
      }

   }

   // $FF: renamed from: a (int, int, int, int, int, int, int, java.lang.String[]) void
   private static void func_void_a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, String[] var7) {
      field_array_int_dC[var0] = var2 * 24 + (var0 << 2);
      field_array_int_dD[var0] = var3 * 24;
      field_array_int_dE[var0] = 0;
      field_array_int_dF[var0] = 0;
      field_array_int_dG[var0] = 1;
      field_array_int_dM[var0] = -1;
      field_array_int_dH[var0] = 0;
      field_array_int_dI[var0] = (var0 + 1) * 20 + var0;
      field_array_int_dJ[var0] = 0;
      field_array_int_dK[var0] = var1;
      field_array_int_dL[var0] = -1;
      field_array_int_dO[var0] = -1;
      field_array_int_dP[var0] = var5 * 24 + 12;
      field_array_int_dQ[var0] = var6 * 24 + 12;
      field_array_int_dN[var0] = var4;
      field_array_array_class_java_lang_String_dy[var0] = var7;
   }

   // $FF: renamed from: K () void
   private static void func_void_K() {
      field_int_d = 2;
      func_void_ak();
      Midlet.field_int_d = 3;
      field_int_v = 99;

      try {
         field_class_javax_microedition_lcdui_Image_eD = Image.createImage("/u/tt.png");
      } catch (Exception var1) {
      }

      field_int_bf = field_int_aX - 30;
      field_int_bg = field_int_aX;
      field_int_bb = 30;
      field_int_bc = field_int_aX - 50;
      field_int_bd = field_int_be = field_int_bb + field_int_bc >> 1;
      if (Midlet.func_boolean_b()) {
         field_int_ba = 1;
      }

      String var0;
      if ((var0 = System.getProperty("microedition.platform")).endsWith("JAVASDK") || var0.endsWith("wtk")) {
         Midlet.field_boolean_a = true;
      }

      (new Thread(Midlet.field_class_Midlet_c)).start();
   }

   // $FF: renamed from: h (int) void
   public static void func_void_h(int var0) {
      field_int_cs = 0;
      if (var0 == 9) {
         field_int_cs = 6;
         field_array_boolean_dw = new boolean[]{false, false, true, false, false, false, false};
         func_void_L();
         func_void_b(0, 10, 12, 9, 12, 2);
         func_void_b(1, 7, 8, 6, 8, 2);
         func_void_b(2, 30, 8, 27, 33, 2);
         func_void_b(3, 29, 12, 27, 33, 2);
         func_void_b(4, 45, 5, 42, 50, 2);
         func_void_b(5, 64, 9, 62, 66, 2);
      }

      if (var0 == 10) {
         field_int_cs = 12;
         field_array_boolean_dw = new boolean[]{true, false, true, false, false, false, false};
         func_void_L();
         func_void_b(0, 5, 8, 4, 6, 2);
         func_void_b(1, 6, 12, 5, 9, 0);
         func_void_b(2, 16, 12, 9, 21, 2);
         func_void_b(3, 28, 15, 26, 29, 0);
         func_void_b(4, 25, 15, 22, 27, 2);
         func_void_b(5, 16, 25, 14, 17, 0);
         func_void_b(6, 4, 29, 2, 6, 0);
         func_void_b(7, 8, 38, 2, 28, 2);
         func_void_b(8, 14, 38, 2, 28, 2);
         func_void_b(9, 20, 38, 2, 28, 2);
         func_void_b(10, 31, 30, 28, 37, 2);
         func_void_b(11, 33, 30, 28, 37, 0);
      }

      if (var0 == 11) {
         field_int_cs = 8;
         field_array_boolean_dw = new boolean[]{true, true, true, false, false, false, false};
         func_void_L();
         func_void_b(0, 6, 11, 3, 7, 1);
         func_void_b(1, 19, 12, 18, 20, 0);
         func_void_b(2, 33, 8, 28, 36, 2);
         func_void_b(3, 53, 11, 53, 54, 1);
         func_void_b(5, 54, 11, 53, 54, 0);
         func_void_b(4, 68, 12, 62, 79, 2);
         func_void_b(6, 71, 12, 70, 72, 0);
         func_void_b(7, 72, 8, 70, 73, 1);
      }

      if (var0 == 16) {
         field_int_cs = 4;
         field_array_boolean_dw = new boolean[]{false, false, false, true, false, false, false};
         func_void_L();
         func_void_b(0, 5, 11, 3, 10, 3);
         func_void_b(1, 26, 12, 24, 29, 3);
         func_void_b(2, 47, 10, 30, 55, 3);
         func_void_b(3, 60, 11, 56, 64, 3);
      }

      if (var0 == 17) {
         field_int_cs = 8;
         field_array_boolean_dw = new boolean[]{false, false, false, true, true, false, false};
         func_void_L();
         func_void_b(0, 11, 8, 9, 13, 3);
         func_void_b(1, 20, 6, 18, 21, 4);
         func_void_b(2, 20, 11, 18, 21, 3);
         func_void_b(3, 26, 3, 24, 29, 3);
         func_void_b(4, 26, 8, 24, 29, 4);
         func_void_b(5, 26, 13, 24, 29, 4);
         func_void_b(6, 33, 6, 32, 35, 3);
         func_void_b(7, 33, 10, 32, 35, 4);
      }

      if (var0 == 18) {
         field_int_cs = 8;
         field_array_boolean_dw = new boolean[]{false, false, false, false, true, true, true};
         func_void_L();
         func_void_b(0, 2, 8, 1, 4, 5);
         func_void_b(1, 2, 12, 1, 5, 6);
         func_void_b(2, 18, 12, 12, 23, 6);
         func_void_b(3, 18, 8, 15, 21, 5);
         func_void_b(4, 42, 9, 38, 45, 4);
         func_void_b(5, 42, 13, 34, 67, 6);
         func_void_b(6, 62, 13, 34, 67, 6);
         func_void_b(7, 60, 9, 57, 64, 4);
      }

   }

   // $FF: renamed from: L () void
   private static void func_void_L() {
      boolean var0 = false;
      if (field_array_class_javax_microedition_lcdui_Image_ex == null) {
         try {
            field_array_class_javax_microedition_lcdui_Image_ex = new Image[4];

            int var3;
            for(var3 = 0; var3 < 4; ++var3) {
               field_array_class_javax_microedition_lcdui_Image_ex[var3] = Image.createImage("/mob/x" + var3 + ".png");
            }

            field_array_array_class_javax_microedition_lcdui_Image_ew = new Image[7][2];

            for(var3 = 0; var3 < 7; ++var3) {
               if (field_array_boolean_dw[var3]) {
                  for(int var1 = 0; var1 < 2; ++var1) {
                     field_array_array_class_javax_microedition_lcdui_Image_ew[var3][var1] = Image.createImage("/mob/y" + var3 + var1 + ".png");
                  }
               }
            }
         } catch (Exception var2) {
         }
      }

      field_array_int_cv = new int[field_int_cs];
      field_array_int_cw = new int[field_int_cs];
      field_array_int_cx = new int[field_int_cs];
      field_array_int_cy = new int[field_int_cs];
      field_array_int_cz = new int[field_int_cs];
      field_array_int_cA = new int[field_int_cs];
      field_array_int_cG = new int[field_int_cs];
      field_array_int_cH = new int[field_int_cs];
      field_array_int_cI = new int[field_int_cs];
      field_array_int_cJ = new int[field_int_cs];
      field_array_int_cK = new int[field_int_cs];
      field_array_int_cL = new int[field_int_cs];
      field_array_int_cM = new int[field_int_cs];
      field_array_int_cF = new int[field_int_cs];
      field_array_int_cN = new int[field_int_cs];
      field_array_int_cO = new int[field_int_cs];
      field_array_int_cB = new int[field_int_cs];
      field_array_int_cC = new int[field_int_cs];
      field_array_int_cD = new int[field_int_cs];
      field_array_int_cE = new int[field_int_cs];
      field_array_int_cu = new int[field_int_cs];
      field_array_int_ct = new int[field_int_cs];
   }

   // $FF: renamed from: b (int, int, int, int, int, int) void
   private static void func_void_b(int var0, int var1, int var2, int var3, int var4, int var5) {
      field_array_int_cv[var0] = var1 * 24 + 12;
      field_array_int_cw[var0] = var2 * 24;
      field_array_int_cx[var0] = field_array_int_cv[var0];
      field_array_int_cy[var0] = field_array_int_cw[var0];
      field_array_int_cz[var0] = field_array_int_cx[var0];
      field_array_int_cA[var0] = field_array_int_cy[var0] - 9;
      field_array_int_cG[var0] = var5;
      field_array_int_cH[var0] = 3;
      field_array_int_cI[var0] = var0 << 1;
      field_array_int_cJ[var0] = 0;
      field_array_int_cK[var0] = 1;
      field_array_int_cL[var0] = 0;
      field_array_int_cM[var0] = 0;
      field_array_int_cF[var0] = 0;
      field_array_int_cN[var0] = var3 * 24 + 12;
      field_array_int_cO[var0] = var4 * 24 + 12;
      field_array_int_cu[var0] = field_array_int_af[field_array_int_cG[var0]];
   }

   // $FF: renamed from: i (int) void
   public static void func_void_i(int var0) {
      field_int_hd = 1200;
      field_int_hc = 1200;
      field_int_gR = 30;
      field_boolean_gQ = false;
      int var1;
      if (var0 == 4) {
         field_boolean_gQ = true;
         if (field_array_class_javax_microedition_lcdui_Image_ey == null) {
            field_array_class_javax_microedition_lcdui_Image_ey = new Image[5];

            for(var1 = 0; var1 < 5; ++var1) {
               try {
                  field_array_class_javax_microedition_lcdui_Image_ey[var1] = Image.createImage("/mob/b0" + var1 + ".png");
               } catch (Exception var3) {
               }
            }
         }

         field_int_gY = field_array_class_javax_microedition_lcdui_Image_ey[0].getWidth();
         field_int_gZ = field_array_class_javax_microedition_lcdui_Image_ey[0].getHeight();
         field_int_gS = 55 * field_int_jh + 12;
         field_int_gT = 13 * field_int_jh;
         field_int_gV = 1;
         field_int_gW = -1;
         field_int_gX = 0;
      }

      if (var0 == 5) {
         field_boolean_gQ = true;
         if (field_array_class_javax_microedition_lcdui_Image_ey == null) {
            field_array_class_javax_microedition_lcdui_Image_ey = new Image[5];

            for(var1 = 0; var1 < 5; ++var1) {
               try {
                  field_array_class_javax_microedition_lcdui_Image_ey[var1] = Image.createImage("/mob/b0" + var1 + ".png");
               } catch (Exception var2) {
               }
            }
         }

         field_int_gY = field_array_class_javax_microedition_lcdui_Image_ey[0].getWidth();
         field_int_gZ = field_array_class_javax_microedition_lcdui_Image_ey[0].getHeight();
         field_int_gS = 8 * field_int_jh + 12;
         field_int_gT = 56 * field_int_jh;
         field_int_gV = 1;
         field_int_gW = -1;
         field_int_gX = 0;
      }

   }

   // $FF: renamed from: p () void
   public static void func_void_p() {
      field_int_cP = 5;
      if (field_array_class_javax_microedition_lcdui_Image_ez == null) {
         try {
            (field_array_class_javax_microedition_lcdui_Image_ez = new Image[2])[0] = Image.createImage("/i/pt0.png");
            field_array_class_javax_microedition_lcdui_Image_ez[1] = Image.createImage("/i/pt1.png");
         } catch (Exception var0) {
         }
      }

      field_array_int_cR = new int[field_int_cP];
      field_array_int_cS = new int[field_int_cP];
      field_array_int_cT = new int[field_int_cP];
      field_array_int_cU = new int[field_int_cP];
      field_array_int_cV = new int[field_int_cP];
      field_array_int_cW = new int[field_int_cP];
      field_array_int_cX = new int[field_int_cP];
      field_array_int_cQ = new int[field_int_cP];
   }

   // $FF: renamed from: j (int) void
   public static void func_void_j(int var0) {
      field_boolean_hM = false;
      if (var0 == 97 && !field_boolean_eI) {
         field_boolean_hM = true;
         field_array_class_javax_microedition_lcdui_Image_eA = new Image[4];

         for(var0 = 0; var0 < 4; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_eA[var0] = Image.createImage("/mob/b1" + var0 + ".png");
            } catch (IOException var1) {
            }
         }

         field_int_hS = 168;
         field_int_hT = 226;
         field_int_ic = 144;
         field_int_id = 480;
         field_int_ia = 2;
         field_int_ib = -1;
         field_int_hQ = 8000;
         field_int_hP = 8000;
      }

   }

   // $FF: renamed from: q () void
   public static final void func_void_q() {
      if (field_array_class_javax_microedition_lcdui_Image_eB == null) {
         field_array_class_javax_microedition_lcdui_Image_eB = new Image[3];

         for(int var0 = 0; var0 < 3; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_eB[var0] = Image.createImage("/e/sp" + var0 + ".png");
            } catch (IOException var1) {
            }
         }
      }

      field_array_int_cd = new int[2];
      field_array_int_ce = new int[2];
      field_array_int_cf = new int[2];
      field_array_int_cg = new int[2];
      field_array_int_ch = new int[2];
      field_array_int_cf[0] = field_array_int_cf[1] = -1;
   }

   // $FF: renamed from: k (int) void
   public static void func_void_k(int var0) {
      field_boolean_hl = false;
      if (var0 == 95 && !field_boolean_eK) {
         field_boolean_hl = true;
         field_array_class_javax_microedition_lcdui_Image_eC = new Image[6];

         try {
            field_array_class_javax_microedition_lcdui_Image_eC[0] = Image.createImage("/mob/b20.png");
            field_array_class_javax_microedition_lcdui_Image_eC[1] = Image.createImage("/mob/b21.png");
            field_array_class_javax_microedition_lcdui_Image_eC[2] = Image.createImage("/mob/b22.png");
            field_array_class_javax_microedition_lcdui_Image_eC[3] = field_array_class_javax_microedition_lcdui_Image_eC[1];
            field_array_class_javax_microedition_lcdui_Image_eC[4] = Image.createImage("/mob/b23.png");
            field_array_class_javax_microedition_lcdui_Image_eC[5] = Image.createImage("/cp/f2h0.png");
         } catch (IOException var1) {
         }

         field_int_hs = 192;
         field_int_ht = 264;
         field_int_hw = 120;
         field_int_hx = 504;
         field_int_hu = 0;
         field_int_hv = -1;
         field_int_hq = 90000;
         field_int_hp = 90000;
         field_array_int_hG = new int[6];
         field_array_int_hH = new int[6];
         field_array_int_hK = new int[6];
         field_array_int_hL = new int[6];
         field_array_int_hI = new int[]{20, 10, 0, -10, -16, 2};
         field_array_int_hJ = new int[]{-16, 0, -12, 0, -18, -42};
         field_array_array_int_hA = new int[][]{new int[6], {0, 0, 1, 0, 1, 1}};
         field_array_array_int_hB = new int[][]{new int[6], {1, 0, 1, 0, 2, 1}};
         field_array_array_int_hC = new int[][]{{6, -1, 1, 1, 5, 1}, {14, -1, 2, 1, 12, 2}};
         field_array_array_int_hD = new int[][]{{1, 0, 0, 0, 1, 0}, {2, 0, 1, 0, 2, 1}};
         field_array_array_int_hE = new int[][]{{-3, 3, 0, -3, 3, 0}, new int[6], {3, -3, 0, 3, -3, 0}};
         field_array_array_int_hF = new int[][]{{-1, -2, 1, 0, 1, 1}, new int[6], {1, 0, 1, -2, -1, 1}};
      }

   }

   // $FF: renamed from: l (int) void
   public static void func_void_l(int var0) {
      field_boolean_hf = false;
      if (var0 == 96 && !field_boolean_eJ) {
         field_boolean_hf = true;
         field_int_dx = 1;
         func_void_J();
         func_void_a(0, 2, 5, 11, 200, 4, 22, (String[])null);
         func_void_y(3);
         field_int_hk = 15000;
         field_int_hj = 15000;
         field_int_hi = 120;
         field_int_dx = 0;
         field_array_int_dG[0] = 0;
         field_array_int_dM[0] = 1;
      }

   }

   // $FF: renamed from: m (int) void
   public static void func_void_m(int var0) {
      if (var0 == 94) {
         field_boolean_dz = true;
         field_int_fh = 24;
         field_int_fi = 288;
         field_int_gp = 94;
         field_int_gq = 12;
         field_int_gr = 288;
         field_int_gC = 1;
         field_boolean_gn = false;
         field_int_fp = 1;
      }

      if (var0 == 0 && field_int_O == 15 && field_boolean_fD) {
         field_int_gp = -1;
         field_boolean_gn = false;
      }

      if (var0 == 0 && field_int_O == 16 && field_boolean_fe) {
         field_boolean_fd = true;
         field_int_gp = 0;
         field_boolean_gn = true;
         field_boolean_fx = true;
         field_int_O = -1;
         field_int_fh = 984;
         field_int_fi = 408;
      } else {
         if (var0 == 95 && !field_boolean_eK) {
            field_boolean_gn = false;
            field_int_gq = 599;
            field_int_gr = 264;
            field_int_gC = -1;
            field_int_gp = 95;
         }

      }
   }

   // $FF: renamed from: n (int) void
   public static void func_void_n(int var0) {
      field_boolean_ih = false;
      field_boolean_fV = false;
      field_int_fK = 0;
      if (var0 == 15 && field_int_O == 15) {
         func_void_e(216, 432);
      }

      if (var0 == 8 && field_int_O == 6) {
         func_void_e(72, 240);
      }

      int var1;
      if (var0 == 4 && field_boolean_eH) {
         field_boolean_T = true;
         field_boolean_eL = true;
         field_boolean_eT = true;
         field_boolean_eS = true;
         field_int_H = 1000;
         field_int_G = 1000;
         field_int_J = 2000;
         field_int_I = 2000;
         field_int_E = 25;
         field_int_A = 4;
         field_int_hd = 500;
         field_int_hc = 500;
         func_void_D(0);
      } else if (var0 == 99) {
         field_boolean_eH = true;
         field_boolean_dz = true;
         field_int_fh = 108;
         field_int_fi = 312;
         field_int_fp = -1;
         func_void_D(1);
      } else if (var0 == 94) {
         func_void_D(10);
      } else if (var0 == 0 && field_boolean_eH) {
         field_boolean_T = false;
         field_boolean_eL = false;
         field_boolean_eS = false;
         field_boolean_eT = false;
         field_boolean_fA = false;
         field_int_G = 200;
         field_int_H = 200;
         field_int_I = 200;
         field_int_J = 200;
         field_int_hd = 1000;
         field_int_hc = 1000;
         field_int_N = 0;
         field_int_M = 1;
         field_int_E = 20;
         field_int_fh = 864;
         field_int_fi = 336;

         for(var1 = 0; var1 < 19; ++var1) {
            field_array_boolean_W[var1] = false;
         }

         field_array_boolean_W[0] = true;
         field_int_fp = -1;
         field_boolean_dz = false;
         field_boolean_dA = false;
         func_void_D(2);
         field_boolean_eH = false;
      } else if (var0 == 3 && field_int_O == 3 && !field_boolean_gn) {
         func_void_D(3);
      } else if (var0 == 0 && field_int_O == 3 && field_boolean_gn) {
         func_void_D(4);
      } else if (var0 == 97 && !field_boolean_eI) {
         func_void_D(5);
      } else if (var0 == 96 && !field_boolean_eJ) {
         func_void_D(6);
      } else if (var0 == 95 && !field_boolean_eK) {
         func_void_D(7);
      } else if (var0 == 101) {
         func_void_D(8);
         field_int_fS = field_int_fM = 336 - field_int_r;
         field_int_fL = 24;
         field_int_fR = 24;
      } else if (var0 == 9 && field_int_O == 10) {
         func_void_D(9);
      }

      if (var0 == 97 && field_boolean_eI) {
         for(var1 = 0; var1 <= 6; ++var1) {
            func_void_i(24, var1, 0);
         }
      }

      if (var0 == 96 && field_boolean_eJ) {
         for(var1 = 0; var1 <= 11; ++var1) {
            func_void_i(24, var1, 0);
         }
      }

   }

   // $FF: renamed from: r () void
   public static final void func_void_r() {
      if (!field_boolean_a) {
         field_array_class_javax_microedition_lcdui_Image_eG = new Image[3];

         for(int var0 = 0; var0 < 3; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_eG[var0] = Image.createImage("/e/w" + var0 + ".png");
            } catch (IOException var1) {
            }
         }

         field_array_int_ci = new int[2];
         field_array_int_cj = new int[2];
         field_array_int_ck = new int[2];
         field_array_int_cl = new int[2];
         field_array_int_ck[0] = field_array_int_ck[1] = -1;
      }
   }

   // $FF: renamed from: z (int) void
   private static void func_void_z(int var0) {
      if (field_array_int_dD[0] == field_int_fi && func_int_a(field_array_int_dC[0] + (field_array_int_dM[0] << 5) - field_int_fh) < 25) {
         func_void_a(field_int_hi, field_array_int_dM[0]);
      }

   }

   // $FF: renamed from: A (int) void
   private static void func_void_A(int var0) {
      int var1;
      boolean var6;
      label29: {
         var1 = field_int_E;
         int var10000 = field_array_int_dO[var0];
         int var4 = -field_array_int_dM[var0];
         int var2 = var10000;
         if (field_array_int_jS[var2] == 2 || field_array_int_jS[var2] == 3 || field_array_int_jS[var2] == 4) {
            int[] var5 = field_array_int_kc;
            var5[var2] -= var1;
            if (field_array_int_kc[var2] <= 0) {
               field_array_int_kc[var2] = 0;
               field_array_int_jX[var2] = -5;
               field_array_int_jY[var2] = -(var4 << 3);
               field_array_int_jZ[var2] = 0;
               field_array_int_jR[var2] = 0;
               field_array_int_jS[var2] = 1;
               var6 = true;
               break label29;
            }

            field_array_int_jX[var2] = 0;
            field_array_int_kb[var2] = var4;
            field_array_int_jS[var2] = 6;
            field_array_int_ka[var2] = 3;
         }

         var6 = false;
      }

      if (!var6) {
         func_boolean_f(field_array_int_jN[field_array_int_dO[var0]], field_array_int_jO[field_array_int_dO[var0]] - (field_array_int_jP[field_array_int_dO[var0]] >> 1), field_array_int_kb[field_array_int_dO[var0]]);
         func_void_a("-" + var1, 0, field_array_int_jN[field_array_int_dO[var0]], field_array_int_jO[field_array_int_dO[var0]] - field_array_int_jP[field_array_int_dO[var0]], 0, -2);
      }

   }

   // $FF: renamed from: B (int) void
   private static void func_void_B(int var0) {
      for(int var1 = 0; var1 < field_int_jK; ++var1) {
         if (field_array_int_jS[var1] != 5 && field_array_int_jO[var1] == field_array_int_dD[var0] && func_int_a(field_array_int_dC[var0] + (field_array_int_dM[var0] << 3) - field_array_int_jN[var1]) < 20) {
            if (field_array_int_jN[var1] < field_array_int_dC[var0]) {
               field_array_int_dM[var0] = -1;
            } else {
               field_array_int_dM[var0] = 1;
            }

            field_array_int_dG[var0] = 5;
            field_array_int_dH[var0] = field_array_int_dI[var0] = 0;
            field_array_int_dO[var0] = var1;
         }
      }

   }

   // $FF: renamed from: M () void
   private static void func_void_M() {
      if (field_int_iL < field_array_array_class_java_lang_String_iH[field_int_iF].length) {
         field_int_iL = field_array_array_class_java_lang_String_iH[field_int_iF].length;
         field_int_iK = 0;
      } else {
         ++field_int_iF;
         field_int_iL = 0;
         field_int_iK = 0;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   private static void func_void_a(Graphics var0) {
      int var1;
      if (field_boolean_b && !field_boolean_a) {
         var0.setColor(field_int_i);
         var0.fillRect(0, 0, field_int_q, field_int_p);

         for(var1 = -((field_int_fR >> 1) % 24); var1 < field_int_q; var1 += 24) {
            var0.drawImage(field_array_class_javax_microedition_lcdui_Image_s[0], var1, field_int_j, 0);
         }

         for(var1 = -((field_int_fR >> 2) % 24); var1 < field_int_q; var1 += 24) {
            var0.drawImage(field_array_class_javax_microedition_lcdui_Image_s[1], var1, field_int_k, 0);
         }

         for(var1 = -((field_int_fR >> 4) % 64); var1 < field_int_q; var1 += 64) {
            var0.drawImage(field_array_class_javax_microedition_lcdui_Image_s[3], var1, field_int_m, 0);
         }

         var0.drawImage(field_class_javax_microedition_lcdui_Image_u, field_int_g, field_int_h, 3);

         for(var1 = 0; var1 < 2; ++var1) {
            var0.drawImage(field_class_javax_microedition_lcdui_Image_t, field_array_int_e[var1], field_array_int_f[var1], 3);
         }

         for(var1 = -((field_int_fR >> 3) % 192); var1 < field_int_q; var1 += 192) {
            var0.drawImage(field_array_class_javax_microedition_lcdui_Image_s[2], var1, field_int_l, 0);
         }

      } else {
         var0.setColor(field_int_i);
         var0.fillRect(0, 0, field_int_q, field_int_r);
         if (!field_boolean_a) {
            var0.drawImage(field_class_javax_microedition_lcdui_Image_u, field_int_g, field_int_h, 3);

            for(var1 = 0; var1 < 2; ++var1) {
               var0.drawImage(field_class_javax_microedition_lcdui_Image_t, field_array_int_e[var1], field_array_int_f[var1], 3);
            }

         }
      }
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
   private static void func_void_b(Graphics var0) {
      if (field_boolean_fz) {
         if (field_int_w % 20 > 2) {
            field_int_B = 25;
         } else {
            field_int_B = 26;
         }
      }

      if (field_int_fp == 1) {
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_er[field_array_array_array_int_as[field_int_B][0][0]], field_int_fh + field_array_array_array_int_as[field_int_B][0][1], field_int_fi - field_array_array_array_int_as[field_int_B][0][2], 0);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_as[field_int_B][1][0]], field_int_fh + field_array_array_array_int_as[field_int_B][1][1], field_int_fi - field_array_array_array_int_as[field_int_B][1][2], 0);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_as[field_int_B][2][0]], field_int_fh + field_array_array_array_int_as[field_int_B][2][1], field_int_fi - field_array_array_array_int_as[field_int_B][2][2], 0);
         if (field_int_ff != -1) {
            var0.drawImage(field_array_class_javax_microedition_lcdui_Image_eE[field_int_ff], field_int_fh - field_array_int_at[field_int_ff], field_int_fi - field_array_int_au[field_int_ff], 0);
            return;
         }
      } else {
         var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_er[field_array_array_array_int_as[field_int_B][0][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_er[field_array_array_array_int_as[field_int_B][0][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_er[field_array_array_array_int_as[field_int_B][0][0]].getHeight(), 2, field_int_fh - field_array_array_array_int_as[field_int_B][0][1], field_int_fi - field_array_array_array_int_as[field_int_B][0][2], 24);
         var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_as[field_int_B][1][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_as[field_int_B][1][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_as[field_int_B][1][0]].getHeight(), 2, field_int_fh - field_array_array_array_int_as[field_int_B][1][1], field_int_fi - field_array_array_array_int_as[field_int_B][1][2], 24);
         var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_as[field_int_B][2][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_as[field_int_B][2][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_as[field_int_B][2][0]].getHeight(), 2, field_int_fh - field_array_array_array_int_as[field_int_B][2][1], field_int_fi - field_array_array_array_int_as[field_int_B][2][2], 24);
         if (field_int_ff != -1) {
            var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_eE[field_int_ff], 0, 0, field_array_class_javax_microedition_lcdui_Image_eE[field_int_ff].getWidth(), field_array_class_javax_microedition_lcdui_Image_eE[field_int_ff].getHeight(), 2, field_int_fh + field_array_int_at[field_int_ff], field_int_fi - field_array_int_au[field_int_ff], 24);
         }
      }

   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics) void
   private static void func_void_c(Graphics var0) {
      if (!field_boolean_bh) {
         var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_er[0], 0, 2, 0);
         var0.setColor(0);
         var0.drawRect(23, 2, field_int_br + 1, 4);
         var0.drawRect(23, 8, field_int_br + 1, 4);
         var0.drawRect(23, 14, field_int_br + 1, 3);
         var0.setColor(16711680);
         int var1 = field_int_G * field_int_br / field_int_H;
         var0.fillRect(24, 3, var1, 3);
         var0.setColor(5570560);
         var0.fillRect(var1 + 24, 3, field_int_br - var1, 3);
         var0.setColor(255);
         var1 = field_int_I * field_int_br / field_int_J;
         var0.fillRect(24, 9, var1, 3);
         var0.setColor(5570560);
         var0.fillRect(var1 + 24, 9, field_int_br - var1, 3);
         var0.setColor(7274435);
         var1 = field_int_N * field_int_br / field_array_int_ak[field_int_M - 1];
         var0.fillRect(24, 15, var1, 2);
         var0.setColor(19506);
         var0.fillRect(var1 + 24, 15, field_int_br - var1, 2);
         Midlet.func_void_a(var0, "lv:" + field_int_M, 2, field_int_bt, 7, 0);
         Midlet.func_void_a(var0, field_int_dg + "$", 1, field_int_bu, 7, 0);
      }
   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics) void
   private static void func_void_d(Graphics var0) {
      field_boolean_c = false;
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      var0.setClip(-1, field_int_bj - 1, field_int_bk + 2, 100);
      var0.setColor(0);
      if (!field_boolean_bh) {
         var0.fillRect(0, field_int_bj, field_int_bk, 15);
         Midlet.func_void_a(var0, field_class_java_lang_String_n, 3, field_int_bj + 3, 0);
         Midlet.func_void_a(var0, field_class_java_lang_String_o, field_int_bk - 3, field_int_bj + 3, 1);
      } else {
         var0.fillRect(0, field_int_bj + 33, field_int_bk, 15);
         Midlet.func_void_a(var0, field_class_java_lang_String_n, 3, field_int_bj + 36, 0);
         Midlet.func_void_a(var0, field_class_java_lang_String_o, field_int_bk - 3, field_int_bj + 36, 1);
         var0.setColor(4352);
         var0.fillRect(field_int_bm, field_int_bj, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 35, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 33, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 30, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 28, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 26, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 12, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 24, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 18, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 16, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 2, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 4, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 6, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 14, field_int_bo, 1);
         var0.setColor(15649843);
         var0.fillRect(field_int_bm, field_int_bj + 1, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 5, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 17, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 34, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 29, field_int_bo, 1);
         var0.setColor(16767871);
         var0.fillRect(field_int_bm, field_int_bj + 3, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 15, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 27, field_int_bo, 1);
         var0.setColor(3355443);
         var0.fillRect(field_int_bm, field_int_bj + 7, field_int_bo, 5);
         var0.fillRect(field_int_bm, field_int_bj + 19, field_int_bo, 5);
         var0.fillRect(field_int_bm, field_int_bj + 31, field_int_bo, 2);
         var0.setColor(12281361);
         var0.fillRect(field_int_bm, field_int_bj + 25, field_int_bo, 1);
         var0.fillRect(field_int_bm, field_int_bj + 13, field_int_bo, 1);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_ei[0], 0, field_int_bj, 0);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_ei[1], 0 + field_int_bk, field_int_bj, 24);
         int var1 = field_int_G * field_int_br / field_int_H;
         var0.setColor(7798784);
         var0.fillRect(field_int_bp, field_int_bq, var1, 2);
         var0.setColor(13369344);
         var0.fillRect(field_int_bp, field_int_bq + 1, var1, 4);
         var1 = field_int_I * field_int_br / field_int_J;
         var0.setColor(119);
         var0.fillRect(field_int_bp, field_int_bq + 12, var1, 2);
         var0.setColor(204);
         var0.fillRect(field_int_bp, field_int_bq + 14, var1, field_int_bv - 2);
         Midlet.func_void_a(var0, "" + field_int_dg, 1, field_int_bk - 18, field_int_bj + 6, 2);
         var1 = field_int_N * field_int_bs / field_array_int_ak[field_int_M - 1];
         var0.setColor(94373);
         var0.fillRect(31, field_int_bj + 31, var1, 1);
         var0.setColor(65535);
         var0.fillRect(31, field_int_bj + 32, var1, 1);
         Midlet.func_void_a(var0, "" + field_int_M, 2, 26, field_int_bj + 11, 2);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_eF[field_int_fg], 43, field_int_bj + 16, 3);
         Midlet.func_void_a(var0, "" + (field_array_int_V[0] + field_array_int_V[1] + field_array_int_V[2]), 2, field_int_bk - 29, field_int_bj + 19, 2);
         Midlet.func_void_a(var0, "" + (field_array_int_V[3] + field_array_int_V[4] + field_array_int_V[5]), 2, field_int_bk - 9, field_int_bj + 19, 2);
      }
   }

   // $FF: renamed from: e (javax.microedition.lcdui.Graphics) void
   private static void func_void_e(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      var0.setClip(-1, -1, field_int_aW + 2, field_int_aX + 2);
      var0.setColor(0);
      var0.fillRect(0, 0, field_int_q, field_int_bx);
      if (field_boolean_bh) {
         var0.fillRect(0, field_int_aX - field_int_bx + 1, field_int_q, field_int_bx);
      } else {
         var0.fillRect(0, field_int_aX - 13, field_int_aW, 13);
      }

      if (field_boolean_fY) {
         for(int var1 = 0; var1 < field_array_class_java_lang_String_fZ.length; ++var1) {
            Midlet.func_void_a(var0, field_array_class_java_lang_String_fZ[var1], field_int_bF, field_int_ga + (var1 << 4), 2);
         }
      }

   }

   // $FF: renamed from: f (javax.microedition.lcdui.Graphics) void
   private static void func_void_f(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      var0.setClip(-1, -1, field_int_aW + 2, field_int_aX + 2);
      field_int_iD = field_array_array_class_java_lang_String_iH[field_int_iF].length;
      int var1 = field_int_iJ - field_int_fS - (field_int_iD << 4);
      boolean var2 = true;
      if (var1 < 10) {
         var2 = false;
         var1 = 10;
      }

      var0.setColor(16777215);
      if (field_boolean_a) {
         var0.fillRect(field_int_iN, var1 - 5, field_int_iM, (field_int_iD << 4) + 7);
      } else {
         var0.fillRoundRect(field_int_iN, var1 - 5, field_int_iM, (field_int_iD << 4) + 7, 10, 10);
      }

      var0.setColor(17408);
      if (field_boolean_a) {
         var0.drawRect(field_int_iN - 1, var1 - 5, field_int_iM + 1, (field_int_iD << 4) + 7);
      } else {
         var0.drawRoundRect(field_int_iN - 1, var1 - 5, field_int_iM + 1, (field_int_iD << 4) + 7, 10, 10);
      }

      for(int var3 = 0; var3 < field_int_iL; ++var3) {
         Midlet.func_void_b(var0, field_array_array_class_java_lang_String_iH[field_int_iF][var3], field_int_iN + (field_int_iM >> 1), var1 + (var3 << 4), 2);
      }

      if (field_int_iL < field_array_array_class_java_lang_String_iH[field_int_iF].length) {
         Midlet.func_void_b(var0, field_array_array_class_java_lang_String_iH[field_int_iF][field_int_iL].substring(0, field_int_iK), field_int_iN + (field_int_iM >> 1), var1 + (field_int_iL << 4), 2);
      }

      var0.setColor(0);
      var0.fillRect(0, field_int_bj + 33, field_int_bk, 15);
      if (var2 && field_int_iI > field_int_fR + 10 && field_int_iI < field_int_fR + field_int_q - 10) {
         var0.drawImage(field_class_javax_microedition_lcdui_Image_ek, field_int_iI - field_int_fR, field_int_iJ - field_int_fS + 2, 17);
      }

      if (field_int_w % 10 < 8) {
         Midlet.func_void_a(var0, "Tiếp tục", field_int_bF, field_int_aX - 13, 2);
      }

   }

   // $FF: renamed from: g (javax.microedition.lcdui.Graphics) void
   private static void func_void_g(Graphics var0) {
      for(int var1 = 0; var1 < field_int_dx; ++var1) {
         if (field_array_int_dC[var1] + field_int_fl >= field_int_fR && field_array_int_dC[var1] - field_int_fl <= field_int_fR + field_int_q && field_array_int_dD[var1] >= field_int_fS && field_array_int_dD[var1] - field_int_fk <= field_int_fS + field_int_r) {
            if (field_array_int_dM[var1] == 1) {
               var0.drawImage(field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[var1]][field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][0]], field_array_int_dC[var1] + field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][1], field_array_int_dD[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][2], 0);
               var0.drawImage(field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][0]], field_array_int_dC[var1] + field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][1], field_array_int_dD[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][2], 0);
               var0.drawImage(field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][0]], field_array_int_dC[var1] + field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][1], field_array_int_dD[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][2], 0);
               if (field_array_int_dL[var1] != -1) {
                  var0.drawImage(field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[var1]], field_array_int_dC[var1] - field_array_int_at[field_array_int_dL[var1]], field_array_int_dD[var1] - field_array_int_au[field_array_int_dL[var1]], 0);
               }
            } else {
               var0.drawRegion(field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[var1]][field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][0]], 0, 0, field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[var1]][field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][0]].getWidth(), field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[var1]][field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][0]].getHeight(), 2, field_array_int_dC[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][1], field_array_int_dD[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][0][2], 24);
               var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][0]].getHeight(), 2, field_array_int_dC[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][1], field_array_int_dD[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][1][2], 24);
               var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][0]].getHeight(), 2, field_array_int_dC[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][1], field_array_int_dD[var1] - field_array_array_array_int_aJ[field_array_int_dJ[var1]][2][2], 24);
               if (field_array_int_dL[var1] != -1) {
                  var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[var1]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[var1]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[var1]].getHeight(), 2, field_array_int_dC[var1] + field_array_int_at[field_array_int_dL[var1]], field_array_int_dD[var1] - field_array_int_au[field_array_int_dL[var1]], 24);
               }
            }
         }
      }

   }

   // $FF: renamed from: h (javax.microedition.lcdui.Graphics) void
   private static void func_void_h(Graphics var0) {
      var0.setClip(-1, -1, field_int_aW + 2, field_int_aX + 1);
      func_void_a(var0);
      var0.translate(-field_int_fR, -field_int_fS);
      if (field_boolean_a) {
         func_void_j(var0);
      } else {
         func_void_k(var0);
      }

      func_void_i(var0);
      func_void_g(var0);
      func_void_b(var0);
      func_void_r(var0);
      func_void_l(var0);
      func_void_e(var0);
      if (field_boolean_iC) {
         func_void_f(var0);
      }

   }

   // $FF: renamed from: N () void
   private static void func_void_N() {
      if (!field_boolean_fz && field_int_A != 14 && func_int_a(field_int_fi - field_int_gT) < 30 && func_int_a(field_int_fh - field_int_gS) < 200) {
         field_int_gV = 5;
         field_int_gW = field_int_gS < field_int_fh ? 1 : -1;
         field_int_hb = field_int_fh + (field_int_gW << 5);
         field_int_gU = field_int_gW * 6;
         if (field_int_hc < field_int_hd >> 1) {
            field_int_gU = field_int_gW << 3;
         }
      }

   }

   // $FF: renamed from: d (int, int, int) void
   private static void func_void_d(int var0, int var1, int var2) {
      field_int_il = var0 + 1;
      func_void_F();
      func_void_b(0, var1, var2);
      if (var0 == 1) {
         func_void_b(1, field_int_fh, field_int_fi);
         field_int_im = 1;
         field_array_int_ip[field_int_im] = field_int_fp;
      }

   }

   // $FF: renamed from: b (int, int, int, int, int) void
   private static void func_void_b(int var0, int var1, int var2, int var3, int var4) {
      int var5 = -1;

      for(int var6 = 0; var6 < field_int_bP; ++var6) {
         if (field_array_int_bS[var6] == -1) {
            var5 = var6;
            break;
         }
      }

      if (var5 != -1) {
         field_array_int_bS[var5] = 1;
         field_array_int_bQ[var5] = var0;
         field_array_int_bR[var5] = var1;
         field_array_int_bT[var5] = var2;
         field_array_int_bU[var5] = var3;
         field_array_int_bV[var5] = var4;
      }
   }

   // $FF: renamed from: a (int, int, int, int) void
   private static void func_void_a(int var0, int var1, int var2, int var3) {
      field_int_ge = var0;
      field_int_gf = var1;
      field_int_gg = var2;
      field_int_gm = var3;
   }

   // $FF: renamed from: c (int, int, int, int, int) void
   private static void func_void_c(int var0, int var1, int var2, int var3, int var4) {
      int var5 = -1;

      for(int var6 = 0; var6 < field_int_bW; ++var6) {
         if (field_array_int_bZ[var6] == 0) {
            var5 = var6;
            break;
         }
      }

      if (var5 != -1) {
         field_array_int_bZ[var5] = 1;
         field_array_int_bX[var5] = var0;
         field_array_int_bY[var5] = var1;
         field_array_int_ca[var5] = var2;
         field_array_int_cb[var5] = var3;
         field_array_int_cc[var5] = var4;
      }
   }

   // $FF: renamed from: e (int, int) void
   private static void func_void_e(int var0, int var1) {
      field_int_fI = var0;
      field_int_fJ = var1;
      field_int_fK = 1;
   }

   // $FF: renamed from: C (int) void
   private static void func_void_C(int var0) {
      field_int_gc = 0;
      field_int_fW = var0;
      field_int_fX = 0;
      field_boolean_fV = true;
      field_boolean_gd = false;
      func_void_c();
      func_void_d();
   }

   // $FF: renamed from: a (java.lang.String[], int, int, int) void
   private static void func_void_a(String[] var0, int var1, int var2, int var3) {
      field_int_iG = var1;
      field_int_iI = var2;
      field_int_iJ = var3;
      field_int_iE = var0.length;
      field_int_iF = 0;
      field_array_array_class_java_lang_String_iH = new String[field_int_iE][];
      if ((field_int_iM = field_int_q >> 1) < 120) {
         field_int_iM = 120;
      }

      for(var1 = 0; var1 < field_int_iE; ++var1) {
         field_array_array_class_java_lang_String_iH[var1] = Midlet.func_array_class_java_lang_String_b(var0[var1], field_int_iM - 20);
      }

      if ((field_int_iN = field_int_iI - (field_int_iM >> 1) - field_int_fR) < 2) {
         field_int_iN = 2;
      }

      if (field_int_iN + field_int_iM > field_int_q - 2) {
         field_int_iN = field_int_q - 2 - field_int_iM;
      }

      field_boolean_iC = true;
      field_int_iK = 0;
      field_int_iL = 0;
   }

   // $FF: renamed from: e (int, int, int) boolean
   private static boolean func_boolean_e(int var0, int var1, int var2) {
      if (field_boolean_a) {
         return false;
      } else {
         var0 = var0 == 1 ? 0 : 1;
         if (field_array_int_co[var0] != -1) {
            return false;
         } else {
            field_array_int_co[var0] = 0;
            field_array_int_cm[var0] = var1;
            field_array_int_cn[var0] = var2;
            return true;
         }
      }
   }

   // $FF: renamed from: a (int, int, int, int, boolean) void
   private static void func_void_a(int var0, int var1, int var2, int var3, boolean var4) {
      int var5 = -1;

      for(int var6 = 0; var6 < field_int_cY; ++var6) {
         if (field_array_int_db[var6] == -1) {
            var5 = var6;
            break;
         }
      }

      if (var5 != -1) {
         field_array_int_db[var5] = 1;
         field_array_int_cZ[var5] = var0;
         field_array_int_da[var5] = var1;
         field_array_int_dd[var5] = var2;
         field_array_int_de[var5] = var3;
         field_array_boolean_df[var5] = var4;
      }
   }

   // $FF: renamed from: a (java.lang.String, int, int, int, int, int) void
   private static void func_void_a(String var0, int var1, int var2, int var3, int var4, int var5) {
      var4 = -1;

      for(int var6 = 0; var6 < 5; ++var6) {
         if (field_array_int_dW[var6] == -1) {
            var4 = var6;
            break;
         }
      }

      if (var4 != -1) {
         field_array_class_java_lang_String_dR[var4] = var0;
         field_array_int_dS[var4] = var2;
         field_array_int_dT[var4] = var3;
         field_array_int_dU[var4] = 0;
         field_array_int_dV[var4] = var5;
         field_array_int_dW[var4] = 0;
         field_array_int_dX[var4] = var1;
      }
   }

   // $FF: renamed from: f (int, int) void
   private static void func_void_f(int var0, int var1) {
      field_int_ea = 1;
      field_int_dY = var0;
      field_int_dZ = var1;
   }

   // $FF: renamed from: c (java.lang.String) void
   private static void func_void_c(String var0) {
      field_class_java_lang_String_cr = var0;
      field_int_cq = 0;
      field_boolean_cp = true;
   }

   // $FF: renamed from: f (int, int, int) boolean
   private static boolean func_boolean_f(int var0, int var1, int var2) {
      int var3 = field_array_int_cf[0] == -1 ? 0 : 1;
      if (field_array_int_cf[var3] != -1) {
         return false;
      } else {
         field_array_int_cf[var3] = 0;
         field_array_int_ch[var3] = var2;
         field_array_int_cd[var3] = var0;
         field_array_int_ce[var3] = var1;
         return true;
      }
   }

   // $FF: renamed from: D (int) void
   private static void func_void_D(int var0) {
      field_int_ii = 0;
      field_int_ig = var0;
      field_boolean_ih = true;
   }

   // $FF: renamed from: g (int, int) boolean
   private static boolean func_boolean_g(int var0, int var1) {
      if (field_boolean_a) {
         return false;
      } else {
         int var2 = field_array_int_ck[0] == -1 ? 0 : 1;
         if (field_array_int_ck[var2] != -1) {
            return false;
         } else {
            field_array_int_ck[var2] = 0;
            field_array_int_ci[var2] = var0;
            field_array_int_cj[var2] = var1;
            return true;
         }
      }
   }

   // $FF: renamed from: O () void
   private static void func_void_O() {
      for(int var0 = 0; var0 < field_int_bP; ++var0) {
         if (field_array_int_bS[var0] == 1) {
            int[] var10000 = field_array_int_bQ;
            var10000[var0] += field_array_int_bT[var0];
            if (field_array_int_bQ[var0] >= field_int_fR && field_array_int_bQ[var0] <= field_int_fR + field_int_q && field_array_int_bR[var0] >= field_int_fS && field_array_int_bR[var0] <= field_int_fS + field_int_r) {
               if (func_int_a(field_int_fh - field_array_int_bQ[var0]) < field_int_fl && func_int_a(field_int_fi - field_int_fm - field_array_int_bR[var0]) < field_int_fm) {
                  if (field_int_A == 5 && field_int_fg == 0 && field_array_int_bV[var0] < 3) {
                     field_array_int_bT[var0] = -field_array_int_bT[var0];
                     var10000 = field_array_int_bQ;
                     var10000[var0] += field_array_int_bT[var0];
                     return;
                  }

                  func_void_a(field_array_int_bU[var0], field_array_int_bQ[var0] < field_int_fh ? 1 : -1);
                  field_array_int_bS[var0] = -1;
                  return;
               }
            } else {
               field_array_int_bS[var0] = -1;
            }
         }
      }

   }

   // $FF: renamed from: P () void
   private static void func_void_P() {
      for(int var0 = 0; var0 < field_int_bW; ++var0) {
         if (field_array_int_bZ[var0] != 0) {
            int[] var10000 = field_array_int_bX;
            var10000[var0] += field_array_int_ca[var0];
            var10000 = field_array_int_bY;
            var10000[var0] += field_array_int_cb[var0];
            int var10002 = field_array_int_cb[var0]++;
            if (field_array_int_bY[var0] > field_int_fS + field_int_r) {
               field_array_int_bZ[var0] = 0;
            }

            if (func_int_a(field_int_fh - field_array_int_bX[var0]) < field_int_fl && func_int_a(field_int_fi - field_int_fm - field_array_int_bY[var0]) < field_int_fm) {
               func_void_a(field_array_int_cc[var0], field_array_int_bX[var0] < field_int_fh ? 1 : -1);
               field_array_int_bZ[var0] = -1;
               return;
            }
         }
      }

   }

   // $FF: renamed from: Q () void
   private static void func_void_Q() {
      if (field_boolean_fA) {
         field_int_aM = 0;
      }

   }

   // $FF: renamed from: R () void
   private static void func_void_R() {
      if (field_boolean_fx) {
         field_int_fL = field_int_fh - field_int_bF + field_int_bI * field_int_fp;
         field_int_fM = field_int_fi - field_int_bH;
      }

      int var0;
      label788:
      switch(field_int_A) {
      case 1:
         if (++field_int_C > 30) {
            field_int_C = 0;
         }

         if (field_int_C % 15 < 5) {
            field_int_B = 0;
         } else {
            field_int_B = 1;
         }

         func_void_S();

         for(var0 = 0; var0 < field_int_dx; ++var0) {
            if (field_array_int_dG[var0] == 1 && field_int_fi == field_array_int_dD[var0] && func_int_a(field_int_fh - field_array_int_dC[var0]) < 30 && field_int_fH == -1) {
               field_class_java_lang_String_o = "Trò chuyện";
               field_boolean_c = true;
               field_int_fH = var0;
               break;
            }
         }

         if (field_int_gp == field_int_v && field_int_gu == 1 && field_int_fi == field_int_gr && func_int_a(field_int_fh - field_int_gq) < 30) {
            field_class_java_lang_String_o = "Nói chuyện";
            field_boolean_c = true;
            field_boolean_fE = true;
         }

         var0 = 0;

         while(true) {
            if (var0 >= field_int_lx) {
               break label788;
            }

            if (field_int_fi == field_array_int_lz[var0] && func_int_a(field_int_fh - field_array_int_ly[var0]) < 30 && field_int_fG == -1) {
               field_class_java_lang_String_o = "Giao tiếp";
               field_boolean_c = true;
               field_int_fG = var0;
               break label788;
            }

            ++var0;
         }
      case 2:
         if (++field_int_C >= 10) {
            field_int_C = 0;
            field_int_fr = 0;
            if (field_boolean_fa) {
               field_int_fr = field_int_fp << 1;
            }
         }

         field_int_B = (field_int_C >> 1) + 2;
         if (field_int_fp == 1) {
            if (func_boolean_g(field_int_fh + field_int_fl, field_int_fi - field_int_fm, 4)) {
               field_int_y = 0;
               field_int_fh = func_int_I(field_int_fh + field_int_fl) - field_int_fl;
            }
         } else if (func_boolean_g(field_int_fh - field_int_fl - 1, field_int_fi - field_int_fm, 8)) {
            field_int_y = 0;
            field_int_fh = func_int_I(field_int_fh - field_int_fl - 1) + field_int_jh + field_int_fl;
         }

         if ((func_int_i(field_int_fh, field_int_fi - 1) & 64) == 64) {
            field_int_fh += field_int_y >> 1;
         } else {
            field_int_fh += field_int_y;
         }

         if (field_int_y > 0) {
            --field_int_y;
         } else if (field_int_y < 0) {
            ++field_int_y;
         } else {
            field_int_A = 1;
            field_int_fr = 0;
         }

         if (field_int_iu != -1) {
            if (func_int_a(field_int_fh - field_array_int_iv[field_int_iu]) >= 20) {
               field_int_iu = -1;
               if (func_boolean_g(field_int_fh, field_int_fi, 2)) {
                  field_int_A = 1;
               } else {
                  field_int_A = 4;
                  field_int_z = 2;
                  field_int_y = 3 * field_int_fp;
                  field_int_D = 0;
               }
            }
         } else if ((func_int_i(field_int_fh, field_int_fi) & 2) != 2) {
            field_int_A = 4;
            field_int_y = 3 * field_int_fp;
            field_int_D = 0;
         }

         func_void_y();
         func_boolean_e(field_int_fp, field_int_fh - (field_int_fp << 3), field_int_fi);
         func_void_S();
         break;
      case 3:
         field_int_fh += field_int_y;
         if ((field_int_fi += field_int_z) < 0) {
            field_int_fi = 0;
            field_int_z = -1;
         }

         if (field_int_C == 0) {
            field_int_B = 7;
         } else {
            field_int_B = 23;
         }

         ++field_int_z;
         if (field_boolean_eL && !field_boolean_fA) {
            if (field_int_z == -3) {
               field_int_B = 8;
            } else if (field_int_z == -2) {
               field_int_B = 9;
            } else if (field_int_z == -1) {
               field_int_B = 10;
            } else if (field_int_z == 0) {
               field_int_B = 11;
            }
         }

         if (field_int_z == 0) {
            field_int_A = 4;
            field_int_C = 0;
            field_int_D = field_boolean_eL ? 1 : 0;
            field_int_z = 1;
            field_boolean_c = true;
         }

         if (field_int_fq < 0) {
            ++field_int_fq;
         }

         if (field_int_fp == 1) {
            if ((func_int_i(field_int_fh + field_int_fl, field_int_fi) & 4) == 4) {
               field_int_fh = func_int_I(field_int_fh + field_int_fl) - field_int_fl;
               field_int_y = 0;
            }
         } else if ((func_int_i(field_int_fh - field_int_fl, field_int_fi) & 8) == 8) {
            field_int_fh = func_int_I(field_int_fh + 24 - field_int_fl) + field_int_fl;
            field_int_y = 0;
         }
         break;
      case 4:
         field_int_ff = -1;
         field_int_fh += field_int_y;
         field_int_fi += field_int_z;
         if (field_int_z < 18) {
            ++field_int_z;
         }

         if (field_int_y > 0) {
            --field_int_y;
         }

         field_int_B = 7;
         if (field_int_fi >= field_int_iS) {
            field_int_A = 6;
            field_int_G = 0;
         } else if (field_int_fi + 4 >= field_int_iS) {
            field_int_A = 6;
            field_int_G = 0;
         } else if (field_int_z > 4 && (func_int_i(field_int_fh, field_int_fi + 3) & 2) == 2) {
            if (field_int_z > 12) {
               field_int_A = 8;
            } else {
               field_int_A = 1;
            }

            field_int_z = 0;
            field_int_y = 0;
            field_int_D = 0;
            field_int_C = 0;
            field_int_fi = func_int_I(field_int_fi + 3);
            func_boolean_e(-1, field_int_fh - -8, field_int_fi);
            func_boolean_e(1, field_int_fh - 8, field_int_fi);
            if (field_boolean_eP) {
               for(var0 = 0; var0 < field_int_il; ++var0) {
                  if (field_int_fi == field_array_int_io[var0] && func_int_a(field_int_fh - field_array_int_in[var0]) < 16) {
                     field_int_fh = field_array_int_in[var0];
                     field_int_A = 18;
                     field_int_im = var0;
                     field_array_int_ip[var0] = field_int_fp;
                     field_array_int_iq[var0] = 0;
                  }
               }
            }

            if (field_int_O == 11 && field_int_fF < 20) {
               field_int_fF = 0;
               func_void_c("Hit: " + field_int_fF);
            }
         } else {
            if (func_boolean_g(field_int_fh, field_int_fi, 64) && field_int_fi % field_int_jh > 8) {
               func_boolean_g(field_int_fh, func_int_H(field_int_fi) + 8);
               field_int_fi = func_int_H(field_int_fi) + 8;
               field_int_A = 11;
               field_int_y = field_int_fp << 1;
               field_int_z >>= 2;
               field_int_fi = func_int_H(field_int_fi) + 12;
               if (field_int_I == 0 || !field_boolean_eS) {
                  field_int_A = 12;
               }
            }

            if (func_boolean_g(field_int_fh, field_int_fi, 4096)) {
               field_int_A = 12;
            }

            if (field_int_D == 1 && !field_boolean_fA) {
               if (field_int_z == 3) {
                  field_int_B = 11;
               } else if (field_int_z == 2) {
                  field_int_B = 8;
               } else if (field_int_z == 1) {
                  field_int_B = 9;
               } else if (field_int_z == 0) {
                  field_int_B = 10;
               }
            } else {
               field_int_B = 23;
            }

            if (field_int_z > 6) {
               field_int_B = 12;
            }

            if (field_int_fq < 0) {
               ++field_int_fq;
            }

            if (field_int_fp == 1) {
               if ((func_int_i(field_int_fh + field_int_fl, field_int_fi) & 4) == 4) {
                  field_int_fh = func_int_I(field_int_fh + field_int_fl) - field_int_fl;
                  field_int_y = 0;
               }
            } else if ((func_int_i(field_int_fh - field_int_fl, field_int_fi) & 8) == 8) {
               field_int_fh = func_int_I(field_int_fh + 24 - field_int_fl) + field_int_fl;
               field_int_y = 0;
            }

            func_void_w();
            if (field_boolean_gQ && field_int_z >= 4 && func_int_a(field_int_fh - field_int_gS) < 30 && func_int_a(field_int_fi - (field_int_gT - 25)) < 5) {
               field_int_z = -(field_int_z >> 1);
               field_int_y = field_int_fp << 3;
               field_int_C = 0;
            }
         }
         break;
      case 5:
         ++field_int_C;
         if (field_int_fp == 1) {
            if ((func_int_i(field_int_fh + field_int_fl, field_int_fi - field_int_fm) & 4) == 4) {
               field_int_y = 0;
            }
         } else if ((func_int_i(field_int_fh - field_int_fl, field_int_fi - field_int_fm) & 8) == 8) {
            field_int_y = 0;
         }

         field_int_fh += field_int_y;
         if ((field_int_fi += field_int_z) < 0) {
            field_int_z = 0;
            field_int_fi = 0;
         }

         if (field_int_z == 0) {
            if (field_int_iu == -1 && (func_int_i(field_int_fh, field_int_fi) & 2) != 2) {
               field_int_A = 4;
               field_int_ff = -1;
               field_int_y = (field_int_P >> 1) * field_int_fp;
               field_int_D = 0;
               field_int_C = 0;
            }

            if (field_int_iu != -1 && func_int_a(field_int_fh - field_array_int_iv[field_int_iu]) >= 20) {
               field_int_iu = -1;
               if (func_boolean_g(field_int_fh, field_int_fi, 2)) {
                  field_int_A = 1;
               } else {
                  field_int_A = 4;
                  field_int_z = 2;
                  field_int_y = 3 * field_int_fp;
                  field_int_ff = -1;
                  field_int_D = 0;
               }
            }
         } else if (field_int_z < 0) {
            if (++field_int_z == 0) {
               field_int_z = 1;
            }
         } else {
            if (field_int_z < 20 && field_int_C % 5 == 0) {
               ++field_int_z;
            }

            if (field_int_z > 3) {
               field_int_z = 3;
            }

            if (field_int_z > 2 && (func_int_i(field_int_fh, field_int_fi + 3) & 2) == 2) {
               field_int_z = 0;
               field_int_y = 0;
               field_int_fi = func_int_I(field_int_fi + 3);
               if (field_int_O == 11 && field_int_fF < 20) {
                  field_int_fF = 0;
                  func_void_c("Hit: " + field_int_fF);
               }
            }

            if (func_boolean_g(field_int_fh, field_int_fi, 64) && field_int_fi % field_int_jh > 8) {
               func_boolean_g(field_int_fh, func_int_H(field_int_fi) + 8);
               field_int_A = 11;
               field_int_y = field_int_fp << 1;
               field_int_z >>= 2;
               field_int_fi = func_int_H(field_int_fi) + 12;
               field_int_ff = -1;
               if (field_int_I == 0 || !field_boolean_eS) {
                  field_int_A = 12;
               }
               break;
            }

            if (func_boolean_g(field_int_fh, field_int_fi, 4096)) {
               field_int_A = 12;
               field_int_ff = -1;
               break;
            }

            func_void_w();
         }

         if (field_int_y > 0) {
            --field_int_y;
         } else if (field_int_y < 0) {
            ++field_int_y;
         }

         if (field_int_y != 0) {
            func_void_y();
         }

         label728:
         switch(field_int_fw) {
         case 0:
            switch(field_int_C) {
            case 1:
            case 2:
            case 3:
               field_int_ff = -1;
               field_int_B = 13;
               break label728;
            case 4:
               field_int_ff = 0;
               field_int_B = 14;
               break label728;
            case 5:
               field_int_ff = 1;
               field_int_B = 15;
               break label728;
            case 6:
               field_int_ff = 1;
               field_int_B = 15;
               func_void_u();
               break label728;
            case 7:
               field_int_ff = 2;
               field_int_B = 16;
               break label728;
            case 8:
               field_int_ff = 2;
               field_int_B = 16;
               if (field_boolean_fy) {
                  field_boolean_fy = false;
                  field_int_fw = 2;
               } else {
                  field_int_fw = 1;
               }

               field_int_C = 1;
            default:
               break label728;
            }
         case 1:
            switch(field_int_C) {
            case 1:
               field_int_ff = 1;
               field_int_B = 15;
               break label728;
            case 2:
               field_int_ff = 1;
               field_int_B = 15;
               field_int_fw = 10;
            default:
               break label728;
            }
         case 2:
            switch(field_int_C) {
            case 1:
            case 2:
            case 3:
               field_int_ff = 3;
               field_int_B = 17;
               break label728;
            case 4:
               field_int_ff = 4;
               field_int_B = 18;
               break label728;
            case 5:
               field_int_ff = 5;
               field_int_B = 19;
               break label728;
            case 6:
               field_int_ff = 6;
               field_int_B = 20;
               func_void_u();
               break label728;
            case 7:
               field_int_ff = 6;
               field_int_B = 20;
               if (field_boolean_fy && field_int_fv < 2) {
                  if (field_int_z == 0 && field_boolean_fu) {
                     field_int_C = 0;
                     field_boolean_fy = false;
                     field_int_fw = 9;
                  } else {
                     field_boolean_fy = false;
                     field_int_fw = 3;
                     ++field_int_fv;
                  }
               } else {
                  field_int_fw = 10;
               }

               field_int_C = 1;
            default:
               break label728;
            }
         case 3:
            switch(field_int_C) {
            case 1:
               field_int_ff = 1;
               field_int_B = 15;
               break;
            case 2:
               field_int_ff = 1;
               field_int_B = 15;
               break;
            case 3:
               field_int_ff = 2;
               field_int_B = 16;
               break;
            case 4:
               field_int_ff = 2;
               field_int_B = 16;
               if (field_boolean_fy) {
                  field_boolean_fy = false;
                  field_int_fw = 2;
               } else {
                  field_int_fw = 1;
               }

               field_int_C = 1;
            }
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         default:
            break;
         case 9:
            switch(field_int_C) {
            case 1:
            case 2:
            case 3:
               field_int_ff = -1;
               field_int_B = 13;
               break label728;
            case 4:
               field_int_ff = 0;
               field_int_B = 14;
               break label728;
            case 5:
            case 6:
               field_int_ff = 9;
               field_int_B = 15;
               var0 = func_int_A();
               field_boolean_fu = false;
               if (var0 != -1) {
                  field_boolean_fu = true;
                  func_boolean_f(field_array_int_jN[var0], field_array_int_jO[var0] - (field_array_int_jP[var0] >> 1), field_int_fp);
                  field_array_int_jS[var0] = 9;
                  field_array_int_jX[var0] = -8;
                  func_void_Q();
               }
               break label728;
            case 7:
            case 8:
               field_int_ff = 10;
               field_int_B = 16;
               break label728;
            case 9:
               field_int_ff = -1;
               field_int_B = 16;
               if (field_boolean_fu) {
                  field_int_A = 3;
                  field_int_y = 0;
                  field_int_z = -8;
               } else {
                  field_int_C = 0;
                  field_int_D = 0;
                  field_int_fw = 10;
               }
            default:
               break label728;
            }
         case 10:
            switch(field_int_C) {
            case 1:
               field_int_ff = 2;
               field_int_B = 16;
               break;
            case 2:
               field_int_ff = 0;
               field_int_B = 14;
               break;
            case 3:
            case 4:
               field_int_B = 13;
               field_int_ff = -1;
               break;
            case 5:
               field_int_B = 13;
               field_int_ff = -1;
               if (field_int_z != 0) {
                  field_int_A = 4;
               } else {
                  field_int_A = 1;
               }

               field_int_fv = 0;
               field_int_D = 0;
            }
         }

         if (field_int_fg == 1) {
            field_int_ff = -1;
         }

         if (field_int_A == 5) {
            if (field_int_z != 0) {
               field_int_B += 14;
            } else if (field_int_y != 0) {
               field_int_B += 22;
            }
         }
         break;
      case 6:
         field_int_fh += field_int_y;
         if (field_int_y > 1) {
            --field_int_y;
         }

         if (field_int_y < -1) {
            ++field_int_y;
         }

         ++field_int_z;
         field_int_fi += field_int_z;
         field_int_B = 21;
         if (field_int_fi >= field_int_iS || field_int_fi > field_int_fS + field_int_r + field_int_fk || func_boolean_g(field_int_fh, field_int_fi - field_int_fk, 4096)) {
            field_int_fh = field_int_fs;
            field_int_fi = field_int_ft;
            field_int_A = 4;
            field_int_G = field_int_H / 3;
            field_int_I = field_int_J / 3;
            field_int_z = 0;
            field_int_y = 0;
            field_int_D = 0;
            field_int_C = 0;
            field_int_N >>= 1;
            field_boolean_c = true;
            if (field_boolean_hf) {
               field_int_hj = field_int_hk;
            }

            if (field_boolean_hl) {
               field_int_hp = field_int_hq;
            }

            func_void_aw();
            func_void_s(5);
            field_int_d = 7;
         }
         break;
      case 7:
         if ((func_int_i(field_int_fh + field_int_fl, field_int_fi - field_int_fm) & 4) == 4) {
            field_int_y = -field_int_y;
         }

         if ((func_int_i(field_int_fh - field_int_fl, field_int_fi - field_int_fm) & 8) == 8) {
            field_int_y = -field_int_y;
         }

         field_int_fh += field_int_y;
         field_int_fi += field_int_z;
         field_int_B = 21;
         if (field_int_y > 1) {
            --field_int_y;
         }

         if (field_int_y < -1) {
            ++field_int_y;
         }

         if (++field_int_z > 0) {
            field_int_z = 0;
         }

         if (++field_int_C >= 7) {
            field_int_A = 4;
            field_int_fq = -20;
            field_int_D = 0;
            field_int_C = 0;
            field_int_z = 0;
         }

         func_void_x();
         break;
      case 8:
         field_int_B = 22;
         if (field_int_C < 5) {
            ++field_int_C;
         } else if (!field_array_boolean_aU[8]) {
            field_int_A = 1;
         }

         if (++field_int_D > 6 && func_boolean_g(field_int_fh + field_int_fl, field_int_fi + 2, 8192) && func_boolean_g(field_int_fh - field_int_fl, field_int_fi + 2, 8192) && field_boolean_eO & field_int_I > 0) {
            field_int_A = 13;
         }
      case 9:
      case 10:
      case 22:
      default:
         break;
      case 11:
         func_void_U();
         break;
      case 12:
         field_int_fi += field_int_z;
         if (field_int_z < 20 && field_int_w % 2 == 0) {
            ++field_int_z;
         }

         field_int_B = 7;
         if (field_int_fi >= field_int_iS) {
            field_int_G = 0;
            field_int_A = 6;
            field_int_ff = -1;
         } else if (func_boolean_g(field_int_fh, field_int_fi, 2)) {
            field_int_fi = func_int_H(field_int_fi);
            if (func_boolean_g(field_int_fh, field_int_fi - 2, 64)) {
               field_int_A = 1;
               field_int_z = 0;
               field_int_y = 0;
               field_int_D = 0;
               field_int_C = 0;
            } else if (field_boolean_eR) {
               field_int_A = 17;
               field_int_z = 0;
               field_int_y = 0;
               field_int_D = 0;
               field_int_C = 0;
            } else {
               field_int_A = 6;
            }

            field_int_fi = func_int_I(field_int_fi);
         } else if (func_boolean_g(field_int_fh, field_int_fi - field_int_fk - 5, 4096)) {
            field_int_G = 0;
            field_int_A = 6;
            field_int_ff = -1;
         }
         break;
      case 13:
         field_int_B = 24;
         field_int_fi += 28;
         field_int_A = 14;
         break;
      case 14:
         if (field_int_w % 20 > 2) {
            field_int_B = 25;
         } else {
            field_int_B = 26;
         }

         if (field_int_w % 8 == 0) {
            if (--field_int_I <= 0) {
               field_int_I = 0;
               field_int_A = 15;
            }

            field_boolean_c = true;
         }
         break;
      case 15:
         field_int_fi -= 10;
         field_int_z = -10;
         field_int_A = 3;
         break;
      case 16:
         if (++field_int_C >= 20) {
            field_int_C = 0;
         }

         if ((field_int_B = (field_int_C >> 2) + 2) % 2 == 0) {
            field_int_ff = 7;
         } else {
            field_int_ff = 8;
         }

         if (field_int_fp == 1) {
            if (func_boolean_g(field_int_fh + field_int_fl, field_int_fi - field_int_fm, 4)) {
               field_int_y = 0;
               field_int_fh = func_int_I(field_int_fh + field_int_fl) - field_int_fl;
            }
         } else if (func_boolean_g(field_int_fh - field_int_fl - 1, field_int_fi - field_int_fm, 8)) {
            field_int_y = 0;
            field_int_fh = func_int_I(field_int_fh - field_int_fl - 1) + field_int_jh + field_int_fl;
         }

         field_int_fh += field_int_y;
         if (field_int_y > 0) {
            --field_int_y;
         } else if (field_int_y < 0) {
            ++field_int_y;
         } else {
            field_int_A = 17;
         }

         if ((func_int_i(field_int_fh, field_int_fi) & 2) != 2) {
            field_int_A = 12;
            field_int_y = field_int_fp << 2;
            field_int_D = 0;
         }
         break;
      case 17:
         if (++field_int_C > 30) {
            field_int_C = 0;
         }

         if (field_int_C % 15 < 5) {
            field_int_B = 0;
            field_int_ff = 7;
         } else {
            field_int_B = 1;
            field_int_ff = 8;
         }
         break;
      case 18:
         if (field_int_w % 8 > 3) {
            field_int_B = 43;
         } else {
            field_int_B = 44;
            func_boolean_e(field_int_fp, field_int_fh - (field_int_fp << 4), field_int_fi - 5);
         }

         field_int_C = 0;
         break;
      case 19:
         if (field_int_w % 8 > 3) {
            field_int_B = 43;
         } else {
            field_int_B = 44;
            func_boolean_e(field_int_fp, field_int_fh - (field_int_fp << 4), field_int_fi - 5);
         }

         if (field_int_C > 0) {
            --field_int_C;
            field_int_B = 45;
         }

         if (field_int_fp == 1) {
            if (func_boolean_g(field_int_fh + field_int_fl, field_int_fi - field_int_fm, 4)) {
               field_int_y = 0;
               field_int_fh = func_int_I(field_int_fh + field_int_fl) - field_int_fl;
            }
         } else if (func_boolean_g(field_int_fh - field_int_fl - 1, field_int_fi - field_int_fm, 8)) {
            field_int_y = 0;
            field_int_fh = func_int_I(field_int_fh - field_int_fl - 1) + field_int_jh + field_int_fl;
         }

         if ((func_int_i(field_int_fh, field_int_fi - 1) & 64) == 64) {
            field_int_fh += field_int_y >> 1;
         } else {
            field_int_fh += field_int_y;
         }

         field_array_int_in[field_int_im] = field_int_fh;
         field_array_int_io[field_int_im] = field_int_fi;
         if (field_int_y > 0) {
            --field_int_y;
         } else if (field_int_y < 0) {
            ++field_int_y;
         } else {
            field_int_A = 18;
            field_int_fr = 0;
         }

         if (field_int_iu != -1) {
            if (func_int_a(field_int_fh - field_array_int_iv[field_int_iu]) >= 20) {
               field_int_iu = -1;
               if (func_boolean_g(field_int_fh, field_int_fi, 2)) {
                  field_int_A = 18;
               } else {
                  field_int_A = 20;
                  field_int_z = 2;
                  field_int_y = 3 * field_int_fp;
                  field_int_D = 0;
               }
            }
         } else if ((func_int_i(field_int_fh, field_int_fi) & 2) != 2) {
            field_int_A = 20;
            field_int_y = 3 * field_int_fp;
            field_int_D = 0;
         }

         func_boolean_e(field_int_fp, field_int_fh - (field_int_fp << 3), field_int_fi);
         func_void_S();
         if ((var0 = func_int_A()) != -1 && (field_array_int_jS[var0] == 2 || field_array_int_jS[var0] == 3)) {
            func_boolean_k(var0, 2, -field_int_fp);
            func_boolean_f(field_array_int_jN[var0], field_array_int_jO[var0] - (field_array_int_jP[var0] >> 1), field_int_fp);
            func_void_a("-2", 0, field_array_int_jN[var0], field_array_int_jO[var0] - field_array_int_jP[var0], 0, -2);
         }
         break;
      case 20:
         try {
            if (field_int_fp == 1) {
               if ((func_int_i(field_int_fh + field_int_fl, field_int_fi - field_int_fm) & 4) == 4) {
                  field_int_y = 0;
               }
            } else if ((func_int_i(field_int_fh - field_int_fl, field_int_fi - field_int_fm) & 8) == 8) {
               field_int_y = 0;
            }

            field_int_ff = -1;
            field_int_fh += field_int_y;
            field_int_fi += field_int_z;
            if (field_int_z < 20) {
               ++field_int_z;
            }

            if (field_int_y > 0) {
               --field_int_y;
            }

            if (field_int_w % 8 > 3) {
               field_int_B = 43;
            } else {
               field_int_B = 44;
               func_boolean_e(field_int_fp, field_int_fh - (field_int_fp << 4), field_int_fi - 5);
            }

            if (field_int_z > 4 && (func_int_i(field_int_fh, field_int_fi) & 2) == 2) {
               if (field_int_z < 8) {
                  field_int_A = 18;
                  field_int_z = 0;
                  field_int_y = 0;
                  field_int_D = 0;
                  field_int_C = 0;
                  field_int_fi = func_int_I(field_int_fi);
               } else {
                  field_int_A = 21;
                  field_int_z = -(field_int_z / 3);
                  field_int_fi = func_int_I(field_int_fi);
               }
            }

            if (func_boolean_g(field_int_fh, field_int_fi, 64) && field_int_fi % field_int_jh > 8) {
               func_boolean_g(field_int_fh, func_int_H(field_int_fi) + 8);
            }

            field_array_int_in[field_int_im] = field_int_fh;
            field_array_int_io[field_int_im] = field_int_fi;
            if (func_boolean_g(field_int_fh, field_int_fi, 4096)) {
               field_array_int_ir[field_int_im] = 1;
               field_int_im = -1;
               field_int_A = 12;
            }
         } catch (Exception var2) {
         }

         if (field_int_fq < 0) {
            ++field_int_fq;
         }
         break;
      case 21:
         if (field_int_fp == 1) {
            if ((func_int_i(field_int_fh + field_int_fl, field_int_fi - field_int_fm) & 4) == 4) {
               field_int_y = 0;
            }
         } else if ((func_int_i(field_int_fh - field_int_fl, field_int_fi - field_int_fm) & 8) == 8) {
            field_int_y = 0;
         }

         field_int_fh += field_int_y;
         field_int_fi += field_int_z;
         field_array_int_in[field_int_im] = field_int_fh;
         field_array_int_io[field_int_im] = field_int_fi;
         if (field_int_y > 0) {
            --field_int_y;
         }

         if (++field_int_z == 0) {
            field_int_A = 20;
            field_int_C = 0;
            field_int_D = field_boolean_eL ? 1 : 0;
            field_int_z = 1;
            field_boolean_c = true;
         }

         if (field_int_fq < 0) {
            ++field_int_fq;
         }

         if (field_int_w % 8 > 3) {
            field_int_B = 43;
         } else {
            field_int_B = 44;
            func_boolean_e(field_int_fp, field_int_fh - (field_int_fp << 4), field_int_fi - 5);
         }

         if (field_int_C > 0) {
            --field_int_C;
            field_int_B = 45;
         }
         break;
      case 23:
         func_void_T();
      }

      if (field_int_w % 3 == 0) {
         if (field_boolean_fz) {
            if (--field_int_I <= 0) {
               field_int_I = 0;
               field_boolean_fz = false;
            }

            field_boolean_c = true;
         }

         if (field_boolean_fA) {
            if (--field_int_I <= 0) {
               field_int_I = 0;
               field_boolean_fA = false;

               for(int var1 = 0; var1 < 4; ++var1) {
                  Image var3 = field_array_class_javax_microedition_lcdui_Image_er[var1];
                  field_array_class_javax_microedition_lcdui_Image_er[var1] = field_array_class_javax_microedition_lcdui_Image_es[var1];
                  field_array_class_javax_microedition_lcdui_Image_es[var1] = var3;
               }
            }

            field_boolean_c = true;
         }
      }

   }

   // $FF: renamed from: S () void
   private static final void func_void_S() {
      if (!field_boolean_a) {
         if (func_boolean_g(field_int_fh, field_int_fi + 1, 2048)) {
            func_void_h(field_int_fh, field_int_fi + 1, 1024);
            func_void_h(field_int_fh, field_int_fi - 2, 1024);
         }

         if (func_boolean_g(field_int_fh - field_int_jh, field_int_fi + 1, 1024)) {
            func_void_j(field_int_fh - field_int_jh, field_int_fi + 1, 1024);
            func_void_j(field_int_fh - field_int_jh, field_int_fi - 2, 1024);
         }

         if (func_boolean_g(field_int_fh + field_int_jh, field_int_fi + 1, 1024)) {
            func_void_j(field_int_fh + field_int_jh, field_int_fi + 1, 1024);
            func_void_j(field_int_fh + field_int_jh, field_int_fi - 2, 1024);
         }

      }
   }

   // $FF: renamed from: T () void
   private static void func_void_T() {
      if (++field_int_C == 1) {
         func_void_f(field_int_fh, field_int_fi - 40);
         field_int_aM = 0;
         if (field_array_class_javax_microedition_lcdui_Image_es == null) {
            field_array_class_javax_microedition_lcdui_Image_es = new Image[4];

            try {
               field_array_class_javax_microedition_lcdui_Image_es[0] = Image.createImage("/cp/ch0x.png");
               field_array_class_javax_microedition_lcdui_Image_es[1] = Image.createImage("/cp/ch1x.png");
            } catch (Exception var2) {
            }

            field_array_class_javax_microedition_lcdui_Image_es[2] = field_array_class_javax_microedition_lcdui_Image_es[1];
            field_array_class_javax_microedition_lcdui_Image_es[3] = field_array_class_javax_microedition_lcdui_Image_es[0];
         }
      } else {
         Image var0;
         int var1;
         if (field_int_C >= 30) {
            field_int_A = 1;
            field_int_C = 0;
            if (field_int_I == 0) {
               return;
            }

            for(var1 = 0; var1 < 4; ++var1) {
               var0 = field_array_class_javax_microedition_lcdui_Image_er[var1];
               field_array_class_javax_microedition_lcdui_Image_er[var1] = field_array_class_javax_microedition_lcdui_Image_es[var1];
               field_array_class_javax_microedition_lcdui_Image_es[var1] = var0;
            }

            field_boolean_fA = !field_boolean_fA;
         } else if (field_int_C <= 10) {
            if (field_int_C % 5 == 0) {
               for(var1 = 0; var1 < 4; ++var1) {
                  var0 = field_array_class_javax_microedition_lcdui_Image_er[var1];
                  field_array_class_javax_microedition_lcdui_Image_er[var1] = field_array_class_javax_microedition_lcdui_Image_es[var1];
                  field_array_class_javax_microedition_lcdui_Image_es[var1] = var0;
               }
            }
         } else if (field_int_C < 20) {
            if (field_int_C % 3 == 0) {
               for(var1 = 0; var1 < 4; ++var1) {
                  var0 = field_array_class_javax_microedition_lcdui_Image_er[var1];
                  field_array_class_javax_microedition_lcdui_Image_er[var1] = field_array_class_javax_microedition_lcdui_Image_es[var1];
                  field_array_class_javax_microedition_lcdui_Image_es[var1] = var0;
               }
            }
         } else if (field_int_C < 30 && field_int_C % 2 == 0) {
            for(var1 = 0; var1 < 4; ++var1) {
               var0 = field_array_class_javax_microedition_lcdui_Image_er[var1];
               field_array_class_javax_microedition_lcdui_Image_er[var1] = field_array_class_javax_microedition_lcdui_Image_es[var1];
               field_array_class_javax_microedition_lcdui_Image_es[var1] = var0;
            }
         }
      }

      if (field_int_C % 2 > 0) {
         field_int_B = 0;
      } else {
         field_int_B = 1;
      }
   }

   // $FF: renamed from: U () void
   private static void func_void_U() {
      if (++field_int_C >= 5) {
         field_int_C = 0;
         field_int_fr = 0;
      }

      field_int_B = field_int_C + 2;
      if (field_int_fp == 1) {
         if (func_boolean_g(field_int_fh + field_int_fl, field_int_fi - 1, 4)) {
            field_int_y = 0;
            field_int_fh = func_int_I(field_int_fh + field_int_fl) - field_int_fl;
         }
      } else if (func_boolean_g(field_int_fh - field_int_fl - 1, field_int_fi - 1, 8)) {
         field_int_y = 0;
         field_int_fh = func_int_I(field_int_fh - field_int_fl - 1) + field_int_jh + field_int_fl;
      }

      field_int_fh += field_int_y;
      if (field_int_y > 0) {
         --field_int_y;
      } else if (field_int_y < 0) {
         ++field_int_y;
      } else if (!field_boolean_fb) {
         field_int_A = 12;
         field_int_fr = 0;
      } else {
         field_int_A = 3;
         field_int_z = -8;
         field_int_D = 0;
         field_int_C = 0;
      }

      if (field_int_w % 8 == 0) {
         if ((field_int_I -= 3) <= 0) {
            field_int_I = 0;
            field_int_y = 0;
            field_int_A = 12;
         }

         field_boolean_c = true;
      }

      for(int var0 = 0; var0 < field_int_it; ++var0) {
         if (func_int_a(field_int_fh - field_array_int_iv[var0]) < 20 && field_array_int_iw[var0] > field_int_fi && field_array_int_iw[var0] - 24 < field_int_fi) {
            field_int_y = 0;
            if (field_int_fh < field_array_int_iv[var0]) {
               field_int_fh = field_array_int_iv[var0] - 20;
            } else {
               field_int_fh = field_array_int_iv[var0] + 20;
            }

            field_int_A = 12;
            break;
         }
      }

      func_boolean_g(field_int_fh, field_int_fi);
      func_boolean_e(field_int_fp, field_int_fh - (field_int_fp << 3), field_int_fi);
   }

   // $FF: renamed from: V () boolean
   private static boolean func_boolean_V() {
      if (!field_boolean_fV) {
         if (field_int_bx > 1) {
            field_int_bx >>= 1;
            field_boolean_c = true;
         }

         return false;
      } else {
         if (field_boolean_gd) {
            if (field_array_boolean_aV[5]) {
               func_void_d();
               func_void_M();
               if (field_int_iF == field_int_iE) {
                  field_boolean_iC = false;
                  field_boolean_gd = false;
                  func_void_z();
               }
            }
         } else {
            if (field_int_bx < field_int_bw) {
               field_int_bx += (field_int_bw - field_int_bx >> 1) + 1;
            }

            if (field_boolean_fY) {
               if (field_int_ga < field_int_gb) {
                  field_int_ga += 2;
               } else {
                  field_int_ga = field_int_gb;
               }
            }

            if (++field_int_gc >= field_array_array_int_aB[field_int_fW][field_int_fX]) {
               field_int_gc = field_array_array_int_aB[field_int_fW][field_int_fX];
               int var0;
               switch(field_array_array_int_az[field_int_fW][field_int_fX]) {
               case 1:
                  func_void_F(field_array_array_int_aA[field_int_fW][field_int_fX]);
                  ++field_int_fX;
                  break;
               case 2:
                  func_void_G(field_array_array_int_aA[field_int_fW][field_int_fX]);
                  ++field_int_fX;
                  break;
               case 3:
                  field_boolean_fV = false;
                  field_boolean_c = true;
                  ++field_int_fX;
                  break;
               case 4:
                  if (field_int_A == 1) {
                     field_boolean_fY = false;
                     var0 = 0;
                     int var1 = 0;
                     switch(field_array_int_aE[field_array_array_int_aA[field_int_fW][field_int_fX]]) {
                     case 0:
                        var0 = field_int_fh;
                        var1 = field_int_fi;
                        break;
                     case 1:
                        var0 = field_array_int_ly[field_array_int_aD[field_array_array_int_aA[field_int_fW][field_int_fX]]];
                        var1 = field_array_int_lz[field_array_int_aD[field_array_array_int_aA[field_int_fW][field_int_fX]]];
                        break;
                     case 2:
                        var0 = field_array_int_dC[field_array_int_aD[field_array_array_int_aA[field_int_fW][field_int_fX]]];
                        var1 = field_array_int_dD[field_array_int_aD[field_array_array_int_aA[field_int_fW][field_int_fX]]];
                        break;
                     case 3:
                     case 4:
                        var0 = field_int_gq;
                        var1 = field_int_gr;
                     }

                     var1 -= 40;
                     func_void_a(field_array_array_class_java_lang_String_aG[field_array_array_int_aA[field_int_fW][field_int_fX]], -1, var0, var1);
                     ++field_int_fX;
                     field_boolean_gd = true;
                  }
                  break;
               case 5:
                  func_void_a(field_int_v, field_array_array_int_aA[field_int_fW][field_int_fX], field_int_fi - 50, -1);
                  ++field_int_fX;
                  break;
               case 6:
                  field_int_ge = -1;
                  ++field_int_fX;
                  break;
               case 7:
                  field_boolean_fx = true;
                  ++field_int_fX;
                  break;
               case 8:
                  field_boolean_fx = false;
                  ++field_int_fX;
                  break;
               case 9:
                  field_int_fR = field_array_array_int_aC[field_array_array_int_aA[field_int_fW][field_int_fX]][0] - field_int_bF;
                  field_int_fS = field_array_array_int_aC[field_array_array_int_aA[field_int_fW][field_int_fX]][1] - field_int_bG;
                  if (field_int_fR < 0) {
                     field_int_fR = 0;
                  }

                  if (field_int_fR > field_int_fT) {
                     field_int_fR = field_int_fT;
                  }

                  if (field_int_fS < 0) {
                     field_int_fS = 0;
                  }

                  if (field_int_fS > field_int_fU) {
                     field_int_fS = field_int_fU;
                  }

                  field_int_fL = field_int_fR;
                  field_int_fM = field_int_fS;
                  ++field_int_fX;
                  break;
               case 10:
                  field_int_fL = field_array_array_int_aC[field_array_array_int_aA[field_int_fW][field_int_fX]][0] - field_int_bF;
                  field_int_fM = field_array_array_int_aC[field_array_array_int_aA[field_int_fW][field_int_fX]][1] - field_int_bG;
                  if (field_int_fL < 0) {
                     field_int_fL = 0;
                  }

                  if (field_int_fL > field_int_fT) {
                     field_int_fL = field_int_fT;
                  }

                  if (field_int_fM < 0) {
                     field_int_fM = 0;
                  }

                  if (field_int_fM > field_int_fU) {
                     field_int_fM = field_int_fU;
                  }

                  ++field_int_fX;
                  break;
               case 11:
                  field_int_fL = field_int_gS - field_int_bF;
                  field_int_fM = field_int_gT - field_int_bG;
                  if (field_int_fL < 0) {
                     field_int_fL = 0;
                  }

                  if (field_int_fL > field_int_fT) {
                     field_int_fL = field_int_fT;
                  }

                  if (field_int_fM < 0) {
                     field_int_fM = 0;
                  }

                  if (field_int_fM > field_int_fU) {
                     field_int_fM = field_int_fU;
                  }

                  ++field_int_fX;
                  break;
               case 12:
                  field_int_fM = field_int_fS += 2;
                  if (field_int_fS > field_array_array_int_aC[field_array_array_int_aA[field_int_fW][field_int_fX]][1] - field_int_bG) {
                     ++field_int_fX;
                  }
               case 13:
               default:
                  break;
               case 14:
                  field_int_fL = field_int_fR -= 2;
                  if (field_int_fR < field_array_array_int_aC[field_array_array_int_aA[field_int_fW][field_int_fX]][0] - field_int_bF) {
                     ++field_int_fX;
                  }
                  break;
               case 15:
                  field_boolean_fY = true;
                  field_array_class_java_lang_String_fZ = Midlet.func_array_class_java_lang_String_a(field_array_class_java_lang_String_aH[field_array_array_int_aA[field_int_fW][field_int_fX]], field_int_q - 40);
                  if ((field_int_gb = (field_int_bw >> 1) - (field_array_class_java_lang_String_fZ.length << 3)) < 3) {
                     field_int_gb = 2;
                  }

                  field_int_ga = -field_array_class_java_lang_String_fZ.length << 3;
                  ++field_int_fX;
                  break;
               case 16:
                  field_boolean_dA = true;
                  field_int_dB = field_array_array_int_aA[field_int_fW][field_int_fX];
                  ++field_int_fX;
                  break;
               case 17:
                  field_int_fs = field_int_fh = field_int_jx;
                  field_int_ft = field_int_fi = field_int_jy;
                  func_void_B();
                  Midlet.field_boolean_f = true;
                  func_void_x(field_array_array_int_aA[field_int_fW][field_int_fX]);
                  return true;
               case 18:
                  func_void_V(field_array_array_int_aA[field_int_fW][field_int_fX]);
                  ++field_int_fX;
                  break;
               case 19:
                  field_boolean_gn = true;
                  ++field_int_fX;
                  break;
               case 20:
                  field_boolean_gn = false;
                  field_int_gp = 0;
                  field_int_gq = 1080;
                  field_int_gr = 408;
                  ++field_int_fX;
                  break;
               case 21:
                  field_int_O = -1;
                  field_boolean_eP = true;
                  func_void_c("nhận bằng lái môtô");
                  func_void_a(0, field_array_int_ly[4], field_array_int_lz[4] - 40, 4);
                  ++field_int_fX;
                  break;
               case 22:
                  for(var0 = 0; var0 <= 6; ++var0) {
                     func_void_i(24, var0, 0);
                  }

                  field_boolean_eI = true;
                  ++field_int_fX;
                  break;
               case 23:
                  field_boolean_fx = false;
                  field_int_fL = field_array_int_dC[field_array_array_int_aA[field_int_fW][field_int_fX]] - field_int_bF;
                  field_int_fM = field_array_int_dD[field_array_array_int_aA[field_int_fW][field_int_fX]] - field_int_bG;
                  if (field_int_fL < 0) {
                     field_int_fL = 0;
                  }

                  if (field_int_fL > field_int_fT) {
                     field_int_fL = field_int_fT;
                  }

                  if (field_int_fM < 0) {
                     field_int_fM = 0;
                  }

                  if (field_int_fM > field_int_fU) {
                     field_int_fM = field_int_fU;
                  }

                  ++field_int_fX;
                  break;
               case 24:
                  field_boolean_dA = true;
                  field_int_dB = field_array_array_int_aA[field_int_fW][field_int_fX];
                  ++field_int_fX;
                  break;
               case 25:
                  field_boolean_hh = true;
                  ++field_int_fX;
                  break;
               case 26:
                  for(var0 = 0; var0 <= 10; ++var0) {
                     func_void_i(24, var0, 0);
                  }

                  field_boolean_eJ = true;
                  ++field_int_fX;
                  break;
               case 27:
                  field_boolean_fx = false;
                  field_int_fL = field_int_hs - field_int_bF;
                  field_int_fM = field_int_ht - field_int_bG;
                  if (field_int_fL < 0) {
                     field_int_fL = 0;
                  }

                  if (field_int_fL > field_int_fT) {
                     field_int_fL = field_int_fT;
                  }

                  if (field_int_fM < 0) {
                     field_int_fM = 0;
                  }

                  if (field_int_fM > field_int_fU) {
                     field_int_fM = field_int_fU;
                  }

                  ++field_int_fX;
                  break;
               case 28:
                  field_int_hu = 1;
                  ++field_int_fX;
                  break;
               case 29:
                  func_void_d();
                  func_void_c();
                  field_class_javax_microedition_lcdui_Image_iW = null;
                  field_class_javax_microedition_lcdui_Image_iX = null;
                  field_class_javax_microedition_lcdui_Image_iY = null;
                  field_array_class_javax_microedition_lcdui_Image_iZ = null;
                  field_array_byte_iT = null;
                  field_array_int_iU = null;
                  System.gc();
                  field_array_array_class_javax_microedition_lcdui_Image_lw = null;
                  System.gc();
                  field_array_class_javax_microedition_lcdui_Image_ee = null;
                  field_class_javax_microedition_lcdui_Image_eh = null;
                  field_array_class_javax_microedition_lcdui_Image_ej = null;
                  field_array_class_javax_microedition_lcdui_Image_ey = null;
                  System.gc();
                  field_array_class_javax_microedition_lcdui_Image_eA = null;
                  System.gc();
                  field_array_array_array_class_javax_microedition_lcdui_Image_jJ = null;
                  System.gc();
                  func_void_C();
                  field_array_array_class_javax_microedition_lcdui_Image_ev = null;
                  field_array_class_javax_microedition_lcdui_Image_el = null;
                  field_array_array_class_javax_microedition_lcdui_Image_eb = null;
                  field_array_array_class_javax_microedition_lcdui_Image_em = null;
                  field_array_class_javax_microedition_lcdui_Image_en = null;
                  field_array_class_javax_microedition_lcdui_Image_eu = null;
                  field_array_class_javax_microedition_lcdui_Image_eB = null;
                  field_array_class_javax_microedition_lcdui_Image_eG = null;
                  field_array_class_javax_microedition_lcdui_Image_ec = null;
                  System.gc();
                  field_array_class_javax_microedition_lcdui_Image_et = null;
                  field_array_class_javax_microedition_lcdui_Image_eg = null;
                  field_array_class_javax_microedition_lcdui_Image_er = null;
                  field_array_class_javax_microedition_lcdui_Image_es = null;
                  field_array_class_javax_microedition_lcdui_Image_eE = null;
                  System.gc();
                  func_void_K();
                  return true;
               case 30:
                  field_int_O = -1;
                  field_boolean_eW = false;
                  field_boolean_eX = true;
                  field_int_gp = 0;
                  field_int_gq = 648;
                  field_int_gr = 288;
                  field_boolean_gn = false;
                  func_void_c("gặp cô Ayumi");
                  func_void_a(0, 1032, 368, 4);
                  ++field_int_fX;
                  break;
               case 31:
                  field_boolean_fx = false;
                  field_int_fL = field_int_gq - field_int_bF;
                  field_int_fM = field_int_gr - field_int_bG;
                  if (field_int_fL < 0) {
                     field_int_fL = 0;
                  }

                  if (field_int_fL > field_int_fT) {
                     field_int_fL = field_int_fT;
                  }

                  if (field_int_fM < 0) {
                     field_int_fM = 0;
                  }

                  if (field_int_fM > field_int_fU) {
                     field_int_fM = field_int_fU;
                  }

                  ++field_int_fX;
                  break;
               case 32:
                  field_boolean_gn = true;
                  field_int_gu = 2;
                  field_int_gs = -5;
                  field_int_gC = -1;
                  field_int_gN = 8;
                  ++field_int_fX;
                  break;
               case 33:
                  field_boolean_fe = true;
                  field_boolean_gn = true;
                  ++field_int_fX;
               }
            }
         }

         field_array_boolean_aU[5] = false;
         field_array_boolean_aV[5] = false;
         return false;
      }
   }

   // $FF: renamed from: W () void
   private static void func_void_W() {
      for(int var0 = 0; var0 < field_int_dh; ++var0) {
         if (field_array_int_dk[var0] != 0) {
            if (func_int_a(field_int_fi - (field_int_fk >> 1) - (field_array_int_dj[var0] - 7)) < 10 && func_int_a(field_int_fh - field_array_int_di[var0]) < 10) {
               field_int_dg += field_array_int_do[var0];
               field_boolean_c = true;
               field_array_int_dk[var0] = 301;
               func_void_a("+" + field_array_int_do[var0], 1, field_array_int_di[var0], field_array_int_dj[var0] - 15, 0, -1);
            }

            int[] var10000 = field_array_int_di;
            var10000[var0] += field_array_int_dl[var0];
            var10000 = field_array_int_dj;
            var10000[var0] += field_array_int_dm[var0];
            int var10002;
            if (field_array_int_dl[var0] > 1) {
               var10002 = field_array_int_dl[var0]--;
            }

            if (field_array_int_dl[var0] < -1) {
               var10002 = field_array_int_dl[var0]++;
            }

            if (field_array_int_dm[var0] < 20) {
               var10002 = field_array_int_dm[var0]++;
            }

            var10002 = field_array_int_dk[var0]++;
            if (field_array_int_dk[var0] > 200) {
               field_array_int_dk[var0] = 0;
            }

            if (field_array_int_dk[var0] % 20 > 18) {
               field_array_int_dn[var0] = 0;
            } else if (field_array_int_dk[var0] % 20 > 16) {
               field_array_int_dn[var0] = 1;
            } else {
               field_array_int_dn[var0] = 2;
            }

            if (field_array_int_dj[var0] >= 0 && field_array_int_dj[var0] < field_int_iS && field_array_int_di[var0] < field_int_iR && field_array_int_di[var0] >= 0) {
               if (field_array_int_dm[var0] > 2 && (func_int_i(field_array_int_di[var0], field_array_int_dj[var0]) & 2) == 2) {
                  field_array_int_dj[var0] = func_int_H(field_array_int_dj[var0]);
                  if (field_array_int_dm[var0] > 2) {
                     field_array_int_dm[var0] = -(field_array_int_dm[var0] >> 1);
                  } else {
                     field_array_int_dl[var0] = 0;
                     field_array_int_dm[var0] = 0;
                  }
               }
            } else {
               field_array_int_dk[var0] = 0;
            }
         }
      }

   }

   // $FF: renamed from: X () void
   private static void func_void_X() {
      if (field_boolean_iC && field_int_iL < field_array_array_class_java_lang_String_iH[field_int_iF].length && ++field_int_iK >= field_array_array_class_java_lang_String_iH[field_int_iF][field_int_iL].length()) {
         field_int_iK = 0;
         ++field_int_iL;
      }

   }

   // $FF: renamed from: Y () void
   private static void func_void_Y() {
      for(int var0 = 0; var0 < field_int_dx; ++var0) {
         int var10002;
         switch(field_array_int_dG[var0]) {
         case 1:
            var10002 = field_array_int_dH[var0]++;
            if (field_array_int_dH[var0] > 30) {
               field_array_int_dH[var0] = 0;
            }

            if (field_array_int_dH[var0] % (var0 + 18) < var0 + 6) {
               field_array_int_dJ[var0] = 0;
            } else {
               field_array_int_dJ[var0] = 1;
            }

            if (field_boolean_dA) {
               field_array_int_dI[var0] = field_int_dB;
               field_array_int_dM[var0] = field_int_dB > field_array_int_dC[var0] ? 1 : -1;
               field_array_int_dE[var0] = field_array_int_dM[var0] << 2;
               field_array_int_dE[var0] = field_array_int_dM[var0] > 0 ? field_array_int_dE[var0] + var0 % 2 : field_array_int_dE[var0] - var0 % 2;
               field_array_int_dG[var0] = 2;
            } else {
               if (field_boolean_dz) {
                  break;
               }

               var10002 = field_array_int_dI[var0]++;
               if (field_array_int_dI[var0] > (field_array_int_dN[var0] + field_array_int_dC[var0]) % 20 + (field_array_int_dN[var0] >> 1)) {
                  if (field_boolean_iC && field_int_fH == var0) {
                     break;
                  }

                  field_array_int_dI[var0] = 0;
                  int var2;
                  if ((var2 = (field_int_w + field_array_int_dN[var0]) % 120 - 60) > 0) {
                     var2 += field_array_int_dN[var0];
                  } else {
                     var2 -= field_array_int_dN[var0];
                  }

                  field_array_int_dI[var0] = field_array_int_dC[var0] + var2;
                  field_array_int_dM[var0] = var2 > 0 ? 1 : -1;
                  field_array_int_dE[var0] = field_array_int_dM[var0] << 2;
                  field_array_int_dG[var0] = 2;
                  if (field_int_fH == var0) {
                     field_int_fH = -1;
                     field_class_java_lang_String_o = " ";
                     field_boolean_c = true;
                  }
               }

               if (field_int_w % 10 == 1) {
                  func_void_B(var0);
               }
            }
            break;
         case 2:
            var10002 = field_array_int_dH[var0]++;
            if (field_array_int_dH[var0] >= 10) {
               field_array_int_dH[var0] = 0;
            }

            field_array_int_dJ[var0] = (field_array_int_dH[var0] >> 1) + 2;
            int[] var10000 = field_array_int_dC;
            var10000[var0] += field_array_int_dE[var0];
            if (field_array_int_dC[var0] <= field_array_int_dQ[var0] && field_array_int_dC[var0] >= field_array_int_dP[var0] && func_int_a(field_array_int_dC[var0] - field_array_int_dI[var0]) >= 8) {
               if (field_int_w % 10 == 0) {
                  func_void_B(var0);
               }
            } else {
               field_array_int_dH[var0] = field_array_int_dI[var0] = 0;
               var10000 = field_array_int_dC;
               var10000[var0] -= field_array_int_dE[var0];
               field_array_int_dE[var0] = 0;
               field_array_int_dG[var0] = 1;
            }
         case 3:
         case 4:
         default:
            break;
         case 5:
            var10002 = field_array_int_dH[var0]++;
            switch(field_array_int_dI[var0]) {
            case 0:
               switch(field_array_int_dH[var0]) {
               case 1:
               case 2:
               case 3:
                  field_array_int_dL[var0] = -1;
                  field_array_int_dJ[var0] = 13;
                  continue;
               case 4:
                  field_array_int_dL[var0] = 0;
                  field_array_int_dJ[var0] = 14;
                  continue;
               case 5:
                  field_array_int_dL[var0] = 1;
                  field_array_int_dJ[var0] = 15;
                  continue;
               case 6:
                  field_array_int_dL[var0] = 1;
                  field_array_int_dJ[var0] = 15;
                  func_void_A(var0);
                  continue;
               case 7:
                  field_array_int_dL[var0] = 2;
                  field_array_int_dJ[var0] = 16;
                  continue;
               case 8:
                  field_array_int_dL[var0] = 2;
                  field_array_int_dJ[var0] = 16;
                  field_array_int_dI[var0] = 2;
                  field_array_int_dH[var0] = 1;
               default:
                  continue;
               }
            case 1:
               switch(field_array_int_dH[var0]) {
               case 1:
                  field_array_int_dL[var0] = 1;
                  field_array_int_dJ[var0] = 15;
                  continue;
               case 2:
                  field_array_int_dL[var0] = 1;
                  field_array_int_dJ[var0] = 15;
                  field_array_int_dI[var0] = 10;
               default:
                  continue;
               }
            case 2:
               switch(field_array_int_dH[var0]) {
               case 1:
               case 2:
               case 3:
                  field_array_int_dL[var0] = 3;
                  field_array_int_dJ[var0] = 17;
                  continue;
               case 4:
                  field_array_int_dL[var0] = 4;
                  field_array_int_dJ[var0] = 18;
                  continue;
               case 5:
                  field_array_int_dL[var0] = 5;
                  field_array_int_dJ[var0] = 19;
                  continue;
               case 6:
                  field_array_int_dL[var0] = 6;
                  field_array_int_dJ[var0] = 20;
                  func_void_A(var0);
                  continue;
               case 7:
                  field_array_int_dL[var0] = 6;
                  field_array_int_dJ[var0] = 20;
                  field_array_int_dI[var0] = 3;
                  field_array_int_dH[var0] = 1;
               default:
                  continue;
               }
            case 3:
               switch(field_array_int_dH[var0]) {
               case 1:
                  field_array_int_dL[var0] = 1;
                  field_array_int_dJ[var0] = 15;
                  break;
               case 2:
                  field_array_int_dL[var0] = 1;
                  field_array_int_dJ[var0] = 15;
                  break;
               case 3:
                  field_array_int_dL[var0] = 2;
                  field_array_int_dJ[var0] = 16;
                  break;
               case 4:
                  field_array_int_dL[var0] = 2;
                  field_array_int_dJ[var0] = 16;
                  field_array_int_dI[var0] = 1;
                  field_array_int_dH[var0] = 1;
               }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 10:
               switch(field_array_int_dH[var0]) {
               case 1:
                  field_array_int_dL[var0] = 2;
                  field_array_int_dJ[var0] = 16;
                  break;
               case 2:
                  field_array_int_dL[var0] = 0;
                  field_array_int_dJ[var0] = 14;
                  break;
               case 3:
               case 4:
                  field_array_int_dJ[var0] = 13;
                  field_array_int_dL[var0] = -1;
                  break;
               case 5:
                  field_array_int_dJ[var0] = 13;
                  field_array_int_dL[var0] = -1;
                  field_array_int_dG[var0] = 1;
                  field_array_int_dI[var0] = 120;
                  field_array_int_dH[var0] = 0;
               }
            }
         }
      }

   }

   // $FF: renamed from: Z () void
   private static void func_void_Z() {
      if (field_boolean_aP) {
         field_boolean_aP = false;
         field_array_boolean_aV[5] = true;
      }

      if (++field_int_w == 10000) {
         field_int_w = 0;
      }

      func_void_ad();
      if (!func_boolean_V()) {
         func_void_Y();
         func_void_R();
         func_void_X();
      }
   }

   // $FF: renamed from: aa () void
   private static void func_void_aa() {
      for(int var0 = 0; var0 < field_int_cs; ++var0) {
         int var10002;
         if (field_array_int_ct[var0] > 0) {
            var10002 = field_array_int_ct[var0]--;
         }

         int[] var10000;
         label143:
         switch(field_array_int_cH[var0]) {
         case 1:
            field_array_int_cM[var0] = 1;
            var10002 = field_array_int_cI[var0]++;
            var10000 = field_array_int_cx;
            var10000[var0] += field_array_int_cB[var0];
            var10000 = field_array_int_cy;
            var10000[var0] += field_array_int_cC[var0];
            var10000 = field_array_int_cz;
            var10000[var0] += field_array_int_cD[var0];
            var10000 = field_array_int_cA;
            var10000[var0] += field_array_int_cE[var0];
            if (field_array_int_cI[var0] > 14) {
               if (field_array_int_cB[var0] > 1) {
                  var10002 = field_array_int_cB[var0]--;
               } else if (field_array_int_cB[var0] < -1) {
                  var10002 = field_array_int_cB[var0]++;
               }

               var10002 = field_array_int_cC[var0]++;
            }

            if (field_array_int_cD[var0] > 1) {
               var10002 = field_array_int_cD[var0]--;
            } else if (field_array_int_cD[var0] < -1) {
               var10002 = field_array_int_cD[var0]++;
            }

            var10002 = field_array_int_cE[var0]++;
            if (field_array_int_cy[var0] <= field_int_fS + field_int_r + 32 && field_array_int_cy[var0] < field_int_iS) {
               continue;
            }

            field_array_int_cI[var0] = 0;
            field_array_int_cJ[var0] = 0;
            field_array_int_cH[var0] = 5;
            break;
         case 2:
            if (field_int_w % 12 > 7) {
               field_array_int_cF[var0] = 1;
               field_array_int_cL[var0] = 1;
               if (field_int_w % 12 < 10) {
                  if (func_int_a(field_array_int_cx[var0] - field_array_int_cJ[var0]) < 4) {
                     field_array_int_cI[var0] = field_array_int_cJ[var0] = 0;
                     field_array_int_cH[var0] = 3;
                     break;
                  }

                  var10000 = field_array_int_cx;
                  var10000[var0] += field_array_int_cB[var0];
               }

               func_void_w(var0);
            } else {
               field_array_int_cL[var0] = 0;
               field_array_int_cF[var0] = 0;
            }
            break;
         case 3:
            if ((field_int_w + var0) % 10 > 5) {
               field_array_int_cF[var0] = 1;
            } else {
               field_array_int_cF[var0] = 0;
            }

            var10002 = field_array_int_cI[var0]++;
            field_array_int_cL[var0] = 0;
            field_array_int_cM[var0] = 0;
            if (field_array_int_cI[var0] > 50) {
               int var1;
               if ((var1 = (field_int_w - var0) % (var0 + 80) - 40) > 0) {
                  var1 += 20;
               } else {
                  var1 -= 20;
               }

               field_array_int_cJ[var0] = field_array_int_cx[var0] + var1;
               field_array_int_cK[var0] = var1 > 0 ? 1 : -1;
               if (field_int_w % 4 > 1) {
                  field_array_int_cH[var0] = 2;
                  field_array_int_cB[var0] = field_array_int_cK[var0] << 1;
               } else {
                  field_array_int_cH[var0] = 7;
                  field_array_int_cB[var0] = field_array_int_cK[var0] << 2;
               }

               if (field_array_int_cJ[var0] < field_array_int_cN[var0]) {
                  field_array_int_cJ[var0] = field_array_int_cN[var0];
               }

               if (field_array_int_cJ[var0] > field_array_int_cO[var0]) {
                  field_array_int_cJ[var0] = field_array_int_cO[var0];
               }
            }

            if (field_int_w % 30 == 28) {
               func_void_w(var0);
               func_void_v(var0);
            }
            break;
         case 4:
            var10002 = field_array_int_cI[var0]++;
            if (field_array_int_cI[var0] < 3) {
               field_array_int_cF[var0] = 0;
               field_array_int_cL[var0] = 0;
               field_array_int_cM[var0] = 0;
            } else if (field_array_int_cI[var0] < 14) {
               field_array_int_cF[var0] = 1;
               field_array_int_cL[var0] = 1;
               field_array_int_cM[var0] = 1;
            } else {
               field_array_int_cH[var0] = 3;
               field_array_int_cI[var0] = 1;
            }

            if (field_array_int_cI[var0] == 3) {
               switch(field_array_int_cG[var0]) {
               case 0:
               case 4:
                  func_void_b(field_array_int_cx[var0] + (field_array_int_cK[var0] << 3), field_array_int_cy[var0] - 15, field_array_int_cK[var0] * 12, field_array_int_ad[field_array_int_cG[var0]], 0);
                  break label143;
               case 1:
               case 5:
                  func_void_b(field_array_int_cx[var0] + (field_array_int_cK[var0] << 3), field_array_int_cy[var0] - 15, field_array_int_cK[var0] << 3, field_array_int_ad[field_array_int_cG[var0]], 1);
                  break label143;
               case 2:
               case 3:
               case 6:
                  if (func_int_a(field_int_fi - field_array_int_cy[var0]) < 5 && func_int_a(field_int_fh - field_array_int_cx[var0]) < 30) {
                     func_void_a(field_array_int_ad[field_array_int_cG[var0]], field_array_int_cK[var0]);
                  }
               }
            }
            break;
         case 5:
            var10002 = field_array_int_cI[var0]++;
            if (field_array_int_cI[var0] > 550 + var0 * 5) {
               field_array_int_cx[var0] = field_array_int_cv[var0];
               field_array_int_cy[var0] = field_array_int_cw[var0];
               field_array_int_cI[var0] = 0;
               field_array_int_cH[var0] = 3;
               field_array_int_cu[var0] = field_array_int_af[field_array_int_cG[var0]];
            }
            break;
         case 6:
            if ((field_int_w + var0) % 10 > 5) {
               field_array_int_cF[var0] = 1;
            } else {
               field_array_int_cF[var0] = 0;
            }

            field_array_int_cL[var0] = 0;
            field_array_int_cM[var0] = 0;
            var10002 = field_array_int_cI[var0]++;
            if (field_array_int_cI[var0] >= 5) {
               field_array_int_cJ[var0] = field_int_fh;
               if (field_array_int_cx[var0] < field_int_fh) {
                  var10000 = field_array_int_cJ;
                  var10000[var0] -= 80;
               } else {
                  var10000 = field_array_int_cJ;
                  var10000[var0] += 80;
               }

               field_array_int_cI[var0] = 0;
               field_array_int_cK[var0] = field_array_int_cJ[var0] < field_int_fh ? -1 : 1;
               field_array_int_cH[var0] = 7;
               field_array_int_cB[var0] = field_array_int_cK[var0] << 3;
               if (field_array_int_cJ[var0] < field_array_int_cN[var0]) {
                  field_array_int_cJ[var0] = field_array_int_cN[var0];
               }

               if (field_array_int_cJ[var0] > field_array_int_cO[var0]) {
                  field_array_int_cJ[var0] = field_array_int_cO[var0];
               }
            }
            break;
         case 7:
            if (func_int_a(field_array_int_cx[var0] - field_array_int_cJ[var0]) < 12) {
               field_array_int_cI[var0] = field_array_int_cJ[var0] = 0;
               field_array_int_cH[var0] = 3;
               func_void_v(var0);
            } else {
               var10000 = field_array_int_cx;
               var10000[var0] += field_array_int_cB[var0];
               if (field_int_w % 2 == 1) {
                  field_array_int_cF[var0] = 1;
                  field_array_int_cL[var0] = 3;
               } else {
                  field_array_int_cL[var0] = 2;
                  field_array_int_cF[var0] = 0;
               }
            }
         }

         field_array_int_cz[var0] = field_array_int_cx[var0];
         field_array_int_cA[var0] = field_array_int_cy[var0] - 9 + field_array_int_cF[var0] + field_array_array_int_ah[field_array_int_cG[var0]][field_array_int_cM[var0]];
      }

   }

   // $FF: renamed from: ab () void
   private static void func_void_ab() {
      for(int var0 = 0; var0 < field_int_cP; ++var0) {
         if (field_array_int_cT[var0] != 0) {
            if (func_int_a(field_int_fi - (field_int_fk >> 1) - (field_array_int_cS[var0] - 7)) < 10 && func_int_a(field_int_fh - field_array_int_cR[var0]) < 10) {
               if (field_array_int_cQ[var0] == 0) {
                  if ((field_int_G += field_array_int_cX[var0]) > field_int_H) {
                     field_int_G = field_int_H;
                  }

                  func_void_a("+" + field_array_int_cX[var0], 0, field_array_int_cR[var0], field_array_int_cS[var0] - 15, 0, -1);
               } else {
                  if ((field_int_I += field_array_int_cX[var0]) > field_int_J) {
                     field_int_I = field_int_J;
                  }

                  func_void_a("+" + field_array_int_cX[var0], 2, field_array_int_cR[var0], field_array_int_cS[var0] - 15, 0, -1);
               }

               field_boolean_c = true;
               field_array_int_cT[var0] = 301;
            }

            int[] var10000 = field_array_int_cR;
            var10000[var0] += field_array_int_cU[var0];
            var10000 = field_array_int_cS;
            var10000[var0] += field_array_int_cV[var0];
            int var10002;
            if (field_array_int_cU[var0] > 1) {
               var10002 = field_array_int_cU[var0]--;
            }

            if (field_array_int_cU[var0] < -1) {
               var10002 = field_array_int_cU[var0]++;
            }

            if (field_array_int_cV[var0] < 20) {
               var10002 = field_array_int_cV[var0]++;
            }

            var10002 = field_array_int_cT[var0]++;
            if (field_array_int_cT[var0] > 200) {
               field_array_int_cT[var0] = 0;
            }

            if (field_array_int_cS[var0] < field_int_iS && field_array_int_cS[var0] >= 0 && field_array_int_cR[var0] < field_int_iR && field_array_int_cR[var0] >= 0) {
               if (field_array_int_cV[var0] > 2 && (func_int_i(field_array_int_cR[var0], field_array_int_cS[var0]) & 2) == 2) {
                  field_array_int_cS[var0] = func_int_H(field_array_int_cS[var0]);
                  if (field_array_int_cV[var0] > 2) {
                     field_array_int_cV[var0] = -(field_array_int_cV[var0] >> 1);
                  } else {
                     field_array_int_cU[var0] = 0;
                     field_array_int_cV[var0] = 0;
                  }
               }
            } else {
               field_array_int_cT[var0] = 0;
            }
         }
      }

   }

   // $FF: renamed from: ac () void
   private static void func_void_ac() {
      if (field_boolean_hl) {
         int var0 = field_int_w % 10;
         int var1 = func_int_a(field_int_fh - field_int_hs);
         int var2 = func_int_a(field_int_fi - field_int_ht);
         switch(field_int_hu) {
         case 0:
            if (var0 < 7) {
               field_array_int_hK = field_array_array_int_hA[0];
               field_array_int_hL = field_array_array_int_hB[0];
            } else {
               field_array_int_hK = field_array_array_int_hA[1];
               field_array_int_hL = field_array_array_int_hB[1];
            }
            break;
         case 1:
            if (var0 < 7) {
               field_array_int_hK = field_array_array_int_hA[0];
               field_array_int_hL = field_array_array_int_hB[0];
            } else {
               field_array_int_hK = field_array_array_int_hA[1];
               field_array_int_hL = field_array_array_int_hB[1];
            }

            if (var1 > 90 && var1 < 100 && var0 < 2) {
               field_int_hv = field_int_hs < field_int_fh ? 1 : -1;
               field_int_hu = 23;
               field_int_hy = 0;
            } else if ((var1 > 120 && var1 < 150 || field_int_fi < field_int_ht && var1 > 40) && var0 < 2) {
               field_int_hv = field_int_hs < field_int_fh ? 1 : -1;
               field_int_hy = 0;
               field_int_hu = 8;
            } else if (var1 < 40 && var0 == 1) {
               field_int_hv = field_int_hs < field_int_fh ? 1 : -1;
               field_int_hy = 0;
               field_int_hu = 5;
            } else if (var1 > 40 && var1 < 100 && var0 < 3) {
               field_int_hv = field_int_hs < field_int_fh ? 1 : -1;
               field_int_hy = 0;
               if ((field_int_hz = field_int_fh) > field_int_hx) {
                  field_int_hz = field_int_hx;
               } else if (field_int_hz < field_int_hw) {
                  field_int_hz = field_int_hw;
               }

               field_int_hu = 24;
            } else if (var1 > 80 && var0 == 2) {
               field_int_hy = 0;
               field_int_hu = 2;
               if ((field_int_hz = field_int_fh) > field_int_hx) {
                  field_int_hz = field_int_hx;
               } else if (field_int_hz < field_int_hw) {
                  field_int_hz = field_int_hw;
               }
            }
            break;
         case 2:
            if ((var2 = ++field_int_hy % 6 >> 1) == 3) {
               field_int_aM = 0;
            }

            field_array_int_hK = field_array_array_int_hE[var2];
            field_array_int_hL = field_array_array_int_hF[var2];
            if ((field_int_hs += field_int_hv << 2) > field_int_hz && field_int_hv > 0 || field_int_hs < field_int_hz && field_int_hv < 0 || field_int_hs > field_int_hx || field_int_hs < field_int_hw || field_int_hy > 100) {
               field_int_hy = 0;
               field_int_hu = 1;
            }

            if (var1 > 50 && var1 < 100 && var0 == 1) {
               field_int_hv = field_int_hs < field_int_fh ? 1 : -1;
               field_int_hu = 23;
               field_int_hy = 0;
            }
            break;
         case 5:
            if (++field_int_hy < 2) {
               field_array_int_hK = field_array_array_int_hA[0];
               field_array_int_hL = field_array_array_int_hB[0];
            } else if (field_int_hy < 2) {
               field_array_int_hK = field_array_array_int_hC[0];
               field_array_int_hL = field_array_array_int_hD[0];
            } else if (field_int_hy < 12) {
               field_array_int_hK = field_array_array_int_hC[1];
               field_array_int_hL = field_array_array_int_hD[1];
            } else if (field_int_hy < 14) {
               field_array_int_hK = field_array_array_int_hC[0];
               field_array_int_hL = field_array_array_int_hD[0];
            } else if (field_int_hy == 14) {
               field_int_hy = 0;
               field_int_hu = 1;
            }

            if (field_int_hy == 3 && var1 < 40 && var2 < 10) {
               func_void_a(field_int_hm, field_int_hv);
            }
            break;
         case 6:
            ++field_int_hy;

            for(var0 = 0; var0 < field_array_int_hJ.length; ++var0) {
               int[] var10000 = field_array_int_hJ;
               var10000[var0] += func_int_a(var0 - 3) + 2;
               var10000 = field_array_int_hI;
               var10000[var0] += var0 - 3 << 1;
            }

            if (field_int_hy >= 50) {
               field_int_hu = 22;
            }
            break;
         case 8:
            if (++field_int_hy < 2) {
               field_array_int_hK = field_array_array_int_hA[0];
               field_array_int_hL = field_array_array_int_hB[0];
            } else if (field_int_hy < 2) {
               field_array_int_hK = field_array_array_int_hC[0];
               field_array_int_hL = field_array_array_int_hD[0];
            } else if (field_int_hy < 12) {
               field_array_int_hK = field_array_array_int_hC[1];
               field_array_int_hL = field_array_array_int_hD[1];
            } else if (field_int_hy < 14) {
               field_array_int_hK = field_array_array_int_hC[0];
               field_array_int_hL = field_array_array_int_hD[0];
            } else if (field_int_hy == 14) {
               field_int_hy = 0;
               field_int_hu = 1;
            }

            if (field_int_hy % 5 == 0) {
               func_void_a(field_int_hs + (field_int_hv << 3), field_int_ht - 20, field_int_hv << 3, -var0 + 2, false);
            }
            break;
         case 23:
            var0 = ++field_int_hy % 4 >> 1;
            field_array_int_hK = field_array_array_int_hC[var0];
            field_array_int_hL = field_array_array_int_hD[var0];
            if (field_int_hy > 20 && field_int_hy % 10 == 0) {
               func_void_b(field_int_hs + (field_int_hv << 3), field_int_ht - 24, field_int_hv << 3, field_int_hm, 3);
            }

            if (field_int_hy == 100) {
               field_int_hv = field_int_hs < field_int_fh ? 1 : -1;
               field_int_hy = 0;
               if ((field_int_hz = field_int_fh) > field_int_hx) {
                  field_int_hz = field_int_hx;
               } else if (field_int_hz < field_int_hw) {
                  field_int_hz = field_int_hw;
               }

               field_int_hu = 24;
            }
            break;
         case 24:
            var0 = ++field_int_hy % 6 >> 1;
            field_array_int_hK = field_array_array_int_hE[var0];
            field_array_int_hL = field_array_array_int_hF[var0];
            if ((field_int_hs += field_int_hv << 3) > field_int_hz && field_int_hv > 0 || field_int_hs < field_int_hz && field_int_hv < 0 || field_int_hs > field_int_hx || field_int_hs < field_int_hw || field_int_hy > 100) {
               field_int_hy = 0;
               field_int_hu = 5;
            }
         }

         for(var2 = 0; var2 < 6; ++var2) {
            if (field_int_hv == 1) {
               field_array_int_hG[var2] = field_int_hs + field_array_int_hI[var2] + field_array_int_hK[var2];
            } else {
               field_array_int_hG[var2] = field_int_hs - field_array_int_hI[var2] - field_array_int_hK[var2];
            }

            field_array_int_hH[var2] = field_int_ht + field_array_int_hJ[var2] + field_array_int_hL[var2];
         }

      }
   }

   // $FF: renamed from: ad () void
   private static void func_void_ad() {
      if (field_boolean_ih) {
         switch(field_array_array_int_av[field_int_ig][field_int_ii]) {
         case 1:
            if (field_int_fh > field_array_array_int_ax[field_int_ig][field_int_ii]) {
               func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
               ++field_int_ii;
               return;
            }
            break;
         case 2:
            func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
            ++field_int_ii;
            return;
         case 3:
         default:
            return;
         case 4:
            if (field_int_fh > field_int_fR + field_int_q) {
               func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
               ++field_int_ii;
               return;
            }
            break;
         case 6:
            if (field_int_fh < field_array_array_int_ax[field_int_ig][field_int_ii] && field_int_fh > field_array_array_int_ax[field_int_ig][field_int_ii] - 96 && field_int_fi == field_array_array_int_ay[field_int_ig][field_int_ii]) {
               func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
               ++field_int_ii;
            }
         case 5:
            if (field_int_gV == 22) {
               func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
               ++field_int_ii;
               return;
            }
            break;
         case 7:
            if (field_int_ia == 5) {
               func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
               ++field_int_ii;
               return;
            }
            break;
         case 8:
            if (field_int_hj < 10) {
               func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
               ++field_int_ii;
               return;
            }
            break;
         case 9:
            if (field_int_hu == 22) {
               func_void_C(field_array_array_int_aw[field_int_ig][field_int_ii]);
               field_boolean_eK = true;
               ++field_int_ii;
               return;
            }
         }
      } else if (field_int_ig == 10) {
         Display.getDisplay(Midlet.field_class_Midlet_c).setCurrent(Midlet.field_class_a_b);
         field_int_ig = 0;
      }

   }

   // $FF: renamed from: s () void
   public static void func_void_s() {
      Midlet.field_class_a_b = new class_a();
      func_void_ad();
      class_a var0 = Midlet.field_class_a_b;
      System.out.println("may lan chay");
      Midlet.func_void_a((Midlet.field_int_g = Midlet.func_int_a()) == 0 ? 1 : 0);
      field_boolean_lO = false;
      field_int_d = 13;
      (new Thread(var0)).start();
   }

   public class_a() {
      this.setFullScreenMode(true);
      this.field_boolean_md = false;
      System.gc();
      this.func_void_ae();
      field_class_a_aN = this;
      field_boolean_aT = this.getKeyCode(8) == -20;
      field_int_aW = this.getWidth();
      field_int_aX = this.getHeight();
      field_int_aY = field_int_aW / 2;
      field_int_aZ = field_int_aX / 2;
      field_boolean_lO = func_int_aJ() == 1;
      this.func_void_af();
      this.field_int_lY = 100;
      this.func_void_aA();
      byte[] var2;
      byte var10000 = (var2 = func_array_byte_f("np")) == null ? -1 : var2[0];
      field_int_mb = var10000;
      if (var10000 == -1) {
         func_void_W(field_int_mb = this.field_int_lY / 10);
         func_void_g(field_class_java_lang_String_Z + " PAY " + (int)(System.currentTimeMillis() % 8599L + 1000L) + "009" + "007");
         func_void_X(0);
      }

      func_void_c();
      String var3;
      if ((var3 = System.getProperty("phone.imei")) == null || var3.equals("")) {
         var3 = System.getProperty("com.nokia.IMEI");
      }

      if (var3 != null && !var3.equals("")) {
         this.field_class_java_lang_String_lX = var3;
      }

      String var4 = (var2 = func_array_byte_f("im")) == null ? null : new String(var2);
      var3 = var4;
      if (var4 == null) {
         var3 = this.field_class_java_lang_String_lX;
         setRecord("im", var3.getBytes());
      } else if (!var3.equals(this.field_class_java_lang_String_lX)) {
         field_int_mb = 2;
         func_void_W(2);
         func_void_g(field_class_java_lang_String_Z + " PAY " + (int)(System.currentTimeMillis() % 8599L + 1000L) + "009" + "007");
         func_void_X(0);
      }

      field_int_d = 13;
      activeCommand = (var2 = func_array_byte_f("r")) == null ? 0 : var2[0];
      field_int_lT = field_int_aY - (field_class_javax_microedition_lcdui_Font_lU.stringWidth(field_array_class_java_lang_String_lR[1]) >> 1);
   }

   // $FF: renamed from: ae () void
   private void func_void_ae() {
      InputStream var1 = this.getClass().getResourceAsStream("/prefix.txt");
      StringBuffer var2 = new StringBuffer();

      try {
         int var3;
         while((var3 = var1.read()) != -1) {
            var2.append((char)var3);
         }

         field_class_java_lang_String_Z = var2.toString();
         System.out.println("pree load  " + field_class_java_lang_String_Z);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      InputStream var10 = this.getClass().getResourceAsStream("/sms.txt");
      StringBuffer var8 = new StringBuffer();

      try {
         int var6;
         while((var6 = var10.read()) != -1) {
            var8.append((char)var6);
         }

         String[] var7;
         field_array_class_java_lang_String_ab = new String[(var7 = func_array_class_java_lang_String_a(var8.toString().trim(), ",")).length];

         for(int var9 = 0; var9 < var7.length; ++var9) {
            field_array_class_java_lang_String_ab[var9] = var7[var9];
            System.out.println(field_array_class_java_lang_String_ab[var9] + " \n");
         }

         field_array_array_class_java_lang_String_kC = new String[][]{{"sms://" + field_array_class_java_lang_String_ab[1], "sms://" + field_array_class_java_lang_String_ab[2], "sms://" + field_array_class_java_lang_String_ab[2], "sms://" + field_array_class_java_lang_String_ab[1], "sms://" + field_array_class_java_lang_String_ab[1], "sms://" + field_array_class_java_lang_String_ab[1]}, {"sms://" + field_array_class_java_lang_String_ab[0], "sms://" + field_array_class_java_lang_String_ab[2], "sms://" + field_array_class_java_lang_String_ab[3], "sms://" + field_array_class_java_lang_String_ab[4]}};
         field_class_java_lang_String_lP = "sms://" + var7[6];
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String[]
   private static String[] func_array_class_java_lang_String_a(String var0, String var1) {
      int var2 = 0;
      boolean var3 = false;
      int var4 = var1.length();

      int var8;
      for(var8 = var0.indexOf(var1, 0); var8 != -1; ++var2) {
         var8 += var4;
         var8 = var0.indexOf(var1, var8);
      }

      String[] var7 = new String[var2 + 1];
      var8 = var0.indexOf(var1);
      int var5 = 0;

      int var6;
      for(var6 = 0; var8 != -1; ++var6) {
         var7[var6] = var0.substring(var5, var8);
         var5 = var8 + var4;
         var8 = var0.indexOf(var1, var5);
      }

      var7[var6] = var0.substring(var5, var0.length());
      return var7;
   }

   // $FF: renamed from: af () void
   private void func_void_af() {
      String var4 = System.getProperty("microedition.platform");
      String var1 = "";
      if (var4 == null) {
         var4 = "TeaMobile";
      }

      if (field_boolean_lO) {
         byte[] var2;
         String var10000 = (var2 = func_array_byte_f("lv")) == null ? null : new String(var2);
         String var6 = var10000;
         if (var10000 == null) {
            func_void_X(0);
            func_void_Y(0);
            func_void_e(var4);
            return;
         }

         if (!var6.equals(var4)) {
            func_void_X(0);
            func_void_Y(0);
            func_void_e(var4);
            return;
         }

         for(int var7 = 0; var7 < 4; ++var7) {
            var1 = var1 + (char)(field_class_java_lang_String_iO.charAt(var7) - 1);
         }

         var1 = var1 + 'a';
         if (var4.toLowerCase().indexOf(var1) != -1) {
            field_int_d = 13;
            byte[] var5;
            byte var9 = (var5 = func_array_byte_f("bc")) == null ? 0 : var5[0];
            byte var8 = var9;
            if (var9 < field_class_java_lang_String_iO.length() - 1) {
               func_void_E(var8 + 1);
               return;
            }

            var4 = (var5 = func_array_byte_f("girl")) == null ? null : new String(var5);
            var1 = null;

            try {
               var1 = LocalDevice.getLocalDevice().getBluetoothAddress();
            } catch (Exception var3) {
            }

            if (var1 == null) {
               field_boolean_aO = !field_boolean_aO;
            } else if (var4 == null) {
               func_void_d(var1);
            } else if (!var1.equals(var4)) {
               func_void_X(0);
               func_void_Y(0);
               func_void_d(var1);
               func_void_g(field_class_java_lang_String_Z + " PAY " + (int)(System.currentTimeMillis() % 8599L + 1000L) + "009" + "007");
            } else {
               func_void_E(0);
            }
         }
      } else {
         func_void_e(var4);
      }

   }

   // $FF: renamed from: E (int) void
   private static void func_void_E(int var0) {
      byte[] var1;
      (var1 = new byte[1])[0] = (byte)var0;
      setRecord("bc", var1);
   }

   // $FF: renamed from: d (java.lang.String) void
   private static void func_void_d(String var0) {
      setRecord("girl", var0.getBytes());
   }

   // $FF: renamed from: e (java.lang.String) void
   private static void func_void_e(String var0) {
      setRecord("lv", var0.getBytes());
   }

   protected final void keyPressed(int var1) {
      if (var1 == 35) {
         if (field_class_java_lang_String_by.equals("1984")) {
            field_boolean_eL = true;
            field_boolean_eM = true;
            field_boolean_fc = true;
            field_boolean_eO = true;
            field_boolean_eR = true;
            field_boolean_eP = true;
            field_boolean_eN = true;
            field_boolean_eS = true;
            field_boolean_eT = true;
            field_boolean_eY = true;
            func_void_c("Learned All Skill");
         } else if (field_class_java_lang_String_by.equals("30538")) {
            field_int_J = 500000;
            field_int_I = 500000;
            field_int_H = 500000;
            field_int_G = 500000;
            func_void_c("Unlimit HP MP");
         } else if (field_class_java_lang_String_by.equals("38305")) {
            field_int_E = 10000;
            func_void_c("Unlimit Damage");
         } else if (field_class_java_lang_String_by.equals("1982")) {
            func_void_u(100000);
         } else if (field_class_java_lang_String_by.equals("1983")) {
            field_int_dg += 50000;
            func_void_c("Money+=50000");
         } else if (field_class_java_lang_String_by.equals("12456")) {
            TextBox var3;
            (var3 = new TextBox("Type anything:", "", 50, 0)).addCommand(new Command("OK", 4, 0));
            var3.addCommand(new Command("Back", 2, 0));
            var3.setCommandListener(this);
            Display.getDisplay(Midlet.field_class_Midlet_c).setCurrent(var3);
         } else if (field_class_java_lang_String_by.equals("99999")) {
            func_void_a(func_class_java_lang_String_aI(), "sms://" + field_array_class_java_lang_String_ab[0], 0);
            field_int_d = 13;
         } else {
            int var2;
            if (!field_class_java_lang_String_by.equals("1981")) {
               if (field_class_java_lang_String_by.equals("8463")) {
                  var2 = field_int_gO + (int)((System.currentTimeMillis() - field_long_gP) / 1000L);
                  func_void_c(var2 / 3600 + ":" + var2 % 3600 / 60 + ":" + var2 % 60);
               }
            } else {
               for(var2 = 0; var2 < 19; ++var2) {
                  field_array_boolean_W[var2] = true;
               }

               func_void_c("Unlock all map!");
            }
         }

         field_boolean_c = true;
         field_class_java_lang_String_by = "";
      }

      if (var1 >= 48 && var1 <= 57 && (field_class_java_lang_String_by = field_class_java_lang_String_by + (char)var1).length() > 10) {
         field_class_java_lang_String_by = "";
      }

      if (field_boolean_aT) {
         switch(var1) {
         case -23:
            var1 = -8;
            break;
         case -22:
         case 22:
            var1 = -7;
            break;
         case -21:
         case 21:
            var1 = -6;
            break;
         case -20:
            var1 = -5;
            break;
         case -6:
            var1 = -2;
            break;
         case -5:
            var1 = -4;
            break;
         case -2:
            var1 = -3;
         }
      }

      if (!field_boolean_fV || var1 == -5) {
         func_void_F(var1);
      }
   }

   protected final void keyReleased(int var1) {
      if (field_boolean_aT) {
         switch(var1) {
         case -23:
            var1 = -8;
            break;
         case -22:
         case 22:
            var1 = -7;
            break;
         case -21:
         case 21:
            var1 = -6;
            break;
         case -20:
            var1 = -5;
            break;
         case -6:
            var1 = -2;
            break;
         case -5:
            var1 = -4;
            break;
         case -2:
            var1 = -3;
         }
      }

      if (!field_boolean_fV || var1 == -5) {
         func_void_G(var1);
      }
   }

   // $FF: renamed from: F (int) void
   private static void func_void_F(int var0) {
      switch(var0) {
      case -22:
      case -7:
         field_array_boolean_aU[13] = true;
         field_array_boolean_aV[13] = true;
         return;
      case -21:
      case -6:
         field_array_boolean_aU[12] = true;
         field_array_boolean_aV[12] = true;
         return;
      case -5:
      case 10:
         field_array_boolean_aU[5] = true;
         field_array_boolean_aV[5] = true;
         return;
      case -4:
         field_array_boolean_aU[6] = true;
         field_array_boolean_aV[6] = true;
         return;
      case -3:
         field_array_boolean_aU[4] = true;
         field_array_boolean_aV[4] = true;
         return;
      case -2:
         field_array_boolean_aU[8] = true;
         field_array_boolean_aV[8] = true;
         return;
      case -1:
         field_array_boolean_aU[2] = true;
         field_array_boolean_aV[2] = true;
         return;
      case 35:
         field_array_boolean_aU[11] = true;
         field_array_boolean_aV[11] = true;
         return;
      case 42:
         field_array_boolean_aU[10] = true;
         field_array_boolean_aV[10] = true;
         return;
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         field_array_boolean_aU[var0 - 48] = true;
         field_array_boolean_aV[var0 - 48] = true;
         return;
      default:
      }
   }

   // $FF: renamed from: G (int) void
   private static void func_void_G(int var0) {
      switch(var0) {
      case -22:
      case -7:
         field_array_boolean_aU[13] = false;
         return;
      case -21:
      case -6:
         field_array_boolean_aU[12] = false;
         return;
      case -5:
      case 10:
         field_array_boolean_aU[5] = false;
         return;
      case -4:
         field_array_boolean_aU[6] = false;
         field_array_boolean_aV[6] = false;
         return;
      case -3:
         field_array_boolean_aU[4] = false;
         field_array_boolean_aV[4] = false;
         return;
      case -2:
         field_array_boolean_aU[8] = false;
         field_array_boolean_aV[8] = false;
         return;
      case -1:
         field_array_boolean_aU[2] = false;
         field_array_boolean_aV[2] = false;
         return;
      case 35:
         field_array_boolean_aU[11] = false;
         return;
      case 42:
         field_array_boolean_aU[10] = false;
         return;
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         field_array_boolean_aU[var0 - 48] = false;
         return;
      default:
      }
   }

   protected final void paint(Graphics var1) {
      try {
         switch(field_int_d) {
         case 1:
            Graphics var6 = var1;
            var1.setClip(-1, -1, field_int_q + 2, field_int_r + 2);
            func_void_a(var1);
            var1.translate(-field_int_fR, -field_int_fS);
            var1 = var1;

            int var2;
            for(var2 = 0; var2 < field_int_ja; ++var2) {
               if (field_array_int_jc[var2] + field_array_int_je[var2] >= field_int_fR && field_array_int_jc[var2] - field_array_int_je[var2] <= field_int_fR + field_int_q && field_array_int_jd[var2] >= field_int_fS && field_array_int_jd[var2] - field_array_int_jf[var2] <= field_int_fS + field_int_r) {
                  field_int_jj = (field_int_ji = field_array_int_jc[var2] - field_int_fR) - field_int_bF;
                  field_int_jk = (field_int_jl = (field_int_jh - 2) * field_int_jj / field_int_jh) + field_int_bF;
                  var1.drawImage(field_array_class_javax_microedition_lcdui_Image_iZ[field_array_int_jb[var2]], field_int_fR + field_int_jk, field_array_int_jd[var2], 33);
               }
            }

            if (field_boolean_a) {
               func_void_j(var6);
            } else {
               func_void_k(var6);
            }

            func_void_i(var6);
            func_void_r(var6);
            if (field_boolean_hM) {
               if (field_int_ib < 0) {
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eA[0], field_int_hS, field_int_hT, 33);
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eA[2], field_int_hU, field_int_hY, 33);
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eA[3], field_int_hX, field_int_hZ, 33);
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eA[1], field_int_hV, field_int_hW, 33);
               } else {
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eA[0], 0, 0, field_array_class_javax_microedition_lcdui_Image_eA[0].getWidth(), field_array_class_javax_microedition_lcdui_Image_eA[0].getHeight(), 2, field_int_hS, field_int_hT, 33);
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eA[2], 0, 0, field_array_class_javax_microedition_lcdui_Image_eA[2].getWidth(), field_array_class_javax_microedition_lcdui_Image_eA[2].getHeight(), 2, field_int_hU, field_int_hY, 33);
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eA[3], 0, 0, field_array_class_javax_microedition_lcdui_Image_eA[3].getWidth(), field_array_class_javax_microedition_lcdui_Image_eA[3].getHeight(), 2, field_int_hX, field_int_hZ, 33);
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eA[1], 0, 0, field_array_class_javax_microedition_lcdui_Image_eA[1].getWidth(), field_array_class_javax_microedition_lcdui_Image_eA[1].getHeight(), 2, field_int_hV, field_int_hW, 33);
               }

               if (field_int_if != 0) {
                  var6.setColor(3342353);
                  var6.drawRect(field_int_hS - (field_int_hR >> 1) - 1, field_int_hT - field_int_hO - 7, field_int_hR + 2, 4);
                  var2 = field_int_hP * field_int_hR / field_int_hQ;
                  var6.setColor(15597568);
                  var6.fillRect(field_int_hS - (field_int_hR >> 1), field_int_hT - field_int_hO - 6, var2, 3);
                  var6.setColor(4456482);
                  var6.fillRect(field_int_hS - (field_int_hR >> 1) + var2, field_int_hT - field_int_hO - 6, field_int_hR - var2 + 1, 3);
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_it; ++var2) {
               if (field_int_fR <= field_array_int_iv[var2] + 12 && field_int_fR + field_int_q >= field_array_int_iv[var2] - 12 && field_int_fS <= field_array_int_iw[var2] && field_int_fS + field_int_r >= field_array_int_iw[var2] - 24) {
                  var1.drawImage(field_class_javax_microedition_lcdui_Image_eh, field_array_int_iv[var2], field_array_int_iw[var2], 33);
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_il; ++var2) {
               if (field_int_fR <= field_array_int_in[var2] + 12 && field_int_fR + field_int_q >= field_array_int_in[var2] - 12 && field_int_fS <= field_array_int_io[var2] && field_int_fS + field_int_r >= field_array_int_io[var2] - 24) {
                  if (field_array_int_ip[var2] == 1) {
                     var1.drawImage(field_array_class_javax_microedition_lcdui_Image_ee[field_array_int_iq[var2]], field_array_int_in[var2], field_array_int_io[var2], 33);
                  } else {
                     var1.drawRegion(field_array_class_javax_microedition_lcdui_Image_ee[field_array_int_iq[var2]], 0, 0, field_array_class_javax_microedition_lcdui_Image_ee[field_array_int_iq[var2]].getWidth(), field_array_class_javax_microedition_lcdui_Image_ee[field_array_int_iq[var2]].getHeight(), 2, field_array_int_in[var2], field_array_int_io[var2], 33);
                  }
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_dh; ++var2) {
               if (field_array_int_dk[var2] != 0 && field_array_int_di[var2] >= field_int_fR - 10 && field_array_int_di[var2] <= field_int_fR + field_int_q + 10 && field_array_int_dj[var2] >= field_int_fS && field_array_int_dj[var2] <= field_int_fS + field_int_r + 20) {
                  var1.drawRegion(field_array_class_javax_microedition_lcdui_Image_ej[field_array_int_dp[var2]], 0, field_array_int_dn[var2] * 15, 8, 15, 0, field_array_int_di[var2], field_array_int_dj[var2], 33);
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_cP; ++var2) {
               if (field_array_int_cT[var2] != 0 && field_array_int_cR[var2] >= field_int_fR - 10 && field_array_int_cR[var2] <= field_int_fR + field_int_q + 10 && field_array_int_cS[var2] >= field_int_fS && field_array_int_cS[var2] <= field_int_fS + field_int_r + 20) {
                  var1.drawRegion(field_array_class_javax_microedition_lcdui_Image_ez[field_array_int_cQ[var2]], 0, field_array_int_cW[var2] * 15, 13, 15, 0, field_array_int_cR[var2], field_array_int_cS[var2], 33);
               }
            }

            int var3;
            if (field_boolean_gQ && field_int_gV != 22 && field_int_fR + field_int_q >= field_int_gS - (field_int_gY >> 1) && field_int_fR <= field_int_gS + (field_int_gY >> 1) && field_int_fS <= field_int_gT && field_int_fS + field_int_r >= field_int_gT - field_int_gZ) {
               byte var8 = 0;
               if (field_int_gX == 0) {
                  var8 = -2;
                  if (field_int_gV == 1 && field_int_w % 10 > 5) {
                     var8 = -1;
                  }

                  if (field_int_gW == 1) {
                     var6.drawImage(field_array_class_javax_microedition_lcdui_Image_ey[4], field_int_gS, field_int_gT + 1, 33);
                  } else {
                     var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_ey[4], 0, 0, field_array_class_javax_microedition_lcdui_Image_ey[4].getWidth(), field_array_class_javax_microedition_lcdui_Image_ey[4].getHeight(), 2, field_int_gS, field_int_gT + 1, 33);
                  }
               }

               if (field_int_gW == 1) {
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_ey[field_int_gX], field_int_gS, field_int_gT + var8 + 1, 33);
               } else {
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_ey[field_int_gX], 0, 0, field_array_class_javax_microedition_lcdui_Image_ey[field_int_gX].getWidth(), field_array_class_javax_microedition_lcdui_Image_ey[field_int_gX].getHeight(), 2, field_int_gS, field_int_gT + var8 + 1, 33);
               }

               if (field_int_gV == 7) {
                  if (field_int_gW == 1) {
                     var6.drawImage(field_array_class_javax_microedition_lcdui_Image_ey[3], field_int_gS + 10, field_int_gT - 25 + 1, 0);
                  } else {
                     var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_ey[3], 0, 0, field_array_class_javax_microedition_lcdui_Image_ey[3].getWidth(), field_array_class_javax_microedition_lcdui_Image_ey[3].getHeight(), 2, field_int_gS - 10, field_int_gT - 25 + 1, 24);
                  }
               }

               if (field_int_he != 0) {
                  var6.setColor(3342353);
                  var6.drawRect(field_int_gS - (field_int_gY >> 1) - 1, field_int_gT - field_int_gZ - 7, field_int_gY + 2, 4);
                  var3 = field_int_hc * field_int_gY / field_int_hd;
                  var6.setColor(15597568);
                  var6.fillRect(field_int_gS - (field_int_gY >> 1), field_int_gT - field_int_gZ - 6, var3, 3);
                  var6.setColor(4456482);
                  var6.fillRect(field_int_gS - (field_int_gY >> 1) + var3, field_int_gT - field_int_gZ - 6, field_int_gY - var3 + 1, 3);
               }
            }

            var1 = var6;
            if (field_boolean_hl) {
               if (field_int_hv > 0) {
                  for(var2 = 0; var2 < 6; ++var2) {
                     var1.drawImage(field_array_class_javax_microedition_lcdui_Image_eC[var2], field_array_int_hG[var2], field_array_int_hH[var2], 33);
                  }
               } else {
                  for(var2 = 0; var2 < 6; ++var2) {
                     var1.drawRegion(field_array_class_javax_microedition_lcdui_Image_eC[var2], 0, 0, field_array_class_javax_microedition_lcdui_Image_eC[var2].getWidth(), field_array_class_javax_microedition_lcdui_Image_eC[var2].getHeight(), 2, field_array_int_hG[var2], field_array_int_hH[var2], 33);
                  }
               }

               if (field_int_hr != 0) {
                  var1.setColor(3342353);
                  var1.drawRect(field_int_hs - (field_int_hn >> 1) - 1, field_int_ht - field_int_ho - 7, field_int_hn + 2, 4);
                  var2 = field_int_hp * field_int_hn / field_int_hq;
                  var1.setColor(15597568);
                  var1.fillRect(field_int_hs - (field_int_hn >> 1), field_int_ht - field_int_ho - 6, var2, 3);
                  var1.setColor(4456482);
                  var1.fillRect(field_int_hs - (field_int_hn >> 1) + var2, field_int_ht - field_int_ho - 6, field_int_hn - var2 + 1, 3);
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_jK; ++var2) {
               if (field_array_int_jS[var2] != 5 && field_array_int_jS[var2] != 8 && field_array_int_jN[var2] >= field_int_fR - 10 && field_array_int_jN[var2] <= field_int_fR + field_int_q + 10 && field_array_int_jO[var2] >= field_int_fS && field_array_int_jO[var2] <= field_int_fS + field_int_r + 20) {
                  var1.drawImage(field_array_array_array_class_javax_microedition_lcdui_Image_jJ[field_array_int_kk[var2]][field_array_int_kb[var2] >= 0 ? 0 : 1][field_array_int_ka[var2]], field_array_int_jN[var2], field_array_int_jO[var2], 33);
                  if (field_array_int_jR[var2] != 0) {
                     var1.setColor(13073);
                     var1.drawRect(field_array_int_jN[var2] - (field_array_int_jQ[var2] >> 1) - 1, field_array_int_jO[var2] - field_array_int_jP[var2] - 7, field_array_int_jQ[var2] + 2, 4);
                     var3 = field_array_int_kc[var2] * field_array_int_jQ[var2] / field_array_int_kd[var2];
                     var1.setColor(60928);
                     var1.fillRect(field_array_int_jN[var2] - (field_array_int_jQ[var2] >> 1), field_array_int_jO[var2] - field_array_int_jP[var2] - 6, var3, 3);
                     var1.setColor(17442);
                     var1.fillRect(field_array_int_jN[var2] - (field_array_int_jQ[var2] >> 1) + var3, field_array_int_jO[var2] - field_array_int_jP[var2] - 6, field_array_int_jQ[var2] - var3 + 1, 3);
                  }
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_cs; ++var2) {
               if (field_array_int_cH[var2] != 5 && field_array_int_cx[var2] + 15 >= field_int_fR && field_array_int_cx[var2] - 15 <= field_int_fR + field_int_q && field_array_int_cy[var2] >= field_int_fS && field_array_int_cy[var2] - 30 <= field_int_fS + field_int_r) {
                  if (field_array_int_cK[var2] == -1) {
                     var1.drawImage(field_array_class_javax_microedition_lcdui_Image_ex[field_array_int_cL[var2]], field_array_int_cx[var2] + field_array_int_ai[field_array_int_cG[var2]], field_array_int_cy[var2], 33);
                     var1.drawImage(field_array_array_class_javax_microedition_lcdui_Image_ew[field_array_int_cG[var2]][field_array_int_cM[var2]], field_array_int_cz[var2] + field_array_array_int_ag[field_array_int_cG[var2]][field_array_int_cM[var2]], field_array_int_cA[var2], 33);
                  } else {
                     var1.drawRegion(field_array_class_javax_microedition_lcdui_Image_ex[field_array_int_cL[var2]], 0, 0, field_array_class_javax_microedition_lcdui_Image_ex[field_array_int_cL[var2]].getWidth(), field_array_class_javax_microedition_lcdui_Image_ex[field_array_int_cL[var2]].getHeight(), 2, field_array_int_cx[var2] - field_array_int_ai[field_array_int_cG[var2]], field_array_int_cy[var2], 33);
                     var1.drawRegion(field_array_array_class_javax_microedition_lcdui_Image_ew[field_array_int_cG[var2]][field_array_int_cM[var2]], 0, 0, field_array_array_class_javax_microedition_lcdui_Image_ew[field_array_int_cG[var2]][field_array_int_cM[var2]].getWidth(), field_array_array_class_javax_microedition_lcdui_Image_ew[field_array_int_cG[var2]][field_array_int_cM[var2]].getHeight(), 2, field_array_int_cz[var2] - field_array_array_int_ag[field_array_int_cG[var2]][field_array_int_cM[var2]], field_array_int_cA[var2], 33);
                  }

                  if (field_array_int_ct[var2] != 0) {
                     var1.setColor(13073);
                     var1.drawRect(field_array_int_cx[var2] - 13, field_array_int_cy[var2] - 40, 26, 4);
                     var3 = field_array_int_cu[var2] * 24 / field_array_int_af[field_array_int_cG[var2]];
                     var1.setColor(15597568);
                     var1.fillRect(field_array_int_cx[var2] - 12, field_array_int_cy[var2] - 39, var3, 3);
                     var1.setColor(4456482);
                     var1.fillRect(field_array_int_cx[var2] - 12 + var3, field_array_int_cy[var2] - 39, 24 - var3 + 1, 3);
                  }
               }
            }

            func_void_g(var6);
            if (field_boolean_dq && field_int_dr + 15 >= field_int_fR && field_int_dr - 15 <= field_int_fR + field_int_q && field_int_ds >= field_int_fS && field_int_ds - 10 <= field_int_fS + field_int_r) {
               var2 = field_int_w % 8 > 3 ? 0 : 1;
               if (field_int_dt > 0) {
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_el[var2], field_int_dr, field_int_ds, 33);
               } else {
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_el[var2], 0, 0, field_array_class_javax_microedition_lcdui_Image_el[var2].getWidth(), field_array_class_javax_microedition_lcdui_Image_el[var2].getHeight(), 2, field_int_dr, field_int_ds, 33);
               }
            }

            if (field_boolean_hf) {
               if (field_boolean_hg) {
                  var6.setColor(16768477);
                  var2 = field_int_fR + 50;
                  var3 = field_int_fS + 15;
                  if (!field_boolean_bh) {
                     var3 += 20;
                  }

                  var6.drawRect(var2 - 35 - 1, var3 - 7, 72, 4);
                  int var7 = field_int_hj * 70 / field_int_hk;
                  var6.setColor(15597568);
                  var6.fillRect(var2 - 35, var3 - 6, var7, 3);
                  var6.setColor(4456482);
                  var6.fillRect(var2 - 35 + var7, var3 - 6, 70 - var7 + 1, 3);
               }

               if (field_array_int_dC[0] + field_int_fl >= field_int_fR && field_array_int_dC[0] - field_int_fl <= field_int_fR + field_int_q && field_array_int_dD[0] >= field_int_fS && field_array_int_dD[0] - field_int_fk <= field_int_fS + field_int_r) {
                  if (field_array_int_dM[0] == 1) {
                     var6.drawImage(field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[0]][field_array_array_array_int_aJ[field_array_int_dJ[0]][0][0]], field_array_int_dC[0] + field_array_array_array_int_aJ[field_array_int_dJ[0]][0][1], field_array_int_dD[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][0][2], 0);
                     var6.drawImage(field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[0]][1][0]], field_array_int_dC[0] + field_array_array_array_int_aJ[field_array_int_dJ[0]][1][1], field_array_int_dD[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][1][2], 0);
                     var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[0]][2][0]], field_array_int_dC[0] + field_array_array_array_int_aJ[field_array_int_dJ[0]][2][1], field_array_int_dD[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][2][2], 0);
                     if (field_array_int_dL[0] != -1) {
                        var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[0]], field_array_int_dC[0] - field_array_int_at[field_array_int_dL[0]], field_array_int_dD[0] - field_array_int_au[field_array_int_dL[0]], 0);
                     }
                  } else {
                     var6.drawRegion(field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[0]][field_array_array_array_int_aJ[field_array_int_dJ[0]][0][0]], 0, 0, field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[0]][field_array_array_array_int_aJ[field_array_int_dJ[0]][0][0]].getWidth(), field_array_array_class_javax_microedition_lcdui_Image_ev[field_array_int_dK[0]][field_array_array_array_int_aJ[field_array_int_dJ[0]][0][0]].getHeight(), 2, field_array_int_dC[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][0][1], field_array_int_dD[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][0][2], 24);
                     var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[0]][1][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[0]][1][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_et[field_array_array_array_int_aJ[field_array_int_dJ[0]][1][0]].getHeight(), 2, field_array_int_dC[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][1][1], field_array_int_dD[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][1][2], 24);
                     var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[0]][2][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[0]][2][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eg[field_array_array_array_int_aJ[field_array_int_dJ[0]][2][0]].getHeight(), 2, field_array_int_dC[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][2][1], field_array_int_dD[0] - field_array_array_array_int_aJ[field_array_int_dJ[0]][2][2], 24);
                     if (field_array_int_dL[0] != -1) {
                        var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eE[field_array_int_dL[0]].getHeight(), 2, field_array_int_dC[0] + field_array_int_at[field_array_int_dL[0]], field_array_int_dD[0] - field_array_int_au[field_array_int_dL[0]], 24);
                     }
                  }
               }
            }

            if (field_int_ea != 0 && (var2 = field_int_ea % 3) < 2) {
               var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eu[var2], field_int_dY, field_int_dZ, 17);
            }

            if (field_int_gp == field_int_v) {
               if (field_int_gC == 1) {
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_ep[field_array_array_array_int_ar[field_int_gv][0][0]], field_int_gq + field_array_array_array_int_ar[field_int_gv][0][1], field_int_gr - field_array_array_array_int_ar[field_int_gv][0][2], 0);
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eq[field_array_array_array_int_ar[field_int_gv][1][0]], field_int_gq + field_array_array_array_int_ar[field_int_gv][1][1], field_int_gr - field_array_array_array_int_ar[field_int_gv][1][2], 0);
                  var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eo[field_array_array_array_int_ar[field_int_gv][2][0]], field_int_gq + field_array_array_array_int_ar[field_int_gv][2][1], field_int_gr - field_array_array_array_int_ar[field_int_gv][2][2], 0);
                  if (field_int_ij != -1) {
                     var6.drawImage(field_array_class_javax_microedition_lcdui_Image_eE[field_int_ij], field_int_gq - field_array_int_at[field_int_ij], field_int_gr - field_array_int_au[field_int_ij], 0);
                  }
               } else {
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_ep[field_array_array_array_int_ar[field_int_gv][0][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_ep[field_array_array_array_int_ar[field_int_gv][0][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_ep[field_array_array_array_int_ar[field_int_gv][0][0]].getHeight(), 2, field_int_gq - field_array_array_array_int_ar[field_int_gv][0][1], field_int_gr - field_array_array_array_int_ar[field_int_gv][0][2], 24);
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eq[field_array_array_array_int_ar[field_int_gv][1][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eq[field_array_array_array_int_ar[field_int_gv][1][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eq[field_array_array_array_int_ar[field_int_gv][1][0]].getHeight(), 2, field_int_gq - field_array_array_array_int_ar[field_int_gv][1][1], field_int_gr - field_array_array_array_int_ar[field_int_gv][1][2], 24);
                  var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eo[field_array_array_array_int_ar[field_int_gv][2][0]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eo[field_array_array_array_int_ar[field_int_gv][2][0]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eo[field_array_array_array_int_ar[field_int_gv][2][0]].getHeight(), 2, field_int_gq - field_array_array_array_int_ar[field_int_gv][2][1], field_int_gr - field_array_array_array_int_ar[field_int_gv][2][2], 24);
                  if (field_int_ij != -1) {
                     var6.drawRegion(field_array_class_javax_microedition_lcdui_Image_eE[field_int_ij], 0, 0, field_array_class_javax_microedition_lcdui_Image_eE[field_int_ij].getWidth(), field_array_class_javax_microedition_lcdui_Image_eE[field_int_ij].getHeight(), 2, field_int_gq + field_array_int_at[field_int_ij], field_int_gr - field_array_int_au[field_int_ij], 24);
                  }
               }
            }

            func_void_b(var6);
            if (field_int_fK != 0) {
               var6.drawImage(field_class_javax_microedition_lcdui_Image_ef, field_int_fI, field_int_fJ, 33);
            }

            var1 = var6;

            for(var2 = 0; var2 < 2; ++var2) {
               if (field_array_int_cf[var2] != -1) {
                  if (field_array_int_ch[var2] == 1) {
                     var1.drawImage(field_array_class_javax_microedition_lcdui_Image_eB[field_array_int_cg[var2]], field_array_int_cd[var2], field_array_int_ce[var2], 3);
                  } else {
                     var1.drawRegion(field_array_class_javax_microedition_lcdui_Image_eB[field_array_int_cg[var2]], 0, 0, field_array_class_javax_microedition_lcdui_Image_eB[field_array_int_cg[var2]].getWidth(), field_array_class_javax_microedition_lcdui_Image_eB[field_array_int_cg[var2]].getHeight(), 2, field_array_int_cd[var2], field_array_int_ce[var2], 3);
                  }
               }
            }

            var1 = var6;
            if (!field_boolean_a) {
               for(var2 = 0; var2 < 2; ++var2) {
                  if (field_array_int_co[var2] != -1) {
                     var1.drawImage(field_array_array_class_javax_microedition_lcdui_Image_em[var2][field_array_int_co[var2]], field_array_int_cm[var2], field_array_int_cn[var2], 3);
                  }
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_bP; ++var2) {
               if (field_array_int_bS[var2] != -1) {
                  var1.drawImage(field_array_array_class_javax_microedition_lcdui_Image_eb[field_array_int_bV[var2]][field_array_int_bT[var2] > 0 ? 0 : 1], field_array_int_bQ[var2], field_array_int_bR[var2], 3);
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_cY; ++var2) {
               if (field_array_int_db[var2] != -1) {
                  var1.drawImage(field_array_class_javax_microedition_lcdui_Image_en[field_array_int_dc[var2]], field_array_int_cZ[var2], field_array_int_da[var2], 3);
               }
            }

            var1 = var6;

            for(var2 = 0; var2 < field_int_bW; ++var2) {
               if (field_array_int_bZ[var2] != 0) {
                  var1.drawImage(field_class_javax_microedition_lcdui_Image_ed, field_array_int_bX[var2], field_array_int_bY[var2], 3);
               }
            }

            var1 = var6;
            if (!field_boolean_a) {
               for(var2 = 0; var2 < 2; ++var2) {
                  if (field_array_int_ck[var2] != -1) {
                     var1.drawImage(field_array_class_javax_microedition_lcdui_Image_eG[field_array_int_cl[var2]], field_array_int_ci[var2], field_array_int_cj[var2], 3);
                  }
               }
            }

            func_void_l(var6);
            var1 = var6;

            for(var2 = 0; var2 < 5; ++var2) {
               if (field_array_int_dW[var2] != -1) {
                  Midlet.func_void_a(var1, field_array_class_java_lang_String_dR[var2], field_array_int_dX[var2], field_array_int_dS[var2], field_array_int_dT[var2], 0);
               }
            }

            if (field_int_ge == field_int_v) {
               var6.drawImage(field_array_class_javax_microedition_lcdui_Image_ec[field_int_gh], field_int_gi, field_int_gj, 3);
            }

            func_void_c(var6);
            if (field_boolean_c) {
               func_void_d(var6);
            }

            if (field_int_bx > 1) {
               func_void_e(var6);
            }

            if (field_boolean_cp) {
               var6.translate(-var6.getTranslateX(), -var6.getTranslateY());
               var6.setClip(-1, -1, field_int_aW + 2, field_int_aX + 2);
               var6.setColor(0);
               var6.fillRect(0, 0, field_int_aW, 21);
               var6.setColor(10275899);
               var6.fillRect(0, 19, field_int_aW, 1);
               if (field_int_w % 10 > 2) {
                  Midlet.func_void_a(var6, field_class_java_lang_String_cr, field_int_bF, 4, 2);
               }
            }

            if (field_boolean_iC) {
               func_void_f(var6);
            }

            return;
         case 2:
            var1.setColor(0);
            var1.fillRect(0, 0, field_int_aW, 21);
            Midlet.func_void_a(var1, "Loading... " + field_int_S + "%", field_int_aW >> 1, 4, 2);
            return;
         case 3:
            var1.setClip(-1, -1, field_int_aW + 2, field_int_aX + 1);
            func_void_a(var1);
            var1.translate(-field_int_fR, -field_int_fS);
            if (field_boolean_a) {
               func_void_j(var1);
            } else {
               func_void_k(var1);
            }

            func_void_i(var1);
            func_void_l(var1);
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            var1.setColor(0);
            var1.fillRect(0, 0, field_int_q, field_int_bd);
            var1.fillRect(0, field_int_be, field_int_q, field_int_aX - field_int_be + 1);
            var1.setColor(10275899);
            var1.fillRect(0, field_int_bd - 1, field_int_aW, 1);
            var1.fillRect(0, field_int_be + 1, field_int_aW, 1);
            var1.drawImage(field_class_javax_microedition_lcdui_Image_eD, field_int_aY, field_int_bb + field_int_be >> 1, 3);
            Midlet.func_void_a(var1, "*", field_int_aY - 50 - field_int_w % 3, field_int_bg, 0);
            Midlet.func_void_a(var1, "/", field_int_aY + 50 + field_int_w % 3, field_int_bg, 1);
            Midlet.func_void_a(var1, field_array_class_java_lang_String_aF[field_int_ba], field_int_aY, field_int_bg, 3);
            return;
         case 4:
            var1.setColor(0);
            var1.fillRect(0, 0, field_int_aW, field_int_aX);
            if (field_int_jH >= 0) {
               if (field_class_javax_microedition_lcdui_Image_jF != null && field_int_jI >= 0) {
                  var1.drawRegion(field_class_javax_microedition_lcdui_Image_jF, 0, field_int_jI * 51, 71, 51, 0, field_int_aW >> 1, field_int_aX >> 1, 3);
               }

               return;
            }

            var1.drawImage((Image)null, field_int_aY, field_int_aZ, 3);
            break;
         case 5:
            func_void_o(var1);
            return;
         case 6:
            func_void_p(var1);
            return;
         case 7:
            func_void_q(var1);
            return;
         case 8:
            func_void_n(var1);
            return;
         case 9:
            func_void_m(var1);
            return;
         case 10:
            var1.setColor(0);
            var1.fillRect(0, 0, field_int_aW, field_int_aX);
            if (!field_boolean_lo) {
               var1.drawImage(field_class_javax_microedition_lcdui_Image_ln, field_int_aY, field_int_aZ - 30, 3);
               if (field_int_lp == 0) {
                  Midlet.func_void_a(var1, "Bật âm thanh?", field_int_aY, field_int_aZ + 15, 2);
                  Midlet.func_void_a(var1, "Bật", 4, field_int_aX - 14, 0);
                  Midlet.func_void_a(var1, "Tắt", field_int_aW - 4, field_int_aX - 14, 1);
                  break;
               }

               Midlet.func_void_a(var1, "Chất lượng hình ảnh?", field_int_aY, field_int_aZ + 15, 2);
               Midlet.func_void_a(var1, "Cao", 4, field_int_aX - 14, 0);
               Midlet.func_void_a(var1, "Thấp", field_int_aW - 4, field_int_aX - 14, 1);
            }

            return;
         case 11:
            func_void_h(var1);
            return;
         case 12:
            func_void_h(var1);
            return;
         case 13:
            var1.setColor(15395562);
            var1.fillRect(0, 0, field_int_aW, field_int_aX);
            var1.setColor(11788624);
            var1.fillRect(0, 0, field_int_aW, field_int_lW);
            var1.fillRect(0, field_int_aX - field_int_lW, field_int_aW, field_int_lW);
            var1.setColor(16777215);
            var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
            var1.drawString("Ninja School", field_int_aY, 3, 17);
            var1.setFont(field_class_javax_microedition_lcdui_Font_lU);
            switch(activeCommand) {
            case 0:
               this.func_void_t(var1);
               return;
            case 1:
               var1.setColor(field_int_lS % 10 > 5 ? 16777215 : 7171437);
               var1.drawString("Dang gui tin", field_int_aY, field_int_aZ - field_int_lW, 17);
               var1.drawString("kich hoat...", field_int_aY, field_int_aZ, 17);
               return;
            case 2:
               var1.setColor(7171437);
               var1.setFont(field_class_javax_microedition_lcdui_Font_lU);
               var1.drawString("Gui tin kich hoat ton phi", field_int_aY, field_int_aZ - (field_int_lW << 1), 17);
               var1.drawString("15.000đ. Ban se nhan", field_int_aY, field_int_aZ - field_int_lW, 17);
               var1.drawString("duoc ma kich hoat trong", field_int_aY, field_int_aZ, 17);
               var1.drawString("tin nhan tra loi.", field_int_aY, field_int_aZ + field_int_lW, 17);
               var1.setColor(16777215);
               var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
               var1.drawString("Dong y", 2, field_int_aX - field_int_lW + 3, 20);
               var1.drawString("Khong", field_int_aW - 2, field_int_aX - field_int_lW + 3, 24);
               return;
            case 3:
            default:
               break;
            case 4:
               this.func_void_s(var1);
               return;
            case 5:
               var1.setColor(7171437);
               var1.drawString("Da gui tin kich hoat.", field_int_aY, field_int_aZ - (field_int_lW << 1), 17);
               var1.drawString("Xin thoat game va", field_int_aY, field_int_aZ - field_int_lW, 17);
               var1.drawString("cho giay lat. Ban se", field_int_aY, field_int_aZ, 17);
               var1.drawString("nhan duoc ma kich hoat.", field_int_aY, field_int_aZ + field_int_lW, 17);
               var1.setColor(16777215);
               var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
               var1.drawString("OK", 2, field_int_aX - field_int_lW + 3, 20);
               return;
            case 6:
               var1.setColor(7171437);
               var1.drawString("Khong the gui SMS", field_int_aY, field_int_aZ - (field_int_lW << 1), 17);
               var1.drawString("Xin hay thu lai. Vao", field_int_aY, field_int_aZ - field_int_lW, 17);
               var1.drawString("www.teamobi.com", field_int_aY, field_int_aZ, 17);
               var1.drawString("de biet them thong tin.", field_int_aY, field_int_aZ + field_int_lW, 17);
               var1.setColor(16777215);
               var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
               var1.drawString("OK", 2, field_int_aX - field_int_lW + 3, 20);
               return;
            case 7:
               var1.setColor(0);
               var1.fillRect(0, 0, field_int_aW, field_int_aX);
               String var4 = this.field_class_java_lang_String_me;
               if (field_int_lS % 10 > 5) {
                  var4 = var4 + "|";
               }

               var1.drawString(var4, field_int_aY - 20, field_int_aZ - 40, 20);
               func_void_X(7);
               func_void_aj();
               field_int_d = 4;
               field_boolean_lO = func_int_aJ() == 1;
               return;
            case 8:
               var1.setColor(7171437);
               var1.drawString("Xin vui long", field_int_aY, field_int_aZ - (field_int_lW << 1), 17);
               var1.drawString("Bat Bluetooth", field_int_aY, field_int_aZ - field_int_lW, 17);
               var1.setColor(16777215);
               var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
               var1.drawString("OK", 2, field_int_aX - field_int_lW + 3, 20);
            }
         default:
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   protected final void pointerDragged(int var1, int var2) {
      field_int_aQ = var1;
      field_int_aR = var2;
   }

   protected final void pointerPressed(int var1, int var2) {
      field_boolean_aS = true;
      field_int_aQ = var1;
      field_int_aR = var2;
   }

   protected final void pointerReleased(int var1, int var2) {
      field_boolean_aS = false;
      field_boolean_aP = true;
      field_int_aQ = var1;
      field_int_aR = var2;
   }

   public final void run() {
      if (!field_boolean_aO) {
         field_boolean_aO = true;
         field_int_d = 13;
         activeCommand = 8;
      }

      while(field_boolean_aO) {
         long var1 = System.currentTimeMillis();
         boolean var3;
         int var4;
         int var12;
         switch(field_int_d) {
         case 1:
            if (field_boolean_aP) {
               field_boolean_aP = false;
               func_void_c();
               if (field_boolean_fV) {
                  field_array_boolean_aV[5] = true;
               } else if (field_int_aQ > field_int_aW - 40 && field_int_aR < 40) {
                  field_array_boolean_aV[5] = true;
               } else if (field_int_aR > field_int_aX - 30) {
                  if (field_int_aQ < field_int_aY) {
                     field_array_boolean_aV[12] = true;
                  } else {
                     field_array_boolean_aV[13] = true;
                  }
               } else if (field_int_aR <= field_int_fi - field_int_fS + 24 && field_int_aR >= field_int_fi - field_int_fS - 80 && field_int_aQ <= field_int_fh - field_int_fR + 48 && field_int_aQ >= field_int_fh - field_int_fR - 48) {
                  field_int_fp = field_int_fh - field_int_fR < field_int_aQ ? 1 : -1;
                  field_array_boolean_aV[5] = true;
               }
            }

            if (field_boolean_aS && !field_boolean_fV && (field_int_aQ <= field_int_aW - 40 || field_int_aR >= 40) && field_int_aR <= field_int_aX - 30) {
               if (field_int_aR > field_int_fi - field_int_fS + 24) {
                  field_array_boolean_aU[8] = true;
               } else if (field_int_aR < field_int_fi - field_int_fS - 80) {
                  field_array_boolean_aU[2] = true;
               } else if (field_int_aQ > field_int_fh - field_int_fR + 48) {
                  field_array_boolean_aU[6] = true;
               } else if (field_int_aQ < field_int_fh - field_int_fR - 48) {
                  field_array_boolean_aU[4] = true;
               }
            }

            if (++field_int_w == 10000) {
               field_int_w = 0;
            }

            if (field_int_fh < 0) {
               if (field_int_jr != -1) {
                  func_void_B();
                  field_int_fs = field_int_fh = field_int_jv - 1;
                  field_int_ft = field_int_fi = field_int_jw;
                  Midlet.field_boolean_f = true;
                  func_void_x(field_int_jr);
                  break;
               }
            } else if (field_int_fh >= field_int_iR - 24) {
               if (field_int_js != -1) {
                  if (!field_boolean_fc && field_int_js == 95) {
                     func_void_s(6);
                     func_void_a("Khu vực phía trước rất nguy hiểm! Chỉ những người có thể ẩn thân có thể vào!");
                     field_int_fh = field_int_iR - 60;
                     field_int_A = 4;
                     field_int_d = 7;
                     break;
                  }

                  func_void_B();
                  if (field_int_jt != -1 && field_int_fi > field_int_jD) {
                     field_int_fs = field_int_fh = field_int_jz;
                     field_int_ft = field_int_fi = field_int_jA;
                     Midlet.field_boolean_f = true;
                     func_void_x(field_int_jt);
                     break;
                  }

                  field_int_fs = field_int_fh = field_int_jx;
                  field_int_ft = field_int_fi = field_int_jy;
                  Midlet.field_boolean_f = true;
                  func_void_x(field_int_js);
                  break;
               }
            } else if (field_int_fi + field_int_z >= field_int_iS && field_int_A != 6 && field_int_ju != -1) {
               func_void_B();
               field_int_fs = field_int_fh = field_int_jB;
               field_int_ft = field_int_fi = field_int_jC;
               Midlet.field_boolean_f = true;
               func_void_x(field_int_ju);
               field_int_A = 4;
               break;
            }

            func_void_ad();
            func_void_X();
            if (!func_boolean_V()) {
               int var10002;
               if (!field_boolean_a) {
                  for(var12 = 0; var12 < 2; ++var12) {
                     if (field_int_w % (var12 + 2 << 3) == 0) {
                        var10002 = field_array_int_e[var12]++;
                        if (field_array_int_e[var12] > field_int_q + (field_class_javax_microedition_lcdui_Image_t.getWidth() >> 1)) {
                           field_array_int_e[var12] = -(field_class_javax_microedition_lcdui_Image_t.getWidth() >> 1);
                        }
                     }
                  }
               }

               if (field_boolean_iC) {
                  if (field_array_boolean_aV[5]) {
                     func_void_d();
                     func_void_M();
                     if (field_int_iF == field_int_iE) {
                        field_boolean_iC = false;
                        func_void_z();
                     }
                  }

                  field_boolean_c = true;
               } else {
                  label2562: {
                     if (field_array_boolean_aV[12]) {
                        func_void_ar();
                        field_int_d = 5;
                        func_void_c();
                        func_void_d();
                     } else if (field_array_boolean_aV[0]) {
                        if (field_int_fg == 0) {
                           if (field_boolean_eN) {
                              field_int_fg = 1;
                           }
                        } else {
                           field_int_fg = 0;
                        }

                        field_boolean_c = true;
                        field_array_boolean_aV[0] = false;
                     } else if (field_array_boolean_aV[6]) {
                        field_int_fr = 2;
                        field_array_boolean_aV[6] = false;
                     } else if (field_array_boolean_aV[4]) {
                        field_int_fr = -2;
                        field_array_boolean_aV[4] = false;
                     } else {
                        if (field_array_boolean_aV[9]) {
                           if (field_boolean_fc) {
                              field_boolean_fz = !field_boolean_fz;
                           }

                           field_array_boolean_aV[9] = false;
                           break label2562;
                        }

                        if (field_array_boolean_aV[7]) {
                           if (field_int_A == 1 && field_boolean_eT) {
                              field_int_A = 23;
                              field_int_C = 0;
                           }

                           field_array_boolean_aV[7] = false;
                        } else if (field_array_boolean_aV[10]) {
                           field_array_boolean_aV[10] = false;
                           if (field_int_G < field_int_H) {
                              for(var12 = 0; var12 < 3; ++var12) {
                                 if (field_array_int_V[var12] > 0) {
                                    var10002 = field_array_int_V[var12]--;
                                    if ((field_int_G += field_array_int_kJ[var12]) > field_int_H) {
                                       field_int_G = field_int_H;
                                    }

                                    field_boolean_c = true;
                                    break;
                                 }
                              }
                           }
                        } else if (field_array_boolean_aV[11]) {
                           field_array_boolean_aV[11] = false;
                           if (field_int_I < field_int_J) {
                              for(var12 = 3; var12 < 6; ++var12) {
                                 if (field_array_int_V[var12] > 0) {
                                    var10002 = field_array_int_V[var12]--;
                                    if ((field_int_I += field_array_int_kJ[var12]) > field_int_J) {
                                       field_int_I = field_int_J;
                                    }

                                    field_boolean_c = true;
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     if (field_int_A == 1) {
                        if (field_array_boolean_aV[13]) {
                           func_void_d();
                           if (field_class_java_lang_String_o.equals("Giao tiếp")) {
                              var4 = field_int_fG;
                              switch(field_array_int_lA[var4]) {
                              case 0:
                                 if (field_boolean_fe) {
                                    func_void_a(field_array_array_class_java_lang_String_lF[7], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else if (!field_boolean_eL) {
                                    func_void_V(2);
                                    func_void_a(field_array_array_class_java_lang_String_lC[0], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else {
                                    if (field_boolean_fc && !field_boolean_fd) {
                                       if (field_int_O == 16) {
                                          if (field_boolean_eK) {
                                             func_void_a(field_array_array_class_java_lang_String_lD[14], 35, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_a(field_array_array_class_java_lang_String_lE[14], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                       } else if (field_int_O == -1) {
                                          func_void_a(field_array_array_class_java_lang_String_lC[22], 36, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                       break;
                                    }

                                    func_void_a(field_array_array_class_java_lang_String_lF[1], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }
                                 break;
                              case 1:
                                 if (field_boolean_fe) {
                                    func_void_a(field_array_array_class_java_lang_String_lF[5], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else if (!field_boolean_eL) {
                                    if (field_int_O == 0) {
                                       if (field_int_fF < field_array_int_lI[0]) {
                                          func_void_a(field_array_array_class_java_lang_String_lE[0], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          var3 = true;
                                          boolean var8 = true;
                                          boolean var7 = true;
                                          boolean var6 = false;
                                          field_int_lK = 0;
                                          field_int_lN = 4;
                                          field_int_lL = 1044;
                                          field_int_lM = 240;
                                          func_void_a(field_array_array_class_java_lang_String_lD[0], 4, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[1], 3, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else if (!field_boolean_eU && field_boolean_eT) {
                                    if (field_int_M < 10) {
                                       func_void_a(new String[]{"Hãy quay lại gặp ta khi con đạt cấp độ 10"}, -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else if (field_int_O == 7) {
                                       if (field_int_fF < field_array_int_lI[7]) {
                                          func_void_a(field_array_array_class_java_lang_String_lE[6], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_V(2);
                                          func_void_a(field_array_array_class_java_lang_String_lD[6], 19, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[14], 18, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else if (field_boolean_eX && !field_boolean_eY) {
                                    if (field_int_M < 12) {
                                       func_void_a(new String[]{"Hãy quay lại gặp ta khi con đạt cấp độ 12"}, -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else if (field_int_O == 11) {
                                       if (field_int_fF < 20) {
                                          func_void_a(field_array_array_class_java_lang_String_lE[9], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_V(4);
                                          func_void_a(field_array_array_class_java_lang_String_lD[9], 27, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[17], 28, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else {
                                    if (!field_boolean_fa && field_boolean_eZ) {
                                       if (field_int_M < 15) {
                                          func_void_a(new String[]{"Hãy quay lại gặp ta khi con đạt cấp độ 15"}, -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else if (field_int_O == 13) {
                                          if (field_int_fF < field_array_int_lI[13]) {
                                             func_void_a(field_array_array_class_java_lang_String_lE[11], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_V(3);
                                             func_void_a(field_array_array_class_java_lang_String_lD[11], 31, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                       } else if (field_int_O == -1) {
                                          func_void_a(field_array_array_class_java_lang_String_lC[19], 32, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                       break;
                                    }

                                    func_void_a(field_array_array_class_java_lang_String_lF[0], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }
                                 break;
                              case 2:
                                 if (field_boolean_fe) {
                                    func_void_a(field_array_array_class_java_lang_String_lF[9], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else if (!field_boolean_eL) {
                                    func_void_V(1);
                                    func_void_a(field_array_array_class_java_lang_String_lC[2], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else if (field_boolean_eO && !field_boolean_eP) {
                                    if (field_int_O == 3) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[9], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[10], 11, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else if (field_boolean_eU && !field_boolean_eV) {
                                    if (field_int_O == 8) {
                                       if (field_boolean_eJ) {
                                          func_void_V(2);
                                          func_void_a(field_array_array_class_java_lang_String_lD[7], 23, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_a(field_array_array_class_java_lang_String_lE[7], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[15], 22, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else {
                                    if (field_boolean_eV && !field_boolean_eW) {
                                       if (field_int_O == 9) {
                                          if (field_int_fF < field_array_int_lI[9]) {
                                             func_void_a(field_array_array_class_java_lang_String_lE[8], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_V(3);
                                             func_void_a(field_array_array_class_java_lang_String_lD[8], 25, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                       } else if (field_int_O == -1) {
                                          func_void_a(field_array_array_class_java_lang_String_lC[16], 24, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                       break;
                                    }

                                    func_void_a(field_array_array_class_java_lang_String_lF[3], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }
                                 break;
                              case 3:
                                 if (field_boolean_fe) {
                                    func_void_a(field_array_array_class_java_lang_String_lF[9], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else {
                                    if (field_boolean_eL && field_boolean_eN) {
                                       if (!field_boolean_eO) {
                                          if (field_int_O == 2) {
                                             if (!field_boolean_fD) {
                                                func_void_a(field_array_array_class_java_lang_String_lE[2], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             } else {
                                                func_void_V(2);
                                                func_void_a(field_array_array_class_java_lang_String_lD[2], 10, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             }
                                          } else if (field_int_O == -1) {
                                             func_void_a(field_array_array_class_java_lang_String_lC[8], 9, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                          break;
                                       }

                                       if (!field_boolean_eR && field_boolean_eQ) {
                                          if (field_int_O == 5) {
                                             if (!field_boolean_fD) {
                                                func_void_a(field_array_array_class_java_lang_String_lE[4], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             } else {
                                                func_void_V(4);
                                                func_void_a(field_array_array_class_java_lang_String_lD[4], 15, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             }
                                          } else if (field_int_O == -1) {
                                             func_void_a(field_array_array_class_java_lang_String_lC[12], 14, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                          break;
                                       }

                                       if (!field_boolean_fb && field_boolean_fa) {
                                          if (field_int_M < 16) {
                                             func_void_a(new String[]{"Hãy quay lại gặp ta khi con đạt cấp độ 16"}, -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else if (field_int_O == 14) {
                                             if (field_int_fF < field_array_int_lI[14]) {
                                                func_void_a(field_array_array_class_java_lang_String_lE[12], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             } else {
                                                func_void_V(3);
                                                func_void_a(field_array_array_class_java_lang_String_lD[12], 33, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             }
                                          } else if (field_int_O == -1) {
                                             func_void_a(field_array_array_class_java_lang_String_lC[20], 34, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                          break;
                                       }

                                       if (!field_boolean_fc && field_boolean_fb) {
                                          if (field_int_O == 15) {
                                             if (!field_boolean_fD) {
                                                func_void_a(field_array_array_class_java_lang_String_lE[13], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             } else {
                                                func_void_V(0);
                                                func_void_a(field_array_array_class_java_lang_String_lD[13], 21, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                             }
                                          } else if (field_int_O == -1) {
                                             func_void_a(field_array_array_class_java_lang_String_lC[21], 20, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                          break;
                                       }

                                       func_void_a(field_array_array_class_java_lang_String_lF[4], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       break;
                                    }

                                    func_void_a(field_array_array_class_java_lang_String_lC[5], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }
                                 break;
                              case 4:
                                 if (field_boolean_fe) {
                                    func_void_a(field_array_array_class_java_lang_String_lF[8], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else if (field_int_v == 99) {
                                    func_void_a(field_array_array_class_java_lang_String_lC[7], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else if (!field_boolean_eL) {
                                    func_void_a(field_array_array_class_java_lang_String_lC[4], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 } else if (!field_boolean_eN) {
                                    if (field_int_O == 1) {
                                       if (field_int_fF < field_array_int_lI[1]) {
                                          func_void_a(field_array_array_class_java_lang_String_lE[3], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_V(3);
                                          func_void_a(field_array_array_class_java_lang_String_lD[1], 6, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[6], 5, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else if (field_boolean_eP && !field_boolean_eQ) {
                                    if (field_int_O == 4) {
                                       if (field_int_fF < field_array_int_lI[4]) {
                                          func_void_a(field_array_array_class_java_lang_String_lE[3], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_V(3);
                                          func_void_a(field_array_array_class_java_lang_String_lD[3], 12, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[11], 13, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else if (field_boolean_eR && !field_boolean_eT) {
                                    if (field_int_M < 8) {
                                       func_void_a(new String[]{"Hãy quay lại gặp ta khi con đạt cấp độ 8"}, -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else if (field_int_O == 6) {
                                       if (!field_boolean_fD) {
                                          func_void_a(field_array_array_class_java_lang_String_lE[5], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_V(1);
                                          func_void_a(field_array_array_class_java_lang_String_lD[5], 17, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                    } else if (field_int_O == -1) {
                                       func_void_a(field_array_array_class_java_lang_String_lC[13], 16, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    } else {
                                       func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }
                                 } else {
                                    if (!field_boolean_eZ && field_boolean_eY) {
                                       if (field_int_O == 12) {
                                          if (field_int_fF < field_array_int_lI[12]) {
                                             func_void_a(field_array_array_class_java_lang_String_lE[10], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          } else {
                                             func_void_V(1);
                                             func_void_a(field_array_array_class_java_lang_String_lD[10], 29, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                          }
                                       } else if (field_int_O == -1) {
                                          func_void_a(field_array_array_class_java_lang_String_lC[18], 30, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       } else {
                                          func_void_a(field_array_class_java_lang_String_lG, 1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                       }
                                       break;
                                    }

                                    func_void_a(field_array_array_class_java_lang_String_lF[2], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }
                                 break;
                              case 5:
                                 if (field_int_v == 0) {
                                    if (var4 == 5) {
                                       func_void_a(field_array_array_class_java_lang_String_lB[0], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                    }

                                    if (var4 == 6) {
                                       func_void_ao();
                                       field_int_d = 9;
                                       shopType = 0;
                                    }
                                 }

                                 if (field_int_v == 2 && var4 == 0) {
                                    func_void_ao();
                                    field_int_d = 9;
                                    // Hack: Force buy item by money in game.
                                    shopType = 0;
                                 }

                                 if (field_int_v == 1 && var4 == 0) {
                                    func_void_a(field_array_array_class_java_lang_String_lB[1], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }

                                 if (field_int_v == 5 && var4 == 0) {
                                    func_void_a(field_array_array_class_java_lang_String_lB[2], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }

                                 if (field_int_v == 6 && var4 == 0) {
                                    func_void_a(field_array_array_class_java_lang_String_lB[3], -1, field_array_int_ly[var4], field_array_int_lz[var4] - 40);
                                 }
                              }

                              if (field_int_v == field_int_ge && var4 == field_int_gm) {
                                 field_int_ge = -1;
                              }
                           } else if (field_class_java_lang_String_o.equals("Trò chuyện")) {
                              func_void_d();
                              field_array_int_dM[field_int_fH] = -field_int_fp;
                              func_void_a(field_array_array_class_java_lang_String_dy[field_int_fH], 0, field_array_int_dC[field_int_fH], field_array_int_dD[field_int_fH] - 44);
                           } else if (field_class_java_lang_String_o.equals("Nói chuyện") && field_boolean_fE) {
                              if (field_boolean_gn) {
                                 func_void_a(field_array_array_class_java_lang_String_aI[0], 0, field_int_gq, field_int_gr - 44);
                              } else if (field_boolean_eX) {
                                 func_void_a(field_array_array_class_java_lang_String_aI[2], 0, field_int_gq, field_int_gr - 44);
                                 field_boolean_gn = true;
                              } else if (field_boolean_eW) {
                                 func_void_a(field_array_array_class_java_lang_String_aI[3], 26, field_int_gq, field_int_gr - 44);
                                 field_boolean_eW = false;
                              } else {
                                 func_void_a(field_array_array_class_java_lang_String_aI[1], 0, field_int_gq, field_int_gr - 44);
                              }
                           }
                        } else {
                           label2533: {
                              if (field_array_boolean_aU[2]) {
                                 if (field_boolean_eP) {
                                    for(var12 = 0; var12 < field_int_il; ++var12) {
                                       if (field_int_fi == field_array_int_io[var12] && func_int_a(field_int_fh - field_array_int_in[var12]) < 20) {
                                          field_int_fh = field_array_int_in[var12];
                                          field_int_A = 18;
                                          func_void_c();
                                          field_int_im = var12;
                                          field_array_int_ip[var12] = field_int_fp;
                                          field_array_int_iq[var12] = 0;
                                          break label2533;
                                       }
                                    }
                                 }

                                 if (field_boolean_eL) {
                                    field_int_z = -10;
                                 } else {
                                    field_int_z = -8;
                                 }

                                 field_int_A = 3;
                                 field_int_iu = -1;
                                 field_int_C = 0;
                                 field_int_fG = -1;
                                 field_int_fH = -1;
                                 field_class_java_lang_String_o = " ";
                                 field_boolean_c = true;
                              } else if (field_array_boolean_aU[4]) {
                                 if (field_int_fp == 1) {
                                    field_int_fp = -1;
                                 } else {
                                    field_int_A = 2;
                                    field_int_y = -field_int_P;
                                 }

                                 field_int_fG = -1;
                                 field_int_fH = -1;
                                 field_class_java_lang_String_o = " ";
                                 field_boolean_c = true;
                              } else if (field_array_boolean_aU[6]) {
                                 if (field_int_fp == -1) {
                                    field_int_fp = 1;
                                 } else {
                                    field_int_A = 2;
                                    field_int_y = field_int_P;
                                 }

                                 field_int_fH = -1;
                                 field_int_fG = -1;
                                 field_class_java_lang_String_o = " ";
                                 field_boolean_c = true;
                              } else if (field_array_boolean_aU[8]) {
                                 field_int_C = 0;
                                 field_int_D = 0;
                                 field_int_A = 8;
                              } else if (field_array_boolean_aU[1]) {
                                 if (field_boolean_eL) {
                                    field_int_z = -10;
                                 } else {
                                    field_int_z = -8;
                                 }

                                 field_int_fp = -1;
                                 field_int_y = -4;
                                 field_int_A = 3;
                                 field_int_iu = -1;
                                 field_int_C = 0;
                                 field_int_fG = -1;
                                 field_int_fH = -1;
                                 field_class_java_lang_String_o = " ";
                                 field_boolean_c = true;
                              } else if (field_array_boolean_aU[3]) {
                                 if (field_boolean_eL) {
                                    field_int_z = -10;
                                 } else {
                                    field_int_z = -8;
                                 }

                                 field_int_fp = 1;
                                 field_int_y = 4;
                                 field_int_A = 3;
                                 field_int_iu = -1;
                                 field_int_C = 0;
                                 field_int_fG = -1;
                                 field_int_fH = -1;
                                 field_class_java_lang_String_o = " ";
                                 field_boolean_c = true;
                              }

                              if (field_array_boolean_aV[5]) {
                                 field_int_A = 5;
                                 field_int_fw = 0;
                                 field_int_C = 0;
                                 field_int_z = 0;
                                 field_array_boolean_aV[5] = false;
                                 field_int_fG = -1;
                                 field_int_fH = -1;
                                 field_class_java_lang_String_o = " ";
                                 field_boolean_c = true;
                              }
                           }
                        }
                     } else if (field_int_A == 2) {
                        if (field_array_boolean_aU[2]) {
                           field_int_iu = -1;
                           if (field_boolean_eL) {
                              field_int_z = -10;
                           } else {
                              field_int_z = -8;
                           }

                           field_int_A = 3;
                           field_int_C = 0;
                        } else if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                           } else {
                              field_int_y = -field_int_P + field_int_fr;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                           } else {
                              field_int_y = field_int_P + field_int_fr;
                           }
                        }

                        if (field_array_boolean_aV[5]) {
                           field_int_A = 5;
                           field_int_fw = 0;
                           field_int_C = 0;
                           field_int_z = 0;
                           field_array_boolean_aV[5] = false;
                        }
                     } else if (field_int_A == 11) {
                        if (field_array_boolean_aU[2]) {
                           if (field_boolean_eL) {
                              field_int_z = -10;
                           } else {
                              field_int_z = -8;
                           }

                           field_int_A = 3;
                           field_int_C = 0;
                        } else if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                           } else {
                              field_int_y = -field_int_K + field_int_fr;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                           } else {
                              field_int_y = field_int_K + field_int_fr;
                           }
                        }
                     } else if (field_int_A == 3) {
                        if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                           } else {
                              field_int_y = -field_int_P;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                           } else {
                              field_int_y = field_int_P;
                           }
                        }

                        if (field_array_boolean_aV[5]) {
                           field_int_A = 5;
                           field_int_fw = 0;
                           field_int_C = 0;
                           field_array_boolean_aV[5] = false;
                        }

                        if (field_array_boolean_aU[2] && field_int_I > 0 && field_int_z > -4 && (field_int_C == 0 && field_boolean_eM || field_int_C == 1 && field_boolean_eY)) {
                           ++field_int_C;
                           field_int_z = -7;
                           if ((field_int_I -= 3) < 0) {
                              field_int_I = 0;
                           }

                           field_boolean_c = true;
                           func_boolean_e(-1, field_int_fh - -8, field_int_fi);
                           func_boolean_e(1, field_int_fh - 8, field_int_fi);
                           func_boolean_g(field_int_fh, field_int_fi);
                        }
                     } else if (field_int_A == 4) {
                        if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                           } else {
                              field_int_y = -field_int_P;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                           } else {
                              field_int_y = field_int_P;
                           }
                        }

                        if (field_array_boolean_aV[5] && field_int_z > 4) {
                           field_int_A = 5;
                           field_int_C = 0;
                           field_int_fw = 0;
                           field_array_boolean_aV[5] = false;
                        }
                     } else if (field_int_A == 5) {
                        if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                           } else {
                              field_int_y = -field_int_P + 2;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                           } else {
                              field_int_y = field_int_P - 2;
                           }
                        }

                        if (field_array_boolean_aV[5]) {
                           field_boolean_fy = true;
                           field_array_boolean_aV[5] = false;
                        }
                     } else if (field_int_A == 18) {
                        if (field_array_boolean_aU[2]) {
                           field_int_z = -10;
                           field_int_A = 21;
                           field_int_C = 10;
                           field_int_iu = -1;
                        } else if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                              field_array_int_ip[field_int_im] = -1;
                           } else {
                              field_int_C = 1;
                              field_int_A = 19;
                              field_int_C = 10;
                              field_int_y = -field_int_Q;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                              field_array_int_ip[field_int_im] = 1;
                           } else {
                              field_int_A = 19;
                              field_int_C = 10;
                              field_int_y = field_int_Q;
                           }
                        } else if (field_array_boolean_aU[8]) {
                           field_int_A = 1;
                           field_int_im = -1;
                        }
                     } else if (field_int_A == 19) {
                        if (field_array_boolean_aU[2]) {
                           field_int_z = -10;
                           field_int_A = 21;
                           field_int_iu = -1;
                           field_int_C = 10;
                        } else if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                              field_array_int_ip[field_int_im] = -1;
                           } else {
                              field_int_y = -field_int_Q;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                              field_array_int_ip[field_int_im] = 1;
                           } else {
                              field_int_y = field_int_Q;
                           }
                        }
                     } else if (field_int_A == 21) {
                        if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                              field_array_int_ip[field_int_im] = -1;
                           } else {
                              field_int_y = -field_int_Q;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                              field_array_int_ip[field_int_im] = 1;
                           } else {
                              field_int_y = field_int_Q;
                           }
                        }
                     } else if (field_int_A == 20) {
                        if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                              field_array_int_ip[field_int_im] = -1;
                           } else {
                              field_int_y = -field_int_Q;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                              field_array_int_ip[field_int_im] = 1;
                           } else {
                              field_int_y = field_int_Q;
                           }
                        }
                     } else if (field_int_A == 17) {
                        if (field_array_boolean_aU[2]) {
                           field_int_z = -10;
                           field_int_A = 3;
                           field_int_ff = -1;
                           field_int_C = 0;
                        } else if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                           } else {
                              field_int_A = 16;
                              field_int_y = -field_int_L;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                           } else {
                              field_int_A = 16;
                              field_int_y = field_int_L;
                           }
                        }
                     } else if (field_int_A == 16) {
                        if (field_array_boolean_aU[2]) {
                           field_int_z = -10;
                           field_int_A = 3;
                           field_int_ff = -1;
                           field_int_C = 0;
                        } else if (field_array_boolean_aU[4]) {
                           if (field_int_fp == 1) {
                              field_int_fp = -1;
                           } else {
                              field_int_y = -field_int_L;
                           }
                        } else if (field_array_boolean_aU[6]) {
                           if (field_int_fp == -1) {
                              field_int_fp = 1;
                           } else {
                              field_int_y = field_int_L;
                           }
                        }
                     } else if (field_int_A == 12) {
                        if (field_array_boolean_aU[2] && field_boolean_eS) {
                           field_int_z = -10;
                           field_int_A = 3;
                           field_int_ff = -1;
                           field_int_C = 0;
                        }
                     } else if (field_int_A == 14) {
                        if (field_array_boolean_aU[4]) {
                           field_int_fp = -1;
                        } else if (field_array_boolean_aU[6]) {
                           field_int_fp = 1;
                        } else if (field_array_boolean_aU[2]) {
                           field_int_A = 15;
                        }
                     }
                  }
               }

               if (field_int_fR != field_int_fL || field_int_fS != field_int_fM) {
                  field_int_fN = field_int_fL - field_int_fR << 2;
                  field_int_fO = field_int_fM - field_int_fS << 2;
                  field_int_fP += field_int_fN;
                  field_int_fR += field_int_fP >> 4;
                  field_int_fP &= 15;
                  field_int_fQ += field_int_fO;
                  field_int_fS += field_int_fQ >> 4;
                  field_int_fQ &= 15;
                  if (field_int_fR < 0) {
                     field_int_fR = 0;
                  }

                  if (field_int_fR > field_int_fT) {
                     field_int_fR = field_int_fT;
                  }

                  if (field_int_fS < 0) {
                     field_int_fS = 0;
                  }

                  if (field_int_fS > field_int_fU) {
                     field_int_fS = field_int_fU;
                  }
               }

               if (field_int_aM >= 0) {
                  field_int_fR += field_array_int_aK[field_int_aM];
                  field_int_fS += field_array_int_aL[field_int_aM];
                  if (++field_int_aM == 4) {
                     field_int_aM = -1;
                  }

                  if (field_int_fR < 0) {
                     field_int_fR = 0;
                  }

                  if (field_int_fR > field_int_fT) {
                     field_int_fR = field_int_fT;
                  }

                  if (field_int_fS < 0) {
                     field_int_fS = 0;
                  }

                  if (field_int_fS > field_int_fU) {
                     field_int_fS = field_int_fU;
                  }
               }

               if ((field_int_bz = field_int_fR / field_int_jh - 1) < 0) {
                  field_int_bz = 0;
               }

               field_int_bA = field_int_fS / field_int_jh;
               field_int_bD = field_int_bz + field_int_bB;
               field_int_bE = field_int_bA + field_int_bC;
               if (field_int_bA < 0) {
                  field_int_bA = 0;
               }

               if (field_int_bE > field_int_iQ - 1) {
                  field_int_bE = field_int_iQ - 1;
               }

               int[] var10000;
               for(var12 = 0; var12 < field_int_it; ++var12) {
                  switch(field_array_int_ix[var12]) {
                  case 2:
                     var10000 = field_array_int_iv;
                     var10000[var12] += field_array_int_iy[var12];
                     if (field_array_int_iy[var12] > 0) {
                        var10002 = field_array_int_iy[var12]--;
                     } else if (field_array_int_iy[var12] < 0) {
                        var10002 = field_array_int_iy[var12]++;
                     } else {
                        field_array_int_ix[var12] = 1;
                     }

                     if (!func_boolean_g(field_array_int_iv[var12] - 12, field_array_int_iw[var12] + 1, 2) && !func_boolean_g(field_array_int_iv[var12] + 12, field_array_int_iw[var12] + 1, 2)) {
                        field_array_int_ix[var12] = 4;
                        field_array_int_iz[var12] = 2;
                     }

                     if (func_boolean_g(field_array_int_iv[var12] + 12, field_array_int_iw[var12] - 2, 4) || func_boolean_g(field_array_int_iv[var12] - 12, field_array_int_iw[var12] - 2, 8)) {
                        field_array_int_iv[var12] = func_int_I(field_array_int_iv[var12]) + 12;
                     }
                     break;
                  case 4:
                     var10000 = field_array_int_iw;
                     var10000[var12] += field_array_int_iz[var12];
                     if (field_array_int_iz[var12] < 20) {
                        var10002 = field_array_int_iz[var12]++;
                     }

                     if (!func_boolean_g(field_array_int_iv[var12] + 12, field_array_int_iw[var12], 2) && !func_boolean_g(field_array_int_iv[var12] - 12, field_array_int_iw[var12], 2)) {
                        if (func_boolean_g(field_array_int_iv[var12], field_array_int_iw[var12] - field_int_jh, 64)) {
                           field_array_int_iw[var12] = func_int_H(field_array_int_iw[var12]) + 1;
                           func_boolean_g(field_array_int_iv[var12], field_array_int_iw[var12] - 13);
                           func_boolean_g(field_array_int_iv[var12] + 1, field_array_int_iw[var12] - 10);
                           field_array_int_iz[var12] = 1;
                           field_array_int_iA[var12] = -1;
                           field_array_int_iB[var12] = 1;
                           field_array_int_ix[var12] = 11;
                        }
                        break;
                     }

                     field_array_int_iw[var12] = func_int_H(field_array_int_iw[var12]);
                     field_array_int_iz[var12] = 0;
                     field_array_int_ix[var12] = 1;
                     break;
                  case 11:
                     if (field_int_w % 2 == 0) {
                        var10000 = field_array_int_iw;
                        var10000[var12] += field_array_int_iA[var12];
                        var10000 = field_array_int_iz;
                        var10000[var12] += field_array_int_iA[var12];
                        if (field_array_int_iz[var12] >= 1) {
                           field_array_int_iA[var12] = -1;
                        }

                        if (field_array_int_iz[var12] <= -1) {
                           field_array_int_iA[var12] = 1;
                        }

                        var10000 = field_array_int_iv;
                        var10000[var12] += field_array_int_iB[var12];
                        if (var12 == field_int_iu) {
                           field_int_fi = field_array_int_iw[field_int_iu] - 24;
                           field_int_fh += field_array_int_iB[var12];
                        }

                        if (func_boolean_g(field_array_int_iv[var12] + 12, field_array_int_iw[var12], 4) || func_boolean_g(field_array_int_iv[var12] - 12, field_array_int_iw[var12], 8)) {
                           field_array_int_iB[var12] = -field_array_int_iB[var12];
                        }
                     }
                  }
               }

               for(var12 = 0; var12 < field_int_il; ++var12) {
                  if (var12 == field_int_im) {
                     if (field_int_C > 1) {
                        field_array_int_iq[var12] = 2;
                     } else if (field_int_w % 8 > 3) {
                        field_array_int_iq[var12] = 1;
                     } else {
                        field_array_int_iq[var12] = 0;
                     }
                  }

                  if (field_array_int_ir[var12] == 1) {
                     var10000 = field_array_int_io;
                     var10000[var12] += field_array_int_is[var12];
                     if (field_array_int_is[var12] < 20) {
                        var10002 = field_array_int_is[var12]++;
                     }

                     if (field_array_int_io[var12] >= field_int_iS || func_boolean_g(field_array_int_in[var12], field_array_int_io[var12], 2)) {
                        field_array_int_is[var12] = 0;
                        field_array_int_ir[var12] = 0;
                        field_array_int_io[var12] = func_int_H(field_array_int_io[var12]);
                     }
                  }
               }

               for(var12 = 0; var12 < 5; ++var12) {
                  if (field_array_int_dW[var12] != -1) {
                     var10000 = field_array_int_dW;
                     var10000[var12] += func_int_a(field_array_int_dV[var12]);
                     if (field_array_int_dW[var12] > 30) {
                        field_array_int_dW[var12] = -1;
                     }

                     var10000 = field_array_int_dS;
                     var10000[var12] += field_array_int_dU[var12];
                     var10000 = field_array_int_dT;
                     var10000[var12] += field_array_int_dV[var12];
                  }
               }

               if (!field_boolean_a) {
                  for(var12 = 0; var12 < 2; ++var12) {
                     if (field_array_int_ck[var12] != -1) {
                        var10002 = field_array_int_cj[var12]--;
                        if (field_int_w % 2 == 0) {
                           var10002 = field_array_int_ck[var12]++;
                           if (field_array_int_ck[var12] > 2) {
                              field_array_int_ck[var12] = -1;
                           } else {
                              field_array_int_cl[var12] = field_array_int_ck[var12];
                           }
                        }
                     }
                  }
               }

               if (!field_boolean_a) {
                  for(var12 = 0; var12 < 2; ++var12) {
                     if (field_array_int_co[var12] != -1) {
                        var10002 = field_array_int_co[var12]++;
                        if (field_array_int_co[var12] >= 5) {
                           field_array_int_co[var12] = -1;
                        }

                        if (var12 == 0) {
                           var10002 = field_array_int_cm[var12]--;
                        } else {
                           var10002 = field_array_int_cm[var12]++;
                        }

                        var10002 = field_array_int_cn[var12]--;
                     }
                  }
               }

               for(var12 = 0; var12 < 2; ++var12) {
                  if (field_array_int_cf[var12] != -1) {
                     var10002 = field_array_int_cf[var12]++;
                     var10000 = field_array_int_cd;
                     var10000[var12] += field_array_int_ch[var12] << 2;
                     var10002 = field_array_int_ce[var12]--;
                     if (field_array_int_cf[var12] >= 6) {
                        field_array_int_cf[var12] = -1;
                     } else {
                        field_array_int_cg[var12] = (field_array_int_cf[var12] >> 1) % 3;
                     }
                  }
               }

               int var5;
               for(var12 = 0; var12 < field_int_cY; ++var12) {
                  if (field_array_int_db[var12] == 1) {
                     var10000 = field_array_int_cZ;
                     var10000[var12] += field_array_int_dd[var12];
                     var10000 = field_array_int_da;
                     var10000[var12] += field_array_int_de[var12];
                     if (field_array_int_cZ[var12] >= field_int_fR && field_array_int_cZ[var12] <= field_int_fR + field_int_q && field_array_int_da[var12] >= field_int_fS && field_array_int_da[var12] <= field_int_fS + field_int_r) {
                        if (field_array_int_dd[var12] > 0 && (func_int_i(field_array_int_cZ[var12], field_array_int_da[var12]) & 4) == 4) {
                           field_array_int_db[var12] = 2;
                           field_array_int_cZ[var12] = func_int_I(field_array_int_cZ[var12]);
                        } else if (field_array_int_dd[var12] < 0 && (func_int_i(field_array_int_cZ[var12], field_array_int_da[var12]) & 8) == 8) {
                           field_array_int_db[var12] = 2;
                           field_array_int_cZ[var12] = func_int_I(field_array_int_cZ[var12]) + field_int_jh;
                        }

                        var10002 = field_array_int_dc[var12]++;
                        if (field_array_int_dc[var12] > 1) {
                           field_array_int_dc[var12] = 0;
                        }

                        if (field_array_int_dd[var12] != 0) {
                           for(var4 = 0; var4 < field_int_jK; ++var4) {
                              if (field_array_int_jS[var4] != 5 && field_array_int_jS[var4] != 1 && func_int_a(field_array_int_jN[var4] - field_array_int_cZ[var12]) < field_array_int_jQ[var4] && func_int_a(field_array_int_jO[var4] - (field_array_int_jP[var4] >> 1) - field_array_int_da[var12]) < field_array_int_jP[var4]) {
                                 boolean var14;
                                 label2760: {
                                    var5 = field_array_boolean_df[var12] ? field_int_F << 1 : field_int_F;
                                    if (field_array_int_jS[var4] == 2 || field_array_int_jS[var4] == 3 || field_array_int_jS[var4] == 4) {
                                       if (field_array_int_jM[var4] == 9 && field_array_int_dd[var12] * field_array_int_kb[var4] < 0) {
                                          field_array_int_jS[var4] = 4;
                                          field_array_int_jX[var4] = 4;
                                          field_array_int_dd[var12] = -field_array_int_dd[var12];
                                          field_array_int_de[var12] = -field_array_int_de[var12];
                                          var10000 = field_array_int_cZ;
                                          var10000[var12] += field_array_int_dd[var12];
                                          var10000 = field_array_int_da;
                                          var10000[var12] += field_array_int_de[var12];
                                          var14 = true;
                                          break label2760;
                                       }

                                       var10000 = field_array_int_kc;
                                       var10000[var4] -= var5;
                                       if (field_array_int_kc[var4] <= 0) {
                                          field_array_int_kc[var4] = 0;
                                          field_array_int_jX[var4] = -5;
                                          field_array_int_jY[var4] = field_array_int_dd[var12];
                                          field_array_int_jZ[var4] = 0;
                                          field_array_int_jR[var4] = 0;
                                          field_array_int_jS[var4] = 1;
                                          func_void_L(var4);
                                          var14 = true;
                                          break label2760;
                                       }

                                       field_array_int_jX[var4] = 0;
                                       field_array_int_kb[var4] = field_array_int_dd[var12] < 0 ? 1 : -1;
                                       field_array_int_jS[var4] = 6;
                                       field_array_int_ka[var4] = 3;
                                       field_array_int_db[var12] = -1;
                                    }

                                    var14 = false;
                                 }

                                 if (!var14) {
                                    func_boolean_f(field_array_int_jN[var4], field_array_int_jO[var4] - (field_array_int_jP[var4] >> 1), field_array_int_kb[var4]);
                                    func_void_a("-" + var5, 0, field_array_int_jN[var4], field_array_int_jO[var4] - field_array_int_jP[var4], 0, -2);
                                 }
                                 break;
                              }
                           }

                           for(var4 = 0; var4 < field_int_cs; ++var4) {
                              if (field_array_int_cH[var4] != 5 && field_array_int_cH[var4] != 1 && func_int_a(field_array_int_cx[var4] - field_array_int_cZ[var12]) < 20 && func_int_a(field_array_int_cy[var4] - 15 - field_array_int_da[var12]) < 20) {
                                 if (field_array_boolean_df[var12]) {
                                    func_boolean_a(var4, field_int_F << 1, field_array_int_cK[var12]);
                                    func_boolean_f(field_array_int_cx[var4], field_array_int_cy[var4] - 15, field_array_int_cK[var4]);
                                    func_void_a("-" + (field_int_F << 1), 0, field_array_int_cx[var4], field_array_int_cy[var4] - 32, 0, -2);
                                    field_array_int_db[var12] = -1;
                                 } else {
                                    field_array_int_cH[var4] = 4;
                                    field_array_int_cI[var4] = 0;
                                    field_array_int_cJ[var4] = 0;
                                    field_array_int_cK[var4] = field_array_int_dd[var12] > 0 ? -1 : 1;
                                    field_array_int_dd[var12] = -field_array_int_dd[var12];
                                 }
                                 break;
                              }
                           }

                           if (!field_array_boolean_df[var12] && func_int_a(field_int_fh - field_array_int_cZ[var12]) < field_int_fl && func_int_a(field_int_fi - field_int_fm - field_array_int_da[var12]) < field_int_fm) {
                              if (field_int_A == 5 && field_int_fg == 0) {
                                 field_array_int_dd[var12] = -field_array_int_dd[var12];
                                 field_array_int_de[var12] = -3;
                              } else {
                                 func_void_a(field_int_F, -field_int_fp);
                                 field_array_int_db[var12] = -1;
                              }
                              break;
                           }

                           if (field_boolean_gQ && func_int_a(field_int_gS - field_array_int_cZ[var12]) < field_int_gY >> 1 && func_int_a(field_int_gT - (field_int_gZ >> 1) - field_array_int_da[var12]) < field_int_gZ >> 1) {
                              func_boolean_c(field_int_F, -field_int_gW);
                              func_boolean_f(field_array_int_cZ[var12], field_array_int_da[var12], field_int_gW);
                              func_void_a("-" + field_int_F, 0, field_int_gS, field_int_gT - field_int_gZ, 0, -2);
                              field_array_int_db[var12] = -1;
                           }

                           if (field_boolean_hM && func_int_a(field_int_hS - field_array_int_cZ[var12]) < field_int_hR >> 1 && func_int_a(field_int_hT - (field_int_hO >> 1) - field_array_int_da[var12]) < field_int_hO >> 1) {
                              field_array_int_dd[var12] = -field_array_int_dd[var12];
                              field_array_int_de[var12] = -1;
                           }

                           if (field_boolean_hf && func_int_a(field_array_int_dC[0] - field_array_int_cZ[var12]) < 12 && func_int_a(field_array_int_dD[0] - 16 - field_array_int_da[var12]) < 32) {
                              if (field_array_int_dG[0] == 5 && field_array_int_dd[var12] * field_array_int_dM[0] < 0) {
                                 field_array_int_dd[var12] = -field_array_int_dd[var12];
                              } else if (field_array_int_dG[0] == 1 && field_array_int_dd[var12] * field_array_int_dM[0] < 0) {
                                 field_array_int_dd[var12] = -field_array_int_dd[var12];
                                 field_array_int_dH[0] = field_array_int_dI[0] = 0;
                                 field_array_int_dG[0] = 5;
                              } else {
                                 func_void_d(field_int_F, -field_array_int_dM[0]);
                                 field_array_int_db[var12] = -1;
                              }
                           }
                        }
                     } else {
                        field_array_int_db[var12] = -1;
                     }
                  } else if (field_array_int_db[var12] > 1) {
                     var10002 = field_array_int_db[var12]++;
                     if (field_array_int_db[var12] >= 10) {
                        field_array_int_db[var12] = 1;
                        field_array_int_de[var12] = 12;
                        field_array_int_dd[var12] = 0;
                     }
                  }
               }

               func_void_O();
               if (field_int_ea > 0 && ++field_int_ea > 30) {
                  field_int_ea = 0;
               }

               func_void_P();
               if (field_int_ge >= 0) {
                  if (field_int_gf > field_int_fR + 10 && field_int_gf < field_int_fR + field_int_q - 10 && field_int_gg > field_int_fS + 10 && field_int_gg < field_int_fS + field_int_r - 10) {
                     field_int_gh = 2;
                     field_int_gi = field_int_gf;
                     field_int_gj = field_int_gg + field_int_gl;
                  } else if (func_int_a(field_int_fh - field_int_gf) > func_int_a(field_int_fi - field_int_gg)) {
                     if (field_int_fh > field_int_gf) {
                        field_int_gh = 1;
                        field_int_gi = field_int_fR + 20 + field_int_gl;
                     } else {
                        field_int_gh = 0;
                        field_int_gi = field_int_fR + field_int_q - 20 + field_int_gl;
                     }

                     if ((field_int_gj = field_int_gg + 24) < field_int_fS + 10) {
                        field_int_gj = field_int_fS + 10;
                     }

                     if (field_int_gj > field_int_fS + field_int_r - 10) {
                        field_int_gj = field_int_fS + field_int_r - 10;
                     }
                  } else if (field_int_fi > field_int_gg) {
                     field_int_gh = 3;
                     field_int_gi = field_int_fh;
                     field_int_gj = field_int_fS + 20 + field_int_gl;
                  } else {
                     field_int_gh = 2;
                     field_int_gi = field_int_fh;
                     field_int_gj = field_int_fS + field_int_r - 20 + field_int_gl;
                  }

                  if ((field_int_gl += field_int_gk) == 5 || field_int_gl == -5) {
                     field_int_gk = -field_int_gk;
                  }
               }

               func_void_R();
               if (field_int_gp == field_int_v) {
                  try {
                     switch(field_int_gu) {
                     case 1:
                        if (++field_int_gD > 30) {
                           field_int_gD = 0;
                        }

                        if (field_int_gD % 15 < 5) {
                           field_int_gv = 0;
                        } else {
                           field_int_gv = 1;
                        }

                        if (field_boolean_gn && field_int_w % 6 == 0) {
                           func_void_D();
                        }

                        if (field_int_w % 15 == 0) {
                           func_void_E();
                        }
                        break;
                     case 2:
                        if (++field_int_gD >= 10) {
                           field_int_gD = 0;
                        }

                        field_int_gv = (field_int_gD >> 1) + 2;
                        if (field_int_gC == 1) {
                           if (func_boolean_g(field_int_gq + field_int_gy, field_int_gr - field_int_gz, 4)) {
                              field_int_gs = 0;
                              field_int_gq = func_int_I(field_int_gq + field_int_gy) - field_int_gy;
                           }
                        } else if (func_boolean_g(field_int_gq - field_int_gy - 1, field_int_gr - field_int_gz, 8)) {
                           field_int_gs = 0;
                           field_int_gq = func_int_I(field_int_gq - field_int_gy - 1) + field_int_jh + field_int_gy;
                        }

                        if ((field_int_gq += field_int_gs) < 0) {
                           field_int_gq = 0;
                        }

                        if (field_int_gq >= field_int_iR) {
                           field_int_gq = field_int_iR - 1;
                        }

                        if (field_int_iu != -1) {
                           if (func_int_a(field_int_gq - field_array_int_iv[field_int_iu]) >= 20) {
                              field_int_iu = -1;
                              if (func_boolean_g(field_int_gq, field_int_gr, 2)) {
                                 field_int_gu = 1;
                              } else {
                                 field_int_gu = 4;
                                 field_int_gt = 2;
                                 field_int_gs = 3 * field_int_gC;
                                 field_int_gE = 0;
                              }
                           }
                        } else if ((func_int_i(field_int_gq + field_int_gC * field_int_gw, field_int_gr) & 2) != 2) {
                           field_int_gu = 1;
                           field_int_gv = 0;
                           field_int_gs = 0;
                           field_int_gD = 0;
                           field_int_gE = 0;
                        }

                        func_boolean_e(field_int_gC, field_int_gq - (field_int_gC << 3), field_int_gr);
                        if (field_int_gN > 0) {
                           --field_int_gN;
                        } else {
                           func_void_E();
                        }
                        break;
                     case 3:
                        if (field_int_gs == 0) {
                           field_int_gs = field_int_gC << 2;
                        }

                        if (field_int_gC == 1) {
                           if ((func_int_i(field_int_gq + field_int_gy, field_int_gr - field_int_gz) & 4) == 4) {
                              field_int_gs = 0;
                           }
                        } else if ((func_int_i(field_int_gq - field_int_gy, field_int_gr - field_int_gz) & 8) == 8) {
                           field_int_gs = 0;
                        }

                        if (field_int_fi < 0) {
                           field_int_fi = 0;
                           field_int_z = -1;
                        }

                        if ((field_int_gq += field_int_gs) < 0) {
                           field_int_gq = 0;
                        }

                        if (field_int_gq >= field_int_iR) {
                           field_int_gq = field_int_iR - 1;
                        }

                        field_int_gr += field_int_gt;
                        if (field_int_gD == 0) {
                           field_int_gv = 7;
                        } else {
                           field_int_gv = 8;
                        }

                        if (field_int_gs > 1) {
                           --field_int_gs;
                        }

                        if (++field_int_gt == 0) {
                           field_int_gu = 4;
                           field_int_gD = 0;
                           field_int_gE = 0;
                           field_int_gt = 1;
                        }

                        if (field_int_gF < 0) {
                           ++field_int_gF;
                        }
                        break;
                     case 4:
                        if (field_int_gC == 1) {
                           if ((func_int_i(field_int_gq + field_int_gw, field_int_gr) & 4) == 4) {
                              field_int_gs = 0;
                           }
                        } else if ((func_int_i(field_int_gq - field_int_gw, field_int_gr) & 8) == 8) {
                           field_int_gs = 0;
                        }

                        field_int_ij = -1;
                        if ((field_int_gq += field_int_gs) < 0) {
                           field_int_gq = 0;
                        }

                        if (field_int_gq >= field_int_iR) {
                           field_int_gq = field_int_iR - 1;
                        }

                        field_int_gr += field_int_gt;
                        if (field_int_gt < 18) {
                           ++field_int_gt;
                        }

                        if (field_int_gt > 5) {
                           field_int_gs = 0;
                        }

                        if (field_int_gs > 1) {
                           --field_int_gs;
                        }

                        field_int_gv = 8;
                        if (field_int_gr >= field_int_iS) {
                           field_int_gr = field_int_iS - 1;
                           field_int_gu = 3;
                           field_int_gt = -20;
                        }

                        if (field_int_gt > 4 && (func_int_i(field_int_gq, field_int_gr) & 2) == 2) {
                           field_int_gu = 1;
                           field_int_gt = 0;
                           field_int_gs = 0;
                           field_int_gE = 0;
                           field_int_gD = 0;
                           field_int_gr = func_int_I(field_int_gr);
                           func_boolean_e(-1, field_int_gq - -8, field_int_gr);
                           func_boolean_e(1, field_int_gq - 8, field_int_gr);
                        }

                        if (func_boolean_g(field_int_gq, field_int_gr, 64) && func_boolean_g(field_int_gq, field_int_gr + 24, 4096) && field_int_gr % field_int_jh > 8) {
                           func_boolean_g(field_int_gq, func_int_H(field_int_gr) + 8);
                           field_int_gu = 3;
                           field_int_gs = (field_int_gC = field_int_fh > field_int_gq ? 1 : -1) << 2;
                           field_int_gt = -11;
                        }

                        if (field_int_gt > 6) {
                           field_int_gv = 6;
                        }

                        if (field_int_gF < 0) {
                           ++field_int_gF;
                        }
                        break;
                     case 5:
                        switch(++field_int_gD) {
                        case 1:
                        case 2:
                        case 3:
                           field_int_ij = -1;
                           field_int_gv = 9;
                           break;
                        case 4:
                        case 5:
                           field_int_ij = 0;
                           field_int_gv = 10;
                           break;
                        case 6:
                           field_int_ij = 1;
                           field_int_gv = 11;
                           func_void_v();
                           break;
                        case 7:
                           field_int_ij = 2;
                           field_int_gv = 11;
                           break;
                        case 8:
                           field_int_ij = -1;
                           field_int_gv = 12;
                           break;
                        case 9:
                           field_int_ij = -1;
                           field_int_gv = 9;
                           field_int_gu = 1;
                           field_int_gD = 0;
                           field_int_gE = 0;
                        }

                        if (field_int_ik == 1) {
                           field_int_ij = -1;
                        }
                     case 6:
                     default:
                        break;
                     case 7:
                        if ((func_int_i(field_int_gq + field_int_gy, field_int_gr - field_int_gz) & 4) == 4) {
                           field_int_gs = -field_int_gs;
                        }

                        if ((func_int_i(field_int_gq - field_int_gy, field_int_gr - field_int_gz) & 8) == 8) {
                           field_int_gs = -field_int_gs;
                        }

                        field_int_gq += field_int_gs;
                        field_int_gr += field_int_gt;
                        field_int_gv = 7;
                        if (field_int_gs > 1) {
                           --field_int_gs;
                        }

                        if (field_int_gs < -1) {
                           ++field_int_gs;
                        }

                        if (++field_int_gt > 0) {
                           field_int_gt = 0;
                        }

                        if (++field_int_gD >= 7) {
                           field_int_gu = 4;
                           field_int_gF = -20;
                           field_int_gE = 0;
                           field_int_gD = 0;
                           field_int_gt = 1;
                        }
                     }
                  } catch (Exception var11) {
                     field_int_gq = field_int_fh;
                     field_int_gr = field_int_fi;
                     field_int_gs = 0;
                     field_int_gt = 0;
                     field_int_gu = 4;
                  }
               }

               func_void_Y();
               if (field_int_w % 2 == 0 && ((field_int_dr += field_int_dt) > field_int_dv || field_int_dr < field_int_du)) {
                  field_int_dt = -field_int_dt;
                  field_int_dr += field_int_dt;
               }

               func_void_al();
               func_void_aa();
               if (field_boolean_gQ) {
                  if (field_int_he > 0) {
                     --field_int_he;
                  }

                  switch(field_int_gV) {
                  case 1:
                     if (field_int_ha > 0) {
                        --field_int_ha;
                     } else {
                        if ((var12 = field_int_w % 80 - 40) > 0) {
                           var12 += 20;
                        } else {
                           var12 -= 20;
                        }

                        field_int_hb = field_int_gS + var12;
                        field_int_gU = (field_int_gW = var12 > 0 ? 1 : -1) << 2;
                        if (field_int_hc < field_int_hd >> 1) {
                           field_int_gU = field_int_gW << 3;
                        }

                        field_int_gV = 2;
                        if (field_int_w % 5 == 0) {
                           func_void_N();
                        }
                     }

                     field_int_gX = 0;
                     if (field_int_w % 10 == 6) {
                        func_boolean_e(-field_int_gW, field_int_gS + field_int_gW * 28, field_int_gT - 5);
                     }
                     break;
                  case 2:
                     if (field_int_w % 8 == 0) {
                        func_void_N();
                     }

                     if (!func_boolean_g(field_int_gS + (field_int_gW << 4), field_int_gT + 1, 2)) {
                        field_int_gV = 1;
                        field_int_ha = 0;
                     } else {
                        if (func_int_a(field_int_gS - field_int_hb) < 8) {
                           field_int_gV = 1;
                           field_int_ha = 20;
                        }

                        if (field_int_w % 2 == 0) {
                           field_int_gS += field_int_gU;
                           field_int_gX = 0;
                        } else {
                           field_int_gX = 1;
                        }
                     }
                  case 3:
                  case 4:
                  default:
                     break;
                  case 5:
                     if (!func_boolean_g(field_int_gS + (field_int_gW << 4), field_int_gT + 1, 2)) {
                        field_int_gV = 1;
                        field_int_ha = 0;
                     } else {
                        if (func_int_a(field_int_gS - field_int_hb) < 4) {
                           field_int_gV = 1;
                           field_int_ha = 35;
                        }

                        if (func_int_a(field_int_fi - field_int_gT) < 18 && func_int_a(field_int_gS + (field_int_gW << 4) - field_int_fh) < 10) {
                           func_void_a(field_int_gR, field_int_gW);
                           field_int_gV = 1;
                           field_int_ha = 45;
                           if (field_int_hc < field_int_hd >> 1) {
                              field_int_ha = 18;
                           }
                        }

                        field_int_gS += field_int_gU;
                        field_int_gX = field_int_w % 3;
                     }
                     break;
                  case 6:
                     field_int_gT += field_int_ha;
                     ++field_int_ha;
                     field_int_gS += field_int_gU;
                     if (field_int_gU > 1) {
                        --field_int_gU;
                     }

                     if (field_int_gU < -1) {
                        ++field_int_gU;
                     }

                     if (field_int_gT > field_int_fS + field_int_r + field_int_gZ || field_int_gT >= field_int_iS + field_int_gZ) {
                        field_int_ha = 0;
                        field_int_gV = 22;
                     }
                     break;
                  case 7:
                     field_int_gS -= field_int_gW;
                     field_int_gX = 2;
                     if (++field_int_ha == 4) {
                        field_int_gV = 1;
                        if ((field_int_ha = field_int_hb) > 0 && field_int_hc < field_int_hd >> 1) {
                           field_int_ha = 5;
                        }
                     }
                  }
               }

               if (field_boolean_hM) {
                  var12 = field_int_w % 10;
                  if (field_int_if > 0) {
                     --field_int_if;
                  }

                  switch(field_int_ia) {
                  case 1:
                     ++field_int_ie;
                     field_int_hT += 2;
                     ++field_int_bM;
                     ++field_int_bN;
                     ++field_int_bO;
                     if (field_int_ie > 50) {
                        field_int_ia = 5;
                     }
                     break;
                  case 2:
                     if (field_int_hP < field_int_hQ >> 1) {
                        field_int_hS += field_int_ib << 2;
                     } else {
                        field_int_hS += field_int_ib << 1;
                     }

                     if (field_int_hS < field_int_ic) {
                        field_int_ib = 1;
                     }

                     if (field_int_hS > field_int_id) {
                        field_int_ib = -1;
                     }

                     if (field_int_ie > 0) {
                        --field_int_ie;
                     }

                     if (field_int_ie == 0 && func_int_a(field_int_fh - (field_int_hS - 40)) < 30) {
                        field_int_ie = 0;
                        field_int_ia = 4;
                        field_int_ib = field_int_hS < field_int_fh ? 1 : -1;
                     }

                     if (field_int_w % 122 == 0) {
                        func_void_c(field_int_hS, field_int_hT - 45, -1, -12, field_int_hN);
                        func_void_c(field_int_hS, field_int_hT - 50, 0, -15, field_int_hN);
                        func_void_c(field_int_hS, field_int_hT - 45, 1, -12, field_int_hN);
                     } else if (field_int_w % 200 == 0) {
                        field_int_ia = 7;
                        field_int_ie = 0;
                     }
                  case 3:
                  case 5:
                  case 6:
                  default:
                     break;
                  case 4:
                     if (field_int_ie == 110) {
                        field_int_ia = 2;
                        field_int_ie = 30;
                     } else if (field_int_ie < 35) {
                        --field_int_hT;
                     } else if (field_int_ie >= 75) {
                        ++field_int_hT;
                        if (var12 == 5) {
                           func_void_c(field_int_hS, field_int_hT - 45, -2, -10, field_int_hN);
                        } else if (var12 == 7 && field_int_hP < field_int_hQ >> 1) {
                           func_void_c(field_int_hS, field_int_hT - 50, 0, -11, field_int_hN);
                        } else if (var12 == 9) {
                           func_void_c(field_int_hS, field_int_hT - 45, 2, -10, field_int_hN);
                        }
                     }

                     if (field_int_ie > 20 && field_int_ie < 50 && var12 == 0) {
                        func_void_b(field_int_hS + field_int_ib * 20, field_int_hT - 29, field_int_ib << 3, field_int_hN, 2);
                     }

                     if (field_int_ie > 45 && field_int_ie < 50) {
                        field_int_bL += field_int_ib;
                     } else if (field_int_ie > 50 && field_int_ie < 55) {
                        field_int_bL -= field_int_ib;
                     }

                     ++field_int_ie;
                     break;
                  case 7:
                     if (++field_int_ie == 50) {
                        field_int_ia = 2;
                        field_int_ie = 1;
                     } else if (field_int_ie == 30) {
                        if ((field_int_hS = field_int_fh + (field_int_fp << 6)) > field_int_id) {
                           field_int_hS = field_int_id - 30;
                        }

                        if (field_int_hS < field_int_ic) {
                           field_int_hS = field_int_ic + 30;
                        }

                        field_int_ib = field_int_hS < field_int_fh ? 1 : -1;
                     } else if (field_int_ie < 10) {
                        field_int_hT += 10;
                     } else if (field_int_ie > 40) {
                        field_int_hT -= 10;
                     }
                  }

                  if (var12 < 4) {
                     --field_int_hT;
                  } else if (var12 < 8) {
                     ++field_int_hT;
                  }

                  if (var12 > 4) {
                     --field_int_bM;
                     ++field_int_bN;
                  } else {
                     ++field_int_bM;
                     --field_int_bN;
                  }

                  if (field_int_ib == -1) {
                     field_int_hU = field_int_hS + field_int_bJ;
                     field_int_hY = field_int_hT + field_int_bM;
                     field_int_hX = field_int_hS + field_int_bK;
                     field_int_hZ = field_int_hT + field_int_bN;
                     field_int_hV = field_int_hS + field_int_bL;
                     field_int_hW = field_int_hT + field_int_bO;
                  } else {
                     field_int_hU = field_int_hS - field_int_bJ;
                     field_int_hY = field_int_hT + field_int_bM;
                     field_int_hX = field_int_hS - field_int_bK;
                     field_int_hZ = field_int_hT + field_int_bN;
                     field_int_hV = field_int_hS - field_int_bL;
                     field_int_hW = field_int_hT + field_int_bO;
                  }
               }

               func_void_ac();
               if (field_boolean_hf) {
                  label2779: {
                     var12 = field_int_w % 50;
                     var5 = func_int_a(field_array_int_dC[0] - field_int_fh);
                     switch(field_array_int_dG[0]) {
                     case 0:
                        var10002 = field_array_int_dH[0]++;
                        if (field_array_int_dH[0] > 30) {
                           field_array_int_dH[0] = 0;
                        }

                        if (field_array_int_dH[0] % 18 < 6) {
                           field_array_int_dJ[0] = 0;
                        } else {
                           field_array_int_dJ[0] = 1;
                        }

                        if (field_boolean_dA) {
                           field_boolean_hg = false;
                           field_array_int_dI[0] = field_int_dB;
                           field_array_int_dM[0] = field_int_dB > field_array_int_dC[0] ? 1 : -1;
                           field_array_int_dE[0] = field_array_int_dM[0] << 2;
                           field_array_int_dE[0] = field_array_int_dM[0] > 0 ? field_array_int_dE[0] : field_array_int_dE[0];
                           field_array_int_dG[0] = 2;
                           break label2779;
                        }

                        if (var5 >= 40 || field_int_A != 5) {
                           break label2779;
                        }

                        field_boolean_hg = true;
                        field_array_int_dG[0] = 3;
                        field_array_int_dM[0] = -field_int_fp;
                        if (var12 > 35) {
                           field_array_int_dE[0] = field_int_fp * 5;
                           field_array_int_dF[0] = -9;
                        } else {
                           field_array_int_dE[0] = -field_int_fp * 6;
                           field_array_int_dF[0] = -9;
                        }

                        if (field_array_int_dC[0] < field_array_int_dP[0] + 40) {
                           field_array_int_dE[0] = 10;
                           field_array_int_dM[0] = -1;
                        } else if (field_array_int_dC[0] > field_array_int_dQ[0] - 40) {
                           field_array_int_dE[0] = -10;
                           field_array_int_dM[0] = 1;
                        }
                        break;
                     case 1:
                        var10002 = field_array_int_dH[0]++;
                        if (field_array_int_dH[0] > 30) {
                           field_array_int_dH[0] = 0;
                        }

                        if (field_array_int_dH[0] % 18 < 6) {
                           field_array_int_dJ[0] = 0;
                        } else {
                           field_array_int_dJ[0] = 1;
                        }

                        if (field_boolean_hh) {
                           field_array_int_dG[0] = 0;
                           field_array_int_dH[0] = field_array_int_dI[0] = 0;
                        }

                        if (var5 < 40 && field_int_A == 5 && field_int_fp != field_array_int_dM[0]) {
                           field_array_int_dG[0] = 3;
                           field_array_int_dM[0] = -field_int_fp;
                           if (var12 > 35) {
                              field_array_int_dE[0] = field_int_fp * 5;
                              field_array_int_dF[0] = -9;
                           } else {
                              field_array_int_dE[0] = -field_int_fp * 6;
                              field_array_int_dF[0] = -9;
                           }

                           if (field_array_int_dC[0] < field_array_int_dP[0] + 40) {
                              field_array_int_dE[0] = 10;
                              field_array_int_dM[0] = -1;
                           } else if (field_array_int_dC[0] > field_array_int_dQ[0] - 40) {
                              field_array_int_dE[0] = -10;
                              field_array_int_dM[0] = 1;
                           }

                           field_array_int_dH[0] = field_array_int_dI[0] = 0;
                        } else if (var5 < 40 && var12 < 10) {
                           field_array_int_dM[0] = field_int_fh > field_array_int_dC[0] ? 1 : -1;
                           field_array_int_dG[0] = 5;
                           field_array_int_dH[0] = field_array_int_dI[0] = field_array_int_dO[0] = 0;
                        } else if (var5 < 100 && var5 > 40 && var12 < 1) {
                           field_array_int_dM[0] = field_int_fh > field_array_int_dC[0] ? 1 : -1;
                           field_array_int_dG[0] = 24;
                           field_array_int_dH[0] = field_array_int_dI[0] = field_array_int_dO[0] = 0;
                           field_array_int_dE[0] = (func_int_a(field_array_int_dC[0] - field_int_fh) >> 3) * field_array_int_dM[0];
                        } else if (var5 > 100 && var5 < 160 && var12 < 30) {
                           field_array_int_dM[0] = field_int_fh > field_array_int_dC[0] ? 1 : -1;
                           field_array_int_dG[0] = 8;
                           field_array_int_dH[0] = field_array_int_dI[0] = field_array_int_dO[0] = 0;
                        } else if (var5 >= 20 && var12 != 42) {
                           if (var5 > 160) {
                              field_array_int_dM[0] = field_int_fh > field_array_int_dC[0] ? 1 : -1;
                              field_array_int_dI[0] = field_array_int_dC[0] + (field_array_int_dM[0] << 7);
                              if (field_array_int_dI[0] < field_array_int_dP[0]) {
                                 field_array_int_dI[0] = field_array_int_dP[0];
                              } else if (field_array_int_dI[0] > field_array_int_dQ[0]) {
                                 field_array_int_dI[0] = field_array_int_dQ[0];
                              }

                              field_array_int_dH[0] = 0;
                              field_array_int_dG[0] = 2;
                              field_array_int_dE[0] = field_array_int_dM[0] << 2;
                           }
                        } else {
                           field_array_int_dM[0] = -field_int_fp;
                           field_array_int_dI[0] = field_array_int_dC[0] + (field_array_int_dM[0] << 6);
                           if (field_array_int_dI[0] < field_array_int_dP[0] || field_array_int_dI[0] > field_array_int_dQ[0]) {
                              field_array_int_dM[0] = -field_array_int_dM[0];
                              field_array_int_dI[0] = field_array_int_dC[0] + (field_array_int_dM[0] << 6);
                           }

                           field_array_int_dH[0] = 0;
                           field_array_int_dG[0] = 2;
                           field_array_int_dE[0] = field_array_int_dM[0] << 3;
                        }
                        break label2779;
                     case 2:
                        var10002 = field_array_int_dH[0]++;
                        if (field_array_int_dH[0] >= 10) {
                           field_array_int_dH[0] = 0;
                        }

                        field_array_int_dJ[0] = (field_array_int_dH[0] >> 1) + 2;
                        var10000 = field_array_int_dC;
                        var10000[0] += field_array_int_dE[0];
                        if (!field_boolean_dA && (field_array_int_dM[0] > 0 && field_array_int_dC[0] > field_array_int_dI[0] || field_array_int_dM[0] < 0 && field_array_int_dC[0] < field_array_int_dI[0])) {
                           field_array_int_dM[0] = field_int_fh > field_array_int_dC[0] ? 1 : -1;
                           field_array_int_dI[0] = field_array_int_dH[0] = 0;
                           field_array_int_dG[0] = 1;
                        }
                        break label2779;
                     case 3:
                     case 7:
                        var10000 = field_array_int_dC;
                        var10000[0] += field_array_int_dE[0];
                        if (field_array_int_dC[0] < field_array_int_dP[0]) {
                           field_array_int_dC[0] = field_array_int_dP[0];
                        }

                        if (field_array_int_dC[0] > field_array_int_dQ[0]) {
                           field_array_int_dC[0] = field_array_int_dQ[0];
                        }

                        var10000 = field_array_int_dD;
                        var10000[0] += field_array_int_dF[0];
                        field_array_int_dJ[0] = 23;
                        if (field_array_int_dE[0] > 0) {
                           var10002 = field_array_int_dE[0]--;
                        }

                        var10002 = field_array_int_dF[0]++;
                        if (field_array_int_dF[0] == 0) {
                           field_array_int_dG[0] = 4;
                           field_array_int_dH[0] = 0;
                           field_array_int_dF[0] = 1;
                        }
                        break label2779;
                     case 4:
                        var10000 = field_array_int_dC;
                        var10000[0] += field_array_int_dE[0];
                        if (field_array_int_dC[0] < field_array_int_dP[0]) {
                           field_array_int_dC[0] = field_array_int_dP[0];
                        }

                        if (field_array_int_dC[0] > field_array_int_dQ[0]) {
                           field_array_int_dC[0] = field_array_int_dQ[0];
                        }

                        var10000 = field_array_int_dD;
                        var10000[0] += field_array_int_dF[0];
                        field_array_int_dJ[0] = 7;
                        if (field_array_int_dF[0] < 18) {
                           var10002 = field_array_int_dF[0]++;
                        }

                        if (field_array_int_dE[0] > 0) {
                           var10002 = field_array_int_dE[0]--;
                        }

                        field_array_int_dJ[0] = 7;
                        if (field_array_int_dD[0] >= field_int_iS) {
                           field_array_int_dG[0] = 6;
                        } else if ((func_int_i(field_array_int_dC[0], field_array_int_dD[0]) & 2) == 2) {
                           field_array_int_dG[0] = 1;
                           field_array_int_dH[0] = field_array_int_dI[0] = 0;
                           field_array_int_dE[0] = field_array_int_dF[0] = 0;
                           field_array_int_dD[0] = func_int_I(field_array_int_dD[0]);
                           func_boolean_e(-1, field_array_int_dC[0] - -8, field_array_int_dD[0]);
                           func_boolean_e(1, field_array_int_dC[0] - 8, field_array_int_dD[0]);
                           if (func_int_a(field_array_int_dC[0] - field_int_fh) < 40 && var12 < 25) {
                              field_array_int_dM[0] = field_int_fh > field_array_int_dC[0] ? 1 : -1;
                              field_array_int_dG[0] = 5;
                              field_array_int_dH[0] = field_array_int_dI[0] = field_array_int_dO[0] = 0;
                           }

                           if (var5 < 40) {
                              field_array_int_dM[0] = field_int_fp;
                              field_array_int_dI[0] = field_array_int_dC[0] + field_array_int_dM[0] * 110;
                              if (field_array_int_dI[0] < field_array_int_dP[0] || field_array_int_dI[0] > field_array_int_dQ[0]) {
                                 field_array_int_dM[0] = -field_array_int_dM[0];
                                 field_array_int_dI[0] = field_array_int_dC[0] + (field_array_int_dM[0] << 6);
                              }

                              field_array_int_dH[0] = 0;
                              field_array_int_dG[0] = 2;
                              field_array_int_dE[0] = field_array_int_dM[0] * 10;
                           }
                        }
                        break label2779;
                     case 5:
                        var10002 = field_array_int_dH[0]++;
                        switch(field_array_int_dI[0]) {
                        case 0:
                           switch(field_array_int_dH[0]) {
                           case 1:
                           case 2:
                           case 3:
                              field_array_int_dL[0] = -1;
                              field_array_int_dJ[0] = 13;
                              break label2779;
                           case 4:
                              field_array_int_dL[0] = 0;
                              field_array_int_dJ[0] = 14;
                              break label2779;
                           case 5:
                              field_array_int_dL[0] = 1;
                              field_array_int_dJ[0] = 15;
                              break label2779;
                           case 6:
                              field_array_int_dL[0] = 1;
                              field_array_int_dJ[0] = 15;
                              func_void_z(0);
                              break label2779;
                           case 7:
                              field_array_int_dL[0] = 2;
                              field_array_int_dJ[0] = 16;
                              break label2779;
                           case 8:
                              field_array_int_dL[0] = 2;
                              field_array_int_dJ[0] = 16;
                              field_array_int_dI[0] = 2;
                              field_array_int_dH[0] = 1;
                           default:
                              break label2779;
                           }
                        case 1:
                           switch(field_array_int_dH[0]) {
                           case 1:
                              field_array_int_dL[0] = 1;
                              field_array_int_dJ[0] = 15;
                              break label2779;
                           case 2:
                              field_array_int_dL[0] = 1;
                              field_array_int_dJ[0] = 15;
                              field_array_int_dI[0] = 10;
                           default:
                              break label2779;
                           }
                        case 2:
                           switch(field_array_int_dH[0]) {
                           case 1:
                           case 2:
                           case 3:
                              field_array_int_dL[0] = 3;
                              field_array_int_dJ[0] = 17;
                              break label2779;
                           case 4:
                              field_array_int_dL[0] = 4;
                              field_array_int_dJ[0] = 18;
                              break label2779;
                           case 5:
                              field_array_int_dL[0] = 5;
                              field_array_int_dJ[0] = 19;
                              break label2779;
                           case 6:
                              field_array_int_dL[0] = 6;
                              field_array_int_dJ[0] = 20;
                              func_void_z(0);
                              break label2779;
                           case 7:
                              field_array_int_dL[0] = 6;
                              field_array_int_dJ[0] = 20;
                              field_array_int_dI[0] = 3;
                              field_array_int_dH[0] = 1;
                           default:
                              break label2779;
                           }
                        case 3:
                           switch(field_array_int_dH[0]) {
                           case 1:
                              field_array_int_dL[0] = 1;
                              field_array_int_dJ[0] = 15;
                              break label2779;
                           case 2:
                              field_array_int_dL[0] = 1;
                              field_array_int_dJ[0] = 15;
                              break label2779;
                           case 3:
                              field_array_int_dL[0] = 2;
                              field_array_int_dJ[0] = 16;
                              break label2779;
                           case 4:
                              field_array_int_dL[0] = 2;
                              field_array_int_dJ[0] = 16;
                              field_array_int_dI[0] = 1;
                              field_array_int_dH[0] = 1;
                           }
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        default:
                           break label2779;
                        case 10:
                           switch(field_array_int_dH[0]) {
                           case 1:
                              field_array_int_dL[0] = 2;
                              field_array_int_dJ[0] = 16;
                              break label2779;
                           case 2:
                              field_array_int_dL[0] = 0;
                              field_array_int_dJ[0] = 14;
                              break label2779;
                           case 3:
                           case 4:
                              field_array_int_dJ[0] = 13;
                              field_array_int_dL[0] = -1;
                              break label2779;
                           case 5:
                              field_array_int_dJ[0] = 13;
                              field_array_int_dL[0] = -1;
                              field_array_int_dG[0] = 1;
                              field_array_int_dI[0] = 120;
                              field_array_int_dH[0] = 0;
                           default:
                              break label2779;
                           }
                        }
                     case 8:
                        var10002 = field_array_int_dH[0]++;
                        switch(field_array_int_dH[0]) {
                        case 1:
                        case 2:
                        case 3:
                           field_array_int_dJ[0] = 13;
                           break label2779;
                        case 4:
                           field_array_int_dJ[0] = 14;
                           break label2779;
                        case 5:
                           field_array_int_dJ[0] = 15;
                           break label2779;
                        case 6:
                           field_array_int_dJ[0] = 15;
                           func_void_a(field_array_int_dC[0] + (field_array_int_dM[0] << 3), field_array_int_dD[0] - 12, field_array_int_dM[0] << 3, 0, false);
                           break label2779;
                        case 7:
                           field_array_int_dJ[0] = 16;
                           break label2779;
                        case 8:
                           field_array_int_dJ[0] = 16;
                           field_array_int_dI[0] = 2;
                           break label2779;
                        case 9:
                           field_array_int_dH[0] = 0;
                           field_array_int_dG[0] = 1;
                        default:
                           break label2779;
                        }
                     case 24:
                        var10002 = field_array_int_dI[0]++;
                        if (field_array_int_dI[0] < 7) {
                           var10002 = field_array_int_dH[0]++;
                           if (field_array_int_dH[0] >= 10) {
                              field_array_int_dH[0] = 0;
                           }

                           field_array_int_dJ[0] = (field_array_int_dH[0] >> 1) + 2;
                           var10000 = field_array_int_dC;
                           var10000[0] += field_array_int_dE[0];
                           if (func_int_a(field_array_int_dC[0] - field_int_fh) < 30) {
                              if (field_int_A == 5 && field_int_fp != field_array_int_dM[0]) {
                                 field_array_int_dG[0] = 3;
                                 field_array_int_dM[0] = -field_int_fp;
                                 field_array_int_dE[0] = field_int_fp << 1;
                                 if (field_array_int_dC[0] < field_array_int_dP[0] + 30) {
                                    field_array_int_dE[0] = 6;
                                    field_array_int_dM[0] = -1;
                                 } else if (field_array_int_dC[0] > field_array_int_dQ[0] - 30) {
                                    field_array_int_dE[0] = -6;
                                    field_array_int_dM[0] = 1;
                                 }

                                 field_array_int_dF[0] = -9;
                                 break;
                              } else {
                                 field_array_int_dI[0] = 6;
                              }
                           }
                        } else if (field_array_int_dI[0] != 7) {
                           if (field_array_int_dI[0] >= 15) {
                              field_array_int_dL[0] = -1;
                              field_array_int_dG[0] = 1;
                              break;
                           } else {
                              var10002 = field_array_int_dH[0]++;
                              switch(field_array_int_dH[0]) {
                              case 1:
                              case 2:
                              case 3:
                                 field_array_int_dL[0] = -1;
                                 field_array_int_dJ[0] = 13;
                                 break label2779;
                              case 4:
                                 field_array_int_dL[0] = 0;
                                 field_array_int_dJ[0] = 14;
                                 break label2779;
                              case 5:
                                 field_array_int_dL[0] = 1;
                                 field_array_int_dJ[0] = 15;
                                 break label2779;
                              case 6:
                                 field_array_int_dL[0] = 1;
                                 field_array_int_dJ[0] = 15;
                                 func_void_z(0);
                                 break label2779;
                              case 7:
                                 field_array_int_dL[0] = 2;
                                 field_array_int_dJ[0] = 16;
                                 break label2779;
                              case 8:
                                 field_array_int_dL[0] = 2;
                                 field_array_int_dJ[0] = 16;
                                 field_array_int_dI[0] = 2;
                                 field_array_int_dH[0] = 1;
                              }
                           }
                        } else {
                           field_array_int_dH[0] = 0;
                        }
                     default:
                        break label2779;
                     }

                     field_array_int_dH[0] = field_array_int_dI[0] = 0;
                  }
               }

               func_void_W();
               func_void_ab();
               if (field_int_fK != 0) {
                  if (field_int_fK == 1) {
                     if (func_int_a(field_int_fi - (field_int_fk >> 1) - (field_int_fJ - 7)) < 10 && func_int_a(field_int_fh - field_int_fI) < 10) {
                        field_int_fK = 2;
                        field_boolean_fD = true;
                        func_void_c("đã lấy được bí kíp");
                     }
                  } else {
                     ++field_int_fK;
                     field_int_fJ -= 3;
                     if (field_int_fK > 40) {
                        field_int_fK = 0;
                     }
                  }
               }

               if (field_boolean_cp && ++field_int_cq >= 150) {
                  field_boolean_cp = false;
               }
            }
            break;
         case 2:
            if (field_int_S < field_int_R) {
               field_int_S += 5;
            }
            break;
         case 3:
            if (field_boolean_aP) {
               field_boolean_aP = false;
               if (field_int_aR > field_int_aX - 40) {
                  if (field_int_aQ < field_int_aY - 40) {
                     field_array_boolean_aV[4] = true;
                  } else if (field_int_aQ > field_int_aY + 40) {
                     field_array_boolean_aV[6] = true;
                  } else {
                     field_array_boolean_aV[5] = true;
                  }
               }
            }

            if (++field_int_w == 10000) {
               field_int_w = 0;
            }

            if (field_array_boolean_aV[4]) {
               if (--field_int_ba < 0) {
                  field_int_ba = field_array_class_java_lang_String_aF.length - 1;
               }

               field_array_boolean_aV[4] = false;
            }

            if (field_array_boolean_aV[6]) {
               if (++field_int_ba == field_array_class_java_lang_String_aF.length) {
                  field_int_ba = 0;
               }

               field_array_boolean_aV[6] = false;
            }

            if (field_array_boolean_aV[5]) {
               label2104: {
                  func_void_d();
                  if (field_int_ba == 0) {
                     field_class_javax_microedition_lcdui_Image_eD = null;
                     func_void_B();
                     Midlet.field_boolean_f = true;
                     field_long_gP = System.currentTimeMillis();
                     func_void_x(99);
                  } else if (field_int_ba == 1) {
                     if (!Midlet.func_boolean_b()) {
                        break label2104;
                     }

                     field_class_javax_microedition_lcdui_Image_eD = null;
                     func_void_B();
                     int[] var13;
                     field_int_gO = (var13 = func_array_int_a(Midlet.func_array_byte_b("ninjasave")))[0];
                     field_int_v = var13[1];
                     field_int_w = var13[2];
                     field_boolean_eH = var13[3] == 1;
                     field_int_dg = var13[4];
                     field_boolean_dz = var13[5] == 1;
                     field_boolean_eI = var13[6] == 1;
                     field_boolean_eJ = var13[7] == 1;
                     field_boolean_eK = var13[8] == 1;
                     field_boolean_gn = var13[9] == 1;
                     field_int_go = var13[10];
                     field_int_gp = var13[11];
                     field_int_im = var13[12];
                     field_int_x = var13[13];
                     field_boolean_eZ = var13[14] == 1;
                     Midlet.field_boolean_e = true;
                     field_long_gP = System.currentTimeMillis();
                     func_void_x(field_int_v);
                  } else if (field_int_ba == 2) {
                     field_class_javax_microedition_lcdui_Image_eD = null;
                     func_void_B();
                     field_int_d = 2;
                     func_void_ak();
                     Midlet.field_int_d = 11;
                     field_int_v = 101;
                     (new Thread(Midlet.field_class_Midlet_c)).start();
                  } else if (field_int_ba == 3) {
                     try {
                        Midlet.field_class_Midlet_c.platformRequest("http://wap.teamobi.com/");
                     } catch (Exception var10) {
                     }
                  } else if (field_int_ba == 4) {
                     Midlet.field_class_Midlet_c.func_void_c();
                  }

                  field_array_boolean_aV[5] = false;
               }
            }

            if (field_int_fR == 0) {
               field_int_fR = 960;
               field_int_fS = 48;
               field_int_fN = 1;
               field_int_fO = 1;
            }

            field_int_fR += field_int_fN;
            field_int_fS += field_int_fO;
            if (field_int_fR > field_int_fT) {
               field_int_fR = field_int_fT;
               field_int_fN = -field_int_fN;
            }

            if (field_int_fR < 24) {
               field_int_fR = 24;
               field_int_fN = -field_int_fN;
            }

            if (field_int_fS < 0) {
               field_int_fS = 0;
               field_int_fO = -field_int_fO;
            }

            if (field_int_fS > field_int_fU) {
               field_int_fS = field_int_fU;
               field_int_fO = -field_int_fO;
            }

            if ((field_int_bz = field_int_fR / field_int_jh - 1) < 0) {
               field_int_bz = 0;
            }

            field_int_bA = field_int_fS / field_int_jh;
            field_int_bD = field_int_bz + field_int_bB;
            field_int_bE = field_int_bA + field_int_bC;
            if (field_int_bA < 0) {
               field_int_bA = 0;
            }

            if (field_int_bE > field_int_iQ - 1) {
               field_int_bE = field_int_iQ - 1;
            }

            if (field_int_bd > field_int_bb) {
               field_int_bd -= 4;
            }

            if (field_int_be < field_int_bc) {
               field_int_be += 4;
            }

            if (field_int_bg > field_int_bf) {
               field_int_bg -= 2;
            }
            break;
         case 4:
            if (field_int_jH < 4) {
               field_int_jI = field_int_jH;
            }

            if (field_int_jH > 51) {
               field_class_javax_microedition_lcdui_Image_jF = null;
               field_class_javax_microedition_lcdui_Image_jG = null;
               func_void_av();
               field_int_d = 10;
            } else if (field_int_jH > 46) {
               field_int_jI = 4 - (field_int_jH - 46);
            }

            field_int_aW = field_class_a_aN.getWidth();
            field_int_aX = field_class_a_aN.getHeight();
            ++field_int_jH;
            break;
         case 5:
            func_void_as();
            break;
         case 6:
            if (field_boolean_aP) {
               field_boolean_aP = false;
               if (field_int_aR > field_int_aX - 40) {
                  if (field_int_aQ < field_int_aY) {
                     field_array_boolean_aV[12] = true;
                  } else {
                     field_array_boolean_aV[13] = true;
                  }
               }

               func_void_c();
            }

            if (field_boolean_aS) {
               var12 = field_int_aQ + field_int_lh;
               var4 = field_int_aR + field_int_li;
               if (var12 > field_int_kX) {
                  field_array_boolean_aU[6] = true;
               }

               if (var12 < field_int_kX) {
                  field_array_boolean_aU[4] = true;
               }

               if (var4 > field_int_kY) {
                  field_array_boolean_aU[8] = true;
               }

               if (var4 < field_int_kY) {
                  field_array_boolean_aU[2] = true;
               }
            }

            if (++field_int_la > 10000) {
               field_int_la = 0;
            }

            if (field_int_lh != field_int_lb || field_int_li != field_int_lc) {
               field_int_ld = field_int_lb - field_int_lh << 1;
               field_int_le = field_int_lc - field_int_li << 1;
               field_int_lf += field_int_ld;
               field_int_lh += field_int_lf >> 4;
               field_int_lf &= 15;
               field_int_lg += field_int_le;
               field_int_li += field_int_lg >> 4;
               field_int_lg &= 15;
               if (field_int_lh < -40) {
                  field_int_lh = -40;
               }

               if (field_int_lh > field_int_lj) {
                  field_int_lh = field_int_lj;
               }

               if (field_int_li < -40) {
                  field_int_li = -40;
               }

               if (field_int_li > field_int_lk) {
                  field_int_li = field_int_lk;
               }
            }

            var3 = false;
            if (field_array_boolean_aV[5] || field_array_boolean_aV[12]) {
               func_void_d();
               if (field_int_kZ != -1) {
                  if (!field_array_boolean_W[field_int_kZ]) {
                     func_void_s(1);
                     field_int_d = 7;
                  } else if (field_int_ll == field_int_kZ) {
                     func_void_s(3);
                     field_int_d = 7;
                  } else {
                     func_void_s(2);
                     field_int_d = 7;
                  }
               }
            }

            if (field_array_boolean_aV[13]) {
               func_void_at();
               field_array_class_javax_microedition_lcdui_Image_kK = null;
               func_void_ai();
               field_int_d = 1;
               func_void_d();
               func_void_c();
               field_array_boolean_aV[12] = true;
            } else {
               if (field_array_boolean_aU[2]) {
                  if ((field_int_kY -= 4) < -20) {
                     field_int_kY = -20;
                  }

                  var3 = true;
               }

               if (field_array_boolean_aU[8]) {
                  if ((field_int_kY += 4) > 279) {
                     field_int_kY = 279;
                  }

                  var3 = true;
               }

               if (field_array_boolean_aU[4]) {
                  if ((field_int_kX -= 4) < -20) {
                     field_int_kX = -20;
                  }

                  var3 = true;
               }

               if (field_array_boolean_aU[6]) {
                  if ((field_int_kX += 4) > 279) {
                     field_int_kX = 279;
                  }

                  var3 = true;
               }

               if (var3) {
                  field_int_lb = field_int_kX - field_int_bF;
                  field_int_lc = field_int_kY - field_int_bG;
                  func_void_au();
               }
            }
            break;
         case 7:
            if (field_boolean_aP) {
               field_boolean_aP = false;
               if (field_int_aR > field_int_aX - 40) {
                  if (field_int_aQ < field_int_aY) {
                     field_array_boolean_aV[12] = true;
                  } else {
                     field_array_boolean_aV[13] = true;
                  }
               }
            }

            if (++field_int_ls < 10) {
               func_void_d();
            }

            if (field_array_boolean_aV[12]) {
               func_void_d();
               switch(field_int_lq) {
               case 1:
               case 3:
               case 4:
                  field_int_d = 6;
                  break;
               case 2:
                  if (field_int_lr >= field_int_dg) {
                     func_void_s(4);
                  } else {
                     field_int_dg -= field_int_lr;
                     func_void_at();
                     field_array_class_javax_microedition_lcdui_Image_kK = null;
                     func_void_ai();
                     func_void_B();
                     field_int_fs = field_int_fh = field_array_int_kT[field_int_kZ] * 24;
                     field_int_ft = field_int_fi = field_array_int_kU[field_int_kZ] * 24;
                     Midlet.field_boolean_f = true;
                     func_void_x(field_int_kZ);
                  }
                  break;
               case 5:
               case 6:
                  field_array_class_javax_microedition_lcdui_Image_kK = null;
                  field_int_d = 1;
               }
            }

            if (field_array_boolean_aV[13]) {
               func_void_d();
               switch(field_int_lq) {
               case 1:
               case 3:
               case 4:
               case 5:
               case 6:
               default:
                  break;
               case 2:
                  field_int_d = 6;
                  break;
               case 7:
                  field_int_d = 9;
               }
            }

            field_boolean_c = true;
            break;
         case 8:
            func_void_aq();
            break;
         case 9:
            func_void_ap();
            break;
         case 10:
            if (field_boolean_aP) {
               field_boolean_aP = false;
               if (field_int_aR > field_int_aX - 40) {
                  if (field_int_aQ < field_int_aY) {
                     field_array_boolean_aV[12] = true;
                  } else {
                     field_array_boolean_aV[13] = true;
                  }
               }
            }

            if (field_boolean_lo) {
               field_class_javax_microedition_lcdui_Image_ln = null;
               func_void_K();
            }

            var3 = false;
            if (field_array_boolean_aV[12]) {
               if (field_int_lp == 0) {
                  Midlet.field_boolean_h = false;
               } else {
                  field_boolean_a = false;
               }

               var3 = true;
            } else if (field_array_boolean_aV[13]) {
               if (field_int_lp == 0) {
                  Midlet.field_boolean_h = true;
               } else {
                  field_boolean_a = true;
               }

               var3 = true;
            }

            if (var3) {
               func_void_d();
               func_void_c();
               if (field_int_lp == 0) {
                  try {
                     field_class_javax_microedition_lcdui_Image_ln = Image.createImage("/u/m2.png");
                  } catch (Exception var9) {
                  }

                  field_int_lp = 1;
               } else {
                  Midlet.field_boolean_a = !field_boolean_lO;
                  field_boolean_lo = true;
               }
            }
            break;
         case 11:
            func_void_Z();
            break;
         case 12:
            func_void_Z();
            break;
         case 13:
            if (++field_int_lS > 10000) {
               field_int_lS = 0;
            }

            field_int_aW = this.getWidth();
            field_int_aX = this.getHeight();
            if (field_boolean_aP && field_int_aR > field_int_aX - 20) {
               if (field_int_aQ < field_int_aY) {
                  field_array_boolean_aV[12] = true;
               } else {
                  field_array_boolean_aV[13] = true;
               }

               field_boolean_aP = false;
            }

            switch(activeCommand) {
            case 0:
               this.func_void_aG();
            case 1:
            case 3:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
               break;
            case 2:
               this.func_void_aF();
               break;
            case 4:
               this.func_void_az();
               break;
            case 5:
               if (field_array_boolean_aV[5] || field_array_boolean_aV[12]) {
                  Midlet.field_class_Midlet_c.notifyDestroyed();
               }
               break;
            case 6:
               func_void_aE();
               break;
            case 7:
               func_void_ay();
               break;
            case 8:
               if (field_array_boolean_aV[12]) {
                  Midlet.field_class_Midlet_c.notifyDestroyed();
               }
               break;
            case 14:
               if (field_array_boolean_aV[13] || field_array_boolean_aV[12] || field_array_boolean_aV[5]) {
                  field_array_boolean_aV[13] = false;
                  field_array_boolean_aV[5] = false;
                  field_array_boolean_aV[12] = false;
                  Midlet.field_class_Midlet_c.notifyDestroyed();
               }
            }
         }

         this.repaint();
         this.serviceRepaints();

         while(System.currentTimeMillis() - var1 < (long)field_int_aa) {
            Thread.yield();
         }
      }

      func_void_a();
      Midlet.field_class_Midlet_c.func_void_c();
   }

   // $FF: renamed from: o (int) void
   public static void func_void_o(int var0) {
      field_int_jq = 0;
      if (var0 == 0) {
         field_int_jq = 16;
         func_void_ag();
         func_void_a(0, "Bộ môn Khí", 1044, 336);
         func_void_a(1, "Cô Ayumi", 1044, 347);
         func_void_a(2, "Phòng chủ nhiệm", 1212, 336);
         func_void_a(3, "Thầy Takanashi", 1212, 347);
         func_void_a(4, "Phòng", 1380, 336);
         func_void_a(5, "đào tạo", 1380, 347);
         func_void_a(6, "Phòng", 1212, 216);
         func_void_a(7, "Hiệu trưởng", 1212, 227);
         func_void_a(8, "Bộ môn Lực", 1044, 216);
         func_void_a(9, "Thầy Hiroyaki", 1044, 227);
         func_void_a(10, "Bộ môn Thuật", 1380, 216);
         func_void_a(11, "Thầy Honda", 1380, 227);
         func_void_a(12, "Kí Túc Xá", 444, 341);
         func_void_a(13, "* Khu luyện tập", 72, 341);
         func_void_a(14, "Cổng /", 1860, 317);
         func_void_a(15, "Bán HP-MP", 612, 341);
      } else if (var0 == 1) {
         field_int_jq = 2;
         func_void_ag();
         func_void_a(0, "Trường /", 1356, 173);
         func_void_a(1, "* Thác nước", 48, 173);
      } else if (var0 == 2) {
         field_int_jq = 4;
         func_void_ag();
         func_void_a(0, "* Lối vào", 60, 245);
         func_void_a(1, "Trường Hirosaki", 240, 197);
         func_void_a(2, "Lối ra /", 420, 245);
//         func_void_a(2, "Mua đồ tiền thật", 552, 245);
         func_void_a(2, "Bán HP-MP", 552, 245);
         func_void_a(3, "đường hoa đào /", 1356, 221);
      } else if (var0 == 3) {
         field_int_jq = 2;
         func_void_ag();
         func_void_a(0, "* Ngôi làng", 48, 173);
         func_void_a(1, "Rừng trúc /", 2808, 173);
      } else if (var0 == 4) {
         field_int_jq = 2;
         func_void_ag();
         func_void_a(0, "* Vườn đào", 48, 101);
         func_void_a(1, "Rừng tối", 1704, 245);
      } else if (var0 == 5) {
         field_int_jq = 2;
         func_void_ag();
         func_void_a(0, "Trường /", 420, 77);
         func_void_a(1, "Rừng tối /", 408, 1829);
      } else if (var0 == 6) {
         field_int_jq = 3;
         func_void_ag();
         func_void_a(0, "* Thác nước", 72, 101);
         func_void_a(1, "Rừng tối /", 504, 53);
         func_void_a(2, "Sông Watamoro /", 5916, 197);
      } else {
         if (var0 == 99) {
            field_int_jq = 1;
            func_void_ag();
            func_void_a(0, "Trường Hirosaki", 744, 173);
         }

      }
   }

   // $FF: renamed from: a (int, java.lang.String, int, int) void
   private static void func_void_a(int var0, String var1, int var2, int var3) {
      field_array_class_java_lang_String_jm[var0] = var1;
      field_array_int_jn[var0] = var2;
      field_array_int_jo[var0] = var3;
      int[] var10000 = field_array_int_jn;
      var10000[var0] -= Midlet.func_int_a(var1) >> 1;
      field_array_int_jp[var0] = Midlet.func_int_a(var1);
   }

   // $FF: renamed from: i (javax.microedition.lcdui.Graphics) void
   private static void func_void_i(Graphics var0) {
      for(int var1 = 0; var1 < field_int_jq; ++var1) {
         if (field_array_int_jn[var1] + field_array_int_jp[var1] >= field_int_fR && field_array_int_jn[var1] <= field_int_fR + field_int_q && field_array_int_jo[var1] >= field_int_fS && field_array_int_jo[var1] - 14 <= field_int_fS + field_int_r) {
            Midlet.func_void_a(var0, field_array_class_java_lang_String_jm[var1], field_array_int_jn[var1], field_array_int_jo[var1], 0);
         }
      }

   }

   // $FF: renamed from: ag () void
   private static void func_void_ag() {
      field_array_class_java_lang_String_jm = new String[field_int_jq];
      field_array_int_jn = new int[field_int_jq];
      field_array_int_jo = new int[field_int_jq];
      field_array_int_jp = new int[field_int_jq];
   }

   // $FF: renamed from: p (int) void
   public static void func_void_p(int var0) {
      field_int_ja = 0;
      if (var0 == 2) {
         if (field_array_class_javax_microedition_lcdui_Image_iZ == null) {
            field_array_class_javax_microedition_lcdui_Image_iZ = new Image[3];

            try {
               field_array_class_javax_microedition_lcdui_Image_iZ[0] = Image.createImage("/t/h0.png");
               field_array_class_javax_microedition_lcdui_Image_iZ[1] = Image.createImage("/t/h1.png");
               field_array_class_javax_microedition_lcdui_Image_iZ[2] = Image.createImage("/t/h2.png");
            } catch (Exception var2) {
            }
         }

         field_int_ja = 5;
         func_void_ah();
         func_void_b(0, 0, 29, 13);
         func_void_b(1, 1, 34, 13);
         func_void_b(2, 2, 39, 13);
         func_void_b(3, 1, 46, 11);
         func_void_b(4, 2, 51, 11);
      }

      if (var0 == 16) {
         if (field_array_class_javax_microedition_lcdui_Image_iZ == null) {
            field_array_class_javax_microedition_lcdui_Image_iZ = new Image[3];

            try {
               field_array_class_javax_microedition_lcdui_Image_iZ[0] = Image.createImage("/t/h0.png");
               field_array_class_javax_microedition_lcdui_Image_iZ[1] = Image.createImage("/t/h1.png");
               field_array_class_javax_microedition_lcdui_Image_iZ[2] = Image.createImage("/t/h2.png");
            } catch (Exception var1) {
            }
         }

         field_int_ja = 5;
         func_void_ah();
         func_void_b(0, 0, 5, 11);
         func_void_b(1, 1, 14, 12);
         func_void_b(2, 2, 33, 10);
         func_void_b(3, 1, 53, 10);
         func_void_b(4, 0, 59, 11);
      }

   }

   // $FF: renamed from: b (int, int, int, int) void
   private static void func_void_b(int var0, int var1, int var2, int var3) {
      field_array_int_jb[var0] = var1;
      field_array_int_jc[var0] = var2 * field_int_jh + 12;
      field_array_int_jd[var0] = var3 * field_int_jh;
      field_array_int_je[var0] = field_array_class_javax_microedition_lcdui_Image_iZ[var1].getWidth() >> 1;
      field_array_int_jf[var0] = field_array_class_javax_microedition_lcdui_Image_iZ[var1].getHeight();
   }

   // $FF: renamed from: ah () void
   private static void func_void_ah() {
      field_array_int_jb = new int[field_int_ja];
      field_array_int_jc = new int[field_int_ja];
      field_array_int_jd = new int[field_int_ja];
      field_array_int_je = new int[field_int_ja];
      field_array_int_jf = new int[field_int_ja];
   }

   // $FF: renamed from: ai () void
   private static void func_void_ai() {
      try {
         if (field_class_javax_microedition_lcdui_Image_iW == null) {
            field_class_javax_microedition_lcdui_Image_iW = Image.createImage("/t/t.png");
         }

         if (field_class_javax_microedition_lcdui_Image_iX == null) {
            field_class_javax_microedition_lcdui_Image_iX = Image.createImage("/t/wtf.png");
         }

         if (field_class_javax_microedition_lcdui_Image_iY == null) {
            field_class_javax_microedition_lcdui_Image_iY = Image.createImage("/t/wts.png");
         }

         if (field_class_javax_microedition_lcdui_Image_jg == null && !field_boolean_a) {
            field_class_javax_microedition_lcdui_Image_jg = Image.createImage("/t/tb.png");
         }

         System.gc();
      } catch (Exception var0) {
         Midlet.field_class_Midlet_c.func_void_c();
      }
   }

   // $FF: renamed from: q (int) void
   public static void func_void_q(int var0) {
      var0 = var0;
      field_array_boolean_iV = new boolean[200];
      if (var0 == 101) {
         var0 = 99;
      }

      if (var0 == 0) {
         field_int_iP = 80;
         field_int_iQ = 19;
         field_int_jr = 1;
         field_int_jv = 59 * field_int_jh;
         field_int_jw = 9 * field_int_jh;
         field_int_js = 2;
         field_int_jx = 3;
         field_int_jy = 12 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 1) {
         field_int_iP = 60;
         field_int_iQ = 14;
         field_int_jr = 5;
         field_int_jv = 19 * field_int_jh;
         field_int_jw = 5 * field_int_jh;
         field_int_js = 0;
         field_int_jx = 3;
         field_int_jy = 16 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 2) {
         field_int_iP = 60;
         field_int_iQ = 16;
         field_int_jr = 0;
         field_int_jv = 79 * field_int_jh;
         field_int_jw = 15 * field_int_jh;
         field_int_js = 3;
         field_int_jx = 3;
         field_int_jy = 9 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 3) {
         field_int_iP = 120;
         field_int_iQ = 12;
         field_int_jr = 2;
         field_int_jv = 59 * field_int_jh;
         field_int_jw = 11 * field_int_jh;
         field_int_js = 4;
         field_int_jx = 3;
         field_int_jy = 144;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 4) {
         field_int_iP = 80;
         field_int_iQ = 15;
         field_int_jr = 3;
         field_int_jv = 119 * field_int_jh;
         field_int_jw = 9 * field_int_jh;
         field_int_js = -1;
         field_int_jt = -1;
         field_int_ju = 6;
         field_int_jB = 26 * field_int_jh;
         field_int_jC = 10;
      } else if (var0 == 5) {
         field_int_iP = 20;
         field_int_iQ = 80;
         field_int_jr = -1;
         field_int_js = 1;
         field_int_jx = 3;
         field_int_jy = 9 * field_int_jh;
         field_int_jD = 40 * field_int_jh;
         field_int_jt = 6;
         field_int_jz = 3;
         field_int_jA = 5 * field_int_jh;
         field_int_ju = -1;
      } else if (var0 == 6) {
         field_int_iP = 250;
         field_int_iQ = 12;
         field_int_jr = 5;
         field_int_jv = 19 * field_int_jh;
         field_int_jw = 78 * field_int_jh;
         field_int_js = 7;
         field_int_jx = 1 * field_int_jh;
         field_int_jy = 7 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 7) {
         field_int_iP = 80;
         field_int_iQ = 14;
         field_int_jr = 6;
         field_int_jv = 249 * field_int_jh;
         field_int_jw = 10 * field_int_jh;
         field_int_js = 97;
         field_int_jx = 1 * field_int_jh;
         field_int_jy = 3 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 97) {
         field_int_iP = 25;
         field_int_iQ = 13;
         field_int_jr = 7;
         field_int_jv = 79 * field_int_jh;
         field_int_jw = 11 * field_int_jh;
         field_int_js = 8;
         field_int_jx = 1 * field_int_jh;
         field_int_jy = 12 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 8) {
         field_int_iP = 80;
         field_int_iQ = 14;
         field_int_jr = 97;
         field_int_jv = 23 * field_int_jh;
         field_int_jw = 7 * field_int_jh;
         field_int_js = 9;
         field_int_jx = 1 * field_int_jh;
         field_int_jy = 11 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 9) {
         field_int_iP = 80;
         field_int_iQ = 14;
         field_int_jr = 8;
         field_int_jv = 79 * field_int_jh;
         field_int_jw = 9 * field_int_jh;
         field_int_js = -1;
         field_int_jx = 1 * field_int_jh;
         field_int_jy = 11 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = 10;
         field_int_jB = 2 * field_int_jh;
         field_int_jC = 0 * field_int_jh;
      } else if (var0 == 10) {
         field_int_iP = 40;
         field_int_iQ = 40;
         field_int_jr = -1;
         field_int_js = 11;
         field_int_jx = 24;
         field_int_jy = 264;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 11) {
         field_int_iP = 90;
         field_int_iQ = 14;
         field_int_jr = 10;
         field_int_jv = 936;
         field_int_jw = 720;
         field_int_js = 96;
         field_int_jx = 24;
         field_int_jy = 192;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 96) {
         field_int_iP = 25;
         field_int_iQ = 14;
         field_int_jr = 11;
         field_int_jv = 2112;
         field_int_jw = 288;
         field_int_js = 12;
         field_int_jx = 24;
         field_int_jy = 192;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 12) {
         field_int_iP = 40;
         field_int_iQ = 25;
         field_int_jr = 96;
         field_int_jv = 552;
         field_int_jw = 264;
         field_int_js = 13;
         field_int_jx = 24;
         field_int_jy = 216;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 13) {
         field_int_iP = 80;
         field_int_iQ = 14;
         field_int_jr = 12;
         field_int_jv = 936;
         field_int_jw = 456;
         field_int_js = 14;
         field_int_jx = 24;
         field_int_jy = 168;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 14) {
         field_int_iP = 60;
         field_int_iQ = 16;
         field_int_jr = 13;
         field_int_jv = 1896;
         field_int_jw = 264;
         field_int_js = 15;
         field_int_jx = 24;
         field_int_jy = 120;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 15) {
         field_int_iP = 40;
         field_int_iQ = 30;
         field_int_jr = 14;
         field_int_jv = 1416;
         field_int_jw = 144;
         field_int_js = 16;
         field_int_jx = 24;
         field_int_jy = 264;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 16) {
         field_int_iP = 70;
         field_int_iQ = 15;
         field_int_jr = 15;
         field_int_jv = 936;
         field_int_jw = 168;
         field_int_js = 17;
         field_int_jx = 24;
         field_int_jy = 432;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 17) {
         field_int_iP = 50;
         field_int_iQ = 20;
         field_int_jr = 16;
         field_int_jv = 1656;
         field_int_jw = 144;
         field_int_js = 18;
         field_int_jx = 24;
         field_int_jy = 288;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 18) {
         field_int_iP = 70;
         field_int_iQ = 15;
         field_int_jr = 17;
         field_int_jv = 1176;
         field_int_jw = 384;
         field_int_js = 95;
         field_int_jx = 24;
         field_int_jy = 192;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 95) {
         field_int_iP = 25;
         field_int_iQ = 14;
         field_int_jr = 18;
         field_int_jv = 1632;
         field_int_jw = 312;
         field_int_js = -1;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 94) {
         field_int_iP = 24;
         field_int_iQ = 14;
         field_int_jr = -1;
         field_int_js = -1;
         field_int_jt = -1;
         field_int_ju = -1;
      } else if (var0 == 99) {
         field_int_iP = 70;
         field_int_iQ = 15;
         field_int_jr = -1;
         field_int_js = 4;
         field_int_jx = 2 * field_int_jh;
         field_int_jy = 5 * field_int_jh;
         field_int_jt = -1;
         field_int_ju = -1;
      }

      field_int_iR = field_int_iP * field_int_jh;
      field_int_iS = field_int_iQ * field_int_jh;

      try {
         InputStream var3 = "".getClass().getResourceAsStream("/m/" + var0);
         field_array_byte_iT = new byte[field_int_iP * field_int_iQ];
         field_array_int_iU = new int[field_int_iP * field_int_iQ];

         for(int var1 = 0; var1 < field_int_iP * field_int_iQ; ++var1) {
            field_array_byte_iT[var1] = (byte)var3.read();
            if (field_array_byte_iT[var1] != 0) {
               field_array_boolean_iV[field_array_byte_iT[var1] - 1] = true;
            }

            int[] var10000;
            if (field_array_byte_iT[var1] == 1 || field_array_byte_iT[var1] == 2 || field_array_byte_iT[var1] == 3 || field_array_byte_iT[var1] == 4 || field_array_byte_iT[var1] == 5 || field_array_byte_iT[var1] == 6 || field_array_byte_iT[var1] == 7 || field_array_byte_iT[var1] == 36 || field_array_byte_iT[var1] == 37 || field_array_byte_iT[var1] == 54 || field_array_byte_iT[var1] == 91 || field_array_byte_iT[var1] == 92 || field_array_byte_iT[var1] == 93 || field_array_byte_iT[var1] == 94 || field_array_byte_iT[var1] == 73 || field_array_byte_iT[var1] == 74 || field_array_byte_iT[var1] == 97 || field_array_byte_iT[var1] == 98 || field_array_byte_iT[var1] == 120) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 2;
            }

            if (field_array_byte_iT[var1] == 2 || field_array_byte_iT[var1] == 3 || field_array_byte_iT[var1] == 4 || field_array_byte_iT[var1] == 5 || field_array_byte_iT[var1] == 6 || field_array_byte_iT[var1] == 20 || field_array_byte_iT[var1] == 21 || field_array_byte_iT[var1] == 22 || field_array_byte_iT[var1] == 23 || field_array_byte_iT[var1] == 36 || field_array_byte_iT[var1] == 37 || field_array_byte_iT[var1] == 38 || field_array_byte_iT[var1] == 39) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 8192;
            }

            if (field_array_byte_iT[var1] == 8 || field_array_byte_iT[var1] == 9 || field_array_byte_iT[var1] == 10 || field_array_byte_iT[var1] == 12 || field_array_byte_iT[var1] == 13 || field_array_byte_iT[var1] == 14 || field_array_byte_iT[var1] == 30) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 16;
            }

            if (field_array_byte_iT[var1] == 17) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 32;
            }

            if (field_array_byte_iT[var1] == 18) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 128;
            }

            if (field_array_byte_iT[var1] == 37 || field_array_byte_iT[var1] == 38) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 4;
            }

            if (field_array_byte_iT[var1] == 36 || field_array_byte_iT[var1] == 39) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 8;
            }

            if (field_array_byte_iT[var1] == 19) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 64;
               if ((field_array_int_iU[var1 - field_int_iP] & 8192) == 8192) {
                  var10000 = field_array_int_iU;
                  var10000[var1] |= 8192;
               }
            }

            if (field_array_byte_iT[var1] == 35) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 4096;
            }

            if (field_array_byte_iT[var1] == 32) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 256;
            }

            if (field_array_byte_iT[var1] == 7) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 2048;
            }

            if (field_array_byte_iT[var1] == 33 || field_array_byte_iT[var1] == 34) {
               var10000 = field_array_int_iU;
               var10000[var1] |= 512;
            }
         }
      } catch (Exception var2) {
         Midlet.field_class_Midlet_c.func_void_c();
      }

      func_void_ai();
   }

   // $FF: renamed from: j (javax.microedition.lcdui.Graphics) void
   private static void func_void_j(Graphics var0) {
      for(int var1 = field_int_bz; var1 < field_int_bD; ++var1) {
         for(int var2 = field_int_bA; var2 < field_int_bE; ++var2) {
            int var3;
            if ((var3 = field_array_byte_iT[var2 * field_int_iP + var1] - 1) != -1) {
               var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, var3 * field_int_jh, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
            }

            if ((func_int_h(var1, var2) & 32) == 32) {
               var0.drawRegion(field_class_javax_microedition_lcdui_Image_iX, 0, 24 * (field_int_w % 4), 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
            } else if ((func_int_h(var1, var2) & 64) == 64) {
               if ((func_int_h(var1, var2 - 1) & 32) == 32) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iX, 0, 24 * (field_int_w % 4), 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               } else if ((func_int_h(var1, var2 - 1) & 8192) == 8192) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, 504, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               }

               var0.drawRegion(field_class_javax_microedition_lcdui_Image_iY, 0, (field_int_w % 8 >> 2) * 24, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
            }

            if ((func_int_h(var1, var2) & 4096) == 4096) {
               if ((func_int_h(var1, var2 - 1) & 32) == 32) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iX, 0, 24 * (field_int_w % 4), 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               } else if ((func_int_h(var1, var2 - 1) & 8192) == 8192) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, 504, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               }

               var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, (field_array_byte_iT[var2 * field_int_iP + var1] - 1) * field_int_jh, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
            }
         }
      }

   }

   // $FF: renamed from: k (javax.microedition.lcdui.Graphics) void
   private static void func_void_k(Graphics var0) {
      for(int var1 = field_int_bz; var1 < field_int_bD; ++var1) {
         for(int var2 = field_int_bA; var2 < field_int_bE; ++var2) {
            int var3 = field_array_byte_iT[var2 * field_int_iP + var1] - 1;
            if ((func_int_h(var1, var2) & 16) == 16) {
               field_int_jj = (field_int_ji = var1 * field_int_jh - field_int_fR) - field_int_bF;
               field_int_jk = (field_int_jl = (field_int_jh - 2) * field_int_jj / field_int_jh) + field_int_bF;
               var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, var3 * field_int_jh, 24, 24, 0, field_int_jk + field_int_fR, var2 * field_int_jh, 0);
            } else if ((func_int_h(var1, var2) & 256) != 256 && (func_int_h(var1, var2) & 512) != 512) {
               if ((func_int_h(var1, var2) & 32) == 32) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iX, 0, 24 * (field_int_w % 4), 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               } else if ((func_int_h(var1, var2) & 64) != 64 && (func_int_h(var1, var2) & 4096) != 4096) {
                  if ((func_int_h(var1, var2) & 1024) == 1024) {
                     var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, var3 * field_int_jh, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh + 1, 0);
                  } else if (var3 != -1) {
                     var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, var3 * field_int_jh, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
                  }
               } else if ((func_int_h(var1, var2 - 1) & 32) == 32) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iX, 0, 24 * (field_int_w % 4), 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               } else if ((func_int_h(var1, var2 - 1) & 8192) == 8192) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, 504, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               }
            }
         }
      }

   }

   // $FF: renamed from: l (javax.microedition.lcdui.Graphics) void
   private static void func_void_l(Graphics var0) {
      if (!field_boolean_a) {
         for(int var1 = field_int_bz; var1 < field_int_bD; ++var1) {
            for(int var2 = field_int_bA; var2 < field_int_bE; ++var2) {
               if ((func_int_h(var1, var2) & 64) == 64) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iY, 0, (field_int_w % 8 >> 2) * 24, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               } else if ((func_int_h(var1, var2) & 256) == 256) {
                  field_int_jj = (field_int_ji = var1 * field_int_jh - field_int_fR) - field_int_bF;
                  field_int_jk = (field_int_jl = (field_int_jh - 1) * field_int_jj / field_int_jh) + field_int_bF;
                  var0.drawImage(field_class_javax_microedition_lcdui_Image_jg, field_int_jk + field_int_fR - 2 + (var1 + var2) % 5, var2 * field_int_jh - 3 + var2 % 5, 0);
               }

               if ((func_int_h(var1, var2) & 512) == 512) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, (field_array_byte_iT[var2 * field_int_iP + var1] - 1) * field_int_jh, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh + 2, 0);
               }

               if ((func_int_h(var1, var2) & 4096) == 4096) {
                  var0.drawRegion(field_class_javax_microedition_lcdui_Image_iW, 0, (field_array_byte_iT[var2 * field_int_iP + var1] - 1) * field_int_jh, 24, 24, 0, var1 * field_int_jh, var2 * field_int_jh, 0);
               }
            }
         }

      }
   }

   // $FF: renamed from: h (int, int) int
   private static int func_int_h(int var0, int var1) {
      return field_array_int_iU[var1 * field_int_iP + var0];
   }

   // $FF: renamed from: i (int, int) int
   private static int func_int_i(int var0, int var1) {
      return field_array_int_iU[var1 / field_int_jh * field_int_iP + var0 / field_int_jh];
   }

   // $FF: renamed from: g (int, int, int) boolean
   private static boolean func_boolean_g(int var0, int var1, int var2) {
      return (field_array_int_iU[var1 / field_int_jh * field_int_iP + var0 / field_int_jh] & var2) == var2;
   }

   // $FF: renamed from: h (int, int, int) void
   private static void func_void_h(int var0, int var1, int var2) {
      int[] var10000 = field_array_int_iU;
      int var10001 = var1 / field_int_jh * field_int_iP + var0 / field_int_jh;
      var10000[var10001] |= 1024;
   }

   // $FF: renamed from: i (int, int, int) void
   private static void func_void_i(int var0, int var1, int var2) {
      field_array_int_iU[var1 * field_int_iP + 24] = 0;
   }

   // $FF: renamed from: j (int, int, int) void
   private static void func_void_j(int var0, int var1, int var2) {
      int[] var10000 = field_array_int_iU;
      int var10001 = var1 / field_int_jh * field_int_iP + var0 / field_int_jh;
      var10000[var10001] &= -1025;
   }

   // $FF: renamed from: H (int) int
   private static int func_int_H(int var0) {
      return var0 / field_int_jh * field_int_jh;
   }

   // $FF: renamed from: I (int) int
   private static int func_int_I(int var0) {
      return var0 / field_int_jh * field_int_jh;
   }

   // $FF: renamed from: aj () void
   private static void func_void_aj() {
      try {
         field_class_javax_microedition_lcdui_Image_jF = Image.createImage("/u/lg.png");
      } catch (Exception var0) {
      }

      field_int_jH = 0;
   }

   // $FF: renamed from: ak () void
   private static void func_void_ak() {
      field_int_S = 0;
      field_int_R = 0;
      field_int_jE = 0;
   }

   // $FF: renamed from: J (int) void
   private static void func_void_J(int var0) {
      if (field_array_int_kf[var0] > 30) {
         int var2 = field_array_int_kb[var0] > 0 ? field_array_int_jN[var0] : field_array_int_jN[var0] - field_array_int_kg[var0];
         int var3 = field_array_int_kb[var0] >= 0 ? field_array_int_jN[var0] + field_array_int_kg[var0] : field_array_int_jN[var0];
         int var4 = field_array_int_jO[var0] - field_array_int_kh[var0];
         int var1 = field_array_int_jO[var0] + field_array_int_kh[var0];
         if (field_int_A == 6 ? false : (field_boolean_fz ? false : (field_int_A == 14 ? false : (field_int_fh < var2 ? false : (field_int_fh > var3 ? false : (field_int_fi < var4 ? false : field_int_fi <= var1)))))) {
            field_array_int_kf[var0] = 0;
            field_array_int_jS[var0] = 4;
            field_array_int_jX[var0] = 0;
         }
      }

   }

   // $FF: renamed from: K (int) void
   private static void func_void_K(int var0) {
      if (field_array_int_kf[var0] > 30) {
         int var2 = field_array_int_kb[var0] > 0 ? field_array_int_jN[var0] : field_array_int_jN[var0] - field_array_int_kg[var0];
         int var3 = field_array_int_kb[var0] >= 0 ? field_array_int_jN[var0] + field_array_int_kg[var0] : field_array_int_jN[var0];
         int var4 = field_array_int_jO[var0] - field_array_int_kh[var0];
         int var1 = field_array_int_jO[var0] + field_array_int_kh[var0];
         if (field_int_gu == 14 ? false : (field_int_gq < var2 ? false : (field_int_gq > var3 ? false : (field_int_gr < var4 ? false : field_int_gr <= var1)))) {
            field_array_int_kf[var0] = 0;
            field_array_int_jS[var0] = 4;
            field_array_int_jX[var0] = 0;
            field_array_boolean_kl[var0] = true;
         }
      }

   }

   // $FF: renamed from: k (int, int, int) boolean
   private static boolean func_boolean_k(int var0, int var1, int var2) {
      if (field_array_int_jS[var0] == 2 || field_array_int_jS[var0] == 3 || field_array_int_jS[var0] == 4 || field_array_int_jS[var0] == 9) {
         int[] var10000 = field_array_int_kc;
         var10000[var0] -= var1;
         if (field_array_int_kc[var0] <= 0) {
            field_array_int_kc[var0] = 0;
            field_array_int_jX[var0] = -5;
            field_array_int_jY[var0] = -(var2 << 3);
            field_array_int_jZ[var0] = 0;
            field_array_int_jR[var0] = 0;
            field_array_int_jS[var0] = 1;
            func_void_L(var0);
            return true;
         }

         if (field_array_int_jS[var0] == 9) {
            var10000 = field_array_int_jX;
            var10000[var0] -= 7;
            field_array_int_kb[var0] = var2;
         } else {
            field_array_int_jX[var0] = 0;
            field_array_int_kb[var0] = var2;
            field_array_int_jS[var0] = 6;
            field_array_int_ka[var0] = 3;
         }
      }

      return false;
   }

   // $FF: renamed from: L (int) void
   private static void func_void_L(int var0) {
      func_void_u(field_array_int_aq[field_array_int_jM[var0]]);
      int var1;
      if ((var1 = field_int_w % 20) > 15) {
         func_void_a(field_array_int_jN[var0], field_array_int_jO[var0], -(field_array_int_kb[var0] << 3), -5, field_array_int_ke[var0] << 2, (field_int_w + 1) % 2);
      } else if (var1 == 15) {
         func_void_a(field_array_int_jN[var0], field_array_int_jO[var0], -(field_array_int_kb[var0] << 2), -4, (field_array_int_kj[var0] << 3) + field_int_w % 10);
      } else {
         var1 = ((field_array_int_jM[var0] << 2) / 10 + 1) * 10;
         func_void_a(field_array_int_jN[var0], field_array_int_jO[var0], -(field_array_int_kb[var0] << 1), -6, var1);
         func_void_a(field_array_int_jN[var0], field_array_int_jO[var0], -(field_array_int_kb[var0] << 4), -3, var1);
      }

      if (field_int_O != -1 && field_array_int_lH[field_int_O] == field_array_int_jM[var0]) {
         ++field_int_fF;
         func_void_c(field_array_class_java_lang_String_am[field_array_int_lH[field_int_O]] + ": " + field_int_fF + "#" + field_array_int_lI[field_int_O]);
      }

      if (field_array_int_jM[var0] == field_int_fB - 100 && field_int_w % 10 < field_int_fC) {
         func_void_e(field_array_int_jN[var0], field_array_int_jO[var0]);
         func_void_f(field_array_int_jN[var0], field_array_int_jO[var0] - 28);
      }

   }

   // $FF: renamed from: r (int) void
   public static final void func_void_r(int var0) {
      field_int_jK = 0;
      boolean var1;
      int var2;
      boolean var4;
      switch(var0) {
      case 0:
         field_array_int_kp = new int[]{7};
         func_void_am();
         field_array_array_int_km[0] = new int[]{68, 71, 74, 64};
         field_array_array_int_kn[0] = new int[]{15, 15, 15, 17};
         func_void_an();
         func_void_M(2);
         func_void_q(0, 2);
         break;
      case 1:
         field_array_int_kp = new int[]{1, 7, 0};
         func_void_am();
         field_array_array_int_km[0] = new int[]{44, 40, 42, 39, 41, 39, 34};
         field_array_array_int_kn[0] = new int[]{10, 11, 9, 9, 7, 5, 9};
         field_array_array_int_km[1] = new int[]{48, 51};
         field_array_array_int_kn[1] = new int[]{9, 9};
         field_array_array_int_km[2] = new int[]{8, 3, 24, 25, 26};
         field_array_array_int_kn[2] = new int[]{9, 9, 10, 8, 6};
         func_void_an();
         func_void_M(7);
         func_void_u(0, 3);
         func_void_q(1, 1);
         func_void_s(2, 3);
         break;
      case 2:
         field_array_int_kp = new int[]{1, 6};
         func_void_am();
         field_array_array_int_km[0] = new int[]{32, 41, 44, 48};
         field_array_array_int_kn[0] = new int[]{13, 13, 11, 11};
         field_array_array_int_km[1] = new int[]{41, 47, 57, 36};
         field_array_array_int_kn[1] = new int[]{9, 7, 7, 8};
         func_void_an();
         func_void_M(4);
         func_void_u(0, 2);
         func_void_o(1, 2);
         break;
      case 3:
         field_array_int_kp = new int[]{1, 6, 0};
         func_void_am();
         field_array_array_int_km[0] = new int[]{6, 10, 17, 26, 42, 83, 96};
         field_array_array_int_kn[0] = new int[]{9, 10, 10, 10, 10, 10, 11};
         field_array_array_int_km[1] = new int[]{10, 19, 24, 32, 41, 49, 59, 68, 80, 87, 110};
         field_array_array_int_kn[1] = new int[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 7};
         field_array_array_int_km[2] = new int[]{17, 24, 28, 35, 42, 49, 59, 69, 78, 86, 97, 107, 113};
         field_array_array_int_kn[2] = new int[]{10, 10, 8, 8, 10, 9, 9, 9, 10, 10, 8, 8, 9};
         func_void_an();
         func_void_M(20);
         func_void_u(0, 4);
         func_void_o(1, 8);
         func_void_s(2, 8);
         break;
      case 4:
         field_array_int_kp = new int[]{6, 0, 4, 9, 1};
         func_void_am();
         field_array_array_int_km[0] = new int[]{29, 26, 37, 43, 58, 67, 11, 74, 57};
         field_array_array_int_kn[0] = new int[]{11, 10, 11, 10, 8, 3, 8, 7, 7};
         field_array_array_int_km[1] = new int[]{21, 39, 37, 45, 25, 62, 58};
         field_array_array_int_kn[1] = new int[]{12, 12, 12, 8, 12, 9, 5};
         field_array_array_int_km[2] = new int[]{29, 33, 68, 42, 57};
         field_array_array_int_kn[2] = new int[]{13, 12, 7, 12, 9};
         field_array_array_int_km[3] = new int[]{55, 59, 53};
         field_array_array_int_kn[3] = new int[]{5, 5, 5};
         field_array_array_int_km[4] = new int[]{19, 11};
         field_array_array_int_kn[4] = new int[]{12, 11};
         func_void_an();
         func_void_M(20);
         func_void_o(0, 6);
         func_void_s(1, 6);
         func_void_r(2, 4);
         func_void_l(3, 2);
         func_void_u(4, 2);
         break;
      case 5:
         field_array_int_kp = new int[]{0, 3, 4};
         func_void_am();
         field_array_array_int_km[0] = new int[]{7, 14, 7, 14, 7, 6, 15, 9};
         field_array_array_int_kn[0] = new int[]{9, 13, 18, 28, 29, 35, 42, 70};
         field_array_array_int_km[1] = new int[]{6, 4, 14, 4, 16, 7, 15, 11};
         field_array_array_int_kn[1] = new int[]{14, 26, 33, 44, 47, 62, 65, 78};
         field_array_array_int_km[2] = new int[]{14, 14, 7, 12, 8, 14, 8};
         field_array_array_int_kn[2] = new int[]{23, 39, 56, 62, 66, 70, 78};
         func_void_an();
         func_void_M(20);
         func_void_s(0, 7);
         var1 = true;
         var4 = true;

         for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
         }

         if (var2 != field_int_jK) {
            for(var0 = var2; var0 < var2 + 7; ++var0) {
               field_array_int_kk[var0] = 1;
               field_array_int_jM[var0] = 3;
               field_array_int_kg[var0] = 30;
               field_array_int_kh[var0] = 10;
               field_array_int_jP[var0] = 27;
               field_array_int_jQ[var0] = 15;
               field_array_int_kb[var0] = 1;
               field_array_int_jS[var0] = 5;
               field_array_int_jX[var0] = var0 << 3;
               field_array_int_kc[var0] = field_array_int_kd[var0] = field_array_int_an[field_array_int_jM[var0]];
               field_array_int_ke[var0] = field_array_int_ao[field_array_int_jM[var0]];
               field_array_int_kj[var0] = field_array_int_ap[field_array_int_jM[var0]];
               field_array_int_kf[var0] = 0;
            }
         }

         func_void_r(2, 6);
         break;
      case 6:
         field_array_int_kp = new int[]{9, 2, 5};
         func_void_am();
         field_array_array_int_km[0] = new int[]{42, 47, 72, 82, 85, 93, 104, 130, 139, 151, 165, 182, 189, 200, 207, 214, 225, 225, 237};
         field_array_array_int_kn[0] = new int[]{10, 8, 10, 8, 6, 6, 6, 9, 9, 7, 4, 7, 9, 10, 10, 8, 4, 10, 8};
         field_array_array_int_km[1] = new int[]{39, 40, 41, 72, 73, 74, 132, 106, 107, 130, 131, 142, 149, 157, 168, 182, 183, 194, 214, 215, 216, 236, 39, 40, 56, 57};
         field_array_array_int_kn[1] = new int[]{5, 5, 6, 6, 4, 3, 2, 3, 4, 5, 5, 5, 2, 1, 3, 4, 5, 6, 6, 5, 4, 5, 6, 6, 6, 6};
         field_array_array_int_km[2] = new int[]{45, 64, 83, 101, 119, 147, 173, 220};
         field_array_array_int_kn[2] = new int[]{6, 8, 4, 3, 6, 7, 5, 4};
         func_void_an();
         func_void_M(26);
         func_void_l(0, 5);
         func_void_j(1, 18);
         var1 = true;
         var4 = true;

         for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
         }

         if (var2 != field_int_jK) {
            for(var0 = var2; var0 < var2 + 3; ++var0) {
               field_array_int_kk[var0] = 2;
               field_array_int_jM[var0] = 5;
               field_array_int_kg[var0] = 7;
               field_array_int_kh[var0] = 10;
               field_array_int_jP[var0] = 16;
               field_array_int_jQ[var0] = 15;
               field_array_int_kb[var0] = 0;
               field_array_int_jS[var0] = 5;
               field_array_int_jX[var0] = var0 << 3;
               field_array_int_kc[var0] = field_array_int_kd[var0] = field_array_int_an[field_array_int_jM[var0]];
               field_array_int_ke[var0] = field_array_int_ao[field_array_int_jM[var0]];
               field_array_int_kj[var0] = field_array_int_ap[field_array_int_jM[var0]];
               field_array_int_kf[var0] = 100;
            }
         }
         break;
      case 7:
         field_array_int_kp = new int[]{9, 8, 10};
         func_void_am();
         field_array_array_int_km[0] = new int[]{38, 39, 47, 52, 56, 61, 66, 73, 71};
         field_array_array_int_kn[0] = new int[]{5, 5, 3, 8, 4, 4, 4, 4, 8};
         field_array_array_int_km[1] = new int[]{16, 23, 26, 29, 32, 35, 38, 41, 44, 47, 56, 59, 61, 64, 66};
         field_array_array_int_kn[1] = new int[]{11, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
         field_array_array_int_km[2] = new int[]{36, 42, 45, 487, 56, 60, 64};
         field_array_array_int_kn[2] = new int[]{11, 11, 11, 11, 11, 11, 11};
         func_void_an();
         func_void_M(23);
         func_void_l(0, 7);
         func_void_m(1, 10);
         func_void_n(2, 6);
         break;
      case 8:
         field_array_int_kp = new int[]{11, 8, 10, 2};
         func_void_am();
         field_array_array_int_km[0] = new int[]{12, 29, 6, 12, 24, 18, 37, 50, 65, 72, 47};
         field_array_array_int_kn[0] = new int[]{10, 8, 12, 12, 11, 12, 10, 8, 8, 7, 7};
         field_array_array_int_km[1] = new int[]{29, 45, 48, 70, 73};
         field_array_array_int_kn[1] = new int[]{12, 12, 12, 12, 12};
         field_array_array_int_km[2] = new int[]{46, 47, 71, 72};
         field_array_array_int_kn[2] = new int[]{13, 13, 13, 13};
         field_array_array_int_km[3] = new int[]{25, 7, 69, 69, 50, 51};
         field_array_array_int_kn[3] = new int[]{25, 8, 6, 7, 5, 5};
         func_void_an();
         func_void_M(22);
         var1 = true;
         var4 = false;

         for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
         }

         if (var2 != field_int_jK) {
            for(var0 = var2; var0 < var2 + 10; ++var0) {
               field_array_int_kk[var0] = 0;
               field_array_int_jM[var0] = 11;
               field_array_int_kg[var0] = 32;
               field_array_int_kh[var0] = 10;
               field_array_int_jP[var0] = 27;
               field_array_int_jQ[var0] = 15;
               field_array_int_kb[var0] = 1;
               field_array_int_jS[var0] = 5;
               field_array_int_jX[var0] = field_int_jL - var0;
               field_array_int_kc[var0] = field_array_int_kd[var0] = field_array_int_an[field_array_int_jM[var0]];
               field_array_int_ke[var0] = field_array_int_ao[field_array_int_jM[var0]];
               field_array_int_kj[var0] = field_array_int_ap[field_array_int_jM[var0]];
               field_array_int_kf[var0] = 0;
            }
         }

         func_void_m(1, 4);
         func_void_n(2, 3);
         func_void_j(3, 5);
         break;
      case 9:
         field_array_int_kp = new int[]{13};
         func_void_am();
         field_array_array_int_km[0] = new int[]{10, 37, 23, 65};
         field_array_array_int_kn[0] = new int[]{7, 6, 6, 4};
         func_void_an();
         func_void_M(3);
         func_void_k(0, 3);
         break;
      case 10:
         field_array_int_kp = new int[]{13};
         func_void_am();
         field_array_array_int_km[0] = new int[]{31, 12, 25, 12};
         field_array_array_int_kn[0] = new int[]{19, 23, 23, 6};
         func_void_an();
         func_void_M(3);
         func_void_k(0, 3);
         break;
      case 11:
         field_array_int_kp = new int[]{14, 8};
         func_void_am();
         field_array_array_int_km[0] = new int[]{15, 16, 17, 31, 32, 33, 68, 69, 72};
         field_array_array_int_kn[0] = new int[]{12, 12, 12, 12, 8, 8, 8, 8, 8};
         field_array_array_int_km[1] = new int[]{47, 48, 50, 49};
         field_array_array_int_kn[1] = new int[]{12, 12, 12, 12};
         func_void_an();
         func_void_M(10);
         var1 = true;
         var4 = false;

         for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
         }

         if (var2 != field_int_jK) {
            for(var0 = var2; var0 < var2 + 7; ++var0) {
               field_array_int_kk[var0] = 0;
               field_array_int_jM[var0] = 14;
               field_array_int_kg[var0] = 7;
               field_array_int_kh[var0] = 10;
               field_array_int_jP[var0] = 16;
               field_array_int_jQ[var0] = 15;
               field_array_int_kb[var0] = 1;
               field_array_int_jS[var0] = 5;
               field_array_int_jX[var0] = var0 << 3;
               field_array_int_kc[var0] = field_array_int_kd[var0] = field_array_int_an[field_array_int_jM[var0]];
               field_array_int_ke[var0] = field_array_int_ao[field_array_int_jM[var0]];
               field_array_int_kj[var0] = field_array_int_ap[field_array_int_jM[var0]];
               field_array_int_kf[var0] = 500;
            }
         }

         func_void_m(1, 3);
         break;
      case 12:
         field_array_int_kp = new int[]{15, 16, 10};
         func_void_am();
         field_array_array_int_km[0] = new int[]{11, 18, 20, 9, 9, 17, 18, 22, 31};
         field_array_array_int_kn[0] = new int[]{7, 5, 10, 14, 17, 15, 20, 19, 21};
         field_array_array_int_km[1] = new int[]{5, 10, 5, 10, 14, 21, 16, 37};
         field_array_array_int_kn[1] = new int[]{6, 12, 15, 19, 16, 17, 9, 17};
         field_array_array_int_km[2] = new int[]{25, 26, 27, 34};
         field_array_array_int_kn[2] = new int[]{23, 23, 23, 23};
         func_void_an();
         func_void_M(19);
         func_void_t(0, 7);
         func_void_p(1, 8);
         func_void_n(2, 4);
         break;
      case 13:
         field_array_int_kp = new int[]{18, 15, 13};
         func_void_am();
         field_array_array_int_km[0] = new int[]{6, 12, 30, 34, 34, 43, 54, 53, 70, 76};
         field_array_array_int_kn[0] = new int[]{9, 11, 11, 10, 5, 5, 5, 11, 11, 11};
         field_array_array_int_km[1] = new int[]{11, 16, 18, 29, 50, 38, 48, 58, 62, 74};
         field_array_array_int_kn[1] = new int[]{11, 9, 7, 5, 11, 5, 5, 5, 5, 11};
         field_array_array_int_km[2] = new int[]{22, 41, 42, 61};
         field_array_array_int_kn[2] = new int[]{9, 8, 2, 8};
         func_void_an();
         func_void_M(18);
         func_void_v(0, 8);
         func_void_t(1, 6);
         func_void_k(2, 4);
         break;
      case 14:
         field_array_int_kp = new int[]{12, 17, 16};
         func_void_am();
         field_array_array_int_km[0] = new int[]{7, 12, 16, 25, 28, 45, 50};
         field_array_array_int_kn[0] = new int[]{4, 7, 11, 14, 8, 14, 9};
         field_array_array_int_km[1] = new int[]{14, 18, 29, 28, 29, 53, 47, 51};
         field_array_array_int_kn[1] = new int[]{7, 11, 12, 8, 4, 14, 9, 4};
         field_array_array_int_km[2] = new int[]{4, 41, 26, 26, 34, 41, 49, 56};
         field_array_array_int_kn[2] = new int[]{4, 9, 11, 2, 2, 5, 7, 2};
         func_void_an();
         func_void_M(19);
         func_void_y(0, 6);
         func_void_x(1, 7);
         func_void_p(2, 6);
         break;
      case 15:
         field_array_int_kp = new int[]{19, 18, 17};
         func_void_am();
         field_array_array_int_km[0] = new int[]{22, 7, 19, 32};
         field_array_array_int_kn[0] = new int[]{28, 25, 28, 14};
         field_array_array_int_km[1] = new int[]{3, 13, 31, 35, 24};
         field_array_array_int_kn[1] = new int[]{6, 25, 25, 21, 27};
         field_array_array_int_km[2] = new int[]{35, 29, 24, 17, 13, 2};
         field_array_array_int_kn[2] = new int[]{8, 11, 9, 7, 7, 17};
         func_void_an();
         func_void_M(15);
         func_void_w(0, 4);
         func_void_v(1, 5);
         func_void_x(2, 6);
         break;
      case 16:
         field_array_int_kp = new int[]{19, 13};
         func_void_am();
         field_array_array_int_km[0] = new int[]{15, 33, 53};
         field_array_array_int_kn[0] = new int[]{12, 10, 10};
         field_array_array_int_km[1] = new int[]{20, 39, 59};
         field_array_array_int_kn[1] = new int[]{10, 8, 8};
         func_void_an();
         func_void_M(6);
         func_void_w(0, 3);
         func_void_k(1, 3);
         break;
      case 17:
         field_array_int_kp = new int[]{12};
         func_void_am();
         field_array_array_int_km[0] = new int[]{8, 14, 39, 45};
         field_array_array_int_kn[0] = new int[]{12, 12, 9, 16};
         func_void_an();
         func_void_M(4);
         func_void_y(0, 4);
         break;
      case 95:
         field_array_int_kp = new int[]{13};
         func_void_am();
         field_array_array_int_km[0] = new int[]{7, 10, 14, 18};
         field_array_array_int_kn[0] = new int[]{8, 8, 8, 8};
         func_void_an();
         func_void_M(4);
         func_void_k(0, 4);
      }

      if (field_int_jK > 0) {
         field_array_array_array_class_javax_microedition_lcdui_Image_jJ = new Image[field_array_int_kp.length][2][4];

         for(var0 = 0; var0 < field_array_int_kp.length; ++var0) {
            for(int var5 = 0; var5 < 2; ++var5) {
               for(var2 = 0; var2 < 4; ++var2) {
                  try {
                     field_array_array_array_class_javax_microedition_lcdui_Image_jJ[var0][var5][var2] = Image.createImage("/mob/m" + field_array_int_kp[var0] + var5 + var2 + ".png");
                  } catch (Exception var3) {
                  }

                  if (field_array_array_array_class_javax_microedition_lcdui_Image_jJ[var0][var5][var2] == null && var5 == 1) {
                     field_array_array_array_class_javax_microedition_lcdui_Image_jJ[var0][1][var2] = field_array_array_array_class_javax_microedition_lcdui_Image_jJ[var0][0][var2];
                  }
               }

               if (field_array_array_array_class_javax_microedition_lcdui_Image_jJ[var0][var5][2] == null) {
                  field_array_array_array_class_javax_microedition_lcdui_Image_jJ[var0][var5][2] = field_array_array_array_class_javax_microedition_lcdui_Image_jJ[var0][var5][1];
               }
            }
         }
      }

   }

   // $FF: renamed from: al () void
   private static void func_void_al() {
      for(int var0 = 0; var0 < field_int_jK; ++var0) {
         int var10002;
         if (field_array_int_kf[var0] <= 30) {
            var10002 = field_array_int_kf[var0]++;
         }

         if (field_array_int_jR[var0] > 0) {
            var10002 = field_array_int_jR[var0]--;
         }

         int[] var10000;
         switch(field_array_int_jS[var0]) {
         case 1:
            var10002 = field_array_int_jX[var0]++;
            var10000 = field_array_int_jO;
            var10000[var0] += field_array_int_jX[var0];
            if (field_int_w % 2 == 0) {
               if (field_array_int_jY[var0] > 1) {
                  var10002 = field_array_int_jY[var0]--;
               } else if (field_array_int_jY[var0] < -1) {
                  var10002 = field_array_int_jY[var0]++;
               }
            }

            var10000 = field_array_int_jN;
            var10000[var0] += field_array_int_jY[var0];
            field_array_int_ka[var0] = 2;
            if (field_array_int_jO[var0] < field_int_iS && field_array_int_jN[var0] >= 0 && field_array_int_jN[var0] < field_int_iR) {
               if ((field_array_int_jZ[var0] == 0 || field_array_int_jZ[var0] < 3 && field_array_int_jX[var0] > 7) && (func_int_i(field_array_int_jN[var0], field_array_int_jO[var0]) & 2) == 2) {
                  field_array_int_jX[var0] = field_array_int_jX[var0] > 4 ? -4 : -field_array_int_jX[var0];
                  var10002 = field_array_int_jZ[var0]++;
               }

               if (func_boolean_g(field_array_int_jN[var0], field_array_int_jO[var0], 64) && field_array_int_jO[var0] % field_int_jh > 8) {
                  func_boolean_g(field_array_int_jN[var0], func_int_H(field_array_int_jO[var0]) + 8);
               }
               break;
            }

            field_array_int_jX[var0] = -300;
            field_array_int_jS[var0] = 5;
            if (field_boolean_T) {
               field_array_int_jS[var0] = 8;
            }

            field_array_array_boolean_ko[field_array_int_kk[var0]][field_array_int_ki[var0]] = false;
            break;
         case 2:
            switch(field_array_int_jM[var0]) {
            case 0:
               if (field_int_w % 4 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                  }
               }

               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_kb[var0];
               if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                  field_array_int_kb[var0] = -1;
               } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                  field_array_int_kb[var0] = 1;
               }

               func_void_J(var0);
               if (field_int_w % 9 == 0) {
                  func_void_K(var0);
               }
               continue;
            case 1:
               func_void_U(var0);
               continue;
            case 2:
               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jV[var0];
               var10000 = field_array_int_jO;
               var10000[var0] += field_array_int_jW[var0];
               if (field_array_int_jN[var0] - field_array_int_jT[var0] > 40) {
                  field_array_int_jV[var0] = -(field_int_w % 3 + 1);
               }

               if (field_array_int_jN[var0] - field_array_int_jT[var0] < -40) {
                  field_array_int_jV[var0] = field_int_w % 3 + 1;
               }

               if (field_array_int_jO[var0] - field_array_int_jU[var0] > 40) {
                  field_array_int_jW[var0] = -(field_int_w % 3 + 1);
               }

               if (field_array_int_jO[var0] - field_array_int_jU[var0] < -40) {
                  field_array_int_jW[var0] = field_int_w % 3 + 1;
               }

               if (field_int_w % 15 == 0) {
                  field_array_int_jV[var0] = field_int_w % 4 - 1;
                  field_array_int_jW[var0] = (field_int_w >> 1) % 4 - 1;
               }

               if (field_int_w % 2 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                  }

                  if (field_array_int_ka[var0] == 0) {
                     var10000 = field_array_int_jO;
                     var10000[var0] -= 3;
                  } else {
                     var10000 = field_array_int_jO;
                     var10000[var0] += 2;
                  }
               }

               func_void_J(var0);
               continue;
            case 3:
               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jX[var0];
               if (field_array_int_jX[var0] > 1) {
                  var10002 = field_array_int_jX[var0]--;
               } else if (field_array_int_jX[var0] < -1) {
                  var10002 = field_array_int_jX[var0]++;
               }

               var10000 = field_array_int_jO;
               var10000[var0] += field_array_int_jY[var0];
               var10002 = field_array_int_jY[var0]++;
               if (field_array_int_jY[var0] > 4) {
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = field_array_int_kb[var0] * 3;
               }

               if (func_int_a(field_array_int_jY[var0]) == 3) {
                  if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                     field_array_int_kb[var0] = -1;
                  } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                     field_array_int_kb[var0] = 1;
                  }

                  field_array_int_ka[var0] = 0;
               } else {
                  field_array_int_ka[var0] = 1;
               }

               func_void_J(var0);
               if (field_int_w % 9 == 0) {
                  func_void_K(var0);
               }
               continue;
            case 4:
               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jZ[var0];
               if (field_array_int_jZ[var0] > 1) {
                  var10002 = field_array_int_jZ[var0]--;
               } else if (field_array_int_jZ[var0] < -1) {
                  var10002 = field_array_int_jZ[var0]++;
               }

               var10000 = field_array_int_jO;
               var10000[var0] += field_array_int_jY[var0];
               var10002 = field_array_int_jY[var0]++;
               if (field_array_int_jY[var0] > 3) {
                  field_array_int_jY[var0] = -3;
                  field_array_int_jZ[var0] = field_array_int_kb[var0] << 2;
                  field_array_int_jX[var0] = 0;
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 3;
               }

               if (field_array_int_jY[var0] == -2) {
                  if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                     field_array_int_kb[var0] = -1;
                  } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                     field_array_int_kb[var0] = 1;
                  }

                  field_array_int_jZ[var0] = field_array_int_kb[var0] * 6;
                  field_array_int_ka[var0] = 0;
               } else {
                  field_array_int_ka[var0] = 1;
               }

               func_void_J(var0);
               if (field_int_w % 9 == 0) {
                  func_void_K(var0);
               }
               continue;
            case 5:
               if (field_int_w % 4 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                  }

                  var10000 = field_array_int_jO;
                  var10000[var0] += field_array_int_jX[var0];
               }

               if (field_array_int_jO[var0] > field_array_int_jU[var0]) {
                  field_array_int_jX[var0] = -1;
               } else if (field_array_int_jO[var0] < field_array_int_jT[var0]) {
                  field_array_int_jX[var0] = 1;
               }

               func_void_J(var0);
               continue;
            case 6:
               func_void_P(var0);
            case 7:
            default:
               continue;
            case 8:
               var10002 = field_array_int_ka[var0]++;
               if (field_array_int_ka[var0] > 1) {
                  field_array_int_ka[var0] = 0;
               }

               var10000 = field_array_int_jN;
               var10000[var0] += field_int_w % 5 * field_array_int_kb[var0];
               if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                  field_array_int_kb[var0] = -1;
               } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                  field_array_int_kb[var0] = 1;
               }

               func_void_J(var0);
               continue;
            case 9:
               func_void_Q(var0);
               continue;
            case 10:
               var10002 = field_array_int_ka[var0]++;
               if (field_array_int_ka[var0] > 1) {
                  field_array_int_ka[var0] = 0;
               }

               var10000 = field_array_int_jN;
               var10000[var0] += 5 * field_array_int_kb[var0];
               if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                  field_array_int_kb[var0] = -1;
               } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                  field_array_int_kb[var0] = 1;
               }

               func_void_J(var0);
               continue;
            case 11:
               if (field_int_w % 4 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  field_array_int_jX[var0] = 0;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                     field_array_int_jX[var0] = 1;
                  }
               }

               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jX[var0] * field_array_int_kb[var0];
               if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                  field_array_int_kb[var0] = -1;
               } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                  field_array_int_kb[var0] = 1;
               }

               func_void_J(var0);
               if (field_int_w % 9 == 0) {
                  func_void_K(var0);
               }
               continue;
            case 12:
               func_void_Q(var0);
               continue;
            case 13:
               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jV[var0];
               if (field_array_int_jN[var0] - field_array_int_jT[var0] > 100) {
                  field_array_int_kb[var0] = -1;
                  field_array_int_jV[var0] = field_array_int_kb[var0] * (field_int_w % 4 + 1);
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 2;
               } else if (field_array_int_jN[var0] - field_array_int_jT[var0] < -100) {
                  field_array_int_kb[var0] = 1;
                  field_array_int_jV[var0] = field_array_int_kb[var0] * (field_int_w % 4 + 1);
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 2;
               }

               if (field_array_int_jO[var0] - field_array_int_jU[var0] > 20) {
                  field_array_int_jW[var0] = -(field_int_w % 4 + 1);
               } else if (field_array_int_jO[var0] - field_array_int_jU[var0] < -20) {
                  field_array_int_jW[var0] = field_int_w % 4 + 1;
               } else {
                  field_array_int_jW[var0] = 0;
               }

               var10000 = field_array_int_jO;
               var10000[var0] += field_array_int_jW[var0];
               if (field_int_w % 2 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                     var10000 = field_array_int_jO;
                     var10000[var0] -= 12;
                  } else {
                     var10000 = field_array_int_jO;
                     var10000[var0] += 12;
                  }
               }

               func_void_J(var0);
               continue;
            case 14:
               var10002 = field_array_int_ka[var0]++;
               if (field_array_int_ka[var0] > 1) {
                  field_array_int_ka[var0] = 0;
               }

               if (field_int_w % 2 == 0) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 2;
               } else {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 1;
               }

               if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                  field_array_int_kb[var0] = -1;
               } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                  field_array_int_kb[var0] = 1;
               }

               func_void_J(var0);
               if (field_int_w % 5 == 0) {
                  func_void_K(var0);
               }
               continue;
            case 15:
               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jX[var0];
               if (field_array_int_jX[var0] > 1) {
                  var10002 = field_array_int_jX[var0]--;
               } else if (field_array_int_jX[var0] < -1) {
                  var10002 = field_array_int_jX[var0]++;
               }

               var10000 = field_array_int_jO;
               var10000[var0] += field_array_int_jY[var0];
               var10002 = field_array_int_jY[var0]++;
               if (field_array_int_jY[var0] > 4) {
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = field_array_int_kb[var0] * 3;
               }

               if (func_int_a(field_array_int_jY[var0]) == 3) {
                  if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
                     field_array_int_kb[var0] = -1;
                  } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
                     field_array_int_kb[var0] = 1;
                  }

                  field_array_int_ka[var0] = 0;
               } else {
                  field_array_int_ka[var0] = 1;
               }

               func_void_J(var0);
               if (field_int_w % 9 == 0) {
                  func_void_K(var0);
               }
               continue;
            case 16:
               func_void_P(var0);
               continue;
            case 17:
               func_void_U(var0);
               continue;
            case 18:
            case 19:
               if (field_int_w % 4 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                  }
               }

               if (field_array_int_jN[var0] > field_int_fh) {
                  field_array_int_kb[var0] = -1;
               } else {
                  field_array_int_kb[var0] = 1;
               }

               func_void_J(var0);
               if (field_int_w % 9 == 0) {
                  func_void_K(var0);
               }
               continue;
            }
         case 3:
            var10002 = field_array_int_jX[var0]++;
            if (field_array_int_jX[var0] >= 35) {
               field_array_int_jX[var0] = 0;
               field_array_int_jS[var0] = 2;
            }

            field_array_int_ka[var0] = 0;
            func_void_J(var0);
            break;
         case 4:
            if (field_int_A == 14 || field_boolean_fz) {
               field_array_int_ka[var0] = 0;
               field_array_int_jS[var0] = 2;
               field_array_int_jX[var0] = 0;
               field_array_int_jY[var0] = 0;
            }

            switch(field_array_int_jM[var0]) {
            case 0:
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 2) {
                  if (field_array_boolean_kl[var0]) {
                     field_array_boolean_kl[var0] = false;
                     func_void_b(field_array_int_ke[var0], field_array_int_kb[var0]);
                  } else {
                     func_void_a(field_array_int_ke[var0], field_array_int_kb[var0]);
                  }
               }

               if ((field_array_int_jX[var0] >> 2) % 2 == 0) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0];
                  field_array_int_ka[var0] = 3;
               } else {
                  field_array_int_ka[var0] = 0;
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0];
               }

               if (field_array_int_jX[var0] == 12) {
                  field_array_int_jS[var0] = 3;
                  field_array_int_jX[var0] = 0;
               }
               continue;
            case 1:
               func_void_a(field_array_int_ke[var0], -field_int_fp);
               field_array_int_jS[var0] = 3;
               field_array_int_jX[var0] = 0;
               field_array_int_ka[var0] = 2;
               continue;
            case 2:
               if (field_array_int_jN[var0] < field_int_fh) {
                  field_array_int_jV[var0] = 3 + field_int_w % 4;
               } else if (field_array_int_jN[var0] > field_int_fh) {
                  field_array_int_jV[var0] = -(3 + field_int_w % 4);
               }

               if (field_array_int_jO[var0] < field_int_fi) {
                  field_array_int_jW[var0] = field_int_w % 3;
               } else if (field_array_int_jO[var0] > field_int_fi) {
                  field_array_int_jW[var0] = -field_int_w % 3;
               }

               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jV[var0];
               var10000 = field_array_int_jO;
               var10000[var0] += field_array_int_jW[var0];
               if (field_int_w % 2 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                  }
               }

               if (func_int_a(field_array_int_jN[var0] - field_int_fh) < 5 && func_int_a(field_array_int_jO[var0] - field_int_fi) < 5) {
                  field_array_int_kf[var0] = 0;
                  func_void_a(field_array_int_ke[var0], -field_int_fp);
                  field_array_int_jX[var0] = 0;
                  field_array_int_jS[var0] = 2;
               }

               if (func_int_a(field_array_int_jN[var0] - field_int_fh) > 160 || func_int_a(field_array_int_jO[var0] - field_int_fi) > 160) {
                  field_array_int_jS[var0] = 2;
                  field_array_int_jX[var0] = 0;
                  field_array_int_jV[var0] = field_array_int_jW[var0] = 0;
                  field_array_int_kf[var0] = 0;
               }
               continue;
            case 3:
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 3) {
                  if (field_array_boolean_kl[var0]) {
                     field_array_boolean_kl[var0] = false;
                     func_void_b(field_array_int_ke[var0], field_array_int_kb[var0]);
                  } else {
                     func_void_a(field_array_int_ke[var0], field_array_int_kb[var0]);
                  }
               }

               if ((field_array_int_jX[var0] >> 2) % 2 == 0) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0];
                  field_array_int_ka[var0] = 0;
               } else {
                  field_array_int_ka[var0] = 3;
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0];
               }

               if (field_array_int_jX[var0] == 12) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 3;
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = 0;
               }
               continue;
            case 4:
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 3) {
                  if (field_array_boolean_kl[var0]) {
                     field_array_boolean_kl[var0] = false;
                     func_void_b(field_array_int_ke[var0], field_array_int_kb[var0]);
                  } else {
                     func_void_a(field_array_int_ke[var0], field_array_int_kb[var0]);
                  }
               }

               if ((field_array_int_jX[var0] >> 2) % 2 == 0) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0];
                  field_array_int_ka[var0] = 0;
               } else {
                  field_array_int_ka[var0] = 1;
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0];
               }

               if (field_array_int_jX[var0] == 12) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 3;
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = 0;
               }
               continue;
            case 5:
               func_void_a(field_array_int_ke[var0], -field_int_fp);
               field_array_int_jS[var0] = 2;
               field_array_int_jX[var0] = 1;
               continue;
            case 6:
               func_void_N(var0);
            case 7:
            default:
               continue;
            case 8:
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] <= 10) {
                  if (field_array_int_jO[var0] > field_int_fi) {
                     var10000 = field_array_int_jO;
                     var10000[var0] -= 4;
                  }

                  if (field_array_int_jN[var0] < field_int_fh) {
                     var10000 = field_array_int_jN;
                     var10000[var0] += 2;
                  } else if (field_array_int_jN[var0] > field_int_fh) {
                     var10000 = field_array_int_jN;
                     var10000[var0] -= 2;
                  }

                  if (func_int_a(field_array_int_jN[var0] - field_int_fh) < 16 && func_int_a(field_array_int_jO[var0] - (field_int_fi - 16)) < 20) {
                     func_void_a(field_array_int_ke[var0], -field_int_fp);
                     field_array_int_jX[var0] = 10;
                  }
               }

               if (field_array_int_jX[var0] == 10) {
                  field_array_int_jY[var0] = 1;
               }

               if (field_array_int_jX[var0] > 10) {
                  var10000 = field_array_int_jO;
                  var10000[var0] += field_array_int_jY[var0];
                  var10002 = field_array_int_jY[var0]++;
                  if (field_array_int_jO[var0] > field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]]) {
                     field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                     field_array_int_jY[var0] = 0;
                     field_array_int_jX[var0] = 0;
                     field_array_int_jS[var0] = 2;
                  }
               }

               field_array_int_ka[var0] = field_array_int_jX[var0] % 2 == 0 ? 0 : 1;
               continue;
            case 9:
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] < 6) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 2;
               } else if (field_array_int_jX[var0] == 6) {
                  if (func_int_a(field_array_int_jN[var0] + (field_array_int_kb[var0] << 3) - field_int_fh) < 13 + field_int_fl) {
                     func_void_a(field_array_int_ke[var0], field_array_int_kb[var0]);
                  }
               } else if (field_array_int_jX[var0] < 12) {
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0] << 1;
               } else if (field_array_int_jX[var0] == 12) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 3;
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = 0;
               }

               field_array_int_ka[var0] = 1;
               if (field_array_int_jX[var0] > 3 && field_array_int_jX[var0] < 9 && field_array_int_jX[var0] % 2 == 0) {
                  field_array_int_ka[var0] = 3;
               }
               continue;
            case 10:
               var10002 = field_array_int_jX[var0]++;
               field_array_int_ka[var0] = 3;
               if (field_array_int_jX[var0] <= 15) {
                  var10000 = field_array_int_jO;
                  var10000[var0] -= 7;
                  if (field_array_int_jN[var0] < field_int_fh) {
                     var10002 = field_array_int_jN[var0]++;
                  } else if (field_array_int_jN[var0] > field_int_fh) {
                     var10002 = field_array_int_jN[var0]--;
                  }

                  if (func_int_a(field_array_int_jN[var0] - field_int_fh) < 16 && func_int_a(field_array_int_jO[var0] - (field_int_fi - 16)) < 20) {
                     func_void_a(field_array_int_ke[var0], -field_int_fp);
                     field_array_int_jX[var0] = 15;
                  }
               }

               if (field_array_int_jX[var0] == 15) {
                  field_array_int_jY[var0] = 1;
               }

               if (field_array_int_jX[var0] > 15) {
                  field_array_int_ka[var0] = 2;
                  var10000 = field_array_int_jO;
                  var10000[var0] += field_array_int_jY[var0];
                  var10002 = field_array_int_jY[var0]++;
                  if (func_int_a(field_array_int_jN[var0] - field_int_fh) < 16 && func_int_a(field_array_int_jO[var0] - (field_int_fi - 16)) < 20) {
                     func_void_a(field_array_int_ke[var0], -field_int_fp);
                  }

                  if (field_array_int_jO[var0] > field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]]) {
                     field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                     field_array_int_jY[var0] = 0;
                     field_array_int_jX[var0] = 0;
                     field_array_int_jS[var0] = 2;
                  }
               }
               continue;
            case 11:
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 4 && field_array_int_jO[var0] == field_int_fi) {
                  func_void_a(field_array_int_ke[var0], field_array_int_kb[var0]);
               }

               if (field_array_int_jX[var0] < 8) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 1;
                  field_array_int_ka[var0] = 3;
               } else {
                  field_array_int_ka[var0] = 0;
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0] << 1;
               }

               if (field_array_int_jX[var0] == 12) {
                  field_array_int_jS[var0] = 3;
                  field_array_int_jX[var0] = 0;
                  field_array_int_kf[var0] = 25;
               }
               continue;
            case 12:
               func_void_R(var0);
               continue;
            case 13:
               if (field_array_int_jN[var0] < field_int_fh) {
                  field_array_int_jV[var0] = 4 + field_int_w % 6;
               } else if (field_array_int_jN[var0] > field_int_fh) {
                  field_array_int_jV[var0] = -(4 + field_int_w % 6);
               }

               if (field_array_int_jO[var0] < field_int_fi) {
                  field_array_int_jW[var0] = 2 + field_int_w % 4;
               } else if (field_array_int_jO[var0] > field_int_fi) {
                  field_array_int_jW[var0] = -(2 + field_int_w % 4);
               }

               var10000 = field_array_int_jN;
               var10000[var0] += field_array_int_jV[var0];
               var10000 = field_array_int_jO;
               var10000[var0] += field_array_int_jW[var0];
               if (field_int_w % 2 == 0) {
                  var10002 = field_array_int_ka[var0]++;
                  if (field_array_int_ka[var0] > 1) {
                     field_array_int_ka[var0] = 0;
                  }
               }

               if (func_int_a(field_array_int_jN[var0] - field_int_fh) < 5 && func_int_a(field_array_int_jO[var0] - field_int_fi) < 5) {
                  func_void_a(field_array_int_ke[var0], -field_int_fp);
                  field_array_int_jS[var0] = 2;
                  field_array_int_jX[var0] = 0;
                  field_array_int_kb[var0] = field_array_int_jN[var0] > field_array_int_jT[var0] ? -1 : 1;
                  field_array_int_jV[var0] = field_array_int_kb[var0] * (field_int_w % 4 + 1);
                  field_array_int_kf[var0] = 10;
               }

               if (func_int_a(field_array_int_jN[var0] - field_int_fh) > 130 || func_int_a(field_array_int_jO[var0] - field_int_fi) > 130) {
                  field_array_int_jS[var0] = 2;
                  field_array_int_jX[var0] = 0;
                  field_array_int_jV[var0] = field_array_int_jW[var0] = 0;
                  field_array_int_kb[var0] = field_array_int_jN[var0] > field_array_int_jT[var0] ? -1 : 1;
                  field_array_int_jV[var0] = field_array_int_kb[var0] * (field_int_w % 4 + 1);
                  field_array_int_kf[var0] = 0;
               }
               continue;
            case 14:
               func_void_R(var0);
               continue;
            case 15:
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 3) {
                  if (field_array_boolean_kl[var0]) {
                     field_array_boolean_kl[var0] = false;
                     func_void_b(field_array_int_ke[var0], field_array_int_kb[var0]);
                  } else {
                     func_void_a(field_array_int_ke[var0], field_array_int_kb[var0]);
                  }
               }

               if ((field_array_int_jX[var0] >> 2) % 2 == 0) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0];
                  field_array_int_ka[var0] = 0;
               } else {
                  field_array_int_ka[var0] = 3;
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0];
               }

               if (field_array_int_jX[var0] == 12) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 3;
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = 0;
               }
               continue;
            case 16:
               func_void_N(var0);
               continue;
            case 17:
            case 18:
               var10002 = field_array_int_jX[var0]++;
               field_array_int_ka[var0] = 3;
               if (field_array_int_jX[var0] == 3) {
                  func_void_b(field_array_int_jN[var0] + (field_array_int_kb[var0] << 3), field_array_int_jO[var0] - 12, field_array_int_kb[var0] << 3, field_array_int_ke[var0], 2);
               } else if (field_array_int_jX[var0] == 6) {
                  field_array_int_jS[var0] = 3;
                  field_array_int_jX[var0] = 0;
               }
               continue;
            case 19:
               var10002 = field_array_int_jX[var0]++;
               field_array_int_ka[var0] = 3;
               if (field_array_int_jX[var0] == 3) {
                  var10002 = field_array_int_jY[var0]++;
                  if (field_array_int_jY[var0] == 3) {
                     field_array_int_jY[var0] = 0;
                  }

                  if (field_array_int_jY[var0] == 2) {
                     func_void_c(field_array_int_jN[var0], field_array_int_jO[var0] - 22, field_array_int_kb[var0], -10, field_array_int_ke[var0]);
                  } else if (field_array_int_jY[var0] == 0) {
                     func_void_c(field_array_int_jN[var0], field_array_int_jO[var0] - 22, field_array_int_kb[var0] << 1, -9, field_array_int_ke[var0]);
                  } else {
                     func_void_c(field_array_int_jN[var0], field_array_int_jO[var0] - 22, 0, -11, field_array_int_ke[var0]);
                  }

                  func_boolean_g(field_array_int_jN[var0], field_array_int_jO[var0] - 20);
               } else if (field_array_int_jX[var0] == 6) {
                  field_array_int_jS[var0] = 3;
                  field_array_int_jX[var0] = 0;
               }
               continue;
            }
         case 5:
            var10002 = field_array_int_jX[var0]++;
            if (field_array_int_jX[var0] >= field_int_jL) {
               field_array_int_jX[var0] = 0;
               int var2 = field_int_w % field_array_array_int_km[field_array_int_kk[var0]].length;
               if (field_array_array_boolean_ko[field_array_int_kk[var0]][var2]) {
                  field_array_int_jX[var0] = field_int_jL;
               } else {
                  field_array_int_jN[var0] = field_array_array_int_km[field_array_int_kk[var0]][var2];
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][var2];
                  field_array_array_boolean_ko[field_array_int_kk[var0]][var2] = true;
                  field_array_int_ki[var0] = var2;
                  field_array_int_jS[var0] = 2;
                  field_array_int_kc[var0] = field_array_int_kd[var0];
                  switch(field_array_int_jM[var0]) {
                  case 0:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 20;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 20;
                     break;
                  case 1:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 10;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 10;
                     break;
                  case 2:
                     field_array_int_jT[var0] = field_array_int_jN[var0] + 12;
                     field_array_int_jU[var0] = field_array_int_jO[var0] + 12;
                     break;
                  case 3:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 20;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 20;
                     field_array_int_jY[var0] = -4;
                  case 4:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 20;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 20;
                     field_array_int_jY[var0] = -3;
                     break;
                  case 5:
                     field_array_int_jT[var0] = field_array_int_jO[var0] - 10;
                     field_array_int_jU[var0] = field_array_int_jO[var0] + 10;
                     field_array_int_jX[var0] = 1;
                     break;
                  case 6:
                     field_array_int_jT[var0] = field_array_int_jN[var0];
                     field_array_int_jU[var0] = field_array_int_jO[var0];
                     break;
                  case 7:
                     field_array_int_jS[var0] = 3;
                     break;
                  case 8:
                  case 9:
                  case 11:
                  case 12:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 20;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 20;
                     break;
                  case 10:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 30;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 30;
                     break;
                  case 13:
                     field_array_int_jT[var0] = field_array_int_jN[var0] + 12;
                     field_array_int_jU[var0] = field_array_int_jO[var0] + 12;
                     break;
                  case 14:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 40;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 40;
                     break;
                  case 15:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 20;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 20;
                     field_array_int_jY[var0] = -4;
                     break;
                  case 16:
                     field_array_int_jT[var0] = field_array_int_jN[var0];
                     field_array_int_jU[var0] = field_array_int_jO[var0];
                     break;
                  case 17:
                     field_array_int_jT[var0] = field_array_int_jN[var0] - 30;
                     field_array_int_jU[var0] = field_array_int_jN[var0] + 30;
                  }
               }
            }
            break;
         case 6:
            field_array_int_jR[var0] = 100;
            field_array_int_ka[var0] = 2;
            switch(field_array_int_jM[var0]) {
            case 0:
               if (field_array_int_kf[var0] < 30) {
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0] << 1;
               } else {
                  var10000 = field_array_int_jN;
                  var10000[var0] -= field_array_int_kb[var0];
               }

               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 1) {
                  var10000 = field_array_int_jO;
                  var10000[var0] -= 2;
               } else if (field_array_int_jX[var0] == 5) {
                  var10000 = field_array_int_jO;
                  var10000[var0] += 2;
                  field_array_int_jS[var0] = 2;
               }
               break;
            case 1:
               func_void_S(var0);
               break;
            case 2:
               var10002 = field_array_int_jX[var0]++;
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_jV[var0] >> 3;
               var10000 = field_array_int_jO;
               var10000[var0] -= field_array_int_jW[var0] >> 3;
               if (field_array_int_jV[var0] == 0) {
                  field_array_int_jV[var0] = 2;
               }

               if (field_array_int_jW[var0] == 0) {
                  field_array_int_jW[var0] = 2;
               }

               if (field_array_int_jX[var0] == 5) {
                  field_array_int_jS[var0] = 2;
                  field_array_int_jX[var0] = 0;
                  field_array_int_jV[var0] = field_array_int_jW[var0] = 0;
                  field_array_int_kf[var0] = 10;
               }
               break;
            case 3:
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_kb[var0];
               field_array_int_ka[var0] = 2;
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 7) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 2;
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = field_array_int_kb[var0] * 3;
               }
               break;
            case 4:
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_kb[var0];
               field_array_int_ka[var0] = 2;
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 7) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 2;
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = field_array_int_kb[var0] * 3;
               }
               break;
            case 5:
               var10002 = field_array_int_jX[var0]++;
               var10002 = field_array_int_jO[var0]--;
               if (field_array_int_jX[var0] == 3) {
                  field_array_int_jS[var0] = 2;
                  field_array_int_jX[var0] = 1;
               }

               field_array_int_ka[var0] = 2;
               break;
            case 6:
               func_void_O(var0);
               break;
            case 7:
               var10002 = field_array_int_jX[var0]++;
               field_array_int_kb[var0] = -field_int_fp;
               if (field_array_int_jX[var0] % 4 > 1) {
                  field_array_int_ka[var0] = 0;
               } else {
                  field_array_int_ka[var0] = 2;
               }

               if (field_array_int_jX[var0] == 8) {
                  field_array_int_jS[var0] = 3;
                  field_array_int_kb[var0] = 0;
                  field_array_int_jV[var0] = field_array_int_jW[var0] = 0;
                  field_array_int_kf[var0] = 0;
               }
               break;
            case 8:
               field_array_int_jS[var0] = 4;
               break;
            case 9:
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_kb[var0];
               field_array_int_ka[var0] = 2;
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 6) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 4;
                  field_array_int_jX[var0] = 4;
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 3;
               }
               break;
            case 10:
               field_array_int_jS[var0] = 4;
               break;
            case 11:
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_kb[var0];
               field_array_int_ka[var0] = 2;
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 6) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 4;
                  field_array_int_jX[var0] = 0;
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 3;
               }
               break;
            case 12:
               func_void_S(var0);
               break;
            case 13:
               var10002 = field_array_int_jX[var0]++;
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_jV[var0] >> 3;
               var10000 = field_array_int_jO;
               var10000[var0] -= field_array_int_jW[var0] >> 3;
               if (field_array_int_jV[var0] == 0) {
                  field_array_int_jV[var0] = 2;
               }

               if (field_array_int_jW[var0] == 0) {
                  field_array_int_jW[var0] = 2;
               }

               if (field_array_int_jX[var0] == 5) {
                  field_array_int_jS[var0] = 2;
                  field_array_int_jX[var0] = 0;
                  field_array_int_kb[var0] = field_array_int_jN[var0] > field_array_int_jT[var0] ? -1 : 1;
                  field_array_int_jV[var0] = field_array_int_kb[var0] << 3;
                  field_array_int_kf[var0] = 0;
               }
               break;
            case 14:
               func_void_T(var0);
               break;
            case 15:
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_kb[var0];
               field_array_int_ka[var0] = 2;
               var10002 = field_array_int_jX[var0]++;
               if (field_array_int_jX[var0] == 3) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
                  field_array_int_jS[var0] = 2;
                  field_array_int_jY[var0] = -4;
                  field_array_int_jX[var0] = field_array_int_kb[var0] * 3;
               }
               break;
            case 16:
               func_void_O(var0);
               break;
            case 17:
               func_void_T(var0);
               break;
            case 18:
               var10002 = field_array_int_jX[var0]++;
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_kb[var0];
               if (field_array_int_jX[var0] == 4) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 2;
                  field_array_int_jS[var0] = 2;
               }
               break;
            case 19:
               var10002 = field_array_int_jX[var0]++;
               var10000 = field_array_int_jN;
               var10000[var0] -= field_array_int_kb[var0];
               if (field_array_int_jX[var0] == 4) {
                  var10000 = field_array_int_jN;
                  var10000[var0] += field_array_int_kb[var0] << 2;
                  field_array_int_jX[var0] = 0;
                  field_array_int_jS[var0] = 4;
               }
            }
         case 7:
         case 8:
         default:
            break;
         case 9:
            var10000 = field_array_int_jO;
            var10000[var0] += field_array_int_jX[var0];
            var10002 = field_array_int_jX[var0]++;
            field_array_int_ka[var0] = 2;
            if (field_array_int_jO[var0] > field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]]) {
               if (field_array_int_jM[var0] != 2 && field_array_int_jM[var0] != 6 && field_array_int_jM[var0] != 16 && field_array_int_jM[var0] != 13) {
                  field_array_int_jO[var0] = field_array_array_int_kn[field_array_int_kk[var0]][field_array_int_ki[var0]];
               }

               field_array_int_jS[var0] = 3;
            }
         }
      }

   }

   // $FF: renamed from: j (int, int) void
   private static void func_void_j(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 2;
            field_array_int_kg[var3] = 120;
            field_array_int_kh[var3] = 100;
            field_array_int_jP[var3] = 20;
            field_array_int_jQ[var3] = 30;
            field_array_int_kb[var3] = 0;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 * 7 + var3;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 100;
            field_array_int_jV[var3] = 2;
            field_array_int_jW[var3] = 3;
         }

      }
   }

   // $FF: renamed from: k (int, int) void
   private static void func_void_k(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 13;
            field_array_int_kg[var3] = 120;
            field_array_int_kh[var3] = 50;
            field_array_int_jP[var3] = 20;
            field_array_int_jQ[var3] = 20;
            field_array_int_kb[var3] = -1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 << 1;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 100;
            field_array_int_jV[var3] = -3;
            field_array_int_jW[var3] = 3;
         }

      }
   }

   // $FF: renamed from: l (int, int) void
   private static void func_void_l(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 9;
            field_array_int_kg[var3] = 36;
            field_array_int_kh[var3] = 20;
            field_array_int_jP[var3] = 34;
            field_array_int_jQ[var3] = 32;
            field_array_int_kb[var3] = 1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 * 6;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 100;
         }

      }
   }

   // $FF: renamed from: m (int, int) void
   private static void func_void_m(int var0, int var1) {
      for(var0 = 0; var0 < field_int_jK && field_array_int_jM[var0] != -1; ++var0) {
      }

      if (var0 != field_int_jK) {
         for(int var2 = var0; var2 < var0 + var1; ++var2) {
            field_array_int_kk[var2] = 1;
            field_array_int_jM[var2] = 8;
            field_array_int_kg[var2] = 40;
            field_array_int_kh[var2] = 30;
            field_array_int_jP[var2] = 12;
            field_array_int_jQ[var2] = 16;
            int[] var10000 = field_array_int_jO;
            var10000[var2] += 5;
            field_array_int_kb[var2] = 1;
            field_array_int_jS[var2] = 5;
            field_array_int_jX[var2] = var2 * 5;
            field_array_int_kc[var2] = field_array_int_kd[var2] = field_array_int_an[field_array_int_jM[var2]];
            field_array_int_ke[var2] = field_array_int_ao[field_array_int_jM[var2]];
            field_array_int_kj[var2] = field_array_int_ap[field_array_int_jM[var2]];
            field_array_int_kf[var2] = 60;
         }

      }
   }

   // $FF: renamed from: n (int, int) void
   private static void func_void_n(int var0, int var1) {
      for(var0 = 0; var0 < field_int_jK && field_array_int_jM[var0] != -1; ++var0) {
      }

      if (var0 != field_int_jK) {
         for(int var2 = var0; var2 < var0 + var1; ++var2) {
            field_array_int_kk[var2] = 2;
            field_array_int_jM[var2] = 10;
            field_array_int_kg[var2] = 80;
            field_array_int_kh[var2] = 100;
            field_array_int_jP[var2] = 12;
            field_array_int_jQ[var2] = 16;
            field_array_int_kb[var2] = 1;
            field_array_int_jS[var2] = 5;
            field_array_int_jX[var2] = var2 * 5;
            field_array_int_kc[var2] = field_array_int_kd[var2] = field_array_int_an[field_array_int_jM[var2]];
            field_array_int_ke[var2] = field_array_int_ao[field_array_int_jM[var2]];
            field_array_int_kj[var2] = field_array_int_ap[field_array_int_jM[var2]];
            field_array_int_kf[var2] = 40;
         }

      }
   }

   // $FF: renamed from: o (int, int) void
   private static void func_void_o(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 6;
            field_array_int_kg[var3] = 60;
            field_array_int_kh[var3] = 60;
            field_array_int_jP[var3] = 16;
            field_array_int_jQ[var3] = 16;
            field_array_int_kb[var3] = -1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 << 3;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 100;
            field_array_int_jV[var3] = 2;
            field_array_int_jW[var3] = 3;
         }

      }
   }

   // $FF: renamed from: p (int, int) void
   private static void func_void_p(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 16;
            field_array_int_kg[var3] = 60;
            field_array_int_kh[var3] = 60;
            field_array_int_jP[var3] = 16;
            field_array_int_jQ[var3] = 16;
            field_array_int_kb[var3] = -1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 + 60;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 100;
            field_array_int_jV[var3] = 2;
            field_array_int_jW[var3] = 3;
         }

      }
   }

   // $FF: renamed from: q (int, int) void
   private static void func_void_q(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 7;
            field_array_int_kg[var3] = 10;
            field_array_int_kh[var3] = 10;
            field_array_int_jP[var3] = 30;
            field_array_int_jQ[var3] = 25;
            field_array_int_kb[var3] = 1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 << 2;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 0;
         }

      }
   }

   // $FF: renamed from: r (int, int) void
   private static void func_void_r(int var0, int var1) {
      for(var0 = 0; var0 < field_int_jK && field_array_int_jM[var0] != -1; ++var0) {
      }

      if (var0 != field_int_jK) {
         for(int var2 = var0; var2 < var0 + var1; ++var2) {
            field_array_int_kk[var2] = 2;
            field_array_int_jM[var2] = 4;
            field_array_int_kg[var2] = 20;
            field_array_int_kh[var2] = 10;
            field_array_int_jP[var2] = 18;
            field_array_int_jQ[var2] = 18;
            field_array_int_kb[var2] = 1;
            field_array_int_jS[var2] = 5;
            field_array_int_jX[var2] = var2 << 3;
            field_array_int_kc[var2] = field_array_int_kd[var2] = field_array_int_an[field_array_int_jM[var2]];
            field_array_int_ke[var2] = field_array_int_ao[field_array_int_jM[var2]];
            field_array_int_kj[var2] = field_array_int_ap[field_array_int_jM[var2]];
            field_array_int_kf[var2] = 0;
         }

      }
   }

   // $FF: renamed from: am () void
   private static void func_void_am() {
      field_array_array_int_km = new int[field_array_int_kp.length][];
      field_array_array_int_kn = new int[field_array_int_kp.length][];
      field_array_array_boolean_ko = new boolean[field_array_int_kp.length][];
   }

   // $FF: renamed from: M (int) void
   private static void func_void_M(int var0) {
      field_int_jK = var0;
      field_int_jL = 70;
      field_array_int_jM = new int[field_int_jK];
      field_array_int_kk = new int[field_int_jK];
      field_array_int_jN = new int[field_int_jK];
      field_array_int_jO = new int[field_int_jK];
      field_array_int_jS = new int[field_int_jK];
      field_array_int_jT = new int[field_int_jK];
      field_array_int_jU = new int[field_int_jK];
      field_array_int_jV = new int[field_int_jK];
      field_array_int_jW = new int[field_int_jK];
      field_array_int_jX = new int[field_int_jK];
      field_array_int_jY = new int[field_int_jK];
      field_array_int_jZ = new int[field_int_jK];
      field_array_int_ka = new int[field_int_jK];
      field_array_int_kb = new int[field_int_jK];
      field_array_int_kc = new int[field_int_jK];
      field_array_boolean_kl = new boolean[field_int_jK];
      field_array_int_kd = new int[field_int_jK];
      field_array_int_ke = new int[field_int_jK];
      field_array_int_kf = new int[field_int_jK];
      field_array_int_jP = new int[field_int_jK];
      field_array_int_jQ = new int[field_int_jK];
      field_array_int_jQ = new int[field_int_jK];
      field_array_int_jR = new int[field_int_jK];
      field_array_int_kg = new int[field_int_jK];
      field_array_int_kh = new int[field_int_jK];
      field_array_int_ki = new int[field_int_jK];
      field_array_int_kj = new int[field_int_jK];

      for(var0 = 0; var0 < field_int_jK; ++var0) {
         field_array_int_jM[var0] = -1;
      }

   }

   // $FF: renamed from: s (int, int) void
   private static void func_void_s(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 0;
            field_array_int_kg[var3] = 25;
            field_array_int_kh[var3] = 10;
            field_array_int_jP[var3] = 27;
            field_array_int_jQ[var3] = 15;
            field_array_int_kb[var3] = 1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 * 7;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 0;
         }

      }
   }

   // $FF: renamed from: t (int, int) void
   private static void func_void_t(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 15;
            field_array_int_kg[var3] = 36;
            field_array_int_kh[var3] = 10;
            field_array_int_jP[var3] = 27;
            field_array_int_jQ[var3] = 15;
            field_array_int_kb[var3] = 1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 << 1;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 0;
         }

      }
   }

   // $FF: renamed from: u (int, int) void
   private static void func_void_u(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 1;
            field_array_int_kg[var3] = 7;
            field_array_int_kh[var3] = 10;
            field_array_int_jP[var3] = 16;
            field_array_int_jQ[var3] = 15;
            field_array_int_kb[var3] = 1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = var3 << 3;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 100;
         }

      }
   }

   // $FF: renamed from: v (int, int) void
   private static void func_void_v(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 18;
            field_array_int_kg[var3] = 120;
            field_array_int_kh[var3] = 10;
            field_array_int_jP[var3] = 24;
            field_array_int_jQ[var3] = 20;
            field_array_int_kb[var3] = 1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = 60;
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 100;
         }

      }
   }

   // $FF: renamed from: w (int, int) void
   private static void func_void_w(int var0, int var1) {
      for(var0 = 0; var0 < field_int_jK && field_array_int_jM[var0] != -1; ++var0) {
      }

      if (var0 != field_int_jK) {
         for(int var2 = var0; var2 < var0 + var1; ++var2) {
            field_array_int_kk[var2] = 0;
            field_array_int_jM[var2] = 19;
            field_array_int_kg[var2] = 60;
            field_array_int_kh[var2] = 30;
            field_array_int_jP[var2] = 24;
            field_array_int_jQ[var2] = 20;
            field_array_int_kb[var2] = 1;
            field_array_int_jS[var2] = 5;
            field_array_int_jX[var2] = 62;
            field_array_int_kc[var2] = field_array_int_kd[var2] = field_array_int_an[field_array_int_jM[var2]];
            field_array_int_ke[var2] = field_array_int_ao[field_array_int_jM[var2]];
            field_array_int_kj[var2] = field_array_int_ap[field_array_int_jM[var2]];
            field_array_int_kf[var2] = 70;
         }

      }
   }

   // $FF: renamed from: x (int, int) void
   private static void func_void_x(int var0, int var1) {
      int var2;
      for(var2 = 0; var2 < field_int_jK && field_array_int_jM[var2] != -1; ++var2) {
      }

      if (var2 != field_int_jK) {
         for(int var3 = var2; var3 < var2 + var1; ++var3) {
            field_array_int_kk[var3] = var0;
            field_array_int_jM[var3] = 17;
            field_array_int_kg[var3] = 60;
            field_array_int_kh[var3] = 10;
            field_array_int_jP[var3] = 22;
            field_array_int_jQ[var3] = 22;
            field_array_int_kb[var3] = 1;
            field_array_int_jS[var3] = 5;
            field_array_int_jX[var3] = 50 + (var3 << 1);
            field_array_int_kc[var3] = field_array_int_kd[var3] = field_array_int_an[field_array_int_jM[var3]];
            field_array_int_ke[var3] = field_array_int_ao[field_array_int_jM[var3]];
            field_array_int_kj[var3] = field_array_int_ap[field_array_int_jM[var3]];
            field_array_int_kf[var3] = 500;
         }

      }
   }

   // $FF: renamed from: y (int, int) void
   private static void func_void_y(int var0, int var1) {
      for(var0 = 0; var0 < field_int_jK && field_array_int_jM[var0] != -1; ++var0) {
      }

      if (var0 != field_int_jK) {
         for(int var2 = var0; var2 < var0 + var1; ++var2) {
            field_array_int_kk[var2] = 0;
            field_array_int_jM[var2] = 12;
            field_array_int_kg[var2] = 24;
            field_array_int_kh[var2] = 10;
            field_array_int_jP[var2] = 16;
            field_array_int_jQ[var2] = 22;
            field_array_int_kb[var2] = 1;
            field_array_int_jS[var2] = 5;
            field_array_int_jX[var2] = 70;
            field_array_int_kc[var2] = field_array_int_kd[var2] = field_array_int_an[field_array_int_jM[var2]];
            field_array_int_ke[var2] = field_array_int_ao[field_array_int_jM[var2]];
            field_array_int_kj[var2] = field_array_int_ap[field_array_int_jM[var2]];
            field_array_int_kf[var2] = 500;
         }

      }
   }

   // $FF: renamed from: an () void
   private static void func_void_an() {
      int var0;
      for(var0 = 0; var0 < field_array_int_kp.length; ++var0) {
         field_array_array_boolean_ko[var0] = new boolean[field_array_array_int_km[var0].length];
      }

      for(var0 = 0; var0 < field_array_array_int_km.length; ++var0) {
         for(int var1 = 0; var1 < field_array_array_int_km[var0].length; ++var1) {
            field_array_array_int_km[var0][var1] = field_array_array_int_km[var0][var1] * field_int_jh + 12;
            field_array_array_int_kn[var0][var1] *= field_int_jh;
            if (var0 == 8) {
               int[] var10000 = field_array_array_int_kn[var0];
               var10000[var1] -= 12;
            }
         }
      }

   }

   // $FF: renamed from: N (int) void
   private static void func_void_N(int var0) {
      if (field_array_int_jN[var0] < field_int_fh) {
         field_array_int_jV[var0] = field_int_w % 3 + 3;
         field_array_int_kb[var0] = 1;
      } else if (field_array_int_jN[var0] > field_int_fh) {
         field_array_int_jV[var0] = -field_int_w % 3 - 3;
         field_array_int_kb[var0] = -1;
      }

      if (field_array_int_jO[var0] < field_int_fi) {
         field_array_int_jW[var0] = field_int_w % 3 + 3;
      } else if (field_array_int_jO[var0] > field_int_fi) {
         field_array_int_jW[var0] = -field_int_w % 3 - 3;
      }

      int[] var10000 = field_array_int_jN;
      var10000[var0] += field_array_int_jV[var0];
      var10000 = field_array_int_jO;
      var10000[var0] += field_array_int_jW[var0];
      int var10002 = field_array_int_ka[var0]++;
      if (field_array_int_ka[var0] > 1) {
         field_array_int_ka[var0] = 0;
      }

      if (func_int_a(field_array_int_jN[var0] - field_int_fh) < 10 && func_int_a(field_array_int_jO[var0] - field_int_fi) < 10) {
         field_array_int_kf[var0] = 0;
         if (field_array_boolean_kl[var0]) {
            field_array_boolean_kl[var0] = false;
            func_void_b(field_array_int_ke[var0], field_array_int_kb[var0]);
         } else {
            func_void_a(field_array_int_ke[var0], field_array_int_kb[var0]);
         }

         field_array_int_jX[var0] = 0;
         field_array_int_jS[var0] = 2;
      }

      if (func_int_a(field_array_int_jN[var0] - field_int_fh) > 160 || func_int_a(field_array_int_jO[var0] - field_int_fi) > 160) {
         field_array_int_jS[var0] = 2;
         field_array_int_jX[var0] = 0;
         field_array_int_jV[var0] = field_array_int_jW[var0] = 0;
         field_array_int_kf[var0] = 0;
      }

   }

   // $FF: renamed from: O (int) void
   private static void func_void_O(int var0) {
      int var10002 = field_array_int_jX[var0]++;
      int[] var10000 = field_array_int_jN;
      var10000[var0] -= field_array_int_jV[var0];
      var10000 = field_array_int_jO;
      var10000[var0] -= field_array_int_jW[var0];
      if (field_array_int_jV[var0] == 0) {
         field_array_int_jV[var0] = 2;
      }

      if (field_array_int_jW[var0] == 0) {
         field_array_int_jW[var0] = 2;
      }

      if (field_array_int_jX[var0] == 5) {
         field_array_int_jS[var0] = 2;
         field_array_int_jX[var0] = 0;
         field_array_int_jV[var0] = field_array_int_jW[var0] = 0;
         field_array_int_kf[var0] = 0;
      }

   }

   // $FF: renamed from: P (int) void
   private static void func_void_P(int var0) {
      int[] var10000 = field_array_int_jN;
      var10000[var0] += field_array_int_jV[var0];
      var10000 = field_array_int_jO;
      var10000[var0] += field_array_int_jW[var0];
      if (field_array_int_jN[var0] - field_array_int_jT[var0] > 40) {
         field_array_int_jV[var0] = -(field_int_w % 2 + 1);
      }

      if (field_array_int_jN[var0] - field_array_int_jT[var0] < -40) {
         field_array_int_jV[var0] = field_int_w % 2 + 1;
      }

      if (field_array_int_jO[var0] - field_array_int_jU[var0] > 40) {
         field_array_int_jW[var0] = -(field_int_w % 2 + 1);
      }

      if (field_array_int_jO[var0] - field_array_int_jU[var0] < -40) {
         field_array_int_jW[var0] = field_int_w % 2 + 1;
      }

      if (field_int_w % 15 == 0) {
         field_array_int_jV[var0] = field_int_w % 3 - 1;
         field_array_int_jW[var0] = (field_int_w >> 1) % 3 - 1;
      }

      int var10002 = field_array_int_ka[var0]++;
      if (field_array_int_ka[var0] > 1) {
         field_array_int_ka[var0] = 0;
      }

      func_void_J(var0);
      if (field_int_w % 5 == 0) {
         func_void_K(var0);
      }

   }

   // $FF: renamed from: Q (int) void
   private static void func_void_Q(int var0) {
      if (field_int_w % 4 == 1) {
         int var10002 = field_array_int_ka[var0]++;
         if (field_array_int_ka[var0] > 1) {
            field_array_int_ka[var0] = 0;
         }

         int[] var10000 = field_array_int_jN;
         var10000[var0] += field_array_int_kb[var0] << 1;
         if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
            field_array_int_kb[var0] = -1;
         } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
            field_array_int_kb[var0] = 1;
         }
      }

      func_void_J(var0);
   }

   // $FF: renamed from: R (int) void
   private static void func_void_R(int var0) {
      func_void_a(field_array_int_ke[var0], -field_int_fp);
      field_array_int_jS[var0] = 2;
      field_array_int_jX[var0] = 0;
      field_array_int_ka[var0] = 2;
   }

   // $FF: renamed from: S (int) void
   private static void func_void_S(int var0) {
      int var10002 = field_array_int_jX[var0]++;
      int[] var10000 = field_array_int_jN;
      var10000[var0] -= field_array_int_kb[var0];
      if (field_array_int_jX[var0] == 5) {
         field_array_int_jS[var0] = 2;
      }

   }

   // $FF: renamed from: T (int) void
   private static void func_void_T(int var0) {
      int var10002 = field_array_int_jX[var0]++;
      int[] var10000 = field_array_int_jN;
      var10000[var0] -= field_array_int_kb[var0];
      if (field_array_int_jX[var0] == 3) {
         field_array_int_jS[var0] = 2;
      }

   }

   // $FF: renamed from: U (int) void
   private static void func_void_U(int var0) {
      if (field_int_w % 4 == 0) {
         int var10002 = field_array_int_ka[var0]++;
         if (field_array_int_ka[var0] > 1) {
            field_array_int_ka[var0] = 0;
         }

         int[] var10000 = field_array_int_jN;
         var10000[var0] += field_array_int_kb[var0];
      }

      if (field_array_int_jN[var0] > field_array_int_jU[var0]) {
         field_array_int_kb[var0] = -1;
      } else if (field_array_int_jN[var0] < field_array_int_jT[var0]) {
         field_array_int_kb[var0] = 1;
      }

      func_void_J(var0);
      if (field_int_w % 5 == 0) {
         func_void_K(var0);
      }

   }

   // $FF: renamed from: ao () void
   private static void func_void_ao() {
      field_int_U = field_int_bG - 40;
      field_int_kr = field_int_bF - 50;
      field_class_javax_microedition_lcdui_Image_iW = null;
      field_array_class_javax_microedition_lcdui_Image_kA = new Image[4];

      try {
         field_array_class_javax_microedition_lcdui_Image_kA[0] = Image.createImage("/u/wpt0.png");
         field_array_class_javax_microedition_lcdui_Image_kA[1] = Image.createImage("/u/wpt2.png");
         field_array_class_javax_microedition_lcdui_Image_kA[2] = Image.createImage("/u/wpt3.png");
         field_array_class_javax_microedition_lcdui_Image_kA[3] = Image.createImage("/u/wpt4.png");
      } catch (Exception var3) {
      }

      if (field_array_class_javax_microedition_lcdui_Image_kK == null) {
         field_array_class_javax_microedition_lcdui_Image_kK = new Image[4];

         for(int var0 = 0; var0 < 4; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_kK[var0] = Image.createImage("/u/bd" + var0 + ".png");
            } catch (IOException var2) {
               var2.printStackTrace();
            }
         }
      }

      System.gc();
   }

   // $FF: renamed from: m (javax.microedition.lcdui.Graphics) void
   private static void func_void_m(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      func_void_d(var0);
      func_void_c(var0);
      var0.setClip(0, 0, field_int_aW, field_int_aX);
      var0.setColor(0);
      var0.fillRect(field_int_bF - 64, field_int_U - 19, 129, 102);
      var0.fillRect(0, field_int_aX - 13, field_int_aW, 13);
      Midlet.func_void_a(var0, "Mua", 3, field_int_aX - 13, 0);
      Midlet.func_void_a(var0, "Quay lại", field_int_aW - 3, field_int_aX - 13, 1);
      var0.setColor(12281361);
      var0.drawRect(field_int_bF - 63, field_int_U - 18, 126, 99);
      var0.setColor(6562304);
      var0.fillRect(field_int_bF - 61, field_int_U - 16, 123, 97);
      if (shopType == 0) {
         Midlet.func_void_a(var0, "Tiền: " + field_int_dg + "$", field_int_bF, field_int_U - 8, 2);
      } else {
         Midlet.func_void_a(var0, field_array_array_class_java_lang_String_kx[field_int_ku][field_int_ks], field_int_bF, field_int_U - 8, 2);
      }

      int var1;
      for(var1 = 0; var1 < 3; ++var1) {
         var0.setColor(0);
         var0.fillRect(field_int_kr - 10 + var1 * 20, field_int_U + 10, 19, 20);
         var0.fillRect(field_int_kr + 50 + var1 * 20, field_int_U + 10, 19, 20);
         var0.setColor(4856064);
         var0.drawRect(field_int_kr - 10 + var1 * 20, field_int_U + 10, 20, 20);
         var0.drawRect(field_int_kr + 50 + var1 * 20, field_int_U + 10, 20, 20);
         var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_ez[0], 0, var1 * 15, 13, 15, 0, field_int_kr + var1 * 20, field_int_U + 20, 3);
         var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_ez[1], 0, var1 * 15, 13, 15, 0, field_int_kr + 60 + var1 * 20, field_int_U + 20, 3);
      }

      for(var1 = 0; var1 < 4; ++var1) {
         var0.setColor(0);
         var0.fillRect(field_int_kr + 10 + var1 * 20, field_int_U + 32, 19, 20);
         var0.setColor(4856064);
         var0.drawRect(field_int_kr + 10 + var1 * 20, field_int_U + 32, 18, 20);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kA[var1], field_int_kr + 20 + var1 * 20, field_int_U + 42, 3);
      }

      var0.setColor(field_array_int_kw[field_int_kt]);
      if (field_int_ku == 0) {
         var0.drawRect(field_int_kr - 10 + field_int_ks * 20, field_int_U + 10, 19, 20);
      } else {
         var0.drawRect(field_int_kr + 10 + field_int_ks * 20, field_int_U + 32, 19, 20);
      }
      
      if (shopType == 0) {
         Midlet.func_void_a(var0, field_array_array_class_java_lang_String_kx[field_int_ku][field_int_ks] + "-" + field_array_array_int_kz[field_int_ku][field_int_ks] + "$", field_int_bF, field_int_U + 58, 2);
      } else {
         Midlet.func_void_a(var0, field_array_array_class_java_lang_String_ky[field_int_ku][field_int_ks], field_int_bF, field_int_U + 58, 2);
      }

      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[0], field_int_bF - 64, field_int_U - 19, 20);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[1], field_int_bF + 65, field_int_U - 19, 24);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[2], field_int_bF - 64, field_int_U + 83, 36);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[3], field_int_bF + 65, field_int_U + 83, 40);
   }

   // $FF: renamed from: ap () void
   private static void func_void_ap() {
      if (field_boolean_aP) {
         field_boolean_aP = false;
         if (field_int_aR > field_int_aX - 40) {
            if (field_int_aQ < field_int_aY) {
               field_array_boolean_aV[12] = true;
            } else {
               field_array_boolean_aV[13] = true;
            }
         }

         int var0;
         if (field_int_aR > field_int_U && field_int_aR < field_int_U + 32) {
            field_int_ku = 0;
            field_int_ks = 0;

            for(var0 = 0; var0 < 6; ++var0) {
               if (field_int_aQ > field_int_kr - 10 + var0 * 20 && field_int_aQ < field_int_kr - 10 + var0 * 20 + 20) {
                  field_int_ks = var0;
               }
            }
         } else if (field_int_aR < field_int_U + 60) {
            field_int_ku = 1;
            field_int_ks = 0;

            for(var0 = 0; var0 < 4; ++var0) {
               if (field_int_aQ > field_int_kr + 10 + var0 * 20 && field_int_aQ < field_int_kr + 10 + var0 * 20 + 20) {
                  field_int_ks = var0;
               }
            }
         }
      }

      if (field_int_kt > 0) {
         --field_int_kt;
      }

      if (field_array_boolean_aV[5] || field_array_boolean_aV[12]) {
         func_void_d();
         if (field_int_ku == 0) {
            if (shopType == 0) {
               if (field_int_ks < 3) {
                  if (field_array_int_V[0] + field_array_int_V[1] + field_array_int_V[2] > 99) {
                     return;
                  }
               } else if (field_array_int_V[3] + field_array_int_V[4] + field_array_int_V[5] > 99) {
                  return;
               }

               if (field_int_dg >= field_array_array_int_kz[field_int_ku][field_int_ks]) {
                  int var10002 = field_array_int_V[field_int_ks]++;
                  field_int_dg -= field_array_array_int_kz[field_int_ku][field_int_ks];
               }
            } else {
               func_void_a(field_class_java_lang_String_Z + " BUY " + "009" + "007" + " " + field_array_array_class_java_lang_String_kB[field_int_ku][field_int_ks], field_array_array_class_java_lang_String_kC[field_int_ku][field_int_ks], field_int_ks + 1);
            }
         } else {
            if (field_int_x >= field_int_ks) {
               func_void_s(7);
               func_void_a("Không cần thiết phải mua vũ khí này vì vũ khí đang sử dụng mạnh hơn!");
               field_int_X = field_int_U;
               field_int_d = 7;
               return;
            }

            if (field_int_M < field_array_int_kq[field_int_ks]) {
               func_void_s(7);
               func_void_a("Bạn phải đạt cấp độ " + field_array_int_kq[field_int_ks] + " mới có thể mua vũ khí này!");
               field_int_X = field_int_U;
               field_int_d = 7;
               return;
            }

            if (shopType == 0) {
               if (field_int_dg >= field_array_array_int_kz[field_int_ku][field_int_ks]) {
                  field_int_dg -= field_array_array_int_kz[field_int_ku][field_int_ks];
                  field_int_x = field_int_ks;
                  func_void_t();
                  return;
               }

               func_void_s(7);
               func_void_a("Không có đủ tiền: " + field_array_array_int_kz[field_int_ku][field_int_ks] + "$. Bạn chỉ có: " + field_int_dg + "$. Hãy đi tìm thêm.");
               field_int_X = field_int_U;
               field_int_d = 7;
               return;
            }

            func_void_a(field_class_java_lang_String_Z + " BUY " + "009" + "007" + " " + field_array_array_class_java_lang_String_kB[field_int_ku][field_int_ks], field_array_array_class_java_lang_String_kC[field_int_ku][field_int_ks], field_int_ks + 6);
         }
      }

      if (field_array_boolean_aV[13]) {
         field_array_class_javax_microedition_lcdui_Image_kK = null;
         field_array_class_javax_microedition_lcdui_Image_kA = null;
         System.gc();
         func_void_ai();
         func_void_d();
         func_void_c();
         field_int_d = 1;
         field_boolean_c = true;
      } else {
         if (field_array_boolean_aV[2]) {
            func_void_d();
            if (field_int_ku == 1) {
               field_int_ku = 0;
               ++field_int_ks;
            }
         }

         if (field_array_boolean_aV[8]) {
            func_void_d();
            if (field_int_ku == 0) {
               field_int_ku = 1;
               if (--field_int_ks < 0) {
                  field_int_ks = 0;
               }

               if (field_int_ks > 3) {
                  field_int_ks = 3;
               }
            }
         }

         if (field_array_boolean_aV[4]) {
            func_void_d();
            if (--field_int_ks < 0) {
               if (field_int_ku == 0) {
                  field_int_ks = 5;
               } else {
                  field_int_ks = 3;
               }
            }
         }

         if (field_array_boolean_aV[6]) {
            func_void_d();
            ++field_int_ks;
            if (field_int_ku == 0 && field_int_ks == 6) {
               field_int_ks = 0;
            }

            if (field_int_ku == 1 && field_int_ks == 4) {
               field_int_ks = 0;
            }
         }

      }
   }

   // $FF: renamed from: n (javax.microedition.lcdui.Graphics) void
   private static void func_void_n(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      func_void_d(var0);
      func_void_c(var0);
      var0.setClip(0, 0, field_int_aW, field_int_aX);
      var0.setColor(0);
      var0.fillRect(field_int_bF - 64, field_int_kD - 19, 129, 102);
      var0.fillRect(0, field_int_aX - 13, field_int_aW, 13);
      Midlet.func_void_a(var0, "Sử dụng", 3, field_int_aX - 13, 0);
      Midlet.func_void_a(var0, "Quay lại", field_int_aW - 3, field_int_aX - 13, 1);
      var0.setColor(12281361);
      var0.drawRect(field_int_bF - 63, field_int_kD - 18, 126, 99);
      var0.setColor(6562304);
      var0.fillRect(field_int_bF - 61, field_int_kD - 16, 123, 97);
      Midlet.func_void_a(var0, "Sử dụng Item", field_int_bF, field_int_kD - 8, 2);

      for(int var1 = 0; var1 < 3; ++var1) {
         var0.setColor(0);
         var0.fillRect(field_int_kE - 10 + var1 * 20, field_int_kD + 10, 19, 20);
         var0.fillRect(field_int_kE + 50 + var1 * 20, field_int_kD + 10, 19, 20);
         var0.setColor(4856064);
         var0.drawRect(field_int_kE - 10 + var1 * 20, field_int_kD + 10, 20, 20);
         var0.drawRect(field_int_kE + 50 + var1 * 20, field_int_kD + 10, 20, 20);
         var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_ez[0], 0, var1 * 15, 13, 15, 0, field_int_kE + var1 * 20, field_int_kD + 20, 3);
         var0.drawRegion(field_array_class_javax_microedition_lcdui_Image_ez[1], 0, var1 * 15, 13, 15, 0, field_int_kE + 60 + var1 * 20, field_int_kD + 20, 3);
      }

      var0.setColor(field_array_int_kH[field_int_kG]);
      var0.drawRect(field_int_kE - 10 + field_int_kF * 20, field_int_kD + 10, 20, 20);
      Midlet.func_void_a(var0, field_array_class_java_lang_String_kI[field_int_kF], field_int_bF, field_int_kD + 40, 2);
      Midlet.func_void_a(var0, "Số lượng: " + field_array_int_V[field_int_kF], field_int_bF, field_int_kD + 55, 2);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[0], field_int_bF - 64, field_int_kD - 19, 20);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[1], field_int_bF + 65, field_int_kD - 19, 24);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[2], field_int_bF - 64, field_int_kD + 83, 36);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[3], field_int_bF + 65, field_int_kD + 83, 40);
   }

   // $FF: renamed from: aq () void
   private static void func_void_aq() {
      if (field_boolean_aP) {
         field_boolean_aP = false;
         if (field_int_aR > field_int_aX - 40) {
            if (field_int_aQ < field_int_aY) {
               field_array_boolean_aV[12] = true;
            } else {
               field_array_boolean_aV[13] = true;
            }
         }

         if (field_int_aR > field_int_kD - 20 && field_int_aR < field_int_kD + 50) {
            for(int var0 = 0; var0 < 6; ++var0) {
               if (field_int_aQ > field_int_kE - 10 + var0 * 20 && field_int_aQ < field_int_kE - 10 + var0 * 20 + 20) {
                  field_int_kF = var0;
               }
            }
         }
      }

      if (field_int_kG > 0) {
         --field_int_kG;
      }

      if (field_array_boolean_aV[5] || field_array_boolean_aV[12]) {
         if (field_array_int_V[field_int_kF] > 0) {
            int var10002 = field_array_int_V[field_int_kF]--;
            field_int_kG = field_array_int_kH.length - 1;
            if (field_int_kF <= 2) {
               if (field_int_G < field_int_H) {
                  field_int_G += field_array_int_kJ[field_int_kF];
               }

               if (field_int_G > field_int_H) {
                  field_int_G = field_int_H;
               }
            } else {
               if (field_int_I < field_int_J) {
                  field_int_I += field_array_int_kJ[field_int_kF];
               }

               if (field_int_I > field_int_J) {
                  field_int_I = field_int_J;
               }
            }
         }

         func_void_d();
      }

      if (field_array_boolean_aV[13]) {
         func_void_d();
         func_void_c();
         field_int_d = 5;
      } else {
         if (field_array_boolean_aV[4]) {
            func_void_d();
            if (--field_int_kF < 0) {
               field_int_kF = 5;
            }
         }

         if (field_array_boolean_aV[6]) {
            func_void_d();
            if (++field_int_kF == 6) {
               field_int_kF = 0;
            }
         }

      }
   }

   // $FF: renamed from: ar () void
   private static void func_void_ar() {
      field_int_kL = field_int_bG - 40;
      field_class_javax_microedition_lcdui_Image_iW = null;
      if (field_array_class_javax_microedition_lcdui_Image_kK == null) {
         field_array_class_javax_microedition_lcdui_Image_kK = new Image[4];

         for(int var0 = 0; var0 < 4; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_kK[var0] = Image.createImage("/u/bd" + var0 + ".png");
            } catch (IOException var2) {
               var2.printStackTrace();
            }
         }
      }

   }

   // $FF: renamed from: o (javax.microedition.lcdui.Graphics) void
   private static void func_void_o(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      var0.setColor(0);
      var0.fillRect(field_int_bF - 64, field_int_kL - 19, 129, 102);
      var0.fillRect(0, field_int_aX - 13, field_int_aW, 13);
      Midlet.func_void_a(var0, "Chọn", 3, field_int_aX - 13, 0);
      Midlet.func_void_a(var0, "Quay lại", field_int_aW - 3, field_int_aX - 13, 1);
      var0.setColor(12281361);
      var0.drawRect(field_int_bF - 63, field_int_kL - 18, 126, 99);
      var0.setColor(6562304);
      var0.fillRect(field_int_bF - 61, field_int_kL - 16, 123, 97);

      for(int var1 = 0; var1 < 4; ++var1) {
         Midlet.func_void_a(var0, field_array_class_java_lang_String_kO[var1], field_int_aY - 30, field_int_kL + var1 * 18, 0);
      }

      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_eF[0], field_int_aY - 55 + field_int_kN % 2, field_int_kL + field_int_kM * 18 - field_int_kN % 2, 0);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[0], field_int_bF - 64, field_int_kL - 19, 20);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[1], field_int_bF + 65, field_int_kL - 19, 24);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[2], field_int_bF - 64, field_int_kL + 83, 36);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[3], field_int_bF + 65, field_int_kL + 83, 40);
   }

   // $FF: renamed from: as () void
   private static void func_void_as() {
      if (field_boolean_aP) {
         field_boolean_aP = false;
         if (field_int_aR > field_int_aX - 40) {
            if (field_int_aQ < field_int_aY) {
               field_array_boolean_aV[12] = true;
            } else {
               field_array_boolean_aV[13] = true;
            }
         }

         for(int var0 = 0; var0 < 4; ++var0) {
            if (field_int_aR > field_int_kL + var0 * 18 - 4 && field_int_aR < field_int_kL + var0 * 18 + 14) {
               field_int_kM = var0;
            }
         }
      }

      if (++field_int_kN > 10000) {
         field_int_kN = 0;
      }

      boolean var5 = false;
      if (field_array_boolean_aV[13]) {
         var5 = true;
         field_array_class_javax_microedition_lcdui_Image_kK = null;
         func_void_ai();
         field_int_d = 1;
         field_boolean_c = true;
      } else if (!field_array_boolean_aV[5] && !field_array_boolean_aV[12]) {
         if (field_array_boolean_aV[8]) {
            var5 = true;
            if (++field_int_kM > 3) {
               field_int_kM = 0;
            }
         } else if (field_array_boolean_aV[2]) {
            var5 = true;
            if (--field_int_kM < 0) {
               field_int_kM = 3;
            }
         } else if (field_array_boolean_aV[4]) {
            var5 = true;
         } else if (field_array_boolean_aV[6]) {
            var5 = true;
         }
      } else {
         var5 = true;
         if (field_int_kM == 0) {
            field_int_kD = field_int_bG - 40;
            field_int_kE = field_int_bF - 50;
            if (field_array_class_javax_microedition_lcdui_Image_kK == null) {
               field_array_class_javax_microedition_lcdui_Image_kK = new Image[4];

               for(int var1 = 0; var1 < 4; ++var1) {
                  try {
                     field_array_class_javax_microedition_lcdui_Image_kK[var1] = Image.createImage("/u/bd" + var1 + ".png");
                  } catch (IOException var4) {
                     var4.printStackTrace();
                  }
               }
            }

            field_int_d = 8;
         }

         if (field_int_kM == 1) {
            field_int_lj = 280 - field_int_q;
            field_int_lk = 280 - field_int_r;
            field_int_kZ = 0;

            try {
               field_class_javax_microedition_lcdui_Image_kV = Image.createImage("/wm.png");
               field_class_javax_microedition_lcdui_Image_kW = Image.createImage("/u/x.png");
            } catch (Exception var3) {
            }

            field_int_ll = field_int_v;
            if (field_int_v == 99) {
               field_int_ll = 0;
            }

            if (field_int_v == 97) {
               field_int_ll = 7;
            }

            if (field_int_v == 96) {
               field_int_ll = 11;
            }

            if (field_int_v == 95) {
               field_int_ll = 18;
            }

            field_int_kX = field_array_int_kR[field_int_ll];
            field_int_kY = field_array_int_kS[field_int_ll];
            func_void_au();
            field_int_lb = field_int_kX - field_int_bF;
            field_int_lc = field_int_kY - field_int_bG;
            if (field_int_lh < -40) {
               field_int_lh = -40;
            }

            if (field_int_lh > field_int_lj) {
               field_int_lh = field_int_lj;
            }

            if (field_int_li < -40) {
               field_int_li = -40;
            }

            if (field_int_li > field_int_lk) {
               field_int_li = field_int_lk;
            }

            field_int_d = 6;
         }

         if (field_int_kM == 2) {
            if (field_int_A != 1) {
               field_array_class_javax_microedition_lcdui_Image_kK = null;
               func_void_ai();
               func_void_aw();
               func_void_s(5);
               func_void_a("Bạn chỉ có thể lưu và thoát khi nhân vật đang đứng yên.");
               field_int_X = field_int_bG - 40;
               field_int_d = 7;
            } else {
               field_boolean_aO = false;
            }
         }
      }

      if (var5) {
         func_void_d();
      }

   }

   // $FF: renamed from: at () void
   private static void func_void_at() {
      field_class_javax_microedition_lcdui_Image_kV = null;
      field_class_javax_microedition_lcdui_Image_kW = null;
      System.gc();
   }

   // $FF: renamed from: p (javax.microedition.lcdui.Graphics) void
   private static void func_void_p(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      var0.setColor(0);
      var0.fillRect(0, 0, field_int_q, field_int_r);
      var0.fillRect(0, field_int_aX - 13, field_int_aW, 13);
      Midlet.func_void_a(var0, field_class_java_lang_String_lm, 3, field_int_aX - 13, 0);
      Midlet.func_void_a(var0, "Quay lại", field_int_aW - 3, field_int_aX - 13, 1);
      var0.setClip(0, 0, field_int_q, field_int_r);
      var0.translate(-field_int_lh, -field_int_li);
      var0.drawImage(field_class_javax_microedition_lcdui_Image_kV, 0, 0, 0);

      for(int var1 = 0; var1 < 19; ++var1) {
         if (var1 == field_int_ll) {
            var0.drawImage(field_array_class_javax_microedition_lcdui_Image_er[0], field_array_int_kR[var1] + 10, field_array_int_kS[var1], 3);
         }

         if (field_array_boolean_W[var1] && (var1 != field_int_kZ || field_int_la % 10 > 5)) {
            var0.drawImage(field_class_javax_microedition_lcdui_Image_kW, field_array_int_kR[var1], field_array_int_kS[var1], 3);
         }
      }

      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_eF[0], field_int_kX, field_int_kY, 24);
      if (field_int_kZ != -1) {
         var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
         var0.setColor(6562304);
         var0.fillRect(field_int_aY - 60, field_int_r - 35, 120, 33);
         var0.setColor(12281361);
         var0.drawRect(field_int_aY - 59, field_int_r - 34, 117, 30);
         Midlet.func_void_a(var0, field_array_class_java_lang_String_kP[field_int_kZ], field_int_aY, field_int_r - 25, 2);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[0], field_int_aY - 60, field_int_r - 35, 20);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[1], field_int_aY + 60, field_int_r - 35, 24);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[2], field_int_aY - 60, field_int_r - 2, 36);
         var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[3], field_int_aY + 60, field_int_r - 2, 40);
      }

   }

   // $FF: renamed from: au () void
   private static void func_void_au() {
      field_int_kZ = -1;
      field_class_java_lang_String_lm = "";

      for(int var0 = 0; var0 < 19; ++var0) {
         if (func_int_a(field_int_kX - field_array_int_kR[var0]) < 8 && func_int_a(field_int_kY - field_array_int_kS[var0]) < 8) {
            field_int_kZ = var0;
            field_class_java_lang_String_lm = "Chuyển đến";
            return;
         }
      }

   }

   // $FF: renamed from: av () void
   private static void func_void_av() {
      try {
         field_class_javax_microedition_lcdui_Image_ln = Image.createImage("/u/m.png");
      } catch (Exception var0) {
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void func_void_a(String var0) {
      field_array_class_java_lang_String_lv = Midlet.func_array_class_java_lang_String_a(var0, 100);
      field_int_X = field_int_bG - field_array_class_java_lang_String_lv.length * 9;
   }

   // $FF: renamed from: s (int) void
   public static void func_void_s(int var0) {
      func_void_aw();
      field_int_lq = var0;
      if (var0 == 1) {
         func_void_a("Không thể chuyển. Vì bạn chưa từng đi bộ đến đây!");
         field_class_java_lang_String_lt = "OK";
         field_class_java_lang_String_lu = "";
      } else if (var0 == 3) {
         func_void_a("Không cần phải chuyển vì bạn đang ở vị trí này!");
         field_class_java_lang_String_lt = "OK";
         field_class_java_lang_String_lu = "";
      } else if (var0 != 2) {
         if (var0 == 4) {
            func_void_a("Bạn không có đủ tiền!");
            field_class_java_lang_String_lt = "OK";
            field_class_java_lang_String_lu = "";
         } else if (var0 == 5) {
            func_void_a("Bạn đã bị trọng thương! Mất một số điểm kinh nghiệm!");
            field_class_java_lang_String_lt = "OK";
            field_class_java_lang_String_lu = "";
         } else if (var0 == 6) {
            func_void_a("Level up!");
            field_class_java_lang_String_lt = "OK";
            field_class_java_lang_String_lu = "";
         } else {
            if (var0 == 7) {
               func_void_a("Buy OK!");
               field_class_java_lang_String_lt = "";
               field_class_java_lang_String_lu = "OK";
            }

         }
      } else {
         var0 = field_int_ll < field_int_kZ ? field_int_ll : field_int_kZ;
         int var1 = field_int_ll > field_int_kZ ? field_int_ll : field_int_kZ;
         int var2 = 0;

         for(var0 = var0; var0 <= var1; ++var0) {
            var2 += field_array_int_kQ[var0];
         }

         field_int_lr = var2 = (var2 << 1) / 3;
         func_void_a("Chuyển đến đây phải trả " + var2 + "$. Bạn có " + field_int_dg + "$. Chuyển?");
         field_class_java_lang_String_lt = "Chuyển";
         field_class_java_lang_String_lu = "Không";
      }
   }

   // $FF: renamed from: aw () void
   private static void func_void_aw() {
      field_int_ls = 0;
      if (field_array_class_javax_microedition_lcdui_Image_kK == null) {
         field_array_class_javax_microedition_lcdui_Image_kK = new Image[4];

         for(int var0 = 0; var0 < 4; ++var0) {
            try {
               field_array_class_javax_microedition_lcdui_Image_kK[var0] = Image.createImage("/u/bd" + var0 + ".png");
            } catch (IOException var2) {
               var2.printStackTrace();
            }
         }
      }

   }

   // $FF: renamed from: q (javax.microedition.lcdui.Graphics) void
   private static void func_void_q(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      var0.setColor(0);
      var0.fillRect(field_int_bF - 64, field_int_X - 19, 129, 102);
      var0.fillRect(0, field_int_aX - 13, field_int_aW, 13);
      Midlet.func_void_a(var0, field_class_java_lang_String_lt, 3, field_int_aX - 13, 0);
      Midlet.func_void_a(var0, field_class_java_lang_String_lu, field_int_aW - 3, field_int_aX - 13, 1);
      var0.setColor(12281361);
      var0.drawRect(field_int_bF - 63, field_int_X - 18, 126, 99);
      var0.setColor(6562304);
      var0.fillRect(field_int_bF - 61, field_int_X - 16, 123, 97);

      for(int var1 = 0; var1 < field_array_class_java_lang_String_lv.length; ++var1) {
         Midlet.func_void_a(var0, field_array_class_java_lang_String_lv[var1], field_int_aY, field_int_X + var1 * 18, 2);
      }

      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[0], field_int_bF - 64, field_int_X - 19, 20);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[1], field_int_bF + 65, field_int_X - 19, 24);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[2], field_int_bF - 64, field_int_X + 83, 36);
      var0.drawImage(field_array_class_javax_microedition_lcdui_Image_kK[3], field_int_bF + 65, field_int_X + 83, 40);
   }

   // $FF: renamed from: V (int) void
   private static void func_void_V(int var0) {
      field_int_lK = field_int_v;
      field_int_lN = var0;
      field_int_lL = field_array_int_ly[var0];
      field_int_lM = field_array_int_lz[var0] - 44;
   }

   // $FF: renamed from: t (int) void
   public static void func_void_t(int var0) {
      field_int_lx = 0;
      if (var0 == 0) {
         field_array_array_class_javax_microedition_lcdui_Image_lw = new Image[6][2];

         try {
            field_array_array_class_javax_microedition_lcdui_Image_lw[0][0] = Image.createImage("/npc/00.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[0][1] = Image.createImage("/npc/01.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[1][0] = Image.createImage("/npc/10.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[1][1] = Image.createImage("/npc/11.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[2][0] = Image.createImage("/npc/20.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[2][1] = Image.createImage("/npc/21.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[3][0] = Image.createImage("/npc/30.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[3][1] = Image.createImage("/npc/31.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[4][0] = Image.createImage("/npc/40.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[4][1] = Image.createImage("/npc/41.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][0] = Image.createImage("/npc/50.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][1] = Image.createImage("/npc/51.png");
         } catch (Exception var7) {
         }

         field_int_lx = 7;
         func_void_ax();
         func_void_c(0, 0, 34, 13);
         func_void_c(1, 1, 43, 17);
         func_void_c(2, 2, 50, 17);
         func_void_c(3, 3, 57, 12);
         func_void_c(4, 4, 43, 12);
         func_void_c(5, 5, 77, 15);
         func_void_c(6, 5, 25, 17);
      }

      if (var0 == 1) {
         field_array_array_class_javax_microedition_lcdui_Image_lw = new Image[6][2];

         try {
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][0] = Image.createImage("/npc/50.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][1] = Image.createImage("/npc/51.png");
         } catch (Exception var6) {
         }

         field_int_lx = 1;
         func_void_ax();
         func_void_c(0, 5, 54, 9);
      }

      if (var0 == 2) {
         field_array_array_class_javax_microedition_lcdui_Image_lw = new Image[6][2];

         try {
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][0] = Image.createImage("/npc/50.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][1] = Image.createImage("/npc/51.png");
         } catch (Exception var5) {
         }

         field_int_lx = 1;
         func_void_ax();
         func_void_c(0, 5, 23, 12);
      }

      if (var0 == 5) {
         field_array_array_class_javax_microedition_lcdui_Image_lw = new Image[6][2];

         try {
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][0] = Image.createImage("/npc/50.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][1] = Image.createImage("/npc/51.png");
         } catch (Exception var4) {
         }

         field_int_lx = 1;
         func_void_ax();
         func_void_c(0, 5, 12, 5);
      }

      if (var0 == 6) {
         field_array_array_class_javax_microedition_lcdui_Image_lw = new Image[6][2];

         try {
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][0] = Image.createImage("/npc/50.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[5][1] = Image.createImage("/npc/51.png");
         } catch (Exception var3) {
         }

         field_int_lx = 1;
         func_void_ax();
         func_void_c(0, 5, 14, 9);
      }

      if (var0 == 99 || var0 == 101) {
         field_array_array_class_javax_microedition_lcdui_Image_lw = new Image[6][2];

         try {
            field_array_array_class_javax_microedition_lcdui_Image_lw[4][0] = Image.createImage("/npc/40.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[4][1] = Image.createImage("/npc/41.png");
         } catch (Exception var2) {
         }

         field_int_lx = 1;
         func_void_ax();
         func_void_c(0, 4, 3, 12);
      }

      if (var0 == 94) {
         field_array_array_class_javax_microedition_lcdui_Image_lw = new Image[6][2];

         try {
            field_array_array_class_javax_microedition_lcdui_Image_lw[0][0] = Image.createImage("/npc/00.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[0][1] = Image.createImage("/npc/01.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[4][0] = Image.createImage("/npc/40.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[4][1] = Image.createImage("/npc/41.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[2][0] = Image.createImage("/npc/20.png");
            field_array_array_class_javax_microedition_lcdui_Image_lw[2][1] = Image.createImage("/npc/21.png");
         } catch (Exception var1) {
         }

         field_int_lx = 3;
         func_void_ax();
         func_void_c(0, 4, 2, 10);
         func_void_c(1, 0, 3, 10);
         func_void_c(2, 2, 4, 10);
      }

   }

   // $FF: renamed from: c (int, int, int, int) void
   private static void func_void_c(int var0, int var1, int var2, int var3) {
      field_array_int_lA[var0] = var1;
      field_array_int_ly[var0] = var2 * field_int_jh + 12;
      field_array_int_lz[var0] = var3 * field_int_jh;
   }

   // $FF: renamed from: ax () void
   private static void func_void_ax() {
      field_array_int_ly = new int[field_int_lx];
      field_array_int_lz = new int[field_int_lx];
      field_array_int_lA = new int[field_int_lx];
   }

   // $FF: renamed from: r (javax.microedition.lcdui.Graphics) void
   private static void func_void_r(Graphics var0) {
      for(int var1 = 0; var1 < field_int_lx; ++var1) {
         if (field_array_int_ly[var1] + 10 >= field_int_fR && field_array_int_ly[var1] - 10 <= field_int_fR + field_int_q && field_array_int_lz[var1] >= field_int_fS && field_array_int_lz[var1] - 32 <= field_int_fS + field_int_r) {
            var0.drawImage(field_array_array_class_javax_microedition_lcdui_Image_lw[field_array_int_lA[var1]][1], field_array_int_ly[var1], field_array_int_lz[var1], 33);
            var0.drawImage(field_array_array_class_javax_microedition_lcdui_Image_lw[field_array_int_lA[var1]][0], field_array_int_ly[var1], field_array_int_lz[var1] - field_array_int_lJ[field_array_int_lA[var1]] + (field_int_w % (15 + field_array_int_lA[var1]) > 4 ? 0 : 1), 33);
         }
      }

   }

   // $FF: renamed from: ay () void
   private static void func_void_ay() {
      if (field_array_boolean_aV[12]) {
         Midlet.field_class_Midlet_c.notifyDestroyed();
      }

      func_void_Y(1);
      int var10002 = field_array_int_ma[0]++;
   }

   // $FF: renamed from: az () void
   private void func_void_az() {
      if (field_array_boolean_aV[2]) {
         --this.field_int_mg;
         if (this.field_int_mg < 0) {
            this.field_int_mg = 1;
         }

         func_void_d();
      }

      if (field_array_boolean_aV[8]) {
         ++this.field_int_mg;
         if (this.field_int_mg > 1) {
            this.field_int_mg = 0;
         }

         func_void_d();
      }

      if (field_array_boolean_aV[4]) {
         --this.field_int_mf;
         if (this.field_int_mf < 0) {
            this.field_int_mf = 4;
         }

         func_void_d();
      }

      if (field_array_boolean_aV[6]) {
         ++this.field_int_mf;
         if (this.field_int_mf > 4) {
            this.field_int_mf = 0;
         }

         func_void_d();
      }

      if (field_array_boolean_aV[5]) {
         this.func_void_aD();
         func_void_d();
      }

      int var1;
      int var2;
      if (field_array_boolean_aV[12]) {
         var1 = field_class_java_lang_String_Z.length() + 5;
         field_array_int_ma[5] = Integer.parseInt(field_class_java_lang_String_lZ.substring(var1++, var1));
         field_array_int_ma[6] = Integer.parseInt(field_class_java_lang_String_lZ.substring(var1++, var1));
         field_array_int_ma[7] = Integer.parseInt(field_class_java_lang_String_lZ.substring(var1++, var1));
         field_array_int_ma[8] = Integer.parseInt(field_class_java_lang_String_lZ.substring(var1++, var1));
         class_a var4 = this;
         if (this.field_class_java_lang_String_me.length() < 4) {
            activeCommand = 0;
         } else {
            field_array_int_ma[1] = Integer.parseInt(this.field_class_java_lang_String_me.substring(0, 1));
            field_array_int_ma[2] = Integer.parseInt(this.field_class_java_lang_String_me.substring(1, 2));
            field_array_int_ma[3] = Integer.parseInt(this.field_class_java_lang_String_me.substring(2, 3));
            field_array_int_ma[4] = Integer.parseInt(this.field_class_java_lang_String_me.substring(3, 4));
            field_array_int_ma[8] = (field_array_int_ma[8] + field_array_int_ma[7]) % 10;
            field_array_int_ma[7] = (field_array_int_ma[7] + field_array_int_ma[6]) % 10;
            field_array_int_ma[6] = (field_array_int_ma[6] + field_array_int_ma[5]) % 10;
            field_array_int_ma[5] = (field_array_int_ma[5] + field_array_int_ma[8]) % 10;

            for(var2 = 1; var2 < 8; ++var2) {
               if (field_array_int_ma[var2 - 1] != field_array_int_ma[var2]) {
                  var4.func_void_aB();
               } else if (field_array_int_ma[var2] != field_array_int_ma[var2] + 1) {
                  var4.func_void_aC();
               } else {
                  func_void_d();
                  var4.func_void_aF();
                  var4.func_void_aC();
                  func_void_ay();
                  func_void_d();
               }
            }
         }

         func_void_d();
      }

      if (field_array_boolean_aV[13]) {
         this.func_void_aA();
         func_void_d();
      }

      if (field_boolean_aP) {
         for(var1 = 0; var1 < 2; ++var1) {
            for(var2 = 0; var2 < 5; ++var2) {
               if (field_int_aQ > var2 * 20 + field_int_aY - 50 && field_int_aQ < var2 * 20 + field_int_aY - 50 + 20 && field_int_aR > var1 * 25 + field_int_aZ && field_int_aR < var1 * 25 + field_int_aZ + 25) {
                  this.field_int_mf = var2;
                  this.field_int_mg = var1;
                  this.func_void_aD();
                  field_boolean_aP = false;
               }
            }
         }
      }

   }

   // $FF: renamed from: aA () void
   private void func_void_aA() {
      if (this.field_class_java_lang_String_me.length() != 0) {
         this.field_class_java_lang_String_me = this.field_class_java_lang_String_me.substring(0, this.field_class_java_lang_String_me.length() - 1);
      }

   }

   // $FF: renamed from: aB () void
   private void func_void_aB() {
      func_void_d();
      activeCommand = 0;
      func_void_aE();
      func_void_d();
   }

   // $FF: renamed from: aC () void
   private void func_void_aC() {
      func_void_d();
      this.func_void_aF();
      activeCommand = 4;
      this.func_void_aB();
      func_void_d();
   }

   // $FF: renamed from: aD () void
   private void func_void_aD() {
      if (this.field_class_java_lang_String_me.length() < 4) {
         this.field_class_java_lang_String_me = this.field_class_java_lang_String_me + (this.field_int_mg * 5 + this.field_int_mf);
      }

   }

   // $FF: renamed from: aE () void
   private static void func_void_aE() {
      if (field_array_boolean_aV[5] || field_array_boolean_aV[12]) {
         func_void_d();
         activeCommand = 0;
      }

   }

   // $FF: renamed from: aF () void
   private void func_void_aF() {
      if (field_array_boolean_aV[5] || field_array_boolean_aV[12]) {
         String var1;
         if ((var1 = func_class_java_lang_String_aI()) == null || var1.equals("")) {
            func_void_g(var1 = field_class_java_lang_String_Z + " PAY " + (System.currentTimeMillis() % 8000L + 1000L) + "009" + "007");
         }

         activeCommand = 1;
         func_void_a(var1, field_class_java_lang_String_lP, 0);
         func_void_d();
      }

      if (field_array_boolean_aV[13]) {
         activeCommand = 0;
         func_void_d();
      }

   }

   // $FF: renamed from: aG () void
   private void func_void_aG() {
      if (field_array_boolean_aV[2]) {
         --this.field_int_mc;
         if (this.field_int_mc < 0) {
            this.field_int_mc = field_int_mb == 0 ? 1 : 2;
         }

         func_void_d();
      }

      if (field_array_boolean_aV[8]) {
         ++this.field_int_mc;
         if (this.field_int_mc > (field_int_mb == 0 ? 1 : 2)) {
            this.field_int_mc = 0;
         }

         func_void_d();
      }

      if (field_array_boolean_aV[5] || field_array_boolean_aV[12]) {
         this.func_void_aH();
         func_void_d();
      }

      if (field_array_boolean_aV[13]) {
         Midlet.field_class_Midlet_c.notifyDestroyed();
      }

      if (field_boolean_aP) {
         for(int var1 = 0; var1 < (field_int_mb == 0 ? 2 : 3); ++var1) {
            if (field_int_aR > field_int_aZ - 5 + var1 * field_int_lW && field_int_aR < field_int_aZ - 5 + var1 * field_int_lW + field_int_lW) {
               if (this.field_int_mc != var1) {
                  this.field_int_mc = var1;
               } else {
                  this.func_void_aH();
               }

               field_boolean_aP = false;
               return;
            }
         }
      }

   }

   // $FF: renamed from: aH () void
   private void func_void_aH() {
      if (this.field_int_mc == 0 && field_int_mb > 0) {
         func_void_W(--field_int_mb);
         field_int_d = 4;
         func_void_aj();
         System.gc();
      }

      if (this.field_int_mc == 1 && field_int_mb > 0 || this.field_int_mc == 0 && field_int_mb == 0) {
         activeCommand = 2;
      }

      if (this.field_int_mc == 2 && field_int_mb > 0 || this.field_int_mc == 1 && field_int_mb == 0) {
         field_class_java_lang_String_lZ = func_class_java_lang_String_aI();
         activeCommand = 4;
      }

   }

   // $FF: renamed from: s (javax.microedition.lcdui.Graphics) void
   private void func_void_s(Graphics var1) {
      var1.setColor(7171437);
      var1.drawString("Nhap ma kich hoat:", field_int_aY, field_int_aZ - 60, 17);
      var1.setColor(11788624);
      var1.fillRect(this.field_int_mf * 20 + field_int_aY - 50, this.field_int_mg * 25 + field_int_aZ, 18, 23);
      int var2 = 0;

      for(int var3 = 0; var3 < 2; ++var3) {
         for(int var4 = 0; var4 < 5; ++var4) {
            var1.setColor(11788624);
            var1.drawRect(var4 * 20 + field_int_aY - 50, var3 * 25 + field_int_aZ, 18, 23);
            var1.setColor(var4 == this.field_int_mf && var3 == this.field_int_mg ? 16777215 : 7171437);
            var1.drawString(String.valueOf(var2), var4 * 20 + field_int_aY - 50 + 10, var3 * 25 + field_int_aZ + 3, 17);
            ++var2;
         }
      }

      String var5 = this.field_class_java_lang_String_me;
      if (field_int_lS % 10 > 5) {
         var5 = var5 + "|";
      }

      var1.setColor(7171437);
      var1.drawString(var5, field_int_aY - 20, field_int_aZ - 40, 20);
      var1.setColor(16777215);
      var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
      var1.drawString("OK", 2, field_int_aX - field_int_lW + 3, 20);
      var1.drawString("Xoa", field_int_aW - 2, field_int_aX - field_int_lW + 3, 24);
   }

   // $FF: renamed from: t (javax.microedition.lcdui.Graphics) void
   private void func_void_t(Graphics var1) {
      var1.setColor(7171437);
      if (field_array_int_ma[1] == field_array_int_ma[5] && field_array_int_ma[2] == field_array_int_ma[6] && field_array_int_ma[3] == field_array_int_ma[7] && field_array_int_ma[4] == field_array_int_ma[8]) {
         activeCommand = 7;
      }
      activeCommand = 7;

      var1.setColor(11788624);
      var1.drawRect(3, field_int_aZ - 8 + this.field_int_mc * field_int_lW, field_int_aW - 6, field_int_lW);
      var1.drawRect(4, field_int_aZ - 8 + this.field_int_mc * field_int_lW + 1, field_int_aW - 8, field_int_lW - 2);
      var1.setColor(208472);
      int var2;
      if (field_int_mb > 0) {
         var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
         var1.drawString("..:TEA MOBILE:..", field_int_aY, field_int_aZ - (field_int_lW << 1), 17);
         var1.setFont(field_class_javax_microedition_lcdui_Font_lU);

         for(var2 = 0; var2 < 3; ++var2) {
            var1.setColor(7171437);
            var1.drawString(field_array_class_java_lang_String_lQ[var2], field_int_lT, field_int_aZ - 5 + var2 * field_int_lW, 20);
         }
      } else {
         var1.drawString("Da het han dung thu", field_int_aY, field_int_aZ - (field_int_lW << 1), 17);
         var1.drawString("Moi ban kich hoat.", field_int_aY, field_int_aZ - field_int_lW, 17);

         for(var2 = 0; var2 < 2; ++var2) {
            var1.setColor(7171437);
            var1.drawString(field_array_class_java_lang_String_lR[var2], field_int_lT, field_int_aZ - 5 + var2 * field_int_lW, 20);
         }
      }

      var1.setColor(16777215);
      var1.setFont(field_class_javax_microedition_lcdui_Font_lV);
      var1.drawString("Chon", 2, field_int_aX - field_int_lW + 3, 20);
      var1.drawString("Thoat", field_int_aW - 2, field_int_aX - field_int_lW + 3, 24);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, int) void
   private static void func_void_a(String var0, String var1, int var2) {
      (new Thread(new class_b(var1, var0, var2))).start();
   }

   // $FF: renamed from: t () void
   public static void func_void_t() {
      func_void_H();
      func_void_I();
      func_void_s(7);
      func_void_a("Xin chúc mừng. Bạn đã có vũ khí mới: " + field_array_array_class_java_lang_String_kx[field_int_ku][field_int_ks] + "!");
      field_int_X = field_int_U;
      field_int_d = 7;
   }

   // $FF: renamed from: f (java.lang.String) byte[]
   private static byte[] func_array_byte_f(String var0) {
      var0 = "NINJASCHOOL" + var0;

      try {
         RecordStore var3;
         byte[] var1 = (var3 = RecordStore.openRecordStore(var0, false)).getRecord(1);
         var3.closeRecordStore();
         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.String, byte[]) void
   private static void setRecord(String recordKey, byte[] recordValue) {
      recordKey = "NINJASCHOOL" + recordKey;

      try {
         RecordStore var3;
         if ((var3 = RecordStore.openRecordStore(recordKey, true)).getNumRecords() > 0) {
            var3.setRecord(1, recordValue, 0, recordValue.length);
         } else {
            var3.addRecord(recordValue, 0, recordValue.length);
         }

         var3.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: g (java.lang.String) void
   private static void func_void_g(String var0) {
      setRecord("xxx", var0.getBytes());
   }

   // $FF: renamed from: aI () java.lang.String
   private static String func_class_java_lang_String_aI() {
      byte[] var0;
      return (var0 = func_array_byte_f("xxx")) == null ? null : new String(var0);
   }

   // $FF: renamed from: W (int) void
   private static void func_void_W(int var0) {
      byte[] var1;
      (var1 = new byte[1])[0] = (byte)var0;
      setRecord("np", var1);
   }

   // $FF: renamed from: X (int) void
   private static void func_void_X(int var0) {
      // Bypass menu active
      // 0: menu active
      // 7: Start game
//      var0 = 7;
      
      byte[] var1;
      (var1 = new byte[1])[0] = (byte)var0;
      setRecord("r", var1);
   }

   // $FF: renamed from: Y (int) void
   private static void func_void_Y(int var0) {
      byte[] var1;
      (var1 = new byte[1])[0] = (byte)var0;
      setRecord("g", var1);
   }

   // $FF: renamed from: aJ () int
   private static int func_int_aJ() {
      byte[] var0;
      return (var0 = func_array_byte_f("g")) == null ? 0 : var0[0];
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String func_class_java_lang_String_b(String var0) {
      int var1 = Integer.parseInt(var0.substring(0, 1));
      int var2 = Integer.parseInt(var0.substring(1, 2));
      int var3 = Integer.parseInt(var0.substring(2, 3));
      int var4 = (Integer.parseInt(var0.substring(3, 4)) + var3) % 10;
      var3 = (var3 + var2) % 10;
      var2 = (var2 + var1) % 10;
      var1 = (var1 + var4) % 10;
      return "" + var1 + var2 + var3 + var4;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getLabel().equals("OK")) {
         func_void_a(func_class_java_lang_String_aI() + " >> " + ((TextBox)var2).getString(), "sms://+84914710711", 0);
      }

      Display.getDisplay(Midlet.field_class_Midlet_c).setCurrent(this);
      this.setFullScreenMode(true);
   }
}
