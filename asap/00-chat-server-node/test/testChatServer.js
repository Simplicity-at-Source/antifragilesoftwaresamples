var assert = require('assert');
var request = require("superagent");
require('../app.js'); //Boot up the server for tests
var host = 'http://localhost:8112';

describe('test gene-store: ', function(){

    it('/api/chat/posts works ok', function(done){
        var req = request.get(host + '/api/chat/posts');
        req.end(function(res){
            var json = JSON.parse(res.text);
            assert.equal(200, res.status);
            done();
        });
    });
});