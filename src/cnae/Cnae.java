package cnae;

import GUI.AsignaturaIF;
import GUI.AsistenciaIF;
import GUI.CalendarioIF;
import GUI.CambioContrasena;
import GUI.CarreraIF;
import GUI.DocenteIF;
import GUI.EstructuraEvaluacionIF;
import GUI.EstudianteIF;
import GUI.ActividadDetIF;
import GUI.FacultadIF;
import GUI.ActividadIF;
import GUI.NotasIF;
import GUI.Reestaurar;
import GUI.RepActividadDetalleIF;
import GUI.RepActividadIF;
import GUI.UniversidadIF;
import GUI.RepAsignaturasIF;
import GUI.RepDocentesIF;
import GUI.RepEstructuraEvaluacionIF;
import GUI.RepCalendarioIF;
import GUI.RepEstudiantesIF;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import GUI.RepUniversidadesIF;
import GUI.Respaldar;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author PabloAntonio
 */
public final class Cnae extends javax.swing.JFrame {
    
    
    public Cnae() {
        initComponents();
        setContentPane(Escritorio);
        Escritorio.setBackground(new java.awt.Color(0,128,192));
        this.setVisible(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void centerJIF(JInternalFrame jif) {
        Dimension desktopSize = Escritorio.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
    
    public boolean validar(JInternalFrame jif){
        boolean estado;
        estado = jif.isClosed();
        return estado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuPrArchivo = new javax.swing.JMenu();
        MnuSalir = new javax.swing.JMenuItem();
        MnuCambioAsignatura = new javax.swing.JMenuItem();
        MnuPrOperaciones = new javax.swing.JMenu();
        MnuRegistroAsistencia = new javax.swing.JMenuItem();
        MnuEvaluacion = new javax.swing.JMenuItem();
        MnuPrCatalogo = new javax.swing.JMenu();
        MnuEstudiantes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MnuEstructuraEvaluacion = new javax.swing.JMenuItem();
        MnuCalendario = new javax.swing.JMenuItem();
        MnuTipoEvaluacion = new javax.swing.JMenuItem();
        MnuTipoActividad = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnuAsignatura = new javax.swing.JMenuItem();
        MnuCarreras = new javax.swing.JMenuItem();
        MnuFacultades = new javax.swing.JMenuItem();
        MnuUniversidades = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        MnuPrReportes = new javax.swing.JMenu();
        MnuRepAsistencia = new javax.swing.JMenuItem();
        MnuNotas = new javax.swing.JMenuItem();
        mnuCatalogos = new javax.swing.JMenu();
        MnuRepEstudiantes = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        MnuRepEstructuraEvaluacion = new javax.swing.JMenuItem();
        MnuRepCalendario = new javax.swing.JMenuItem();
        MnuRepDetalleActividad = new javax.swing.JMenuItem();
        MnuRepActividad = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuAsignatura = new javax.swing.JMenuItem();
        mnuUniversidad = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        MnuRepDocente = new javax.swing.JMenuItem();
        MnuPrUtilitarios = new javax.swing.JMenu();
        MnuCambioContrasena = new javax.swing.JMenuItem();
        MnuRespaldoDatos = new javax.swing.JMenuItem();
        MnuRecuperacionDatos = new javax.swing.JMenuItem();
        MnuPrAyuda = new javax.swing.JMenu();
        MnuHelp = new javax.swing.JMenuItem();
        MnuAcercaDe = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MnuPrArchivo.setMnemonic('A');
        MnuPrArchivo.setText("Archivo");

        MnuSalir.setMnemonic('s');
        MnuSalir.setText("Salir");
        MnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuSalirActionPerformed(evt);
            }
        });
        MnuPrArchivo.add(MnuSalir);

        MnuCambioAsignatura.setMnemonic('c');
        MnuCambioAsignatura.setText("Cambiar de Asignatura");
        MnuCambioAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuCambioAsignaturaActionPerformed(evt);
            }
        });
        MnuPrArchivo.add(MnuCambioAsignatura);

        jMenuBar1.add(MnuPrArchivo);

        MnuPrOperaciones.setMnemonic('o');
        MnuPrOperaciones.setText("Registro");

        MnuRegistroAsistencia.setMnemonic('r');
        MnuRegistroAsistencia.setText("Asistencia");
        MnuRegistroAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRegistroAsistenciaActionPerformed(evt);
            }
        });
        MnuPrOperaciones.add(MnuRegistroAsistencia);

        MnuEvaluacion.setMnemonic('e');
        MnuEvaluacion.setText("Evaluación");
        MnuEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuEvaluacionActionPerformed(evt);
            }
        });
        MnuPrOperaciones.add(MnuEvaluacion);

        jMenuBar1.add(MnuPrOperaciones);

        MnuPrCatalogo.setMnemonic('c');
        MnuPrCatalogo.setText("Estructura");

        MnuEstudiantes.setMnemonic('e');
        MnuEstudiantes.setText("Estudiantes");
        MnuEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuEstudiantesActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuEstudiantes);
        MnuPrCatalogo.add(jSeparator2);

        MnuEstructuraEvaluacion.setMnemonic('s');
        MnuEstructuraEvaluacion.setText("Estructura de Evaluación");
        MnuEstructuraEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuEstructuraEvaluacionActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuEstructuraEvaluacion);

        MnuCalendario.setMnemonic('a');
        MnuCalendario.setLabel("Calendario");
        MnuCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuCalendarioActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuCalendario);

        MnuTipoEvaluacion.setMnemonic('t');
        MnuTipoEvaluacion.setText("Detalle de Actividad");
        MnuTipoEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuTipoEvaluacionActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuTipoEvaluacion);

        MnuTipoActividad.setMnemonic('p');
        MnuTipoActividad.setText("Actividades");
        MnuTipoActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuTipoActividadActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuTipoActividad);
        MnuPrCatalogo.add(jSeparator1);

        MnuAsignatura.setMnemonic('g');
        MnuAsignatura.setText("Asignaturas");
        MnuAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuAsignaturaActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuAsignatura);

        MnuCarreras.setMnemonic('r');
        MnuCarreras.setText("Carreras");
        MnuCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuCarrerasActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuCarreras);

        MnuFacultades.setMnemonic('f');
        MnuFacultades.setText("Facultades");
        MnuFacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuFacultadesActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuFacultades);

        MnuUniversidades.setMnemonic('u');
        MnuUniversidades.setText("Univerdades");
        MnuUniversidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuUniversidadesActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(MnuUniversidades);
        MnuPrCatalogo.add(jSeparator3);

        jMenuItem1.setMnemonic('d');
        jMenuItem1.setText("Docente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MnuPrCatalogo.add(jMenuItem1);

        jMenuBar1.add(MnuPrCatalogo);

        MnuPrReportes.setMnemonic('r');
        MnuPrReportes.setText("Reportes");

        MnuRepAsistencia.setMnemonic('r');
        MnuRepAsistencia.setText("Asistencia");
        MnuPrReportes.add(MnuRepAsistencia);

        MnuNotas.setMnemonic('n');
        MnuNotas.setText("Notas");
        MnuPrReportes.add(MnuNotas);

        mnuCatalogos.setMnemonic('c');
        mnuCatalogos.setText("Catálogos");
        mnuCatalogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosActionPerformed(evt);
            }
        });

        MnuRepEstudiantes.setMnemonic('e');
        MnuRepEstudiantes.setText("Estudiantes");
        MnuRepEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRepEstudiantesActionPerformed(evt);
            }
        });
        mnuCatalogos.add(MnuRepEstudiantes);
        mnuCatalogos.add(jSeparator5);

        MnuRepEstructuraEvaluacion.setMnemonic('v');
        MnuRepEstructuraEvaluacion.setText("Estructura de Evaluación");
        MnuRepEstructuraEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRepEstructuraEvaluacionActionPerformed(evt);
            }
        });
        mnuCatalogos.add(MnuRepEstructuraEvaluacion);

        MnuRepCalendario.setMnemonic('l');
        MnuRepCalendario.setText("Calendario");
        MnuRepCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRepCalendarioActionPerformed(evt);
            }
        });
        mnuCatalogos.add(MnuRepCalendario);

        MnuRepDetalleActividad.setMnemonic('t');
        MnuRepDetalleActividad.setText("Detalle Actividad");
        MnuRepDetalleActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRepDetalleActividadActionPerformed(evt);
            }
        });
        mnuCatalogos.add(MnuRepDetalleActividad);

        MnuRepActividad.setMnemonic('i');
        MnuRepActividad.setText("Actividad");
        MnuRepActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRepActividadActionPerformed(evt);
            }
        });
        mnuCatalogos.add(MnuRepActividad);
        mnuCatalogos.add(jSeparator6);

        mnuAsignatura.setMnemonic('g');
        mnuAsignatura.setText("Asignaturas");
        mnuAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignaturaActionPerformed(evt);
            }
        });
        mnuCatalogos.add(mnuAsignatura);

        mnuUniversidad.setMnemonic('u');
        mnuUniversidad.setText("Universidades");
        mnuUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUniversidadActionPerformed(evt);
            }
        });
        mnuCatalogos.add(mnuUniversidad);
        mnuCatalogos.add(jSeparator7);

        MnuRepDocente.setMnemonic('d');
        MnuRepDocente.setText("Docente");
        MnuRepDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRepDocenteActionPerformed(evt);
            }
        });
        mnuCatalogos.add(MnuRepDocente);

        MnuPrReportes.add(mnuCatalogos);

        jMenuBar1.add(MnuPrReportes);

        MnuPrUtilitarios.setMnemonic('u');
        MnuPrUtilitarios.setText("Utilitarios");

        MnuCambioContrasena.setMnemonic('c');
        MnuCambioContrasena.setText("Cambio Contraseña");
        MnuCambioContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuCambioContrasenaActionPerformed(evt);
            }
        });
        MnuPrUtilitarios.add(MnuCambioContrasena);

        MnuRespaldoDatos.setMnemonic('r');
        MnuRespaldoDatos.setText("Respaldo de Datos");
        MnuRespaldoDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRespaldoDatosActionPerformed(evt);
            }
        });
        MnuPrUtilitarios.add(MnuRespaldoDatos);

        MnuRecuperacionDatos.setMnemonic('d');
        MnuRecuperacionDatos.setText("Reestablecer Datos");
        MnuRecuperacionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuRecuperacionDatosActionPerformed(evt);
            }
        });
        MnuPrUtilitarios.add(MnuRecuperacionDatos);

        jMenuBar1.add(MnuPrUtilitarios);

        MnuPrAyuda.setMnemonic('y');
        MnuPrAyuda.setText("Ayuda");

        MnuHelp.setMnemonic('a');
        MnuHelp.setText("Ayuda");
        MnuPrAyuda.add(MnuHelp);

        MnuAcercaDe.setMnemonic('c');
        MnuAcercaDe.setText("Acerca de");
        MnuPrAyuda.add(MnuAcercaDe);

        jMenuBar1.add(MnuPrAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuEvaluacionActionPerformed
        NotasIF evaluacionVent = new NotasIF();
        centerJIF(evaluacionVent);
        Escritorio.add(evaluacionVent);
        evaluacionVent.toFront();
        try {
            evaluacionVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuEvaluacionActionPerformed

    private void MnuCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuCalendarioActionPerformed
        CalendarioIF calendarioVent = new CalendarioIF();
        centerJIF(calendarioVent);
        Escritorio.add(calendarioVent);
        calendarioVent.toFront();
        try {
                calendarioVent.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_MnuCalendarioActionPerformed

    private void MnuTipoActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuTipoActividadActionPerformed
        ActividadIF actividadVent = new ActividadIF();
        centerJIF(actividadVent);
        Escritorio.add(actividadVent);
        actividadVent.toFront();
        try {
            actividadVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_MnuTipoActividadActionPerformed

    private void MnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuSalirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Desea Salir?","Confirmar",
                JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        if(i==JOptionPane.OK_OPTION){
            System.exit(0);}
    }//GEN-LAST:event_MnuSalirActionPerformed

    private void MnuUniversidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuUniversidadesActionPerformed
        UniversidadIF universidadVent = new UniversidadIF();
        centerJIF(universidadVent);
        Escritorio.add(universidadVent);
        universidadVent.toFront();
        try {
            universidadVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuUniversidadesActionPerformed

    private void MnuFacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuFacultadesActionPerformed
        FacultadIF facultadVent = new FacultadIF();
        centerJIF(facultadVent);
        Escritorio.add(facultadVent);
        facultadVent.toFront();
        try {
            facultadVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuFacultadesActionPerformed

    private void MnuCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuCarrerasActionPerformed
        CarreraIF carreraVent = new CarreraIF();
        centerJIF(carreraVent);
        Escritorio.add(carreraVent);
        carreraVent.toFront();
        try {
            carreraVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuCarrerasActionPerformed

    private void MnuAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuAsignaturaActionPerformed
        AsignaturaIF asignaturaVent = new AsignaturaIF();
        centerJIF(asignaturaVent);
        Escritorio.add(asignaturaVent);
        asignaturaVent.toFront();
        try {
            asignaturaVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuAsignaturaActionPerformed

    private void MnuEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuEstudiantesActionPerformed
        EstudianteIF estudianteVent = new EstudianteIF();
        centerJIF(estudianteVent);
        Escritorio.add(estudianteVent);
        estudianteVent.toFront();
        try {
            estudianteVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuEstudiantesActionPerformed

    private void MnuTipoEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuTipoEvaluacionActionPerformed
        ActividadDetIF actividadDetVent = new ActividadDetIF();
        centerJIF(actividadDetVent);
        Escritorio.add(actividadDetVent);
        actividadDetVent.toFront();
        try {
            actividadDetVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuTipoEvaluacionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DocenteIF  docenteVent = new DocenteIF();
        centerJIF(docenteVent);
        Escritorio.add(docenteVent);
        docenteVent.toFront();
        try {
            docenteVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MnuEstructuraEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuEstructuraEvaluacionActionPerformed
        EstructuraEvaluacionIF estructuraVent = new EstructuraEvaluacionIF();
        centerJIF(estructuraVent);
        Escritorio.add(estructuraVent);
        estructuraVent.toFront();
        try {
            estructuraVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuEstructuraEvaluacionActionPerformed

    private void MnuRegistroAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRegistroAsistenciaActionPerformed
        AsistenciaIF asistenciaVent = new AsistenciaIF();
        centerJIF(asistenciaVent);
        Escritorio.add(asistenciaVent);
        asistenciaVent.toFront();
        try {
            asistenciaVent.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRegistroAsistenciaActionPerformed

    private void MnuCambioAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuCambioAsignaturaActionPerformed
        SeleccionarAsignatura saVent = new SeleccionarAsignatura();
        this.dispose();
        saVent.setVisible(true);
    }//GEN-LAST:event_MnuCambioAsignaturaActionPerformed

    private void MnuCambioContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuCambioContrasenaActionPerformed
        CambioContrasena cambio= new CambioContrasena();
        centerJIF(cambio);
        Escritorio.add(cambio);
        cambio.toFront();
        try {
            cambio.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuCambioContrasenaActionPerformed

    private void MnuRespaldoDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRespaldoDatosActionPerformed
        Respaldar respal= new Respaldar();
        centerJIF(respal);
        Escritorio.add(respal);
        respal.toFront();
        try {
            respal.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRespaldoDatosActionPerformed

    private void MnuRecuperacionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRecuperacionDatosActionPerformed
        Reestaurar recup= new Reestaurar();
        centerJIF(recup);
        Escritorio.add(recup);
        recup.toFront();
        try {
            recup.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRecuperacionDatosActionPerformed

    private void mnuCatalogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosActionPerformed

    }//GEN-LAST:event_mnuCatalogosActionPerformed

    private void MnuRepDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRepDocenteActionPerformed
        RepDocentesIF docenteRep = new RepDocentesIF();
        centerJIF(docenteRep);
        Escritorio.add(docenteRep);
        docenteRep.toFront();
        try {
            docenteRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRepDocenteActionPerformed

    private void mnuUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUniversidadActionPerformed
        RepUniversidadesIF universidadRep = new RepUniversidadesIF();
        centerJIF(universidadRep);
        Escritorio.add(universidadRep);
        universidadRep.toFront();
        try {
            universidadRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuUniversidadActionPerformed

    private void mnuAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignaturaActionPerformed
        RepAsignaturasIF asignaturaRep = new RepAsignaturasIF();
        centerJIF(asignaturaRep);
        Escritorio.add(asignaturaRep);
        asignaturaRep.toFront();
        try {
            asignaturaRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuAsignaturaActionPerformed

    private void MnuRepActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRepActividadActionPerformed
        RepActividadIF actividadRep = new RepActividadIF();
        centerJIF(actividadRep);
        Escritorio.add(actividadRep);
        actividadRep.toFront();
        try {
            actividadRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRepActividadActionPerformed

    private void MnuRepDetalleActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRepDetalleActividadActionPerformed
        RepActividadDetalleIF actividadDetalleRep = new RepActividadDetalleIF();
        centerJIF(actividadDetalleRep);
        Escritorio.add(actividadDetalleRep);
        actividadDetalleRep.toFront();
        try {
            actividadDetalleRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRepDetalleActividadActionPerformed

    private void MnuRepCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRepCalendarioActionPerformed
        RepCalendarioIF calendarioRep = new RepCalendarioIF();
        centerJIF(calendarioRep);
        Escritorio.add(calendarioRep);
        calendarioRep.toFront();
        try {
            calendarioRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRepCalendarioActionPerformed

    private void MnuRepEstructuraEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRepEstructuraEvaluacionActionPerformed
        RepEstructuraEvaluacionIF estructuraEvaluacionRep = new RepEstructuraEvaluacionIF();
        centerJIF(estructuraEvaluacionRep);
        Escritorio.add(estructuraEvaluacionRep);
        estructuraEvaluacionRep.toFront();
        try {
            estructuraEvaluacionRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRepEstructuraEvaluacionActionPerformed

    private void MnuRepEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuRepEstudiantesActionPerformed
        RepEstudiantesIF estudianteRep = new RepEstudiantesIF();
        centerJIF(estudianteRep);
        Escritorio.add(estudianteRep);
        estudianteRep.toFront();
        try {
            estudianteRep.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cnae.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MnuRepEstudiantesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MnuAcercaDe;
    private javax.swing.JMenuItem MnuAsignatura;
    private javax.swing.JMenuItem MnuCalendario;
    private javax.swing.JMenuItem MnuCambioAsignatura;
    private javax.swing.JMenuItem MnuCambioContrasena;
    private javax.swing.JMenuItem MnuCarreras;
    private javax.swing.JMenuItem MnuEstructuraEvaluacion;
    private javax.swing.JMenuItem MnuEstudiantes;
    private javax.swing.JMenuItem MnuEvaluacion;
    private javax.swing.JMenuItem MnuFacultades;
    private javax.swing.JMenuItem MnuHelp;
    private javax.swing.JMenuItem MnuNotas;
    private javax.swing.JMenu MnuPrArchivo;
    private javax.swing.JMenu MnuPrAyuda;
    private javax.swing.JMenu MnuPrCatalogo;
    private javax.swing.JMenu MnuPrOperaciones;
    private javax.swing.JMenu MnuPrReportes;
    private javax.swing.JMenu MnuPrUtilitarios;
    private javax.swing.JMenuItem MnuRecuperacionDatos;
    private javax.swing.JMenuItem MnuRegistroAsistencia;
    private javax.swing.JMenuItem MnuRepActividad;
    private javax.swing.JMenuItem MnuRepAsistencia;
    private javax.swing.JMenuItem MnuRepCalendario;
    private javax.swing.JMenuItem MnuRepDetalleActividad;
    private javax.swing.JMenuItem MnuRepDocente;
    private javax.swing.JMenuItem MnuRepEstructuraEvaluacion;
    private javax.swing.JMenuItem MnuRepEstudiantes;
    private javax.swing.JMenuItem MnuRespaldoDatos;
    private javax.swing.JMenuItem MnuSalir;
    private javax.swing.JMenuItem MnuTipoActividad;
    private javax.swing.JMenuItem MnuTipoEvaluacion;
    private javax.swing.JMenuItem MnuUniversidades;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenuItem mnuAsignatura;
    private javax.swing.JMenu mnuCatalogos;
    private javax.swing.JMenuItem mnuUniversidad;
    // End of variables declaration//GEN-END:variables
}
