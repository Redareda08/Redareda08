from distutils import extension
import discord 
import os 
from discord.ext import commands
from discord import Client

dir_path = os.path.dirname(os.path.realpath(__file__))



client=commands.Bot(command_prefix="!")



for filename in os.listdir(dir_path + "\\monbot"):
    if(filename.endswith('.py')):
         client.load_extension(f'monbot.{filename[:-3]}')



client.run("OTU1NTkwMjU4ODc0MDA3NjAz.Yjj4xw.ujasPO-hxJBe_oeyHuEK7YyxbhA")