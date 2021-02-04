package javarush.questsyntax.task1408;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 110;
    }

    @Override
    public String getDescription() {
        return  String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
