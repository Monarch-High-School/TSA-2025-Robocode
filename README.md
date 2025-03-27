# Monarch TSA - Robocode 2025
This repository contains an installation of the [Robocode](https://robocode.sourceforge.io/) Java programming game so that you do not have to have a local environment to install it on.

## First of all - What is Robocode?
According to Viktor G. and ChatGPT, Robocode is a programming game where players write AI-controlled tanks in Java to battle in an arena. The goal is to develop the best possible strategy for your tank, which involves movement, targeting, dodging, and firing at opponents. The game provides a simulated environment where tanks use sensors to detect enemies and make decisions based on programmed logic.

Robocode's motto is
> Build the best, destroy the rest!

## Using this repository
1. In the upper right corner, click **Use this template**, then click **Create a new repository**.
2. Give your repository an easy-to-remember name.
3. Once the repository is created, click **Code**, then click **Create a codespace on main**. A codespace is a virtual environment where you can run the Robocode application.
4. When the codespace loads (this may take a bit), click on **TERMINAL** at the bottom.
5. Issue the following commands in the terminal to run robocode
```bash
cd robocode
./robocode.sh
```

You should see text appear that shows that robocode is starting. It will appear to freeze on "Reading robor database", but that is just the program running. You now need to access the GUI.

6. Click on **PORTS** at the bottom. 
7. Under **Forwarded Address** click on the globe icon to open a browser to view the robocode app. 
8. A window will open with **noVNC**. Click **Connect**. Use the Robocode app.

## Getting Started with Robocode
The best place to get started is the documentation. Viktor G. put together these links:
- [Creating your first robot](https://robowiki.net/wiki/Robocode/My_First_Robot)
- [Huge Wiki page of Robocode](https://robowiki.net/wiki/Main_Page)
- [Sample bots](https://robowiki.net/wiki/Category:Sample_Bots)
- [FAQs](https://robowiki.net/wiki/Robocode/FAQ)
- [Robocode Physics](https://robowiki.net/wiki/Robocode/Game_Physics)
- [Professor Spencer's Robocode Videos](https://www.youtube.com/watch?v=QQfSnrt5myA)

### Important
You are most likely using GitHub Codespaces free plan, which has a limit for how much computing and storage space you get each month. Make sure you shut down your code space at the end of each session to avoid unecessarily running up your usage.

Go to the GitHub repo you created, click **Code**, and click the three dots **...** next to the Codespace. Click **Stop Codespace**.