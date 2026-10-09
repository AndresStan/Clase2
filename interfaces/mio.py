import sys
import time
from PyQt6.QtWidgets import (QApplication, QWidget, QVBoxLayout, QHBoxLayout, 
                             QLabel, QPushButton, QTextEdit, QProgressBar)
from PyQt6.QtCore import Qt, QTimer
from PyQt6.QtGui import QFont

class VentanaUltraPro(QWidget):
    def __init__(self):
        super().__init__()
        self.init_ui()
        
    def init_ui(self):
        # 1. Configuración de la ventana principal (Estilo Cyberpunk / Matriz)
        self.setWindowTitle('--- SISTEMA ULTRA QUANTUM PRO v9.9 ---')
        self.resize(500, 600)
        
        # Paleta de colores loca con CSS (QSS)
        self.setStyleSheet("""
            QWidget {
                background-color: #0d0d1a;
                color: #00ffcc;
                font-family: 'Courier New', monospace;
            }
            QLabel {
                color: #ff007f;
            }
            QPushButton {
                background-color: #1a1a3a;
                border: 2px solid #00ffcc;
                border-radius: 10px;
                padding: 12px;
                font-weight: bold;
                font-size: 14px;
            }
            QPushButton:hover {
                background-color: #ff007f;
                color: #ffffff;
                border: 2px solid #ff007f;
            }
            QPushButton:pressed {
                background-color: #99004c;
            }
            QTextEdit {
                background-color: #050510;
                border: 1px solid #ff007f;
                border-radius: 5px;
                color: #33ff33;
            }
            QProgressBar {
                border: 2px solid #00ffcc;
                border-radius: 5px;
                text-align: center;
                font-weight: bold;
            }
            QProgressBar::chunk {
                background-color: QLinearGradient(x1: 0, y1: 0, x2: 1, y2: 0, 
                stop: 0 #00ffcc, stop: 1 #ff007f);
            }
        """)

        # 2. Elementos de la interfaz (Widgets)
        self.lbl_titulo = QLabel('⚡ MEGA PANEL DE CONTROL INESTABLE ⚡', self)
        self.lbl_titulo.setFont(QFont('Courier New', 16))
        self.lbl_titulo.setAlignment(Qt.AlignmentFlag.AlignCenter)

        self.txt_consola = QTextEdit(self)
        self.txt_consola.setReadOnly(True)
        self.txt_consola.append("--> Sistema iniciado con éxito.")
        self.txt_consola.append("--> Esperando orden del operador supremo...")

        self.barra_carga = QProgressBar(self)
        self.barra_carga.setValue(0)

        self.btn_accion = QPushButton('💥 ACTIVAR MODO SUPER LOCO 💥', self)
        # Conectamos el botón a nuestra función loca
        self.btn_accion.clicked.connect(self.desatar_caos)

        # 3. Diseño y Organización (Layouts)
        layout_principal = QVBoxLayout()
        layout_principal.setSpacing(20)
        layout_principal.setContentsMargins(20, 20, 20, 20)
        
        layout_principal.addWidget(self.lbl_titulo)
        layout_principal.addWidget(self.txt_consola)
        layout_principal.addWidget(self.barra_carga)
        layout_principal.addWidget(self.btn_accion)

        self.setLayout(layout_principal)
        
        # Temporizador interno para animaciones locas de la barra
        self.timer = QTimer()
        self.timer.timeout.connect(self.actualizar_progreso)
        self.progreso_val = 0

    # 4. Lógica de la locura
    def desatar_caos(self):
        self.txt_consola.append("\n[ ALERTA ] ¡Inyectando scripts hiperespaciales!")
        self.txt_consola.append("[ INFO ] Descargando RAM de la nube...")
        self.txt_consola.append("[ OK ] Desborde de flujo cuántico activado.")
        
        # Reiniciar e iniciar animación de la barra
        self.progreso_val = 0
        self.barra_carga.setValue(0)
        self.timer.start(30) # Se actualiza cada 30 milisegundos

    def actualizar_progreso(self):
        if self.progreso_val < 100:
            self.progreso_val += 1
            self.barra_carga.setValue(self.progreso_val)
            if self.progreso_val == 50:
                self.txt_consola.append("[ WARNING ] La Matrix se está dando cuenta...")
        else:
            self.timer.stop()
            self.txt_consola.append("[ ÉXITO ] ¡Hackeo cosmico completado! 😎")

# Ejecución del programa
if __name__ == '__main__':
    app = QApplication([])
    ventana = VentanaUltraPro()
    ventana.show()
app.exec() # Poner siempre si no la ventana se cierra instant