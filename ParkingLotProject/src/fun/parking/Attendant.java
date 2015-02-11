package fun.parking;

import java.util.List;

/**
 * Created by ashisht on 11/02/15.
 */
public class Attendant {
    private List<ParkingLot> parkingLots;


    public Attendant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingSlot giveFreeSlot() {
        //TODO : find a free slot and return
        // To be changed
        return parkingLots.get(0).getFreeSlot();
    }

    public ParkingSlot cheapestFreeSlot() {

        //TODO
        //if all parking lots are full, return nil/not available

        //sort the parking lots in increasing order of price
        //find the first cheapest lot which has free slot

        return null;
    }

    public ParkingSlot slotInLotWithMaxFreeSpace() {

        //TODO
        //find and return a slot from a lot with maximum free space
        return null;
    }

    private ParkingSlot getParkingSlot(ParkingRequirement requirement)
    {

        return null;
    }
}
