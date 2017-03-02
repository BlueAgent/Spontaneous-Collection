package spontaneouscollection.common;

import net.minecraftforge.common.config.Config;
import spontaneouscollection.SpontaneousCollection;

import static net.minecraftforge.common.config.Config.*;

@Config(modid = SpontaneousCollection.MOD_ID)
public class SCConfig {
    public static MendingCharm mending_charm;

    public static class MendingCharm {
        @Comment("Should the default recipe be added?")
        public static boolean recipe = true;

        @Comment("Number of ticks per operation.")
        @RangeInt(min = 1, max = 60*20)
        public static int operation_time = 5*20;

        @Comment("Total maximum durability per operation.\nMake sure this is greater than 'durability_per_xp' if 'repair_efficiently = true' or it will never repair anything.")
        @RangeInt(min = 1, max = 1000000)
        public static int max_durability = 10000;

        @Comment("Amount of durability per experience point.\nVanilla Mending repairs 2 durability per experience point.")
        @RangeDouble(min = 0.1, max = 10000)
        public static double durability_per_xp = 2;

        @Comment("Only repair items with Mending enchantment placed on them.")
        public static boolean requires_mending = true;

        @Comment("Only repair items if it uses the xp to the fullest extent.\nThis leaves items un-repaired if they are not damaged enough to use a full point of xp.")
        public static boolean repair_efficiently = true;

        @Comment("Send debug chat message showing how much xp was used and how much was repaired out of the total missing.")
        public static boolean debug = false;
    }
}
