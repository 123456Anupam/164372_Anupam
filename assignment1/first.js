const http = require('http');

const url = require('url');
const path = require('path');
const fs = require ('fs');

const mimeTypes = {
   "html" : "text/html" , 
    "jpeg" : "image/jpeg",
"jpg" : "image/jpg",
 "png" : "image/png", 
"js" : "text/javascript",
"css" : "text/css"
    

};


http.createServer(function(req,res) {
var uri = url.parse(req.url).pathname;
var filename = path.join(process.cwd(), unescape(uri));
console.log('Loading' + uri);
var stats;
 try {
   stats=fs.lstatSync(fileName);
} catch (e)
{
res.writeHead(404,{'Content-type': 'text/plain'});

res.write('404 Not Found'\n);
res.end();
return;
}
if(stats.isFile()){
var mimeType - mimeTypes[path.extname(fileName).split(".").reverse]
} 
});