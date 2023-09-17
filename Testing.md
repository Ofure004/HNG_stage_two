{
"info": {
"_postman_id": "38ced708-3594-45d7-a2af-514334de22e0",
"name": "New Collection",
"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
"_exporter_id": "23312788",
"_collection_link": "https://www.postman.com/interstellar-meteor-280605/workspace/s/collection/23312788-38ced708-3594-45d7-a2af-514334de22e0?action=share&source=collection_link&creator=23312788"
},
"item": [
{
"name": "create_new",
"request": {
"method": "POST",
"header": [],
"body": {
"mode": "raw",
"raw": "{\r\n    \"firstName\" : \"Osose\",\r\n    \"lastName\" : \"Ehiremhen\",\r\n    \"age\" : \"20\",\r\n    \"track\" : \"frontend\"\r\n\r\n}",
"options": {
"raw": {
"language": "json"
}
}
},
"url": {
"raw": "{{base}}/api",
"host": [
"{{base}}"
],
"path": [
"api"
]
}
},
"response": [
{
"name": "create_new",
"originalRequest": {
"method": "POST",
"header": [],
"body": {
"mode": "raw",
"raw": "{\r\n    \"firstName\" : \"Osose\",\r\n    \"lastName\" : \"Ehiremhen\",\r\n    \"age\" : \"20\",\r\n    \"track\" : \"frontend\"\r\n\r\n}",
"options": {
"raw": {
"language": "json"
}
}
},
"url": {
"raw": "https://hng-stage-two-emp7.onrender.com/api",
"protocol": "https",
"host": [
"hng-stage-two-emp7",
"onrender",
"com"
],
"path": [
"api"
]
}
},
"status": "OK",
"code": 200,
"_postman_previewlanguage": "plain",
"header": [
{
"key": "Date",
"value": "Sun, 17 Sep 2023 00:00:34 GMT"
},
{
"key": "Content-Type",
"value": "text/plain;charset=UTF-8"
},
{
"key": "Transfer-Encoding",
"value": "chunked"
},
{
"key": "Connection",
"value": "keep-alive"
},
{
"key": "CF-Ray",
"value": "807d11cc381ddd3f-LHR"
},
{
"key": "CF-Cache-Status",
"value": "DYNAMIC"
},
{
"key": "Vary",
"value": "Accept-Encoding"
},
{
"key": "x-render-origin-server",
"value": "Render"
},
{
"key": "Server",
"value": "cloudflare"
},
{
"key": "Content-Encoding",
"value": "br"
},
{
"key": "alt-svc",
"value": "h3=\":443\"; ma=86400"
}
],
"cookie": [],
"body": "Ehiremhen Osose has been added to the db successfully and your id is 1"
}
]
},
{
"name": "get_all",
"request": {
"method": "GET",
"header": [],
"url": {
"raw": "{{base}}/api",
"host": [
"{{base}}"
],
"path": [
"api"
]
}
},
"response": [
{
"name": "get_all",
"originalRequest": {
"method": "GET",
"header": [],
"url": {
"raw": "{{base}}/api",
"host": [
"{{base}}"
],
"path": [
"api"
]
}
},
"status": "OK",
"code": 200,
"_postman_previewlanguage": "json",
"header": [
{
"key": "Date",
"value": "Sun, 17 Sep 2023 14:06:43 GMT"
},
{
"key": "Content-Type",
"value": "application/json"
},
{
"key": "Transfer-Encoding",
"value": "chunked"
},
{
"key": "Connection",
"value": "keep-alive"
},
{
"key": "CF-Ray",
"value": "8081e949dc1bdcbf-LHR"
},
{
"key": "CF-Cache-Status",
"value": "DYNAMIC"
},
{
"key": "Vary",
"value": "Accept-Encoding"
},
{
"key": "x-render-origin-server",
"value": "Render"
},
{
"key": "Server",
"value": "cloudflare"
},
{
"key": "Content-Encoding",
"value": "br"
},
{
"key": "alt-svc",
"value": "h3=\":443\"; ma=86400"
}
],
"cookie": [],
"body": "[\n    {\n        \"id\": 1,\n        \"firstName\": \"Osose\",\n        \"lastName\": \"Ehiremhen\",\n        \"age\": \"20\",\n        \"track\": \"frontend\"\n    },\n    {\n        \"id\": 3,\n        \"firstName\": \"Osose\",\n        \"lastName\": \"Ehiremhen\",\n        \"age\": \"20\",\n        \"track\": \"frontend\"\n    },\n    {\n        \"id\": 52,\n        \"firstName\": \"Osose\",\n        \"lastName\": \"Ehiremhen\",\n        \"age\": \"20\",\n        \"track\": \"frontend\"\n    }\n]"
}
]
},
{
"name": "get_by_id",
"request": {
"method": "GET",
"header": []
},
"response": [
{
"name": "get_by_id",
"originalRequest": {
"method": "GET",
"header": [],
"url": {
"raw": "{{base}}/api/3",
"host": [
"{{base}}"
],
"path": [
"api",
"3"
]
}
},
"status": "OK",
"code": 200,
"_postman_previewlanguage": "json",
"header": [
{
"key": "Date",
"value": "Sun, 17 Sep 2023 14:13:49 GMT"
},
{
"key": "Content-Type",
"value": "application/json"
},
{
"key": "Transfer-Encoding",
"value": "chunked"
},
{
"key": "Connection",
"value": "keep-alive"
},
{
"key": "CF-Ray",
"value": "8081f3b39823dcbf-LHR"
},
{
"key": "CF-Cache-Status",
"value": "DYNAMIC"
},
{
"key": "Vary",
"value": "Accept-Encoding"
},
{
"key": "x-render-origin-server",
"value": "Render"
},
{
"key": "Server",
"value": "cloudflare"
},
{
"key": "Content-Encoding",
"value": "br"
},
{
"key": "alt-svc",
"value": "h3=\":443\"; ma=86400"
}
],
"cookie": [],
"body": "{\n    \"id\": 3,\n    \"firstName\": \"Osose\",\n    \"lastName\": \"Ehiremhen\",\n    \"age\": \"20\",\n    \"track\": \"frontend\"\n}"
}
]
},
{
"name": "update",
"request": {
"method": "PATCH",
"header": [],
"body": {
"mode": "raw",
"raw": "{\r\n    \"firstName\" : \"Ofure\",\r\n    \"age\": \"19\"\r\n}",
"options": {
"raw": {
"language": "json"
}
}
},
"url": {
"raw": "{{base}}/api/3",
"host": [
"{{base}}"
],
"path": [
"api",
"3"
]
}
},
"response": [
{
"name": "update",
"originalRequest": {
"method": "PATCH",
"header": [],
"body": {
"mode": "raw",
"raw": "{\r\n    \"firstName\" : \"Ofure\",\r\n    \"age\": \"19\"\r\n}",
"options": {
"raw": {
"language": "json"
}
}
},
"url": {
"raw": "{{base}}/api/3",
"host": [
"{{base}}"
],
"path": [
"api",
"3"
]
}
},
"status": "OK",
"code": 200,
"_postman_previewlanguage": "json",
"header": [
{
"key": "Date",
"value": "Sun, 17 Sep 2023 14:42:55 GMT"
},
{
"key": "Content-Type",
"value": "application/json"
},
{
"key": "Transfer-Encoding",
"value": "chunked"
},
{
"key": "Connection",
"value": "keep-alive"
},
{
"key": "CF-Ray",
"value": "80821e53aa13414d-LHR"
},
{
"key": "CF-Cache-Status",
"value": "DYNAMIC"
},
{
"key": "Vary",
"value": "Accept-Encoding"
},
{
"key": "x-render-origin-server",
"value": "Render"
},
{
"key": "Server",
"value": "cloudflare"
},
{
"key": "Content-Encoding",
"value": "br"
},
{
"key": "alt-svc",
"value": "h3=\":443\"; ma=86400"
}
],
"cookie": [],
"body": "{\n    \"id\": 3,\n    \"firstName\": \"Ofure\",\n    \"lastName\": \"Ehiremhen\",\n    \"age\": \"19\",\n    \"track\": \"frontend\"\n}"
}
]
},
{
"name": "delete",
"request": {
"method": "DELETE",
"header": [],
"url": {
"raw": "{{base}}/api/52",
"host": [
"{{base}}"
],
"path": [
"api",
"52"
]
}
},
"response": [
{
"name": "delete",
"originalRequest": {
"method": "DELETE",
"header": [],
"url": {
"raw": "{{base}}/api/52",
"host": [
"{{base}}"
],
"path": [
"api",
"52"
]
}
},
"status": "OK",
"code": 200,
"_postman_previewlanguage": "plain",
"header": [
{
"key": "Date",
"value": "Sun, 17 Sep 2023 15:04:30 GMT"
},
{
"key": "Content-Type",
"value": "text/plain;charset=UTF-8"
},
{
"key": "Transfer-Encoding",
"value": "chunked"
},
{
"key": "Connection",
"value": "keep-alive"
},
{
"key": "CF-Ray",
"value": "80823dd96e0d4194-LHR"
},
{
"key": "CF-Cache-Status",
"value": "DYNAMIC"
},
{
"key": "Vary",
"value": "Accept-Encoding"
},
{
"key": "x-render-origin-server",
"value": "Render"
},
{
"key": "Server",
"value": "cloudflare"
},
{
"key": "Content-Encoding",
"value": "br"
},
{
"key": "alt-svc",
"value": "h3=\":443\"; ma=86400"
}
],
"cookie": [],
"body": "User deleted successfully"
}
]
}
]
}