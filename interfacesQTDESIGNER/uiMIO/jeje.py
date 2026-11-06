import pyautogui
import random
import time
import threading
import pyperclip
import webbrowser
import rotate_screen
import tkinter as tk
from pynput import keyboard

# Configuraciones de seguridad obligatorias
pyautogui.FAILSAFE = True
broma_activa = False
tiempo_limite = 10 

controlador_teclado = keyboard.Controller()

print("=" * 60)
print("🌋 EL APOCALIPSIS DEFINITIVO DE 10 SEGUNDOS 🌋")
print("Presiona [ F8 ] para reventar el sistema.")
print("Todo volverá a la normalidad AUTOMÁTICAMENTE en 10 segundos.")
print("=" * 60)

def rotar_pantalla_loca():
    """Gira la pantalla del PC en ángulos aleatorios."""
    try:
        pantalla = rotate_screen.get_primary_display()
        angulos = [0, 90, 180, 270]
        while broma_activa:
            pantalla.rotate_to(random.choice(angulos))
            time.sleep(0.8)
        pantalla.rotate_to(0) # Al acabar, la devuelve a su estado normal (0 grados)
    except:
        pass

def abrir_pestanas_troll():
    """Abre el navegador con búsquedas estúpidas en bucle."""
    busquedas = [
        "https://google.com",
        "https://google.com",
        "https://google.com",
        "https://youtube.com"
    ]
    while broma_activa:
        webbrowser.open(random.choice(busquedas))
        time.sleep(1.5) # Abre una pestaña cada segundo y medio

def minimizar_todo_el_rato():
    """Fuerza a Windows a ir al escritorio constantemente."""
    while broma_activa:
        pyautogui.hotkey('win', 'd')
        time.sleep(0.6)

def lluvia_ventanas_goofy():
    ventanas_creadas = []
    while broma_activa:
        try:
            root = tk.Tk()
            root.title("💥 FATAL_ERROR 💥")
            x = random.randint(0, root.winfo_screenwidth() - 300)
            y = random.randint(0, root.winfo_screenheight() - 150)
            root.geometry(f"300x120+{x}+{y}")
            root.configure(bg=random.choice(["red", "purple", "cyan", "black"]))
            root.overrideredirect(True) 
            
            lbl = tk.Label(root, text="¡PÁNICO!", font=("Impact", 24), fg="white", bg=root.cget("bg"))
            lbl.pack(expand=True)
            root.update()
            ventanas_creadas.append(root)
            pyautogui.bell()
        except:
            pass
        time.sleep(0.2)
        
    for v in ventanas_creadas:
        try: v.destroy()
        except: pass

def bucle_raton_salvaje():
    global broma_activa
    while broma_activa:
        x_actual, y_actual = pyautogui.position()
        offset_x = random.randint(-60, 60)
        offset_y = random.randint(-60, 60)
        pyautogui.moveTo(x_actual + offset_x, y_actual + offset_y, duration=0.01)
        if random.random() < 0.08:
            pyautogui.click()
        time.sleep(0.01)

def temporizador_autodestruccion():
    global broma_activa
    time.sleep(tiempo_limite)
    if broma_activa:
        broma_activa = False
        print("\n⏱️ ¡TIEMPO CONCLUIDO! Restaurando el sistema por completo...")
        escuchador_global.stop()

def al_presionar_tecla(tecla):
    global broma_activa
    try:
        if tecla == keyboard.Key.f8 and not broma_activa:
            broma_activa = True
            print("\n🔥 QUE DIOS TE ACOMPAÑE...")
            
            # Ejecutar TODO a la vez en paralelo
            threading.Thread(target=bucle_raton_salvaje, daemon=True).start()
            threading.Thread(target=lluvia_ventanas_goofy, daemon=True).start()
            threading.Thread(target=minimizar_todo_el_rato, daemon=True).start()
            threading.Thread(target=abrir_pestanas_troll, daemon=True).start()
            threading.Thread(target=rotar_pantalla_loca, daemon=True).start()
            threading.Thread(target=temporizador_autodestruccion, daemon=True).start()
            return

        if broma_activa:
            if hasattr(tecla, 'char') and tecla.char is not None:
                if random.random() < 0.50: # 50% de probabilidad de romper la escritura
                    controlador_teclado.press(keyboard.Key.backspace)
                    controlador_teclado.release(keyboard.Key.backspace)
                    controlador_teclado.type(random.choice(["IKER ", "AYUDA ", "💥 "]))
    except:
        pass

with keyboard.Listener(on_press=al_presionar_tecla) as escuchador_global:
    escuchador_global.join()
