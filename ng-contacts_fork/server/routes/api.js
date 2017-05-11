const express = require('express');
const router = express.Router();

const ModuleService = require('../module-service');
const moduleService = new ModuleService();

/**
 * Will get the list of contacts
 */
router.get('/contacts', (req, res) => {
    res.json(moduleService.getContacts());
});

/**
 * 
 */
router.get('/contacts/:id', (req, res) => {
    res.json(moduleService.findContactById(req.params.id));
});

/**
 * 
 */
router.post('/contacts', (req, res) => {
    let contact = req.body;
    contact = moduleService.addContact(contact);
    res.json(contact);
});

/**
 * Will delete a contact
 */
router.delete('/contacts/:id', (req, res) => {
    let contact = moduleService.findContactById(req.params.id);
    contact = moduleService.deleteContact(contact);
    res.json(contact);
//    res.status(200).end("OK");
});

/**
 * Will update a contact
 */
router.put('/contacts', (req, res) => {
    let contact = req.body;
    contact = moduleService.updateContact(contact);
    res.json(contact);
});

module.exports = router;