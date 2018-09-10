package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import executor.ProcessHandler;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class ARTEMIS {
SoftAssert softAssert = new SoftAssert();
String javapath = System.getProperty("java.home") + "\\bin\\java.exe";
String jarpath = "C:\\WS\\SeleniumDriver.jar";
String runid = "0";
String runname = "testRunCI";
String database = "SQLSERVER";
String tool = "SELENIUM";
public int runTest(String testname) {
int retValue=-1;
try {
retValue=ProcessHandler.runCmd(new String[]{javapath,"-jar",jarpath,runid,runname,testname,database,tool});
}
catch(Exception e) {
retValue=1;
}
return retValue;
}

@Test
public void TS042_1110() throws Exception{
int retValue=runTest("1110");
assertThat(0, is(retValue));
}


@Test
public void TS044_1111() throws Exception{
int retValue=runTest("1111");
assertThat(0, is(retValue));
}


@Test
public void TS124_1112() throws Exception{
int retValue=runTest("1112");
assertThat(0, is(retValue));
}


@Test
public void TS125_1113() throws Exception{
int retValue=runTest("1113");
assertThat(0, is(retValue));
}


@Test
public void TS002_1114() throws Exception{
int retValue=runTest("1114");
assertThat(0, is(retValue));
}


@Test
public void TS003_1115() throws Exception{
int retValue=runTest("1115");
assertThat(0, is(retValue));
}


@Test
public void TS004_1116() throws Exception{
int retValue=runTest("1116");
assertThat(0, is(retValue));
}


@Test
public void TS005_1117() throws Exception{
int retValue=runTest("1117");
assertThat(0, is(retValue));
}


@Test
public void TS007_1118() throws Exception{
int retValue=runTest("1118");
assertThat(0, is(retValue));
}


@Test
public void TS008_1119() throws Exception{
int retValue=runTest("1119");
assertThat(0, is(retValue));
}


@Test
public void TS009_1120() throws Exception{
int retValue=runTest("1120");
assertThat(0, is(retValue));
}


@Test
public void TS010_1121() throws Exception{
int retValue=runTest("1121");
assertThat(0, is(retValue));
}


@Test
public void TS130_1122() throws Exception{
int retValue=runTest("1122");
assertThat(0, is(retValue));
}


@Test
public void TS132_1123() throws Exception{
int retValue=runTest("1123");
assertThat(0, is(retValue));
}


@Test
public void TS133_1124() throws Exception{
int retValue=runTest("1124");
assertThat(0, is(retValue));
}


@Test
public void TS134_1125() throws Exception{
int retValue=runTest("1125");
assertThat(0, is(retValue));
}


@Test
public void TS135_1126() throws Exception{
int retValue=runTest("1126");
assertThat(0, is(retValue));
}


@Test
public void TS136_1127() throws Exception{
int retValue=runTest("1127");
assertThat(0, is(retValue));
}


@Test
public void TS138_1128() throws Exception{
int retValue=runTest("1128");
assertThat(0, is(retValue));
}


@Test
public void TS139_1129() throws Exception{
int retValue=runTest("1129");
assertThat(0, is(retValue));
}


@Test
public void TS140_1130() throws Exception{
int retValue=runTest("1130");
assertThat(0, is(retValue));
}


@Test
public void TS043_1131() throws Exception{
int retValue=runTest("1131");
assertThat(0, is(retValue));
}


@Test
public void TS048_1132() throws Exception{
int retValue=runTest("1132");
assertThat(0, is(retValue));
}


@Test
public void TS054_1133() throws Exception{
int retValue=runTest("1133");
assertThat(0, is(retValue));
}


@Test
public void TS060_1134() throws Exception{
int retValue=runTest("1134");
assertThat(0, is(retValue));
}


@Test
public void TS066_1135() throws Exception{
int retValue=runTest("1135");
assertThat(0, is(retValue));
}


@Test
public void TS071_1136() throws Exception{
int retValue=runTest("1136");
assertThat(0, is(retValue));
}


@Test
public void TS082_1137() throws Exception{
int retValue=runTest("1137");
assertThat(0, is(retValue));
}


@Test
public void TS097_1138() throws Exception{
int retValue=runTest("1138");
assertThat(0, is(retValue));
}


@Test
public void TS098_1139() throws Exception{
int retValue=runTest("1139");
assertThat(0, is(retValue));
}


@Test
public void TS099_1140() throws Exception{
int retValue=runTest("1140");
assertThat(0, is(retValue));
}


@Test
public void TS101_1141() throws Exception{
int retValue=runTest("1141");
assertThat(0, is(retValue));
}


@Test
public void TS102_1142() throws Exception{
int retValue=runTest("1142");
assertThat(0, is(retValue));
}


@Test
public void TS103_1143() throws Exception{
int retValue=runTest("1143");
assertThat(0, is(retValue));
}


@Test
public void TS104_1144() throws Exception{
int retValue=runTest("1144");
assertThat(0, is(retValue));
}


@Test
public void TS106_1145() throws Exception{
int retValue=runTest("1145");
assertThat(0, is(retValue));
}


@Test
public void TS107_1146() throws Exception{
int retValue=runTest("1146");
assertThat(0, is(retValue));
}


@Test
public void TS121_1147() throws Exception{
int retValue=runTest("1147");
assertThat(0, is(retValue));
}


@Test
public void TS001_1148() throws Exception{
int retValue=runTest("1148");
assertThat(0, is(retValue));
}


@Test
public void TS006_1149() throws Exception{
int retValue=runTest("1149");
assertThat(0, is(retValue));
}


@Test
public void TS011_1150() throws Exception{
int retValue=runTest("1150");
assertThat(0, is(retValue));
}


@Test
public void TS012_1151() throws Exception{
int retValue=runTest("1151");
assertThat(0, is(retValue));
}


@Test
public void TS014_1152() throws Exception{
int retValue=runTest("1152");
assertThat(0, is(retValue));
}


@Test
public void TS020_1153() throws Exception{
int retValue=runTest("1153");
assertThat(0, is(retValue));
}


@Test
public void TS026_1154() throws Exception{
int retValue=runTest("1154");
assertThat(0, is(retValue));
}


@Test
public void TS35_1155() throws Exception{
int retValue=runTest("1155");
assertThat(0, is(retValue));
}


@Test
public void TS041_1156() throws Exception{
int retValue=runTest("1156");
assertThat(0, is(retValue));
}


@Test
public void TS091_1157() throws Exception{
int retValue=runTest("1157");
assertThat(0, is(retValue));
}


@Test
public void TS100_1158() throws Exception{
int retValue=runTest("1158");
assertThat(0, is(retValue));
}


@Test
public void TS105_1159() throws Exception{
int retValue=runTest("1159");
assertThat(0, is(retValue));
}


@Test
public void TS117_1160() throws Exception{
int retValue=runTest("1160");
assertThat(0, is(retValue));
}


@Test
public void TS126_1161() throws Exception{
int retValue=runTest("1161");
assertThat(0, is(retValue));
}


@Test
public void TS129_1162() throws Exception{
int retValue=runTest("1162");
assertThat(0, is(retValue));
}


@Test
public void TS131_1163() throws Exception{
int retValue=runTest("1163");
assertThat(0, is(retValue));
}


@Test
public void TS137_1164() throws Exception{
int retValue=runTest("1164");
assertThat(0, is(retValue));
}


@Test
public void TS092_1165() throws Exception{
int retValue=runTest("1165");
assertThat(0, is(retValue));
}


@Test
public void TS093_1166() throws Exception{
int retValue=runTest("1166");
assertThat(0, is(retValue));
}


@Test
public void TS094_1167() throws Exception{
int retValue=runTest("1167");
assertThat(0, is(retValue));
}


@Test
public void TS095_1168() throws Exception{
int retValue=runTest("1168");
assertThat(0, is(retValue));
}


@Test
public void TS096_1169() throws Exception{
int retValue=runTest("1169");
assertThat(0, is(retValue));
}


@Test
public void TS127_1170() throws Exception{
int retValue=runTest("1170");
assertThat(0, is(retValue));
}


@Test
public void TS128_1171() throws Exception{
int retValue=runTest("1171");
assertThat(0, is(retValue));
}


@Test
public void TS015_1172() throws Exception{
int retValue=runTest("1172");
assertThat(0, is(retValue));
}


@Test
public void TS016_1173() throws Exception{
int retValue=runTest("1173");
assertThat(0, is(retValue));
}


@Test
public void TS017_1174() throws Exception{
int retValue=runTest("1174");
assertThat(0, is(retValue));
}


@Test
public void TS018_1175() throws Exception{
int retValue=runTest("1175");
assertThat(0, is(retValue));
}


@Test
public void TS019_1176() throws Exception{
int retValue=runTest("1176");
assertThat(0, is(retValue));
}


@Test
public void TS021_1177() throws Exception{
int retValue=runTest("1177");
assertThat(0, is(retValue));
}


@Test
public void TS022_1178() throws Exception{
int retValue=runTest("1178");
assertThat(0, is(retValue));
}


@Test
public void TS023_1179() throws Exception{
int retValue=runTest("1179");
assertThat(0, is(retValue));
}


@Test
public void TS024_1180() throws Exception{
int retValue=runTest("1180");
assertThat(0, is(retValue));
}


@Test
public void TS025_1181() throws Exception{
int retValue=runTest("1181");
assertThat(0, is(retValue));
}


@Test
public void TS027_1182() throws Exception{
int retValue=runTest("1182");
assertThat(0, is(retValue));
}


@Test
public void TS029_1183() throws Exception{
int retValue=runTest("1183");
assertThat(0, is(retValue));
}


@Test
public void TS030_1184() throws Exception{
int retValue=runTest("1184");
assertThat(0, is(retValue));
}


@Test
public void TS031_1185() throws Exception{
int retValue=runTest("1185");
assertThat(0, is(retValue));
}


@Test
public void TS032_1186() throws Exception{
int retValue=runTest("1186");
assertThat(0, is(retValue));
}


@Test
public void TS033_1187() throws Exception{
int retValue=runTest("1187");
assertThat(0, is(retValue));
}


@Test
public void TS028_1188() throws Exception{
int retValue=runTest("1188");
assertThat(0, is(retValue));
}


@Test
public void TS034_1189() throws Exception{
int retValue=runTest("1189");
assertThat(0, is(retValue));
}


@Test
public void TS36_1190() throws Exception{
int retValue=runTest("1190");
assertThat(0, is(retValue));
}


@Test
public void TS045_1191() throws Exception{
int retValue=runTest("1191");
assertThat(0, is(retValue));
}


@Test
public void TS046_1192() throws Exception{
int retValue=runTest("1192");
assertThat(0, is(retValue));
}


@Test
public void TS047_1193() throws Exception{
int retValue=runTest("1193");
assertThat(0, is(retValue));
}


@Test
public void TS049_1194() throws Exception{
int retValue=runTest("1194");
assertThat(0, is(retValue));
}


@Test
public void TS050_1195() throws Exception{
int retValue=runTest("1195");
assertThat(0, is(retValue));
}


@Test
public void TS051_1196() throws Exception{
int retValue=runTest("1196");
assertThat(0, is(retValue));
}


@Test
public void TS037_1197() throws Exception{
int retValue=runTest("1197");
assertThat(0, is(retValue));
}


@Test
public void TS038_1198() throws Exception{
int retValue=runTest("1198");
assertThat(0, is(retValue));
}


@Test
public void TS039_1199() throws Exception{
int retValue=runTest("1199");
assertThat(0, is(retValue));
}


@Test
public void TS040_1200() throws Exception{
int retValue=runTest("1200");
assertThat(0, is(retValue));
}


@Test
public void TS057_1201() throws Exception{
int retValue=runTest("1201");
assertThat(0, is(retValue));
}


@Test
public void TS058_1202() throws Exception{
int retValue=runTest("1202");
assertThat(0, is(retValue));
}


@Test
public void TS059_1203() throws Exception{
int retValue=runTest("1203");
assertThat(0, is(retValue));
}


@Test
public void TS061_1204() throws Exception{
int retValue=runTest("1204");
assertThat(0, is(retValue));
}


@Test
public void TS062_1205() throws Exception{
int retValue=runTest("1205");
assertThat(0, is(retValue));
}


@Test
public void TS063_1206() throws Exception{
int retValue=runTest("1206");
assertThat(0, is(retValue));
}


@Test
public void TS064_1207() throws Exception{
int retValue=runTest("1207");
assertThat(0, is(retValue));
}


@Test
public void TS081_1208() throws Exception{
int retValue=runTest("1208");
assertThat(0, is(retValue));
}


@Test
public void TS088_1209() throws Exception{
int retValue=runTest("1209");
assertThat(0, is(retValue));
}


@Test
public void TS089_1210() throws Exception{
int retValue=runTest("1210");
assertThat(0, is(retValue));
}


@Test
public void TS090_1211() throws Exception{
int retValue=runTest("1211");
assertThat(0, is(retValue));
}


@Test
public void TS052_1213() throws Exception{
int retValue=runTest("1213");
assertThat(0, is(retValue));
}


@Test
public void TS053_1214() throws Exception{
int retValue=runTest("1214");
assertThat(0, is(retValue));
}


@Test
public void TS055_1215() throws Exception{
int retValue=runTest("1215");
assertThat(0, is(retValue));
}


@Test
public void TS056_1216() throws Exception{
int retValue=runTest("1216");
assertThat(0, is(retValue));
}


@Test
public void TS065_1217() throws Exception{
int retValue=runTest("1217");
assertThat(0, is(retValue));
}


@Test
public void TS067_1218() throws Exception{
int retValue=runTest("1218");
assertThat(0, is(retValue));
}


@Test
public void TS068_1219() throws Exception{
int retValue=runTest("1219");
assertThat(0, is(retValue));
}


@Test
public void TS069_1220() throws Exception{
int retValue=runTest("1220");
assertThat(0, is(retValue));
}


@Test
public void TS070_1221() throws Exception{
int retValue=runTest("1221");
assertThat(0, is(retValue));
}


@Test
public void TS072_1222() throws Exception{
int retValue=runTest("1222");
assertThat(0, is(retValue));
}


@Test
public void TS073_1223() throws Exception{
int retValue=runTest("1223");
assertThat(0, is(retValue));
}


@Test
public void TS074_1224() throws Exception{
int retValue=runTest("1224");
assertThat(0, is(retValue));
}


@Test
public void TS075_1225() throws Exception{
int retValue=runTest("1225");
assertThat(0, is(retValue));
}


@Test
public void TS076_1226() throws Exception{
int retValue=runTest("1226");
assertThat(0, is(retValue));
}


@Test
public void TS078_1227() throws Exception{
int retValue=runTest("1227");
assertThat(0, is(retValue));
}


@Test
public void TS079_1228() throws Exception{
int retValue=runTest("1228");
assertThat(0, is(retValue));
}


@Test
public void TS080_1229() throws Exception{
int retValue=runTest("1229");
assertThat(0, is(retValue));
}


@Test
public void TS083_1230() throws Exception{
int retValue=runTest("1230");
assertThat(0, is(retValue));
}


@Test
public void TS084_1231() throws Exception{
int retValue=runTest("1231");
assertThat(0, is(retValue));
}


@Test
public void TS085_1232() throws Exception{
int retValue=runTest("1232");
assertThat(0, is(retValue));
}


@Test
public void TS086_1233() throws Exception{
int retValue=runTest("1233");
assertThat(0, is(retValue));
}


@Test
public void TS087_1234() throws Exception{
int retValue=runTest("1234");
assertThat(0, is(retValue));
}


@Test
public void TS108_1235() throws Exception{
int retValue=runTest("1235");
assertThat(0, is(retValue));
}


@Test
public void TS109_1236() throws Exception{
int retValue=runTest("1236");
assertThat(0, is(retValue));
}


@Test
public void TS110_1237() throws Exception{
int retValue=runTest("1237");
assertThat(0, is(retValue));
}


@Test
public void TS111_1238() throws Exception{
int retValue=runTest("1238");
assertThat(0, is(retValue));
}


@Test
public void TS112_1239() throws Exception{
int retValue=runTest("1239");
assertThat(0, is(retValue));
}


@Test
public void TS113_1240() throws Exception{
int retValue=runTest("1240");
assertThat(0, is(retValue));
}


@Test
public void TS114_1241() throws Exception{
int retValue=runTest("1241");
assertThat(0, is(retValue));
}


@Test
public void TS115_1242() throws Exception{
int retValue=runTest("1242");
assertThat(0, is(retValue));
}


@Test
public void TS116_1243() throws Exception{
int retValue=runTest("1243");
assertThat(0, is(retValue));
}


@Test
public void TS118_1244() throws Exception{
int retValue=runTest("1244");
assertThat(0, is(retValue));
}


@Test
public void TS119_1245() throws Exception{
int retValue=runTest("1245");
assertThat(0, is(retValue));
}


@Test
public void TS120_1246() throws Exception{
int retValue=runTest("1246");
assertThat(0, is(retValue));
}


@Test
public void TS122_1247() throws Exception{
int retValue=runTest("1247");
assertThat(0, is(retValue));
}


@Test
public void TS123_1248() throws Exception{
int retValue=runTest("1248");
assertThat(0, is(retValue));
}


@Test
public void TS013_1249() throws Exception{
int retValue=runTest("1249");
assertThat(0, is(retValue));
}

}
