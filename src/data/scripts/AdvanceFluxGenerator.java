package data.scripts;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI;

public class AdvanceFluxGenerator extends BaseHullMod {

    private static final float CAPACITY_MULT = 2f;

    private static final float DISSIPATION_MULT = 2f;

    @Override
    public void applyEffectsBeforeShipCreation(ShipAPI.HullSize hullSize, MutableShipStatsAPI stats, String id) {
        stats.getFluxCapacity().modifyMult(id, CAPACITY_MULT);
        stats.getFluxDissipation().modifyMult(id, DISSIPATION_MULT);
    }
}