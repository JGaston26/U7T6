import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortTester {
    public static void main(String[] args) {
        int[] arrA = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        Sort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        Sort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

        /*
        System.out.println("--- PART A: TESTING INSERTION SORT --- ");
        int passed = 0;
        System.out.println("test 1: sorting list with 10 elements:");
        int[] arrA = {1, 10, 7, 3, 5, 2, 4, 9, 6, 8};
        Sort.insertionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        boolean pass = true;
        for (int i = 1; i < arrA.length; i++) {
            if (arrA[i] <= arrA[i - 1]) {
                pass = false;
            }
        }
        if (pass && arrA[1] == 2 && arrA[5] == 6) {
            System.out.println("----TEST PASS----");
            passed++;
        } else {
            System.out.println("----!!!!!!!TEST FAIL!!!!!!!----");
        }
        System.out.println("\ntest 2: sorting list with 10 elements:");
        int[] arrB = {8, 10, 7, 3, 5, 2, 4, 9, 6, 1};
        Sort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
        pass = true;
        for (int i = 1; i < arrB.length; i++) {
            if (arrB[i] <= arrB[i - 1]) {
                pass = false;
            }
        }
        if (pass && arrB[1] == 2 && arrB[5] == 6) {
            System.out.println("----TEST PASS----");
            passed++;
        } else {
            System.out.println("----!!!!!!!TEST FAIL!!!!!!!----");
        }
        System.out.println("\ntest 3: sorting list with 10 elements:");
        int[] arrC = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
        Sort.insertionSort(arrC);
        System.out.println(Arrays.toString(arrC));
        pass = true;
        for (int i = 1; i < arrC.length; i++) {
            if (arrC[i] < arrC[i - 1]) {
                pass = false;
            }
        }
        if (pass && arrC[0] == 1 && arrC[2] == 2 && arrC[6] == 4 && arrC[9] == 5) {
            System.out.println("----TEST PASS----");
            passed++;
        } else {
            System.out.println("----!!!!!!!TEST FAIL!!!!!!!----");
        }
        System.out.println("\ntest 4: sorting list with 16 elements:");
        int[] arrD = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        Sort.insertionSort(arrD);
        System.out.println(Arrays.toString(arrD));
        pass = true;
        for (int i = 1; i < arrD.length; i++) {
            if (arrD[i] < arrD[i - 1]) {
                pass = false;
            }
        }
        if (pass) {
            System.out.println("----TEST PASS----");
            passed++;
        } else {
            System.out.println("----!!!!!!!TEST FAIL!!!!!!!----");
        }
        System.out.println("\ntest 5: sorting list with 1000 elements:");
        int[] arrE = {4744,2448,4958,869,1515,3118,2822,66,3362,4047,2988,3643,2037,2654,1695,1473,931,2145,670,987,3830,26,4074,120,1873,4445,2304,2285,4010,4198,4204,3225,3004,1896,2479,3357,1256,2070,2013,2964,925,2298,4556,1702,1946,565,3471,1926,2875,4411,1266,2018,167,1146,4809,2688,3712,3126,3413,4064,3407,1270,3895,2999,202,1429,3526,1035,2461,4697,3724,2687,337,592,4504,2444,3048,693,4806,2537,3172,3957,3933,2651,1986,3269,1253,4818,150,542,1509,4829,3569,875,157,1201,4964,4330,4362,1440,4957,2329,3409,4260,1796,3610,4965,3709,4557,733,4490,1272,576,235,387,1044,3469,3605,1656,3514,3467,1102,1806,2936,1719,794,184,2869,3140,1165,4786,2860,4614,2321,1601,943,4480,3061,2067,2050,4262,1000,2201,651,1237,1284,4101,703,4266,809,2864,4586,4501,4299,4768,546,605,3776,424,4081,537,1739,393,4238,2753,2676,1388,3815,4811,4394,3757,4867,3093,3676,2175,3233,1508,3495,3827,4253,2811,4310,3301,4196,3922,464,1732,654,3168,343,1303,512,4072,2334,475,2459,2967,1799,2525,2374,4853,2383,1399,2439,2332,4318,3453,701,3088,2251,2467,2512,333,1586,4606,900,995,4968,2866,808,1653,4841,2356,1444,4848,4688,233,3044,2895,1788,747,2255,2836,1685,3318,4575,3735,2150,323,138,4195,527,1918,2327,1697,2164,3817,4029,832,2384,3366,1929,4116,3153,1158,4787,3351,4172,780,2660,11,4139,2888,4421,4248,1152,3355,4059,36,3672,4150,4026,3631,599,2830,1575,1989,3918,3216,1494,1031,554,2302,383,1962,2170,3344,1814,1598,1095,3497,2052,2350,1298,3653,1704,1365,1384,2501,2619,1036,1791,4122,4014,3852,4249,1690,4493,992,2692,4960,4021,4503,1161,1085,2194,740,1372,1192,3063,2883,4182,396,629,3051,4753,2963,807,1635,4543,3664,4907,3907,2138,1619,4788,3928,1261,1138,705,4510,1963,1680,1293,2885,353,1587,4317,1670,2061,1513,2706,1735,1528,1427,2785,3687,1970,1328,1202,212,2710,2990,2419,357,3613,4512,1010,297,3433,4728,814,1950,4425,1747,3188,4463,344,4833,2515,3404,4410,801,1280,3047,2478,88,4917,3488,1076,664,59,4180,4383,1195,3972,4153,407,4784,4417,509,18,3145,2492,2567,222,4562,2835,3115,280,1240,1360,859,3822,348,2226,4945,3575,3731,4822,489,1953,4171,1872,4758,329,56,696,2457,1357,4663,972,2613,802,3246,1239,1634,1520,4402,2645,1726,4076,4230,2803,2905,422,1887,2848,2723,757,1269,3030,4980,4986,3548,1156,4674,1344,55,1937,1701,4919,2852,3278,2407,3550,2466,1913,3962,589,1588,2601,2324,1522,2649,1620,4871,2876,480,1876,1387,1072,342,1610,1459,4356,2737,1947,669,1366,498,1050,715,3131,3356,4655,417,4745,1493,2078,1728,1501,1326,51,3329,3253,4110,1943,658,769,3857,2575,1623,961,2563,3293,2121,214,1771,4481,1377,1243,1767,910,4278,2416,2003,1362,820,127,3381,4159,3305,1502,2477,3882,2113,3291,786,4694,3147,3941,1795,335,848,121,2795,3594,1825,3614,824,4904,3761,415,3728,1135,4279,2796,4404,288,1518,2857,3829,1660,766,1228,3365,4626,247,4319,429,674,1347,4308,3303,4350,4700,1684,1813,1230,63,3593,3218,1967,4813,1590,2199,1194,1136,2828,291,521,2182,2994,148,3968,67,788,2263,321,4951,4470,666,2487,4415,1100,4595,3748,4367,1677,430,3755,4682,1251,4053,849,45,2096,2424,1592,729,2196,1624,1479,3094,448,195,4730,4627,3472,4707,1593,3963,3442,2683,2927,3440,618,3198,436,3650,3616,603,1709,662,4996,4949,2877,3177,538,830,1062,3821,1579,3386,3310,3853,1781,25,1700,3285,659,3875,1406,4611,2693,1669,2392,1069,3184,637,3067,21,1552,2632,2842,1438,2614,1668,2789,1968,2270,4254,3678,1281,2280,2577,4807,2455,2016,4732,3241,3012,226,872,778,3996,2617,2871,3639,3098,1784,3595,3646,4984,4168,1925,2837,4211,4343,661,4603,3783,742,752,2073,4625,897,4184,3086,1759,3945,3836,1021,1133,2193,1559,3196,4886,179,4227,1758,300,2747,3844,2225,4488,3965,1383,272,2571,446,317,3477,4517,1763,2930,3461,574,4905,1554,930,3662,686,2519,305,1126,116,2652,2351,4090,2497,261,1016,3842,4760,2072,1110,4927,1363,4602,2058,3893,332,4764,3178,4526,3718,3165,1912,373,839,3710,2962,3398,2005,1641,1773,4969,3071,320,1290,1462,1856,4802,330,691,1923,2062,4284,2686,3590,4915,2063,1863,4482,3607,416,2400,4863,1907,1878,1676,243,3554,4015,3090,990,1033,562,1109,3144,945,805,4498,1966,4601,84,813,2584,4,1723,1278,613,3855,4615,985,2116,1207,3633,3219,4689,4881,91,3502,4508,798,2292,4897,3800,1841,2859,4719,1302,4555,3245,3411,4948,1034,3506,4457,4950,2242,1196,1643,2670,548,1988,4083,579,358,2943,1935,4567,1023,4617,3108,1419,1725,557,3635,4142,762,2343,4763,1910,4359,1756,2056,4158,22,3808,922,2504,1673,1181,3068,1783,883,2203,1613,2151,4750,874,4203,1221,141,4456,2960,1651,4684,1009,3489,4883,2843,2756,4412,2957,2941,2393,1621,3869,274,3295,423,2469,1674,185,4665,4225,3792,1186,2313,2450,3642,431,1104,4221,4826,3371,1540,3934,2127,379,1137,1855,1798,3464,3784,8,236,4366,4232,578,4077,471,3343,2674,4911,1987,3116,3072,3394,1219,372,4609,178,4215,3283,94,4244,775,3889,4132,3549,1127,2912,2889,4093,4938,3883,1112,4413,4972,2119,2846,4080,326,1352,381,2362,4188,4795,4893,2239,1958,721,2486,2378,737};
        Sort.insertionSort(arrE);
        System.out.println(Arrays.toString(arrE));
        pass = true;
        for (int i = 1; i < arrE.length; i++) {
            if (arrE[i] <= arrE[i - 1]) {
                pass = false;
            }
        }
        if (pass && arrE[0] == 4 && arrE[995] == 4972 && arrE[999] == 4996) {
            System.out.println("----TEST PASS----");
            passed++;
        } else {
            System.out.println("----!!!!!!!TEST FAIL!!!!!!!----");
        }
        System.out.println("\nTESTS PASSED: " + passed + " OUT OF 5");
        System.out.println("TESTS FAILED: " + (5 - passed) + " OUT OF 5");

/*
        System.out.println("\n--- PART B: TESTING INSERTION SORT ON WORD LIST --- ");
        ArrayList<String> allWords = new ArrayList<String>();

        // load words from words.txt into array list; see helper method below
        loadWordsInto(allWords);
        System.out.println("This list contains " + allWords.size() + " common words:");

        // sort the list with insertion sort
        Sort.insertionSortWordList(allWords);

        System.out.println(allWords);
        boolean pass2 = true;
        for (int i = 1; i < allWords.size(); i++) {
            if (allWords.get(i).compareTo(allWords.get(i - 1)) < 0) {
                pass2 = false;
            }
        }
        if (pass2 && allWords.size() != 0 && allWords.get(0).equals("a") && allWords.get(1000).equals("your")) {
            System.out.println("----TEST PASS----");
        } else {
            System.out.println("----!!!!!!!TEST FAIL!!!!!!!----");
        }
*/

/*
        System.out.println("\n--- PART C: RUNTIME TESTS FOR SORTING ALGORITHMS --- ");
        ArrayList<String> allWords = new ArrayList<String>();
        ArrayList<String> allWords2 = new ArrayList<String>();

        // load words from words.txt into array list; see helper method below
        loadWordsInto(allWords);
        loadWordsInto(allWords2);

        // sort the list with insertion sort
        Sort.selectionSortWordList(allWords2);
        Sort.insertionSortWordList(allWords);
*/
    }

    // helper method to load words from words.txt
    public static void loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src\\words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
