package ro.siit.java10.EVPurchase;

import java.util.ArrayList;
import java.util.List;

public class GreenBonus {
    private int budget;
    private List<BonusHistory> bonusHistory = new ArrayList<BonusHistory>();

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public GreenBonus(int budget) {
        this.budget = budget;
    }
}
