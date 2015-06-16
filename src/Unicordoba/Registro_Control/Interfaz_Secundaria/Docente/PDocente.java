/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unicordoba.Registro_Control.Interfaz_Secundaria.Docente;

import Unicordoba.Registro_Control.Base_de_Datos.Controlador.DocenteJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.FacultadJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.InformacionBasicaJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.InformacionDeSeguridadJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.exceptions.IllegalOrphanException;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.exceptions.NonexistentEntityException;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.Docente;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.Facultad;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.InformacionBasica;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.InformacionDeSeguridad;
import Unicordoba.Registro_Control.Interfaz_Secundaria.BasicaUno.Estado_Ventana;
import Unicordoba.Registro_Control.Interfaz_Secundaria.BasicaUno.IPanelEdicion;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AndresFelipe
 */
public class PDocente extends javax.swing.JPanel implements IPanelEdicion {
  
    /**
     * Creates new form PDocente
     */
    public PDocente() {
        initComponents();
        CargarFacultadesCB();
        EstadoCampos();
    }

    private void CargarFacultadesCB() {
        entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        List<Facultad> list = new FacultadJpaController(entityManagerFactory).findFacultadEntities();
        for (Facultad list1 : list) {
            CBFacultad.addItem(list1);
        }
    }
    
