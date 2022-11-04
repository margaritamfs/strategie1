package com.example.strategie1

import android.os.Bundle
import android.provider.CalendarContract.Instances
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import java.time.Instant

class ToDoFragment : Fragment() {

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmento: View = inflater.inflate(R.layout.fragment_to_do, container, false)

        val detail1: Button = fragmento.findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_detail_2)
        val detail3: Button = fragmento.findViewById(R.id.btn_detail_3)
        val detail4: Button = fragmento.findViewById(R.id.btn_detail_4)

        detail1.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_trabajo1))
            datos.putString("Hora", "10:00am")
            datos.putString("Lugar", "Estadio Atanacio Girardot")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()

        })

        detail2.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_atencioncliente))
            datos.putString("hora", "8:00am")
            datos.putString("lugar", "Puerta principal, salida 2")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()

        })

        detail3.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_callcenter))
            datos.putString("Hora", "6:00am")
            datos.putString("Lugar", "Call Center Estadio")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()

        })

        detail4.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_organizacionespacio))
            datos.putString("Hora", "6:00am")
            datos.putString("Lugar", "Estadio salida 2")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()

        })

        return fragmento

    }

}