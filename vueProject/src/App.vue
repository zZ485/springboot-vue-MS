<template>
  <el-row type="flex" justify="center">
    <el-col :xs="24" :sm="22" :md="20" :lg="20" :xl="18">
      <router-view/>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'App'
}
</script>