    private void EstadoCampos(){
        CBFacultad.setEnabled(false);
        TFieldNombre.setEnabled(false);
        TFieldApellidos.setEnabled(false);
        TFieldIdentificacion.setEnabled(false);
        TFieldCodigo.setEnabled(false);
        TFieldCorreo.setEnabled(false);
        TFieldTelefono.setEnabled(false);
        TFieldClave.setEnabled(false);
        CBEstado.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNombre = new javax.swing.JLabel();
        LApellidos = new javax.swing.JLabel();
        LCodigo = new javax.swing.JLabel();
        LCorreo = new javax.swing.JLabel();
        LIdentificacion = new javax.swing.JLabel();
        LTelefono = new javax.swing.JLabel();
        TFieldNombre = new javax.swing.JTextField();
        TFieldApellidos = new javax.swing.JTextField();
        TFieldCodigo = new javax.swing.JTextField();
        TFieldCorreo = new javax.swing.JTextField();
        TFieldIdentificacion = new javax.swing.JTextField();
        TFieldTelefono = new javax.swing.JTextField();
        TFieldClave = new javax.swing.JTextField();
        LClaveAcceso = new javax.swing.JLabel();
        LEstado = new javax.swing.JLabel();
        LFacultdad = new javax.swing.JLabel();
        CBFacultad = new javax.swing.JComboBox();
        CBEstado = new javax.swing.JComboBox();
        PanelLectorHuella = new javax.swing.JPanel();
        BotonLeerHuella = new javax.swing.JButton();
        LCodigoHuella = new javax.swing.JLabel();

        LNombre.setText("Nombres:");

        LApellidos.setText("Apellidos:");

        LCodigo.setText("Codigo:");

        LCorreo.setText("Correo:");

        LIdentificacion.setText("Identificación:");

        LTelefono.setText("Telefono");

        LClaveAcceso.setText("Clave de Acceso");

        LEstado.setText("Estado");

        LFacultdad.setText("Facultad:");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        PanelLectorHuella.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        BotonLeerHuella.setText("Leer Huella");

        LCodigoHuella.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LCodigoHuella.setText("010101010101");
        LCodigoHuella.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout PanelLectorHuellaLayout = new javax.swing.GroupLayout(PanelLectorHuella);
        PanelLectorHuella.setLayout(PanelLectorHuellaLayout);
        PanelLectorHuellaLayout.setHorizontalGroup(
            PanelLectorHuellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLectorHuellaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LCodigoHuella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelLectorHuellaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(BotonLeerHuella)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        PanelLectorHuellaLayout.setVerticalGroup(
            PanelLectorHuellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLectorHuellaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LCodigoHuella, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BotonLeerHuella)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LFacultdad)
                    .addComponent(LNombre)
                    .addComponent(LApellidos)
                    .addComponent(LIdentificacion)
                    .addComponent(LCodigo)
                    .addComponent(LCorreo)
                    .addComponent(LTelefono))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFieldCorreo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBFacultad, 0, 227, Short.MAX_VALUE)
                            .addComponent(TFieldNombre)
                            .addComponent(TFieldApellidos)
                            .addComponent(TFieldIdentificacion)))
                    .addComponent(TFieldTelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addComponent(PanelLectorHuella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LClaveAcceso)
                    .addComponent(LEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFieldClave)
                    .addComponent(CBEstado, 0, 199, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LFacultdad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LApellidos))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LIdentificacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LCorreo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LClaveAcceso)
                        .addGap(24, 24, 24)
                        .addComponent(LEstado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelLectorHuella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLeerHuella;
    private javax.swing.JComboBox CBEstado;
    private javax.swing.JComboBox CBFacultad;
    private javax.swing.JLabel LApellidos;
    private javax.swing.JLabel LClaveAcceso;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JLabel LCodigoHuella;
    private javax.swing.JLabel LCorreo;
    private javax.swing.JLabel LEstado;
    private javax.swing.JLabel LFacultdad;
    private javax.swing.JLabel LIdentificacion;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LTelefono;
    private javax.swing.JPanel PanelLectorHuella;
    private javax.swing.JTextField TFieldApellidos;
    private javax.swing.JTextField TFieldClave;
    private javax.swing.JTextField TFieldCodigo;
    private javax.swing.JTextField TFieldCorreo;
    private javax.swing.JTextField TFieldIdentificacion;
    private javax.swing.JTextField TFieldNombre;
    private javax.swing.JTextField TFieldTelefono;
    // End of variables declaration//GEN-END:variables

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private InformacionBasica informacionBasica = null;
    private InformacionDeSeguridad informacionDeSeguridad = null;
    private Docente docente = null;
    
    
    @Override
    public void Guardar(Estado_Ventana estado_Ventana) {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");

            informacionBasica.setNombres(TFieldNombre.getText());
            informacionBasica.setApellidos(TFieldApellidos.getText());
            informacionBasica.setCodigo(TFieldCodigo.getText());
            informacionBasica.setCorreo(TFieldCorreo.getText());
            informacionBasica.setTelefono(TFieldTelefono.getText());
            informacionBasica.setTiCc(Integer.valueOf(TFieldIdentificacion.getText()));
            InformacionBasicaJpaController informacionBasicaJpaController = new InformacionBasicaJpaController(entityManagerFactory);
            if (estado_Ventana.equals(Estado_Ventana.NUEVO)) {
                informacionBasicaJpaController.create(informacionBasica);
            } else {
                informacionBasicaJpaController.edit(informacionBasica);
            }

            informacionDeSeguridad.setClave(TFieldClave.getText());
            informacionDeSeguridad.setCodigoHuella(LCodigoHuella.getText());
            informacionDeSeguridad.setEstado(CBEstado.getSelectedItem().toString());
            InformacionDeSeguridadJpaController informacionDeSeguridadJpaController = new InformacionDeSeguridadJpaController(entityManagerFactory);
            if (estado_Ventana.equals(Estado_Ventana.NUEVO)) {
                informacionDeSeguridadJpaController.create(informacionDeSeguridad);
            } else {
                informacionDeSeguridadJpaController.edit(informacionDeSeguridad);
            }

            docente.setInformacionBasicaId(informacionBasica);
            docente.setInformacionDeSeguridadidI(informacionDeSeguridad);
            docente.setFacultadid((Facultad) CBFacultad.getSelectedItem());
            DocenteJpaController docenteJpaController = new DocenteJpaController(entityManagerFactory);
            if (estado_Ventana.equals(Estado_Ventana.NUEVO)) {
                docenteJpaController.create(docente);
            } else {
                docenteJpaController.edit(docente);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Eliminar() {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
            DocenteJpaController docenteJpaController = new  DocenteJpaController(entityManagerFactory);
            docenteJpaController.destroy(docente.getIdDocente());
            
            InformacionBasicaJpaController informacionBasicaJpaController = new InformacionBasicaJpaController(entityManagerFactory);
            informacionBasicaJpaController.destroy(docente.getInformacionBasicaId().getId());

            InformacionDeSeguridadJpaController informacionDeSeguridadJpaController = new InformacionDeSeguridadJpaController(entityManagerFactory);
            informacionDeSeguridadJpaController.destroy(docente.getInformacionDeSeguridadidI().getIdI());

        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        } catch (IllegalOrphanException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void ActivarEdicion() {
        
    }

    @Override
    public void Nuevo() {
        informacionBasica = new InformacionBasica();
        informacionDeSeguridad = new InformacionDeSeguridad();
        docente = new Docente();
    }

    @Override
    public void Seleccionar(Vector vectorSeleccion) {
        entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        DocenteJpaController docenteJpaController = new DocenteJpaController(entityManagerFactory);

        this.docente = docenteJpaController.findDocente(Integer.valueOf(vectorSeleccion.get(0).toString()));
        this.informacionBasica = docente.getInformacionBasicaId();
        this.informacionDeSeguridad = docente.getInformacionDeSeguridadidI();

        TFieldNombre.setText(docente.getInformacionBasicaId().getNombres());
        TFieldApellidos.setText(docente.getInformacionBasicaId().getApellidos());
        TFieldCodigo.setText(docente.getInformacionBasicaId().getCodigo());
        TFieldCorreo.setText(docente.getInformacionBasicaId().getCorreo());
        TFieldIdentificacion.setText(docente.getInformacionBasicaId().getTiCc()+"");
        TFieldTelefono.setText(docente.getInformacionBasicaId().getTelefono()+"");
        
        LCodigoHuella.setText(docente.getInformacionDeSeguridadidI().getCodigoHuella());
        TFieldClave.setText(docente.getInformacionDeSeguridadidI().getClave());
        CBEstado.setSelectedItem(docente.getInformacionDeSeguridadidI().getEstado());

        CBFacultad.setSelectedItem(docente.getFacultadid());
    }

    @Override
    public List<Object[]> getListaParaTabla() {
        entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        DocenteJpaController docenteJpaController = new  DocenteJpaController(entityManagerFactory);
        
        List<Object[]> list = new ArrayList();
        for (Docente docente : docenteJpaController.findDocenteEntities()) {
            list.add(new Object[]{
                docente.getIdDocente(),
                docente.getFacultadid().getNombre(),
                docente.getInformacionBasicaId().getNombres(),
                docente.getInformacionBasicaId().getApellidos(),
                docente.getInformacionBasicaId().getCodigo(),
                docente.getInformacionBasicaId().getTiCc(),
                docente.getInformacionBasicaId().getCorreo(),
                docente.getInformacionBasicaId().getTelefono(),
                docente.getInformacionDeSeguridadidI().getCodigoHuella(),
                docente.getInformacionDeSeguridadidI().getClave(),
                docente.getInformacionDeSeguridadidI().getEstado()
            });
        }
        return list;
    }

    @Override
    public String[] getNombreDeColumnas() {
        return new String[]{"ID", "Facultad", "Nombre", "Apellidos", "Codigo", "Identificacion", "Correo", "Telefono", "Codigo Huella", "Clave", "Estado"};
    }
}