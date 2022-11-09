package com.revature.helpinghandapi.controllers;
import com.revature.helpinghandapi.dtos.BidDTO;
import com.revature.helpinghandapi.entities.Bid;
import com.revature.helpinghandapi.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bids")
public class BidController {

    private BidService bs;

    @Autowired
    public BidController(BidService bs){
        this.bs = bs;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Bid> createBid(@RequestBody BidDTO bid){
        Bid newBid = bs.createBid(bid);
        return new ResponseEntity<>(newBid, HttpStatus.CREATED);
    } //this communicates with the Service Layer in order to create a new bid

//    @PostMapping(consumes = "application/json", produces = "application/json")
    @PatchMapping
    public ResponseEntity<Bid> updateBid(@RequestBody BidDTO bidDTO){
        Bid updatedBid = bs.updateBid(bidDTO);
        return new ResponseEntity<>(updatedBid, HttpStatus.ACCEPTED);
    } // this communicates with the Service Layer to change the Status of a bid

    @GetMapping
    public ResponseEntity<List<Bid>> getBids() {
        return new ResponseEntity<>(bs.getAllBids(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bid> getById(@PathVariable("id") String id) {
        Optional<Bid> bids = bs.getBidById(id);
        if(bids.isPresent()) {
            return new ResponseEntity<>(bids.get(), HttpStatus.OK);
        } else {
            throw new NullPointerException(); // create bid exception
        }
    }
}
