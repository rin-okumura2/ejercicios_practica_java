class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return (!knightIsAwake)?true:false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake||archerIsAwake||prisonerIsAwake)?true:false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (!archerIsAwake && prisonerIsAwake)?true:false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        
        return ((!archerIsAwake &&petDogIsPresent) || (!knightIsAwake&&!archerIsAwake&&prisonerIsAwake)) ?true:false;
    
    }
}
