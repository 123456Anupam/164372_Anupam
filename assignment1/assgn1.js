/*const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('"Success, I am listening from port\n');
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});*/
var http = require('http');

var server=http.createServer(function (req,res) {
	res.writeHead(200, {
	"Content-Type" : "text/plain"
	});
	res.end('Success, I am listening from port \n');
}).listen(3000);