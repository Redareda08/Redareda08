from discord.ext import commands
from typing import Optional
from fastapi import FastAPI
from shodan import Shodan
app = FastAPI()

mybot = commands.Bot(command_prefix="!")

@mybot.event
async def on_ready():
    print("Le bot est prêt.")

@mybot.command(name="range")
async def range(ctx,param1):
    key="4p6lJmgKTxG6e3KbodgHoablxq8fMZPA" #Shodan Key
    if param1 is None:
        return {"Error": "Please provide a valid API key"}
    else:
        try:
            api = Shodan(key)
            res = api.host(param1)
            await ctx.channel.send("valid")
        except Exception as e:
            return {"Error": str(e)}


mybot.run("OTU1NTkwMjU4ODc0MDA3NjAz.Yjj4xw.ubfYk19g054potK6b4gsV8N4dOM") #Token