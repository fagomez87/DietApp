package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.tp3.proyectofinal.DataBinderMapperImpl());
  }
}
