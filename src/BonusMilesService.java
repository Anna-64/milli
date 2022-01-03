public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = 20;
        int bonusMiles = cost / bonus;
        return bonusMiles;
    }
}
