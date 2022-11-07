package com.revature.helpinghandapi.controllers;
import com.revature.helpinghandapi.dtos.BidDTO;
import com.revature.helpinghandapi.entities.Bid;
import com.revature.helpinghandapi.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    }

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
