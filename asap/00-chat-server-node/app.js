http = require('http');
var fs = require('fs');
var restify = require('restify');

var port = process.env.PORT || 8112;

var server = restify.createServer();
server.use(restify.queryParser());
server.use(restify.bodyParser());

server.listen(port, function() {
    console.log('chat-server listening at %s', server.url);
});

server.get('/api/chat/posts', function(request, response) {
    console.log("chat-server GET /api/chat/posts");
	fs.readFile('./chat-posts.json', function(error, content) {
			if (error) {
				response.writeHead(500);
				response.end();
			}
			else {
				response.writeHead(200, { 'Content-Type': 'text/json' });
				response.end(content, 'utf-8');
			}
		});
});

