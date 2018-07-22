@echo off
title Poke Bot Restarter v1.1
mode con: cols=60 lines=8
color 0a

set /a timer = 3600
set /a max_restarts = 5

:loop
set /a counter = %counter% + 1

cd "C:\Users\Satoshi\Desktop\Release\"
start NecroBot.exe

cls
echo ------------------------------------------------
echo // Poke Bot Restarter
echo // Author: daisukiCx @ ownedcore.com
echo // Version: 1.1 - 8/16/16
echo.
echo [Message] Restarts: %counter% / %max_restarts%
echo [Message] Bot will restart in %timer% seconds...
echo ------------------------------------------------

timeout /t %timer% >nul
taskkill /f /im NecroBot.exe >nul

if %counter% == %max_restarts% goto done
goto loop

:done
exit