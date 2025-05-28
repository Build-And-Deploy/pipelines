
# Uses Node 20 image as base image
FROM node:20-alpine

WORKDIR /app

COPY . .

RUN npm install

EXPOSE 3001

CMD ["node", "server.js"]
