package com.example.supplychainmanagement.controller;

import com.example.supplychainmanagement.model.*;
import com.example.supplychainmanagement.service.XmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SupplyChainController {

    @Autowired
    private XmlService xmlService;

    private Input currentInput;

    @PostMapping("/import")
    public ResponseEntity<String> importXml(@RequestBody String xmlContent) {
        try {
            currentInput = xmlService.importXml(xmlContent);
            return ResponseEntity.ok("XML data imported successfully");
        } catch (JAXBException e) {
            return ResponseEntity.badRequest().body("Error importing XML: " + e.getMessage());
        }
    }

    @GetMapping("/export")
    public ResponseEntity<String> exportXml() {
        if (currentInput == null) {
            return ResponseEntity.badRequest().body("No data available to export");
        }
        try {
            String xmlContent = xmlService.exportXml(currentInput);
            return ResponseEntity.ok(xmlContent);
        } catch (JAXBException e) {
            return ResponseEntity.badRequest().body("Error exporting XML: " + e.getMessage());
        }
    }

    @PostMapping("/sales-planning")
    public ResponseEntity<String> updateSalesPlanning(@RequestBody List<SellWish> sellWishes) {
        if (currentInput == null) {
            currentInput = new Input();
        }
        currentInput.setSellWish(sellWishes);
        return ResponseEntity.ok("Sales planning updated successfully");
    }

    @PostMapping("/direct-sales")
    public ResponseEntity<String> updateDirectSales(@RequestBody List<SellDirect> sellDirects) {
        if (currentInput == null) {
            currentInput = new Input();
        }
        currentInput.setSellDirect(sellDirects);
        return ResponseEntity.ok("Direct sales updated successfully");
    }

    @PostMapping("/production-program")
    public ResponseEntity<String> updateProductionProgram(@RequestBody List<Production> productions) {
        if (currentInput == null) {
            currentInput = new Input();
        }
        currentInput.setProductionList(productions);
        return ResponseEntity.ok("Production program updated successfully");
    }

    // Placeholder methods for other functionalities

    @PostMapping("/quantity-planning")
    public ResponseEntity<String> performQuantityPlanning() {
        // TODO: Implement quantity planning logic
        return ResponseEntity.ok("Quantity planning performed");
    }

    @PostMapping("/capacity-planning")
    public ResponseEntity<String> performCapacityPlanning() {
        // TODO: Implement capacity planning logic
        return ResponseEntity.ok("Capacity planning performed");
    }

    @PostMapping("/lot-size-splitting")
    public ResponseEntity<String> performLotSizeSplitting() {
        // TODO: Implement lot size splitting logic
        return ResponseEntity.ok("Lot size splitting performed");
    }

    @PostMapping("/sequence-planning")
    public ResponseEntity<String> performSequencePlanning() {
        // TODO: Implement sequence planning logic
        return ResponseEntity.ok("Sequence planning performed");
    }

    // Additional endpoints can be added here for other functionalities
}
