import discord
from discord.ext import commands

class reda(commands.Cog):

    def __init__(self,client):
        self.client=client

    @commands.Cog.listener()
    async def on_ready(self):
      print("Le bot est prêt !")

    @commands.Cog.listener("on_message")
    async def on_message(self,message):
        f=open("monbot/message.txt","a")
        f.write(str(message.author) + " said " + message.content + '\n')
        f.close()
    
    @commands.Cog.listener("on_message_delete")
    async def on_message_delete(self,message):
        f=open("monbot/message.txt","a")
        f.write(str(message.author) + " delete " + message.content + '\n')
        f.close()



def setup(client):
    client.add_cog(reda(client))