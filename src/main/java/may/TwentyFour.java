package may;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TwentyFour {
    /**
     * 已知一个无序数组 array，元素均为正整数。给定一个目标值 target，输出数组中是否存在若干元素的组合，相加为目标值。
     * @param arr
     * @return`
     */
    public int count(int[]arr,int target) {
        int count=0;
        for (int i = 0; i <arr.length; i++) {
            int a=arr[i];
            if(a==target){count++;continue;
            }
            if(a>target)continue;
            if(a<target){
                for (int j = i; j <arr.length ; j++) {

                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] names=  {
                "ConfigSlots_Room117_Roulette","ConfigSlots_Room104_Roulette","ConfigSlots_Room110","ConfigSlots_Room114_Roulette","lotteryPoolGoodsConfig","ConfigSlots_Room114","ConfigSlots_Room119","aircraftTaxConfig","rankAdvacnedConfig","ConfigSlots_Room113","aircraftMonsterSpawnConfig","shopLabelReleaseConfig","ConfigSlots_Room120_Roulette","ConfigSlots_Room100_Roulette","addUpWinConfig","ConfigSlots_Room102_Roulette","ConfigSlots_SignIn","luckDrawActivitiesActionConfig","aircraftBulletUpgradeConfig","ConfigSlots_TaskTimes","planeRuinsTreasureConfig","fruitPositionConfig","goldenEggReward","exchange","ConfigSlots_LuckyMap","ConfigSlots_Room108_Roulette","numericalConfig","actBigProfitConfig","planeBossActivityLuckConfig","planePointGoldConfig","treasureHunt","personalPoolDailyConfig","planeGiftBagConfig","ConfigSlots_Room113_Roulette","ConfigInbox_Config","fruitNumericalConfig","aircraftMapConfig","boxConfig","treasureActivitiesRankingConfig","channels","ConfigLobby_Vip","planeExchangeRelease","aircraftActivityConfig","AccShareHistory","planeBossActivityDropConfig","channelActivateUser","planeBossActivityExchangeConfig","ConfigSlots_TaskMainLineGameConfig","planeJackpotWishWincoinConfig","shareTaskLabel","ConfigSlots_FortuneCat","exchangeRelease","ConfigSlots_Room126","aircraftNoviceProtectConfig","stageConfig","screenTime","treasureActivitiesConfig","bonusConfig","periodCardConfig","childrenLabel","aircraftBulletConfig","ConfigSlots_RoomEgg","ConfigSlots_BountyConfig","planeBossActivityRankingConfig","rankConfig","noticeConfig","ConfigSlots_GoldReward","planeShop","treasureHuntCircleBoxConfig","ConfigSlots_UserNewProtect_Free","fruitTaxConfig","planeJackpotWishRankingConfig","monsterConfig","autoCounter","ConfigSlots_Room118_Roulette","ConfigSlots_TaskMainLineConfig","planeShopRelease","wageConfig","rankAdvacnedRewardConfig","ConfigSlots_Room115","ConfigSlots_UserNewProtect_CLG","ConfigSlots_Room112_Roulette","luckyCatConfig","aircraftWheelOfFortuneConfig","planePointGoldCommonConfig","ConfigSlots_Room118","ConfigSlots_RoomRewardRoulette","TO_RankConfig","ConfigSlots_ShopDayRewardsConfig","channelsBindAdv","ConfigSlots_Room116","planeJackpotWishCommonConfig","maintainConfig","numericalConfig2","ConfigSlots_Common","ConfigLobby_FunctionConfig","personalPoolGlobalConfig","NewPlayerConfig","aircraftMonsterPlaneConfig","aircraftWildBossConfig","aircraftJackpotDivideConfig","playerShareTaskConfig","treasureHuntConfig","ConfigSlots_TaskConfig","planeBatteryConfig","activityTaskLabel","medalStageTaskConfig","ConfigSlots_Room120","ConfigSlots_FinanciaSuper","treasureHuntGridConfig","ConfigSlots_Room104","ConfigSlots_Level","playerCheckIndulge","multipleConfig","ConfigSlots_PoolPersonalEtc","ConfigLobby_AcStarConfig","ConfigSlots_LangConfig","positionConfig","aircraftWildBossActivityConfig","ConfigSlots_Room111","loginAndPayUrlsConfig","vipConfig","ConfigSlots_Room116_Roulette","ConfigSlots_Room123","ConfigLobby_VipLabel","planeBossActivityJackpotConfig","planeJackpotWishConfig","ConfigSlots_GrandPush","aircraftDropLimitConfig","advertConfig","diceGetConfig","lotteryConfig","ConfigSlots_Room103_Roulette","ConfigSlots_AcContinuousReward","ConfigLobby_ShareConfig","ConfigSlots_AcTimeTurntableRewards","luckDrawActivitiesConfig","medalTaskConfig","ConfigSlots_Room101_Roulette","ConfigSlots_FirstRecharge","taskConfig","channelConfig","planeGiftBagRankingConfig","aircraftItemConfig","ConfigSlots_PlayerHead","playerInitializeConfig","ConfigSlots_PoolPersonal","treasureHuntDiceConfig","ConfigSlots_Room103","ConfigSlots_PoolPersonalCommon","playerInfo","personalPoolCtrlConfig","ConfigSlots_AcTimeTurntable","planeBossActivityBaseConfig","ConfigSlots_Room115_Roulette","goldenEgg","whiteListConfig","conversionConfig","planeLinkShop","ConfigSlots_Room108","ConfigSlots_Room119_Roulette","planeLinkShopRelease","ConfigSlots_Room106_Roulette","ConfigSlots_Ratio","ConfigLobby_FunRadio","ConfigSlots_Room106","task_jekenis","lotteryRankConfig","aircraftMonsterBuffConfig","advertRecord","Config_CountryCode","ConfigSlots_Room105","ConfigSlots_WebCtrlSpecDaily","planeRuinsRewardConfig","ConfigSlots_FinancialReward","costRewardConfig","aircraftRoomConfig","ConfigSlots_Room101","ConfigLobby_RoomConfig","fruitGearsConfig","ConfigSlots_Room107_Roulette","personalPoolTotallyConfig","taskReleaseConfig","taskSanxiaoRollback","taskGrowUp","planePointGoldRankingConfig","ConfigSlots_Room107","preventBrushConfig","ConfigSlots_Room102","channelsPeriods","weaponUpgradeConfig","ConfigSlots_Level_Old","ConfigSlots_RoomBet","rankRewardConfig","test","shopRelease","ConfigLobby_GlobalActivityConfig","ConfigSlots_Room105_Roulette","ConfigSlots_UserNewProtect","lotteryBaseConfig","aircraftWildBossRewardConfig","picture","ConfigSlots_Room110_Roulette","aircraftAwardGroupConfig","noticeConfigRelease","ConfigLobby_FriendPush","taxConfig","goldenEggConfig","activityTaskLabelRelease","wageConfigRelease","screenTimeConfig","ConfigSlots_Room100","ConfigSlots_Room109_Roulette","shop","shareConfig","channelImposePrisoners","ConfigSlots_Room117","ConfigSlots_Room112","ConfigSlots_Room109","ConfigLobby_LobbyConfig","ConfigSlots_FinancialTimes","playerSignInConfig","aircraftPoolConfig","ConfigSlots_FinancialBasic","planeExchange","planeGoodLuckTreasureConfig","actBountyConfig","taskGrowUpConfig","fruitAddUpWinConfig","ConfigSlots_ItemConfig","ConfigLobby_GlobalActivityRewardsConfig","ConfigSlots_Room111_Roulette"
        };
        List<String> nameList= Arrays.asList(names);
        nameList.forEach(name ->{
            String className=name.substring(0,1).toUpperCase()+name.substring(1);
            System.out.println(className);
            String str="package com.tqx.backend.business.mongo.model.toGameConfig;\n" +
                    "\n" +
                    "import lombok.Data;\n" +
                    "\n" +
                    "@Data\n" +
                    "public class "+className+" {\n" +
                    "}\n";

           try{
               File file = new File("D:/generateCode/java/"+className+".java");
               if(file.createNewFile()) {
                   System.out.println("文件创建成功！");
               } else {
                   System.out.println("出错了，该文件已经存在。");
               }
               FileOutputStream outStream = new FileOutputStream(file);	//文件输出流用于将数据写入文件
               outStream.write(str.getBytes());
               outStream.close();
           }
           catch(IOException ioe) {
               ioe.printStackTrace();
           }
        });
    }
}


