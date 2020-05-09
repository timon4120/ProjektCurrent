package Projekt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class WorldMapPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	Graphics2D g2d;
	
	int[] xRos= {790,829,819,793,791,803,816,811,821,824,821,832,839,838,840,847,844,848,866,899,905,931,926,939,951,945,952,936,950,961,972,969,954,960,963,972,974,986,989,995,981,1001,1013,1058,1072,1080,1101,1109,1077,1099,1108,1115,1143,1150,1167,1174,1180,1195,1210,1218,1233,1248,1260,1285,1293,1298,1319,1327,1331,1329,1365,1383,1387,1388,1393,1405,1394,1373,1363,1354,1346,1358,1363,1354,1330,1305,1298,1298,1278,1272,1301,1306,1289,1288,1274,1266,1218,1193,1203,1210,1215,1211,1191,1177,1177,1182,1192,1179,1162,1155,1138,1127,1113,1090,1079,1069,1065,1053,1047,1025,1007,992,978,964,955,938,907,900,906,893,893,879,868,858,852,847,856,850,853,844,826,813,820,823,806,799,791,788,793,786,776,775,785,778,790,780,783,777,784};
    int[] yRos= {196,213,222,213,214,234,235,228,232,229,226,219,224,213,205,208,212,218,205,204,196,204,187,175,178,185,206,218,220,204,213,200,198,176,189,189,179,185,196,192,172,168,155,148,137,146,147,154,175,167,176,168,174,167,175,188,183,183,185,175,183,180,190,189,203,197,199,206,200,193,201,210,214,218,214,221,232,224,232,228,230,236,244,241,257,257,269,280,306,282,253,243,255,247,248,263,263,287,295,290,296,321,344,348,339,338,322,324,314,296,298,315,311,318,310,313,306,302,314,308,316,309,309,289,293,284,291,302,309,307,310,310,304,313,309,320,325,341,352,347,346,336,327,314,308,299,301,297,294,281,279,263,260,255,242,218,211,206,200};
    int nRos = 159;
    int[] xGren = {500,471,456,471,454,444,409,386,426,405,488,548,586,627,589,584,540,531,510};
    int[] yGren ={259,247,216,197,192,156,151,131,119,114,88,80,100,101,124,195,205,223,225};
    int nGren = 19;
    int[] xRos1= {870,891,930,934,933,906,883,891,889,874};
    int[] yRos1= {181,153,140,140,149,158,181,188,192,191};
    int nRos1 = 10;
    int[] xRos2= {1023,1037,1047,1054,1054,1049,1028};
    int[] yRos2= {112,104,109,118,129,126,120};
    int nRos2 = 7;
    int[] xRos3= {1055,1063,1074,1074};
    int[] yRos3= {135,121,126,130};
    int nRos3 = 4;
    int[] xRos4= {1198,1207,1234,1255,1228,1221,1210};
    int[] yRos4= {156,149,152,161,162,158,163};
    int nRos4 = 7;
    int[] xRos5= {1218,1220,1222,1227,1232,1230,1226};
    int[] yRos5= {330,295,289,300,316,322,315};
    int nRos5 = 7;
    int[] xRos6= {740,756,749};
    int[] yRos6= {289,289,284};
    int nRos6 = 3;
 //////////
    int[] xSval= {733,708,738,745,777,754,766,752,746};
    int[] ySval= {147,121,121,111,117,127,138,143,132};
    int nSval = 9;
    
    int[] xIsl = {617,599,580,582,572,581,587,609};
    int[] yIsl = {229,243,238,229,226,218,223,220};
    int nIsl = 8;
    int[] xCan = {119,121,185,303,344,353,399,400,440,436,467,420,404,395,383,365,365,372,361,356,348,310,302,332,350,337,330,323,318,297,291,296,237,170,144};
    int[] yCan = {194,260,318,317,334,352,325,319,309,322,329,259,268,254,245,245,269,279,285,306,286,275,256,221,216,194,212,202,206,179,195,207,209,194,204};
    int nCan = 35;    
    int[] xUS1 = {121,119,56,19,35,15,27,42,42,23,26,50,19,77,72};
    int[] yUS1 = {260,194,186,203,219,224,234,229,238,246,258,267,293,267,252};
    int nUS1 = 15;
    int[] xUS2 = {185,303,344,353,399,413,369,374,353,361,336,298,289,256,212,189};
    int[] yUS2 = {318,317,334,352,325,337,368,379,400,428,404,405,421,398,396,373};
    int nUS2 = 16;  
    int[] xMex = {212,256,289,288,303,313,318,333,325,326,345,330,293,296,258,261,232,222,240,210};
    int[] yMex = {396,398,421,440,456,451,440,441,452,462,462,475,470,464,447,439,406,403,436,400};
    int nMex = 20;
    int[] xCuba = {339,351,377,370,355,347};
    int[] yCuba = {437,432,444,448,440,441};
    int nCuba = 6;    
    int[] xDom = {381,383,401};
    int[] yDom = {454,442,453};
    int nDom = 3;
    int[] xCan1 = {179,185,210,241,259,263,276,271,216,204,192};
    int[] yCan1 = {181,165,165,177,171,187,195,203,194,183,187};
    int nCan1 = 11;
    int[] xCan2 = {191,240,246,225,239,245,258,255,231};
    int[] yCan2 = {149,126,136,147,153,144,152,161,162};
    int nCan2 = 9;
    int[] xCan3 = {269,284,293,305,315,291};
    int[] yCan3 = {173,187,176,178,169,165};
    int nCan3 = 6;
    int[] xCan4 ={337,329,357,351};
    int[] yCan4 ={228,240,237,230};
    int nCan4 = 4;
    int[] xCan5 ={365,365,381,397,412,420,406,409,421,431,405,409,370,325,321,364,373,367,387,381};
    int[] yCan5 ={226,235,233,245,248,238,226,219,229,217,205,197,169,169,187,192,202,215,211,224};
    int nCan5 = 20;
    int[] xCan6 ={283,302,288,264};
    int[] yCan6 ={160,158,146,147};
    int nCan6 = 4;
    int[] xCan7 ={295,308,311,354,362,322,316};
    int[] yCan7 ={145,151,161,163,157,154,146};
    int nCan7 = 7;
    int[] xCan8 ={259,258,305,297};
    int[] yCan8 ={120,132,140,129};
    int nCan8 = 4;
    int[] xCan9 ={320,359,379,406,426,415,355,344,309,292,326,328};
    int[] yCan9 ={144,151,120,105,96,89,87,97,100,116,135,138};
    int nCan9 = 12;
    int[] xNZ ={1314,1327,1344,1339};
    int[] yNZ ={716,722,695,689}; 
    int nNZ = 4;
    int[] xNZ1 ={1351,1361,1336,1345,1342};
    int[] yNZ1 ={695,679,663,677,684};
    int nNZ1 = 5;
    int[] xTas ={1229,1237,1247,1240};
    int[] yTas ={693,707,695,690};
    int nTas = 4;
    int[] xMad ={841,853,864,858,848,838,838,833};
    int[] yMad ={627,622,585,570,584,589,606,613};
    int nMad = 8;
    int[] xAus ={1111,1123,1145,1148,1159,1162,1176,1187,1195,1203,1210,1224,1230,1237,1240,1244,1246,1251,1250,1261,1265,1255,1255,1236,1231,1226,1221,1213,1195,1201,1175,1171,1161,1141,1111,1105,1117};
    int[] yAus ={662,668,659,661,654,656,650,655,667,657,675,683,679,684,677,679,677,678,665,654,636,617,612,598,583,578,566,593,580,572,567,581,577,596,610,625,653};
    int nAus = 37;
    int[] xChile ={392,389,380,378,371,376,404,414,399,388,381,391,386,394,397,404,401,409,404,396};
    int[] yChile ={597,658,677,712,727,754,766,759,747,747,732,711,695,666,647,632,625,613,614,583};
    int nChile = 20;
    int[] xArgen ={399,388,381,391,386,394,397,404,401,409,423,442,439,442,460,459,446,440,447,448,426,426,414,417,405,413};
    int[] yArgen ={747,747,732,711,695,666,647,632,625,613,611,625,632,635,628,631,645,658,665,677,682,696,692,702,717,724};
    int nArgen = 26;
    int[] xUrug ={446,440,447,450,460,464};
    int[] yUrug ={645,658,665,662,663,656};
    int nUrug = 6;
    int[] xBraz ={440,446,459,460,442,442,433,432,415,414,400,382,387,395,398,405,412,422,418,430,437,461,468,474,466,480,493,492,505,529,534,518,509,498,496,477,478};
    int[] yBraz ={658,645,631,628,604,587,585,578,569,563,568,554,542,539,518,516,522,514,509,504,520,518,507,516,529,525,531,536,535,544,556,571,611,616,613,622,637};
    int nBraz = 37;
    int[] xPara ={423,442,439,442,460,442,427};
    int[] yPara ={611,625,632,635,628,604,601};
    int nPara = 7;
    int[] xBoliv ={442,427,423,404,396,400,414,415,432,442,433,442};
    int[] yBoliv ={604,601,611,614,583,568,563,569,578,587,586,587};
    int nBoliv = 12;
    int[] xPeru ={395,400,382,387,395,375,360,354,351,371};
    int[] yPeru ={597,569,554,542,539,527,543,536,541,580};
    int nPeru = 10;
    int[] xEcu ={375,360,354,361};
    int[] yEcu ={527,543,536,519};
    int nEcu = 4;
    int[] xColu ={361,395,398,405,404,385,382,366,368};
    int[] yColu ={519,539,518,516,501,496,482,493,509};
    int nColu = 9;
    int[] xVen ={382,385,404,405,412,422,418,430,436,431,389};
    int[] yVen ={482,496,501,516,522,514,509,504,493,482,476};
    int nVen = 11;
    int[] xGui ={436,430,437,461,468,441};
    int[] yGui ={493,504,520,518,507,498};
    int nGui = 6;
    int[] xNG ={1214,1214,1222,1231,1243,1251,1240,1244,1234};
    int[] yNG ={534,556,561,553,563,563,553,550,542};
    int nNG = 9;
    int[] xIn1 ={1214,1214,1202,1184,1177,1186,1196,1204};
    int[] yIn1 ={534,556,545,542,528,527,536,531};
    int nIn1 = 8;
    int[] xIn2 ={1146,1146,1135,1127,1134,1137};
    int[] yIn2 ={542,527,527,535,547,535};
    int nIn2 = 6;
    int[] xIn3 ={1119,1080,1086,1108};
    int[] yIn3 ={561,553,547,552};
    int nIn3 = 4;
    int[] xIn4 ={1127,1117,1098,1087,1110,1121};
    int[] yIn4 ={521,539,536,521,518,502};
    int nIn4 = 6;
    int[] xIn5 ={1073,1077,1061,1039};
    int[] yIn5 ={550,534,518,505};
    int nIn5 = 4;
    int[] xPhi ={1153,1159,1157,1149,1139,1144,1135,1130,1140,1142,1142};
    int[] yPhi ={503,496,480,470,466,455,453,469,474,485,496};
    int nPhi = 11;
    int[] xTaj ={1139,1131,1137,1143};
    int[] yTaj ={439,437,424,429};
    int nTaj = 4;
    int[] xJap ={1178,1215,1219,1218,1223,1233,1219,1211,1207,1195,1186,1168};
    int[] yJap ={401,379,362,349,354,343,335,345,367,378,378,391};
    int nJap = 12;
    int[] xIre ={627,629,627,632,644,644,645,642,636,638};
    int[] yIre ={291,293,303,303,301,292,290,285,287,289};
    int nIre = 10;
    int[] xGB ={647,671,674,658,660,653,644,649,655,650,651};
    int[] yGB ={315,308,300,282,274,266,271,286,289,294,302};
    int nGB = 11;
    int[] xPort ={628,636,643,637};
    int[] yPort ={367,351,352,374};
    int nPort =4 ;
    int[] xSp ={631,636,643,637,646,663,670,682,662};
    int[] ySp ={345,351,352,374,379,375,357,354,345};
    int nSp = 9;
    int[] xFr ={676,662,665,649,676,698,691,685};
    int[] yFr ={349,345,334,322,310,319,344,342};
    int nFr = 8;
    int[] xBelg ={676,683,691,691};
    int[] yBelg ={310,303,307,315};
    int nBelg = 4;
    int[] xNeth ={683,695,691};
    int[] yNeth ={302,294,307};
    int nNeth =3 ;
    int[] xDe ={695,704,716,724,725,715,719,714,696,698,691};
    int[] yDe ={294,288,290,293,307,311,319,323,323,319,315};
    int nDe = 11;
    int[] xDen ={696,705,710,704};
    int[] yDen ={282,273,280,288};
    int nDen = 4;
    int[] xSwit ={695,697,714};
    int[] ySwit ={329,322,325};
    int nSwit = 3;
    int[] xIt ={714,695,691,701,729,727,736,732,733,739,740,725,717,718};
    int[] yIt ={325,329,344,341,362,374,365,361,360,363,361,351,338,332};
    int nIt =14 ;
    int[] xAust ={718,732,736,731,719,714};
    int[] yAust ={332,328,323,317,319,325};
    int nAust = 6;
    int[] xCzech ={719,731,739,725,715};
    int[] yCzech ={319,317,313,307,311};
    int nCzech = 5;
    int[] xPL ={724,739,740,756,760,760,756,725};
    int[] yPL ={293,286,289,289,292,308,319,307};
    int nPL = 8;
    int[] xSlov ={756,739,731,736};
    int[] ySlov ={319,313,317,325};
    int nSlov = 4;
    int[] xHung ={756,736,732,734,746,756};
    int[] yHung ={319,325,328,332,333,323};
    int nHung = 6;
    int[] xCroa ={732,734,746,756,750,731,723,717,718};
    int[] yCroa ={328,332,333,343,354,346,338,338,332};
    int nCroa = 9;
    int[] xGre ={745,744,755,756,763,757,769,750};
    int[] yGre ={351,363,378,373,369,361,357,354};
    int nGre = 8;
    int[] xGre1 ={756,766,772};
    int[] yGre1 ={382,387,381};
    int nGre1 = 3;
    int[] xNorw ={709,715,716,714,723,725,739,750,767,772,784,790,781,756,748,741,722,723,704,685,688,698};
    int[] yNorw ={266,260,250,239,235,223,209,204,203,196,200,196,189,187,199,193,205,210,235,247,267,273};
    int nNorw = 22;
    int[] xSwed ={709,715,716,714,723,725,739,750,758,760,749,749,734,734,741,732,730,720};
    int[] ySwed ={266,260,250,239,235,223,209,204,211,222,226,234,245,254,261,267,279,284};
    int nSwed = 18;
    int[] xFin ={750,767,772,784,777,783,780,790,778,757,751,749,767,760,758};
    int[] yFin ={204,203,196,200,206,211,218,242,255,258,253,242,228,222,211};
    int nFin = 15;
    int[] xEst ={776,775,758,765};
    int[] yEst ={274,263,264,271};
    int nEst = 4;
    int[] xLat ={776,776,765,761,755,746,764,769};
    int[] yLat ={279,274,271,273,270,279,279,287};
    int nLat = 8;
    int[] xLit ={769,764,746,749,756,760,768};
    int[] yLit ={287,279,279,284,289,293,290};
    int nLit = 7;
    int[] xBel ={791,788,793,786,776,769,760,760,778};
    int[] yBel ={301,297,294,281,279,287,293,302,308};
    int nBel = 9;
    int[] xUkr ={821,823,806,799,791,778,760,760,756,765,777,782,791,797,793,799,805,803};
    int[] yUkr ={323,314,308,299,301,308,302,308,319,323,320,333,326,332,335,342,335,330};
    int nUkr = 18;
    int[] xRom ={756,765,777,782,777,756,748,756,746};
    int[] yRom ={319,323,320,333,342,343,332,343,333};
    int nRom = 9;
    int[] xBul ={777,769,750,756};
    int[] yBul ={342,357,354,343};
    int nBul = 4;
    int[] xMon ={1120,1113,1090,1079,1069,1065,1053,1047,1025,1007,1021,1018,1037,1040,1058,1075,1101,1101,1107,1130,1127,1116};
    int[] yMon ={313,311,318,310,313,306,302,314,308,316,327,337,340,349,348,355,345,335,340,328,322,322};
    int nMon = 22;
    int[] xKaz ={1007,992,978,964,955,938,906,900,906,879,868,858,852,847,856,874,865,875,885,887,900,911,924,930,957,977,978,989,990,998};
    int[] yKaz ={316,309,309,289,293,284,291,302,309,310,304,313,309,320,325,330,339,351,354,337,334,345,346,356,344,350,336,334,325,327};
    int nKaz = 30;
    int[] xSKr ={1166,1157,1161,1169};
    int[] ySKr ={365,370,386,382};
    int nSKr = 4;
    int[] xNKr ={1166,1157,1151,1173};
    int[] yNKr ={365,370,360,349};
    int nNKr = 4;
    int[] xChi ={1177,1177,1182,1192,1179,1162,1155,1138,1127,1113,1116,1127,1130,1107,1101,1101,1075,1058,1040,1037,1018,1021,1007,998,990,989,978,977,956,959,973,973,1006,1026,1037,1050,1047,1056,1076,1086,1118,1141,1131,1142,1142,1130,1124,1140,1143};
    int[] yChi ={348,339,338,322,324,314,296,298,315,311,322,322,328,340,335,345,355,348,349,340,337,327,316,327,325,334,336,350,363,374,384,399,414,412,408,414,430,439,432,439,434,405,383,376,372,373,365,357,363};
    int nChi = 49;
    int[] xTajl ={1069,1058,1057,1050,1048,1055,1061,1068,1076,1065,1059,1055,1062,1071};
    int[] yTajl ={517,509,502,490,451,446,455,454,466,475,476,483,497,508};
    int nTajl = 14;
    int[] xVie ={1073,1076,1093,1090,1078,1086,1076,1056,1057,1061,1068};
    int[] yVie ={470,492,477,463,450,439,432,439,445,455,452};
    int nVie = 11;
    int[] xMja ={1056,1047,1050,1047,1037,1024,1035,1043,1050,1048};
    int[] yMja ={439,430,414,414,418,440,464,461,490,451};
    int nMja = 10;
    int[] xYem ={832,837,875,869,860,854};
    int[] yYem ={460,474,460,448,450,455};
    int nYem = 6;
    int[] xOma ={875,899,887,880,869};
    int[] yOma ={460,438,425,445,448};
    int nOma = 5;
    int[] xArab ={887,880,869,860,855,832,807,820,838,851,868,878};
    int[] yArab ={425,445,448,450,455,460,411,396,407,409,431,431};
    int nArab = 12;
    int[] xIraq ={820,838,851,857,844,844,841,828,819};
    int[] yIraq ={396,407,409,403,391,380,372,374,391};
    int nIraq = 9;
    int[] xSyr ={828,819,806,807};
    int[] ySyr ={374,391,395,378};
    int nSyr = 4;
    int[] xIsr ={806,807,819};
    int[] yIsr ={395,409,391};
    int nIsr = 3;
    int[] xTur ={841,828,807,777,772,795,809,830,840};
    int[] yTur ={372,374,378,375,362,352,358,355,361};
    int nTur = 9;
    int[] xIran ={841,844,878,886,890,890,913,903,908,905,890,871,857,853,839};
    int[] yIran ={372,391,417,415,420,420,416,406,397,378,369,376,367,353,365};
    int nIran = 15;
    int[] xGeo ={849,840,829,826,844};
    int[] yGeo ={353,361,354,346,347};
    int nGeo = 5;
    int[] xUzb ={885,887,900,911,924,930,932,926,904};
    int[] yUzb ={354,337,334,345,346,356,359,372,355};
    int nUzb = 9;
    int[] xTurk ={871,890,905,926,904,885};
    int[] yTurk ={376,369,378,372,355,354};
    int nTurk = 6;
    int[] xAfg ={905,908,903,925,947,943,938,929};
    int[] yAfg ={378,397,406,407,378,368,373,372};
    int nAfg = 8;
    int[] xPak ={947,923,905,914,906,910,922,933,941,939,947,956,956,967,959};
    int[] yPak ={377,406,408,416,425,428,424,432,428,415,414,398,385,380,374};
    int nPak = 15;
    int[] xInd ={933,941,939,947,956,956,967,973,975,983,976,1008,1010,979,979,971,953,950,941};
    int[] yInd ={432,428,415,414,398,385,380,384,399,404,411,422,435,463,479,495,464,437,442};
    int nInd = 19;
    int[] xBang ={1014,1028,1036,1046,1037,1027,1011,1008};
    int[] yBang ={441,435,419,413,407,411,414,420};
    int nBang = 8;
    int[] xNep ={983,976,1008,1009};
    int[] yNep ={404,411,422,415};
    int nNep = 4;
    int[] xTaji ={930,938,944,948,959,955,974,978,956,933};
    int[] yTaji ={372,374,368,375,373,362,354,350,343,354};
    int nTaji = 10;
    int[] xSA ={737,735,743,775,795,789,782,743,730};
    int[] ySA ={646,659,668,660,633,614,612,638,638};
    int nSA = 9;
    int[] xNam ={724,722,712,713,757,743,730};
    int[] yNam ={628,609,594,589,594,638,638};
    int nNam = 7;
    int[] xZim ={746,789,796,785,792,804,805,803,781,776,759,758};
    int[] yZim ={631,613,589,584,578,588,577,569,548,570,571,593};
    int nZim = 12;
    int[] xMoz ={794,789,796,785,792,804,805,803,822,827,803,808,799};
    int[] yMoz ={630,614,589,584,578,588,577,569,565,584,604,621,623};
    int nMoz = 13;
    int[] xAng ={721,710,731,739,755,754,759,758,713};
    int[] yAng ={567,547,547,557,552,566,571,593,589};
    int nAng = 9;
    int[] xRC ={746,721,731,739,755,754,759,776,781,786,773};
    int[] yRC ={507,546,547,557,552,566,571,570,548,510,503};
    int nRC = 11; 
    int[] xEgy ={763,764,808,791,794,797,799};
    int[] yEgy ={397,439,438,405,404,408,403};
    int nEgy = 7;
    int[] xLib ={763,764,760,726,712,702,713,742,746};
    int[] yLib ={397,439,447,435,430,405,391,402,394};
    int nLib = 9;
    int[] xTun ={701,713,709,707,701,696};
    int[] yTun ={406,391,390,375,375,387};
    int nTun = 6;
    int[] xAlg ={701,696,702,710,682,634,663,660,686};
    int[] yAlg ={375,387,405,431,450,412,394,383,377};
    int nAlg = 9;
    int[] xMar ={634,663,660,645,628,626,617};
    int[] yMar ={412,394,383,383,396,409,416};
    int nMar = 7;
    int[] xMau ={634,617,600,605,602,646,643};
    int[] yMau ={412,416,438,449,460,463,422};
    int nMau = 7;
    int[] xMali ={612,646,643,682,682,666,652,646,639,631,626};
    int[] yMali ={460,463,422,450,463,466,473,481,484,476,476};
    int nMali = 11;
    int[] xSud ={764,808,817,801,794,786,762,755,760,760};
    int[] ySud ={439,438,452,485,476,484,489,480,463,447};
    int nSud = 10;
    int[] xCzad ={760,726,729,721,728,755,761};
    int[] yCzad ={447,435,452,471,493,480,462};
    int nCzad = 7;
    int[] xNig ={726,712,682,682,666,679,687,720,729};
    int[] yNig ={435,430,450,463,466,476,473,471,452};
    int nNig = 9;
    int[] xGwi ={605,638,638,632};
    int[] yGwi ={480,511,484,477};
    int nGwi = 4;
    int[] xSen ={604,625,601,604};
    int[] ySen ={459,476,478,459};
    int nSen = 4;
    int[] xIG ={637,638,655,659,645};
    int[] yIG ={484,511,505,483,482};
    int nIG = 5;
    int[] xNige ={658,683,691,703,723,721,686,680,657};
    int[] yNige ={507,499,507,507,480,471,470,477,483};
    int nNige = 9;
    int[] xBur ={645,679,667,653,645};
    int[] yBur ={483,477,466,472,481};
    int nBur = 5;
    int[] xCam ={723,700,705,703,728,723,729};
    int[] yCam ={479,506,509,514,516,500,494};
    int nCam = 7;
    int[] xGab ={705,720,723,707,701};
    int[] yGab ={516,516,530,542,529};
    int nGab = 5;
    int[] xKon ={707,709,723,745,730,720,722};
    int[] yKon ={539,547,546,507,515,515,530};
    int nKon = 7;
    int[] xCAR ={724,729,745,774,754,729};
    int[] yCAR ={499,514,506,504,481,493};
    int nCAR = 6;
    int[] xSom ={839,868,855,828,828,850};
    int[] ySom ={485,479,510,532,511,494};
    int nSom = 6;
    int[] xEth ={849,828,820,804,801,816,833,838};
    int[] yEth ={494,509,511,505,486,452,478,484};
    int nEth = 8;
    int[] xKen ={827,827,820,800,803,819};
    int[] yKen ={510,532,541,527,503,511};
    int nKen = 6;
    int[] xTanz ={819,823,807,781,783,800};
    int[] yTanz ={541,565,570,549,531,528};
    int nTanz = 6;
    int[] xUga ={803,800,784,787};
    int[] yUga ={506,526,530,510};
    int nUga = 4;
    int[] xSS ={787,804,800,794,786,763,776};
    int[] ySS ={509,505,485,477,484,490,506};
    int nSS = 7;
    ArrayList<Countries> World = new ArrayList<Countries>();

    Countries Afganistan = new Countries (new Color(135,206,250),"Kabul",32225560,930, 388);
    Countries Algieria = new Countries (new Color(135,206,250),"Algiers",43000000,684,383);
    Countries Angola = new Countries (new Color(135,206,250),"Luanda",31127674,722,559);
    Countries Argentina = new Countries (new Color(135,206,250),"Buenos Aires",44938712,440,672);
    Countries Australia = new Countries (new Color(135,206,250),"Canberra",25702366,1247,659);
    Countries Austia = new Countries (new Color(135,206,250),"Vienna",8902600,725,325);

    Countries Bangladesh= new Countries (new Color(135,206,250),"Dhaka",168574456,1016,431);
    Countries Belarus = new Countries (new Color(135,206,250),"Minsk",9408400,777,293);
    Countries Belgium = new Countries (new Color(135,206,250),"Brussels",11534131,685,310);
    Countries Bolivia = new Countries (new Color(135,206,250),"Sucre",11469896,416,596);
    Countries Brazil = new Countries (new Color(135,206,250),"Bras�lia",211495581,485,585);
    Countries Bulgaria = new Countries (new Color(135,206,250),"Sofia",6951482,764,350);
    Countries Burkina = new Countries (new Color(135,206,250),"Wagadugu",21510181,661,476);

    Countries Cameroon = new Countries (new Color(135,206,250),"Yaound�",26545864,713,508);
    Countries Canada = new Countries (new Color(135,206,250),"Ottawa",38021203,375,325);
    Countries CentralAfricanRepublic = new Countries (new Color(135,206,250),"Bangui",5496011,740,501);
    Countries Czad = new Countries (new Color(135,206,250),"N'Djamena",16244513,731,472);
    Countries Chile = new Countries (new Color(135,206,250),"Valpara�so",19107216,386,676);
    Countries China = new Countries (new Color(135,206,250),"Beijing",1402552880,1111,364);
    Countries Columbia = new Countries (new Color(135,206,250),"Bogot�",49395678,384,513);
    Countries Croatia = new Countries (new Color(135,206,250),"Zagreb",4076246,739,342);
    Countries Cuba = new Countries (new Color(135,206,250),"Havana",11209628,360,440);
    Countries Czech = new Countries (new Color(135,206,250),"Prague",10693939,725,315);

    Countries Denmark = new Countries (new Color(135,206,250),"Copenhagen",5822763,704,283);
    Countries Dominicana = new Countries (new Color(135,206,250),"Santo Domingo",10358320,386,450);
    Countries DemocraticRepublicofCongo = new Countries (new Color(135,206,250),"Kinshasa",101780263,719,539);
    
    
    Countries Ecuador = new Countries (new Color(135,206,250),"Quito",17481060,361, 532);
    Countries Egypt = new Countries (new Color(135,206,250),"Cairo",100348670,787, 408);
    Countries Estonia = new Countries (new Color(135,206,250),"Tallinn",1328360,769, 268);
    Countries Ethiopia = new Countries (new Color(135,206,250),"Addis Ababa",98665000,827, 490);

    Countries Finland = new Countries (new Color(135,206,250),"Helsinki",5528390,764, 247);
    Countries France = new Countries (new Color(135,206,250),"Paris",67075000,678 ,322);

    Countries Gabon = new Countries (new Color(135,206,250),"Libreville",2172579,711, 527);
    Countries Georgia = new Countries (new Color(135,206,250),"Tbilisi",3716858,839, 354);
    Countries Germany = new Countries (new Color(135,206,250),"Berlin",83149300,715, 298);
    Countries Greece = new Countries (new Color(135,206,250),"Athens",10724599,753, 368);
    Countries Greenland = new Countries (new Color(135,206,250),"Nuuk",56081,474 ,213);
    Countries Guinea = new Countries (new Color(135,206,250),"Conakry",14218357,624 ,486);
    Countries Guyana = new Countries (new Color(135,206,250),"Georgetown",782766,442, 507);

    Countries Hungary = new Countries (new Color(135,206,250),"Budapest",9772756,745 ,327);

    Countries IceLand = new Countries (new Color(135,206,250),"Reykjav�k",366130,595, 230);
    Countries India = new Countries (new Color(135,206,250),"New Delhi",1391986332,966, 421);
    Countries Indonesia = new Countries (new Color(135,206,250),"Jakarta",266911900,1092, 551);
    Countries Iran = new Countries (new Color(135,206,250),"Tehran",83429279,872 ,401); 
    Countries Iraq = new Countries (new Color(135,206,250),"Baghdad",39127900,833, 392);
    Countries Ireland = new Countries (new Color(135,206,250),"Dublin",4921500,637, 297);
    Countries Isreal = new Countries (new Color(135,206,250),"Jerusalem",9193490,810, 400);
    Countries Italy = new Countries (new Color(135,206,250),"Rome",60238522,717 ,349);
    Countries IvoryCoast = new Countries (new Color(135,206,250),"Yamoussoukro",25823071,647, 494);

    Countries Japan = new Countries (new Color(135,206,250),"Tokyo",125960000,1187, 386);

    Countries Kazakhstan = new Countries (new Color(135,206,250),"Nur-Sultan",18696648,944 ,318);
    Countries Kenya = new Countries (new Color(135,206,250),"Nairobi",47564296,816, 523);

    Countries Lativa = new Countries (new Color(135,206,250),"Riga",1904600,768, 277);
    Countries Libya = new Countries (new Color(135,206,250),"Tripoli",6871287,723, 402);
    Countries Lithuania = new Countries (new Color(135,206,250),"Vilnius",2793039,761, 287);

    Countries Madagaskar = new Countries (new Color(135,206,250),"Antananarivo",26251309,846, 604);
    Countries Mali = new Countries (new Color(135,206,250),"Bamako",20250833,639 ,474);
    Countries Mauritania = new Countries (new Color(135,206,250),"Nouakchott",4077347,613, 450);
    Countries Mexico = new Countries (new Color(135,206,250),"Mexico City",126577691,276 ,440);
    Countries Mongolia = new Countries (new Color(135,206,250),"Ulaanbaatar",3316491,1082, 326);
    Countries Morocco = new Countries (new Color(135,206,250),"Rabat",35891418,641, 396);
    Countries Mozambique = new Countries (new Color(135,206,250),"Maputo",30066648,799 ,613);
    Countries Myanmar = new Countries (new Color(135,206,250),"Naypyidaw",54817919,1039, 437);

    Countries Namibia = new Countries (new Color(135,206,250),"Windhoek",2458936,732, 615);
    Countries Nepal = new Countries (new Color(135,206,250),"Kathmandu",29996478,994, 414);
    Countries Netherlands = new Countries (new Color(135,206,250),"Amsterdam",17463631,690, 302);
    Countries NewZeland = new Countries (new Color(135,206,250),"Wellington",4984090,1348, 685);
    Countries Niger = new Countries (new Color(135,206,250),"Niamey",22314743,704 ,460);
    Countries Nigeria = new Countries (new Color(135,206,250),"Abuja",206139587,690, 498);
    Countries NorthKorea = new Countries (new Color(135,206,250),"Pyongyang",25450000,1160, 363);
    Countries Norway = new Countries (new Color(135,206,250),"Oslo",5367580,701 ,256);

    Countries Oman = new Countries (new Color(135,206,250),"Muscat",4664790,889, 440);

    Countries Pakistan = new Countries (new Color(135,206,250),"Islamabad",220892331,925, 416);
    Countries PapuaNewGuinea = new Countries (new Color(135,206,250),"Port Moresby",8935000,1227 ,550);
    Countries Paraguay = new Countries (new Color(135,206,250),"Asunci�n",7252672,442, 616);
    Countries Peru = new Countries (new Color(135,206,250),"Lima",32131400,372 ,570);
    Countries Philippines = new Countries (new Color(135,206,250),"Manila",108597775,1142 ,473);
    Countries Poland = new Countries (new Color(135,206,250),"Warsaw",38379000,744 ,302);
    Countries Portugal = new Countries (new Color(135,206,250),"Lisbon",10276617,636, 363);

    Countries RepublicoftheCongo = new Countries (new Color(135,206,250),"Brazzaville",5518092,744, 541);
    Countries Romania = new Countries (new Color(135,206,250),"Bucharest",19405156,765, 333);
    Countries Russia = new Countries (new Color(135,206,250),"Moscow",146745098,817, 288);

    Countries SaudiArabia = new Countries (new Color(135,206,250),"Rijad",34218169,830, 439);
    Countries Senegal = new Countries (new Color(135,206,250),"Dakar",16705608,609, 471);
    Countries Slovakia = new Countries (new Color(135,206,250),"Bratislava",5457873,740, 320);
    Countries Somalia = new Countries (new Color(135,206,250),"Mogadishu",15893219,838, 511);
    Countries SouthAfrica = new Countries (new Color(135,206,250),"Pretoria",58775022,761, 648);
    Countries SouthKorea = new Countries (new Color(135,206,250),"Seoul",51780579,1163, 377);
    Countries SouthSudan = new Countries (new Color(135,206,250),"Juba",12778250,786, 497);
    Countries Spain = new Countries (new Color(135,206,250),"Madrid",47100396,653, 362);
    Countries Sudan = new Countries (new Color(135,206,250),"Khartoum",42488000,786, 460);
    Countries Sweden = new Countries (new Color(135,206,250),"Stockholm",10338368,729, 260);
    Countries Switzerland = new Countries (new Color(135,206,250),"Bern",8603899,700, 327);
    Countries Syria = new Countries (new Color(135,206,250),"Damascus",17500657,817, 385);

    Countries Taiwan = new Countries (new Color(135,206,250),"Taipei",23596493,1138, 434);
    Countries Tajikistan = new Countries (new Color(135,206,250),"Dushanbe",9127000,938, 365);
    Countries Tanzania = new Countries (new Color(135,206,250),"Dodoma",57637628,806, 550);
    Countries Thailand = new Countries (new Color(135,206,250),"Bangkok",66502555,1060, 464);
    Countries Tunisia = new Countries (new Color(135,206,250),"Tunis",11722038,703, 389);
    Countries Turkey = new Countries (new Color(135,206,250),"Ankara",83154997,814, 364);
    Countries Turkmenistan = new Countries (new Color(135,206,250),"Ashgabat",6031187,902, 365);

    Countries Uganda = new Countries (new Color(135,206,250),"Kampala",40299300,695, 483);
    Countries Ukraine = new Countries (new Color(135,206,250),"Kiev",41858119,788, 316);
    Countries UnitedKingdom = new Countries (new Color(135,206,250),"London",66435550,660, 300);
    Countries UnitedStates = new Countries (new Color(135,206,250),"Washington",329651905,209, 330);
    Countries Uruguay = new Countries (new Color(135,206,250),"Montevideo",3518552,449, 659);
    Countries Uzbekistan = new Countries (new Color(135,206,250),"Tashkent",34170666,915, 352);

    Countries Venezuela = new Countries (new Color(135,206,250),"Caracas",32219521,416, 493);
    Countries Vietnam = new Countries (new Color(135,206,250),"Hanoi",96208984,1083, 468);

    Countries Zimbabwe = new Countries (new Color(135,206,250),"Harare",15159624,773, 606);
    Countries Yemen = new Countries (new Color(135,206,250),"Sana",29825968,848, 465);





    public WorldMapPanel() {
		this.setSize(1440,960);
    World.add(Afganistan);
    World.add(Algieria);
    World.add(Angola);
    World.add(Argentina);
    World.add(Australia);
    World.add(Austia);
    World.add(Bangladesh);
    World.add(Belarus);
    World.add(Belgium);
    World.add(Bolivia);
    World.add(Brazil);
    World.add(Bulgaria);
    World.add(Burkina);
    World.add(Cameroon);
    World.add(Canada );
    World.add(CentralAfricanRepublic) ;
    World.add(Czad);
    World.add(Chile);
    World.add(China);
    World.add(Columbia);
    World.add(Croatia);
    World.add(Cuba);
    World.add(Czech);
    World.add(Denmark);
    World.add(Dominicana);
    World.add(Ecuador);
    World.add(Egypt);
    World.add(Estonia);
    World.add(Ethiopia);
    World.add(Finland);
    World.add(France);
    World.add(Gabon);
    World.add(Georgia);
    World.add(Germany);
    World.add(Greece);
    World.add(Greenland);
    World.add(Guinea);
    World.add(Guyana);
    World.add(Hungary);
    World.add(IceLand);
    World.add(India);
    World.add(Indonesia);
    World.add(Iran);
    World.add(Iraq);
    World.add(Ireland);
    World.add(Isreal);
    World.add(Italy);
    World.add(IvoryCoast);
    World.add(Japan);
    World.add(Kazakhstan);
    World.add(Kenya);
    World.add(Lativa);
    World.add(Libya);
    World.add(Lithuania);
    World.add(Madagaskar);
    World.add(Mali);
    World.add(Mauritania);
    World.add(Mexico);
    World.add(Mongolia);
    World.add(Morocco);
    World.add(Mozambique);
    World.add(Myanmar);
    World.add(Namibia);
    World.add(Nepal);
    World.add(Netherlands);
    World.add(NewZeland);
    World.add(Niger);
    World.add(Nigeria);
    World.add(NorthKorea);
    World.add(Norway);
    World.add(Oman);
    World.add(Pakistan);
    World.add(PapuaNewGuinea);
    World.add(Paraguay);
    World.add(Peru);
    World.add(Philippines);
    World.add(Poland);
    World.add(Portugal);
    World.add(RepublicoftheCongo);
    World.add(Romania);
    World.add(Russia);
    World.add(SaudiArabia);
    World.add(Senegal);
    World.add(Slovakia);
    World.add(Somalia);
    World.add(SouthAfrica);
    World.add(SouthKorea);
    World.add(SouthSudan);
    World.add(Spain);
    World.add(Sudan);
    World.add(Sweden);
    World.add(Switzerland);
    World.add(Syria);
    World.add(Taiwan);
    World.add(Tajikistan);
    World.add(Tanzania);
    World.add(Thailand);
    World.add(Tunisia);
    World.add(Turkey);
    World.add(Turkmenistan);
    World.add(Uganda);
    World.add(Ukraine);
    World.add(UnitedKingdom);
    World.add(UnitedStates);
    World.add(Uruguay);
    World.add(Uzbekistan);
    World.add(Venezuela);
    World.add(Vietnam);
    World.add(Zimbabwe);
    World.add(Yemen);
    setBackground(new Color(255,250,250));
    }

   
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);  
		  g2d = (Graphics2D) g;
	      drawWorld(g2d);
	  }

	  public Dimension getPreferredSize() {
	    return new Dimension(1440, 960);
	  }
	  
	  public void drawWorld(Graphics2D g2d) {
		  Russia.drawAreaXYn(xRos,yRos,nRos,g2d,4);
		  Russia.drawAreaXYn(xRos1,yRos1,nRos1,g2d,4);
		  Russia.drawAreaXYn(xRos2,yRos2,nRos2,g2d,4);
		  Russia.drawAreaXYn(xRos3,yRos3,nRos3,g2d,4);
		  Russia.drawAreaXYn(xRos4,yRos4,nRos4,g2d,4);
		  Russia.drawAreaXYn(xRos5,yRos5,nRos5,g2d,4);
		  Russia.drawAreaXYn(xRos6,yRos6,nRos6,g2d,4);
		  Greenland.drawAreaXYn(xGren,yGren,nGren,g2d,4);
		  Norway.drawAreaXYn(xSval,ySval,nSval,g2d,4);
		  IceLand.drawAreaXYn(xIsl,yIsl,nIsl,g2d,4);	 
		  Canada.drawAreaXYn(xCan,yCan,nCan,g2d,4);
		  Canada.drawAreaXYn(xCan1,yCan1,nCan1,g2d,4);
		  Canada.drawAreaXYn(xCan2,yCan2,nCan2,g2d,4);
		  Canada.drawAreaXYn(xCan3,yCan3,nCan3,g2d,4);
		  Canada.drawAreaXYn(xCan4,yCan4,nCan4,g2d,4);
		  Canada.drawAreaXYn(xCan5,yCan5,nCan5,g2d,4);
		  Canada.drawAreaXYn(xCan6,yCan6,nCan6,g2d,4);
		  Canada.drawAreaXYn(xCan7,yCan7,nCan7,g2d,4);
		  Canada.drawAreaXYn(xCan8,yCan8,nCan8,g2d,4);
		  Canada.drawAreaXYn(xCan9,yCan9,nCan9,g2d,4);		  
		  UnitedStates.drawAreaXYn(xUS1,yUS1,nUS1,g2d,4);
		  UnitedStates.drawAreaXYn(xUS2,yUS2,nUS2,g2d,4);
		  Mexico.drawAreaXYn(xMex,yMex,nMex,g2d,4);
		  Cuba.drawAreaXYn(xCuba,yCuba,nCuba,g2d,4);
		  Dominicana.drawAreaXYn(xDom,yDom,nDom,g2d,4);
		  NewZeland.drawAreaXYn(xNZ,yNZ,nNZ,g2d,4);
		  NewZeland.drawAreaXYn(xNZ1,yNZ1,nNZ1,g2d,4);		  
		  Australia.drawAreaXYn(xTas,yTas,nTas,g2d,4);
		  Madagaskar.drawAreaXYn(xMad,yMad,nMad,g2d,4);
		  Australia.drawAreaXYn(xAus,yAus,nAus,g2d,4);
		  Chile.drawAreaXYn(xChile,yChile,nChile,g2d,4);
		  Argentina.drawAreaXYn(xArgen,yArgen,nArgen,g2d,4);
		  Uruguay.drawAreaXYn(xUrug,yUrug,nUrug,g2d,4);
		  Brazil.drawAreaXYn(xBraz,yBraz,nBraz,g2d,4);
		  Paraguay.drawAreaXYn(xPara,yPara,nPara,g2d,4);
		  Bolivia.drawAreaXYn(xBoliv,yBoliv,nBoliv,g2d,4);		  
		  Peru.drawAreaXYn(xPeru,yPeru,nPeru,g2d,4);
		  Ecuador.drawAreaXYn(xEcu,yEcu,nEcu,g2d,4);
		  Columbia.drawAreaXYn(xColu,yColu,nColu,g2d,4);
		  Venezuela.drawAreaXYn(xVen,yVen,nVen,g2d,4);  
		  Guyana.drawAreaXYn(xGui,yGui,nGui,g2d,4);
		  PapuaNewGuinea.drawAreaXYn(xNG,yNG,nNG,g2d,4);
		  Indonesia.drawAreaXYn(xIn1,yIn1,nIn1,g2d,4);
		  Indonesia.drawAreaXYn(xIn2,yIn2,nIn2,g2d,4);
		  Indonesia.drawAreaXYn(xIn3,yIn3,nIn3,g2d,4);
		  Indonesia.drawAreaXYn(xIn4,yIn4,nIn4,g2d,4);
		  Indonesia.drawAreaXYn(xIn5,yIn5,nIn5,g2d,4);
		  Philippines.drawAreaXYn(xPhi,yPhi,nPhi,g2d,4);
		  Taiwan.drawAreaXYn(xTaj,yTaj,nTaj,g2d,4);
		  Japan.drawAreaXYn(xJap,yJap,nJap,g2d,4);
		  Ireland.drawAreaXYn(xIre,yIre,nIre,g2d,4);
		  UnitedKingdom.drawAreaXYn(xGB,yGB,nGB,g2d,4);
		  Portugal.drawAreaXYn(xPort,yPort,nPort,g2d,4);
		  Spain.drawAreaXYn(xSp,ySp,nSp,g2d,4);
		  France.drawAreaXYn(xFr,yFr,nFr,g2d,4);
		  Belgium.drawAreaXYn(xBelg,yBelg,nBelg,g2d,4);
		  Netherlands.drawAreaXYn(xNeth,yNeth,nNeth,g2d,4);
		  Germany.drawAreaXYn(xDe,yDe,nDe,g2d,4);
		  Denmark.drawAreaXYn(xDen,yDen,nDen,g2d,4);
		  Switzerland.drawAreaXYn(xSwit,ySwit,nSwit,g2d,4);
		  Italy.drawAreaXYn(xIt,yIt,nIt,g2d,4);
		  Austia.drawAreaXYn(xAust,yAust,nAust,g2d,4);
		  Czech.drawAreaXYn(xCzech,yCzech,nCzech,g2d,4);
		  Poland.drawAreaXYn(xPL,yPL,nPL,g2d,4);
		  Slovakia.drawAreaXYn(xSlov,ySlov,nSlov,g2d,4);
		  Hungary.drawAreaXYn(xHung,yHung,nHung,g2d,4);
		  Croatia.drawAreaXYn(xCroa,yCroa,nCroa,g2d,4);
		  Greece.drawAreaXYn(xGre,yGre,nGre,g2d,4);
		  Norway.drawAreaXYn(xNorw,yNorw,nNorw,g2d,4);
		  Sweden.drawAreaXYn(xSwed,ySwed,nSwed,g2d,4);
		  Finland.drawAreaXYn(xFin,yFin,nFin,g2d,4);
		  Estonia.drawAreaXYn(xEst,yEst,nEst,g2d,4);
		  Lativa.drawAreaXYn(xLat,yLat,nLat,g2d,4);
		  Lithuania.drawAreaXYn(xLit,yLit,nLit,g2d,4);
		  Belarus.drawAreaXYn(xBel,yBel,nBel,g2d,4);
		  Ukraine.drawAreaXYn(xUkr,yUkr,nUkr,g2d,4);
		  Romania.drawAreaXYn(xRom,yRom,nRom,g2d,4);
		  Bulgaria.drawAreaXYn(xBul,yBul,nBul,g2d,4);
		  Mongolia.drawAreaXYn(xMon,yMon,nMon,g2d,4);
		  Kazakhstan.drawAreaXYn(xKaz,yKaz,nKaz,g2d,4);
		  SouthKorea.drawAreaXYn(xSKr,ySKr,nSKr,g2d,4);
		  NorthKorea.drawAreaXYn(xNKr,yNKr,nNKr,g2d,4);
		  China.drawAreaXYn(xChi,yChi,nChi,g2d,4);
		  Thailand.drawAreaXYn(xTajl,yTajl,nTajl,g2d,4);
		  Vietnam.drawAreaXYn(xVie,yVie,nVie,g2d,4);
		  Myanmar.drawAreaXYn(xMja,yMja,nMja,g2d,4);
		  Yemen.drawAreaXYn(xYem,yYem,nYem,g2d,4);
		  Oman.drawAreaXYn(xOma,yOma,nOma,g2d,4);
		  SaudiArabia.drawAreaXYn(xArab,yArab,nArab,g2d,4);
		  Iraq.drawAreaXYn(xIraq,yIraq,nIraq,g2d,4);
		  Syria.drawAreaXYn(xSyr,ySyr,nSyr,g2d,4);
		  Isreal.drawAreaXYn(xIsr,yIsr,nIsr,g2d,4);
		  Turkey.drawAreaXYn(xTur,yTur,nTur,g2d,4);
		  Iran.drawAreaXYn(xIran,yIran,nIran,g2d,4);   
		  Georgia.drawAreaXYn(xGeo,yGeo,nGeo,g2d,4);
		  Uzbekistan.drawAreaXYn(xUzb,yUzb,nUzb,g2d,4);
		  Turkmenistan.drawAreaXYn(xTurk,yTurk,nTurk,g2d,4);
		  Afganistan.drawAreaXYn(xAfg,yAfg,nAfg,g2d,4);
		  Pakistan.drawAreaXYn(xPak,yPak,nPak,g2d,4);
		  India.drawAreaXYn(xInd,yInd,nInd,g2d,4);
		  Bangladesh.drawAreaXYn(xBang,yBang,nBang,g2d,4);
		  Nepal.drawAreaXYn(xNep,yNep,nNep,g2d,4);
		  Tajikistan.drawAreaXYn(xTaji,yTaji,nTaji,g2d,4);
		  SouthAfrica.drawAreaXYn(xSA,ySA,nSA,g2d,4);
		  Namibia.drawAreaXYn(xNam,yNam,nNam,g2d,4);
		   Zimbabwe.drawAreaXYn(xZim,yZim,nZim,g2d,4);
		  Mozambique.drawAreaXYn(xMoz,yMoz,nMoz,g2d,4);
		  Angola.drawAreaXYn(xAng,yAng,nAng,g2d,4);
		  RepublicoftheCongo.drawAreaXYn(xRC,yRC,nRC,g2d,4);
		  Egypt.drawAreaXYn(xEgy,yEgy,nEgy,g2d,4);
		  Libya.drawAreaXYn(xLib,yLib,nLib,g2d,4);
		  Tunisia.drawAreaXYn(xTun,yTun,nTun,g2d,4);
		  Algieria.drawAreaXYn(xAlg,yAlg,nAlg,g2d,4);
		  Morocco.drawAreaXYn(xMar,yMar,nMar,g2d,4);
		  Mauritania.drawAreaXYn(xMau,yMau,nMau,g2d,4);
		  Mali.drawAreaXYn(xMali,yMali,nMali,g2d,4);
		  Sudan.drawAreaXYn(xSud,ySud,nSud,g2d,4);
		  Czad.drawAreaXYn(xCzad,yCzad,nCzad,g2d,4);
		  Niger.drawAreaXYn(xNig,yNig,nNig,g2d,4);
		  Guinea.drawAreaXYn(xGwi,yGwi,nGwi,g2d,4);
		  Senegal.drawAreaXYn(xSen,ySen,nSen,g2d,4);
		  IvoryCoast.drawAreaXYn(xIG,yIG,nIG,g2d,4);
		  Nigeria.drawAreaXYn(xNige,yNige,nNige,g2d,4);
		  Burkina.drawAreaXYn(xBur,yBur,nBur,g2d,4);
		  Cameroon.drawAreaXYn(xCam,yCam,nCam,g2d,4);
		  Gabon.drawAreaXYn(xGab,yGab,nGab,g2d,4);
		  DemocraticRepublicofCongo.drawAreaXYn(xKon,yKon,nKon,g2d,4);
		  CentralAfricanRepublic.drawAreaXYn(xCAR,yCAR,nCAR,g2d,4);
		  Somalia.drawAreaXYn(xSom,ySom,nSom,g2d,4);
		  Ethiopia.drawAreaXYn(xEth,yEth,nEth,g2d,4);
		  Kenya.drawAreaXYn(xKen,yKen,nKen,g2d,4);
		  Tanzania.drawAreaXYn(xTanz,yTanz,nTanz,g2d,4);
		  Uganda.drawAreaXYn(xUga,yUga,nUga,g2d,4);
		  SouthSudan.drawAreaXYn(xSS,ySS,nSS,g2d,4);
		  
	  }
	  public ArrayList<Countries> getCountries(){
		return World;
		  
	  }
}