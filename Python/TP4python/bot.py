import discord
from discord.ext import commands

default_intents = discord.Intents.default()
default_intents.members = True
client = discord.Client(intents=default_intents)
client = discord.Client()


@client.event
async def on_message(message):
    print(message.content)
    if message.content == "Ping":
        await message.channel.send("Pong")
@client.event
async def on_ready():
    print("Le bot est prêt !")

"""@client.event
async def on_member_join(member):
    print(f"L'utilisateur {member.display_name} a rejoint le serveur !")

@client.event
async def on_message(m):
    if m.content.startswith("!del"):
        number = int(m.content.split()[1])
        messages = await m.channel.history(limit=number + 1).flatten()
        for each_message in messages:
            await each_message.delete()"""

client.run("OTU1NTkwMjU4ODc0MDA3NjAz.Yjj4xw.AzWYrOfScjEWHOoiwb6cwKT6ouQ")